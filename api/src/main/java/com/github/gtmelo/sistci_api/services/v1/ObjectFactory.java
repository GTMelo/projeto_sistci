package com.github.gtmelo.sistci_api.services.v1;

import com.github.gtmelo.sistci_api.data.Tables;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jooq.Record;
import org.json.simple.JSONObject;

/**
 * Created by 02364114110 on 09/11/2016.
 */
public class ObjectFactory {

    private static Logger log = LogManager.getLogger(ObjectFactory.class);

    public static Tci buildTci(Record r) {

        Tci tci = new Tci();

        tci.setId(r.getValue(Tables.TCI.ID));
        tci.setData_producao(r.getValue(Tables.TCI.DATA_PRODUCAO));
        tci.setTipo_documento(r.getValue(Tables.TCI.TIPO_DOCUMENTO));
        tci.setRazao_classificacao(r.getValue(Tables.TCI.RAZAO_CLASSIFICACAO));
        tci.setNup(r.getValue(Tables.TCI.NUP));
        tci.setCidic(r.getValue(Tables.TCI.CIDIC));
        tci.setOrgao(r.getValue(Tables.TCI.ORGAOID));
        tci.setCategoria(r.getValue(Tables.TCI.CATEGORIAID));
        tci.setPrazo(r.getValue(Tables.TCI.PRAZOID));
        tci.setFundamentoLegal(r.getValue(Tables.TCI.FUNDAMENTO_LEGALID));
        tci.setGrauSigilo(r.getValue(Tables.TCI.GRAU_SIGILOID));
        tci.setStatus(r.getValue(Tables.TCI.STATUSID));

        return tci;
    }

    public static Tci buildTci(JSONObject jsonObject){

        Tci tci = new Tci();

















        return tci;
    }

    public static ViewTci buildTci(boolean isViewTci, Record r) {

        ViewTci tci = new ViewTci();

        tci.setTciid(r.getValue(Tables.VIEW_TCI.TCIID));
        tci.setData_producao(r.getValue(Tables.VIEW_TCI.DATA_PRODUCAO));
        tci.setTipo_documento(r.getValue(Tables.VIEW_TCI.TIPO_DOCUMENTO));
        tci.setRazao_classificacao(r.getValue(Tables.VIEW_TCI.RAZAO_CLASSIFICACAO));
        tci.setNup(r.getValue(Tables.VIEW_TCI.NUP));
        tci.setCidic(r.getValue(Tables.VIEW_TCI.CIDIC));
        tci.setOrgao_sigla(r.getValue(Tables.VIEW_TCI.ORGAO_SIGLA));
        tci.setOrgao_nome(r.getValue(Tables.VIEW_TCI.ORGAO_NOME));
        tci.setCategoria_codigo(r.getValue(Tables.VIEW_TCI.CATEGORIA_CODIGO));
        tci.setCategoria_descricao(r.getValue(Tables.VIEW_TCI.CATEGORIA_DESCRICAO));
        tci.setPrazo_data(r.getValue(Tables.VIEW_TCI.PRAZO_DATA));
        tci.setPrazo_evento(r.getValue(Tables.VIEW_TCI.PRAZO_EVENTO));
        tci.setFundamento_legal_descricao(r.getValue(Tables.VIEW_TCI.FUNDAMENTO_LEGAL_DESCRICAO));
        tci.setSigilo_descricao(r.getValue(Tables.VIEW_TCI.SIGILO_DESCRICAO));
        tci.setStatus(r.getValue(Tables.VIEW_TCI.STATUS));

        return tci;
    }


