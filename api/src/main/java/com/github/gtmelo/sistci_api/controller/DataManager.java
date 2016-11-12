package com.github.gtmelo.sistci_api.controller;

import com.github.gtmelo.sistci_api.data.Tables;
import com.github.gtmelo.sistci_api.services.v1.Tci;
import com.github.gtmelo.sistci_api.services.v1.TciFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jooq.*;
import org.jooq.impl.DSL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import static javafx.css.StyleOrigin.AUTHOR;

/**
 * Created by 02364114110 on 10/11/2016.
 */
public class DataManager {

    private Logger log;

    private static DataManager instance;
    private Connection connection;

    private DataManager() {

        log = LogManager.getLogger(DataManager.class);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            log.fatal("Couldn't load com.mysql.jdbc.Driver");
            e.printStackTrace();
        }



        String host = "192.168.0.98";
        String port = "3306";
        String db = "sistci";
        String user = "webserver";
        String pass = "webserver";

        String url = String.format("jdbc:mysql://%s:%s/%s", host, port, db);

        try {
            log.debug("Attempting to connect to db now");
            connection = DriverManager.getConnection(url,user,pass);
        } catch (SQLException e) {
            log.fatal("Failed to connect to db");
            e.printStackTrace();
        }

    }

    public static DataManager getInstance() {

        if (instance == null) instance = new DataManager();

        return instance;
    }

    public Connection getConnection() {
        return connection;
    }

    public List<Tci> selectTcis(List<Tci> tcis, int offset) throws SQLException, NullPointerException {

        Result<Record> result = null;

        try(Connection c = this.getConnection()) {
            DSLContext create = DSL.using(c, SQLDialect.MYSQL);
            result = create.select().from(Tables.TCI).offset(offset).limit(25).fetch();
        }

        if(result != null){
            for(Record r : result){

                Tci t = TciFactory.build();

                t.setId(String.valueOf(r.getValue(Tables.TCI.ID)));
                t.setOrgaoId(String.valueOf(r.getValue( Tables.TCI.ORGAOID )));
                t.setPessoaId(String.valueOf(r.getValue( Tables.TCI.PESSOAID )));
                t.setCategoriaId(String.valueOf(r.getValue( Tables.TCI.CATEGORIAID )));
                t.setPrazoId(String.valueOf(r.getValue( Tables.TCI.PRAZOID )));
                t.setFundamentoId(String.valueOf(r.getValue( Tables.TCI.FUNDAMENTO_LEGALID )));
                t.setGrau_sigiloId(String.valueOf(r.getValue( Tables.TCI.GRAU_SIGILOID )));
                t.setStatusId(String.valueOf(r.getValue( Tables.TCI.STATUSID )));
                t.setCidicId(String.valueOf(r.getValue( Tables.TCI.CIDICID )));
                t.setNup(String.valueOf(r.getValue( Tables.TCI.NUP )));
                t.setData_producao(String.valueOf(r.getValue( Tables.TCI.DATA_PRODUCAO )));
                t.setTipo(String.valueOf(r.getValue( Tables.TCI.TIPO )));
                t.setRazaoClassificacao(r.getValue(Tables.TCI.RAZAO_CLASSIFICACAO));

                tcis.add(t);
            }
        }

        return tcis;
    }
}
