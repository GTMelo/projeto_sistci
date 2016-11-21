package com.github.gtmelo.sistci_api.controller;

import com.github.gtmelo.sistci_api.data.Tables;
import com.github.gtmelo.sistci_api.security.exception.DataNotFoundException;
import com.github.gtmelo.sistci_api.services.v1.ObjectFactory;
import com.github.gtmelo.sistci_api.services.v1.Tci;
import com.github.gtmelo.sistci_api.services.v1.ViewTci;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 02364114110 on 09/11/2016.
 */
public class TciManager {

    private static Logger log = LogManager.getLogger(TciManager.class);
    private static TciManager instance;
    private        DSLContext create;


    private TciManager() throws SQLException {
        this.create = DSL.using(ConnectionManager.getInstance().getConnection(), SQLDialect.MYSQL);
    }

    public static TciManager getInstance() {
        if (instance == null) try {
            instance = new TciManager();
        } catch (SQLException e) {
            log.error("Não foi possível estabelecer conexão com o banco de dados");
            log.error(e.getMessage());
            log.error(e.getStackTrace());
        }
        return instance;
    }

    public List<Tci> findTci(int offset, int limit, String... criteria) throws DataNotFoundException, SQLException {

        if (limit > 25) limit = 25;
        if(limit == 0) limit = 25;

        String crit = parseCriteria(criteria);

        Result<Record> results = create.select().from(Tables.TCI).where(crit).limit(limit).offset(offset).fetch();

        ArrayList<Tci> tcis = new ArrayList<>();

        for (Record r : results) {
            tcis.add(ObjectFactory.buildTci(r));
        }

        return tcis;
    }

    public List<ViewTci> findTci(boolean isViewTci, int offset, int limit, String... criteria) {

        if (limit > 25) limit = 25;
        if(limit == 0) limit = 25;

        String crit = parseCriteria(criteria);

        Result<Record> results = create.select()
                .from(Tables.VIEW_TCI)
                .where(crit)
                .limit(limit)
                .offset(offset)
                .fetch();

        ArrayList<ViewTci> viewTcis = new ArrayList<>();

        for (Record r : results) {
            viewTcis.add(ObjectFactory.buildTci(true, r));
        }

        return viewTcis;

    }

    private String parseCriteria(String[] criteria) {

        String crit = "1";

        if (!criteria.equals(null)) {
            for (String c : criteria) {
                crit += " AND " + c;
            }
        }

        return crit;

    }

    public ViewTci insertTci(Tci tci) throws SQLException {

        log.debug("tentando inserir tci");
        try {
            Record record = create.insertInto(
                    Tables.TCI,
                    Tables.TCI.DATA_PRODUCAO,
                    Tables.TCI.TIPO_DOCUMENTO,
                    Tables.TCI.RAZAO_CLASSIFICACAO,
                    Tables.TCI.NUP,
                    Tables.TCI.CIDIC,
                    Tables.TCI.ORGAOID,
                    Tables.TCI.CATEGORIAID,
                    Tables.TCI.PRAZOID,
                    Tables.TCI.FUNDAMENTO_LEGALID,
                    Tables.TCI.GRAU_SIGILOID,
                    Tables.TCI.STATUSID
            ).values(
                    tci.getData_producao(),
                    tci.getTipo_documento(),
                    tci.getRazao_classificacao(),
                    tci.getNup(),
                    tci.getCidic(),
                    tci.getOrgao(),
                    tci.getCategoria(),
                    tci.getPrazo(),
                    tci.getFundamentoLegal(),
                    tci.getGrauSigilo(),
                    tci.getStatus()
            )
                    .returning(Tables.TCI.ID)
                    .fetchOne();

            ViewTci newTci = findTci(true, 0, 25, "tciid = " + record.getValue(Tables.TCI.ID)).get(0);

            return newTci;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public ViewTci updateTci(String tciid, Tci tci) {

        log.debug("tentando atualizar tci " + tciid);

        int tciidToInt = Integer.parseInt(tciid);

        try {

            create.update(Tables.TCI)
                    .set(Tables.TCI.DATA_PRODUCAO, tci.getData_producao())
                    .set(Tables.TCI.TIPO_DOCUMENTO, tci.getTipo_documento())
                    .set(Tables.TCI.RAZAO_CLASSIFICACAO, tci.getRazao_classificacao())
                    .set(Tables.TCI.NUP, tci.getNup())
                    .set(Tables.TCI.CIDIC, tci.getCidic())
                    .set(Tables.TCI.ORGAOID, tci.getOrgao())
                    .set(Tables.TCI.CATEGORIAID, tci.getCategoria())
                    .set(Tables.TCI.PRAZOID, tci.getPrazo())
                    .set(Tables.TCI.FUNDAMENTO_LEGALID, tci.getFundamentoLegal())
                    .set(Tables.TCI.GRAU_SIGILOID, tci.getGrauSigilo())
                    .set(Tables.TCI.STATUSID, tci.getStatus())
                    .where("tci.id = " + tciidToInt)
                    .execute();

            ViewTci newTci = findTci(true, 0, 25, "tciid = " + tciidToInt).get(0);

            return newTci;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;

    }

    public void deleteTci(String tciId) {

        int tciidToInt = Integer.parseInt(tciId);

        try {
            create.deleteFrom(Tables.TCI).where(Tables.TCI.ID.eq(tciidToInt)).execute();
            log.debug("O TCI com Id = " + tciId + " foi apagado.");
        } catch (Exception e) {
            log.error("Falha ao apagar o TCI. Id: " + tciidToInt);
            log.error(e.getMessage());
        }
    }
}