    public static Orgao buildOrgao(Record r) {

        Orgao orgao = new Orgao();

        orgao.setId(r.getValue(Tables.ORGAO.ID));
        orgao.setNome(r.getValue(Tables.ORGAO.NOME));
        orgao.setSigla(r.getValue(Tables.ORGAO.SIGLA));
        orgao.setOrgao_superior(r.getValue(Tables.ORGAO.ORGAO_SUPERIORID));
        orgao.setEmail(r.getValue(Tables.ORGAO.EMAILID));
        orgao.setEndereco(r.getValue(Tables.ORGAO.ENDERECO));
        orgao.setTelefone(r.getValue(Tables.ORGAO.TELEFONE));

        return orgao;
    }

//    public static Tci buildTci(JSONObject jsonObject) throws SQLException {
//
//        Tci tci = new Tci();
//
//        String id                  = (String) jsonObject.get("id");
//        String data_producao       = (String) jsonObject.get("data_producao");
//        String tipo_documento      = (String) jsonObject.get("tipo_documento");
//        String razao_classificacao = (String) jsonObject.get("razao_classificacao");
//        String nup                 = (String) jsonObject.get("nup");
//        String cidic               = (String) jsonObject.get("cidic");
//        String orgao               = (String) jsonObject.get("orgao");
//        String categoria           = (String) jsonObject.get("categoria");
//        String prazo               = (String) jsonObject.get("prazo");
//        String fundamentoLegal     = (String) jsonObject.get("fundamentoLegal");
//        String grauSigilo          = (String) jsonObject.get("grauSigilo");
//        String status              = (String) jsonObject.get("status");
//
//        log.debug(tci.toString());
//        log.debug("Data produção antes: " + jsonObject.get("data_producao"));
//        log.debug("Data produção depois: " + data_producao);
//
//        tci.setId(Integer.parseInt(id));
//        tci.setData_producao(new Date(Long.parseLong(data_producao)));
//        tci.setTipo_documento(tipo_documento);
//        tci.setRazao_classificacao(razao_classificacao);
//        tci.setNup(nup);
//        tci.setCidic(cidic);
//        tci.setOrgao(ObjectFactory.buildOrgao(Integer.parseInt(orgao)));
//        tci.setCategoria(buildCategoria(Integer.parseInt(categoria)));
//        tci.setPrazo(ObjectFactory.buildprazo(Integer.parseInt(prazo)));
//        tci.setFundamentoLegal(ObjectFactory.buildFundamentoLegal(Integer.parseInt(fundamentoLegal)));
//        tci.setGrauSigilo(ObjectFactory.buildGrauSigilo(Integer.parseInt(grauSigilo)));
//        tci.setStatus(ObjectFactory.buildStatus(Integer.parseInt(status)));
//
//        return tci;
//
//    }
//

//    public static Categoria buildCategoria(int id, String codigo, String descricao) {
//
//        Categoria result = new Categoria();
//        result.setId(id);
//        result.setCodigo(codigo);
//        result.setDescricao(descricao);
//
//        return result;
//
//    }
//
//    public static Categoria buildCategoria(int id) throws SQLException {
//
//        Categoria categoria = new Categoria();
//
//        Result<Record> result = ConnectionManager.getInstance().select(Tables.CATEGORIA, "ID = " + id);
//
//        for (Record r : result) {
//            categoria.setId(Integer.parseInt((String) r.getValue("id")));
//            categoria.setCodigo((String) r.getValue("codigo"));
//            categoria.setDescricao((String) r.getValue("descricao"));
//        }
//
//        return categoria;
//    }
//
//    public static Email buildEmail(int id, String email) {
//
//        Email result = new Email();
//        result.setId(id);
//        result.setEmail(email);
//        return result;
//
//    }
//
//    public static Email buildEmail(int id) throws SQLException {
//
//        Email email = new Email();
//
//        Result<Record> records = ConnectionManager.getInstance().select(Tables.EMAIL, "id = " + id);
//
//        for(Record r : records){
//
//            email.setId(Integer.parseInt((String) r.getValue("id")));
//            email.setEmail((String) r.getValue("email"));
//
//        }
//
//        return email;
//
//    }
//
//    public static FundamentoLegal buildFundamentolegal(int id, String descricao) {
//        FundamentoLegal result = new FundamentoLegal();
//
//        result.setId(id);
//        result.setDescricao(descricao);
//
//        return result;
//    }
//
//    public static FundamentoLegal buildFundamentoLegal(int id) throws SQLException {
//
//        FundamentoLegal fundamentoLegal = new FundamentoLegal();
//
//        Result<Record> records = ConnectionManager.getInstance().select(Tables.FUNDAMENTO_LEGAL, "id = " + id);
//
//        for(Record r : records){
//            fundamentoLegal.setId(Integer.parseInt((String) r.getValue("id")));
//            fundamentoLegal.setDescricao((String) r.getValue("descricao"));
//        }
//
//        return fundamentoLegal;
//
//    }
//
//    public static GrauSigilo buildGrauSigilo(int id, String abreviacao, String descricao, boolean permiteAbreviacao) {
//
//        GrauSigilo grauSigilo = new GrauSigilo();
//        grauSigilo.setId(id);
//        grauSigilo.setAbreviacao(abreviacao);
//        grauSigilo.setDescricao(descricao);
//        grauSigilo.setPermite_prorrogacao(permiteAbreviacao);
//        return grauSigilo;
//
//    }
//
//    public static GrauSigilo buildGrauSigilo(int id) throws SQLException {
//
//        GrauSigilo grauSigilo = new GrauSigilo();
//
//        Result<Record> records = ConnectionManager.getInstance().select(Tables.GRAU_SIGILO, "id = " + id);
//        for(Record r : records){
//            grauSigilo.setId(Integer.parseInt((String) r.getValue("id")));
//            grauSigilo.setAbreviacao((String) r.getValue("abreviacao"));
//            grauSigilo.setDescricao((String) r.getValue("descricao"));
//
//            String p = (String) r.getValue("permite_prorrogacao");
//
//            if(p.equals("1")){
//                grauSigilo.setPermite_prorrogacao(true);
//            } else {
//                grauSigilo.setPermite_prorrogacao(false);
//            }
//
//        }
//        return grauSigilo;
//
//    }
//
//    public static Orgao buildOrgao(int id, String sigla, String nome, String telefone, String endereco, Email email, Orgao orgao_superior) {
//
//        Orgao orgao = new Orgao();
//        orgao.setId(id);
//        orgao.setSigla(sigla);
//        orgao.setNome(nome);
//        orgao.setTelefone(telefone);
//        orgao.setEndereco(endereco);
//        orgao.setEmail(email);
//        orgao.setOrgao_superior(orgao_superior);
//        return orgao;
//
//    }
//
//    public static Orgao buildOrgao(int id) throws SQLException {
//
//        Orgao orgao = new Orgao();
//
//        Result<Record> result = ConnectionManager.getInstance().select(Tables.ORGAO, "id = " + id);
//
//        for(Record r : result){
//            orgao.setId(Integer.parseInt((String) r.getValue("id")));
//            orgao.setSigla((String) r.getValue("sigla"));
//            orgao.setNome((String) r.getValue("nome"));
//            orgao.setTelefone((String) r.getValue("telefone"));
//            orgao.setEndereco((String) r.getValue("endereco"));
//            orgao.setEmail(ObjectFactory.buildEmail(Integer.parseInt((String) r.getValue("emailid"))));
//            orgao.setOrgao_superior(buildOrgao(Integer.parseInt((String) r.getValue("orgao_superiorid"))));
//        }
//
//        return orgao;
//
//    }
//
//    public static Prazo buildPrazo(int id, Date data, String evento) {
//        Prazo prazo = new Prazo();
//        prazo.setId(id);
//        prazo.setData(data);
//        prazo.setEvento(evento);
//        return prazo;
//    }
//
//    public static Prazo buildprazo(int id) throws SQLException {
//
//        Prazo prazo = new Prazo();
//
//        Result<Record> records = ConnectionManager.getInstance().select(Tables.PRAZO, "id = " + id);
//
//        for(Record r : records){
//            prazo.setId(Integer.parseInt((String) r.getValue("id")));
//            prazo.setData(new Date(Long.parseLong((String) r.getValue("data"))));
//            prazo.setEvento((String) r.getValue("evento"));
//        }
//
//        return prazo;
//    }
//
//    public static Status buildStatus(int id, String descricao) {
//        Status status = new Status();
//
//        status.setId(id);
//        status.setDescricao(descricao);
//
//        return status;
//
//    }
//
//    public static Status buildStatus(int id) throws SQLException {
//
//        Status status = new Status();
//
//        Result<Record> records = ConnectionManager.getInstance().select(Tables.STATUS, "id = " + id);
//
//        for(Record r : records){
//            status.setId(Integer.parseInt((String) r.getValue("id")));
//            status.setDescricao((String) r.getValue("descricao"));
//        }
//
//        return status;
//
//    }


}
