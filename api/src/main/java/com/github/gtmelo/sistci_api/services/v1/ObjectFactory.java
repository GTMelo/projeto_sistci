package com.github.gtmelo.sistci_api.services.v1;

import org.json.simple.JSONObject;

import java.sql.Date;

/**
 * Created by 02364114110 on 09/11/2016.
 */
public class TciFactory {

    public static Tci build(
            int id,
            Date data_producao,
            String tipo_documento,
            String razao_classificacao,
            String nup,
            String cidic,
            Orgao orgao,
            Categoria categoria,
            Prazo prazo,
            FundamentoLegal fundamentoLegal,
            GrauSigilo grauSigilo,
            Status status
    ) {

        Tci tci = new Tci();

        tci.setId(id);
        tci.setData_producao(data_producao);
        tci.setTipo_documento(tipo_documento);
        tci.setRazao_classificacao(razao_classificacao);
        tci.setNup(nup);
        tci.setCidic(cidic);
        tci.setOrgao(orgao);
        tci.setCategoria(categoria);
        tci.setPrazo(prazo);
        tci.setFundamentoLegal(fundamentoLegal);
        tci.setGrauSigilo(grauSigilo);
        tci.setStatus(status);

        return tci;
    }

    public static Tci build(JSONObject jsonObject) {

        Tci tci = new Tci();

        String id                  = (String) jsonObject.get("id");
        String data_producao       = (String) jsonObject.get("data_producao");
        String tipo_documento      = (String) jsonObject.get("tipo_documento");
        String razao_classificacao = (String) jsonObject.get("razao_classificacao");
        String nup                 = (String) jsonObject.get("nup");
        String cidic               = (String) jsonObject.get("cidic");
        String orgao               = (String) jsonObject.get("orgao");
        String categoria           = (String) jsonObject.get("categoria");
        String prazo               = (String) jsonObject.get("prazo");
        String fundamentoLegal     = (String) jsonObject.get("fundamentoLegal");
        String grauSigilo          = (String) jsonObject.get("grauSigilo");
        String status              = (String) jsonObject.get("status");

        tci.setId(Integer.parseInt(id));
        tci.setData_producao(new Date(Long.parseLong(data_producao)));
        tci.setTipo_documento(tipo_documento);
        tci.setRazao_classificacao(razao_classificacao);
        tci.setNup(nup);
        tci.setCidic(cidic);
        tci.setOrgao(new Orgao(orgao));
        tci.setCategoria(new Categoria(categoria));
        tci.setPrazo(new Prazo(prazo));
        tci.setFundamentoLegal(new FundamentoLegal(fundamentoLegal));
        tci.setGrauSigilo(new GrauSigilo(grauSigilo));
        tci.setStatus(new Status(status));


        tci.setId(Integer.parseInt(id));
        tci.setNup(nup);
        tci.setCategoria(categoria);
        tci.setCidic(cidic);
        tci.setData_producao(new Date(Long.parseLong(data_producao)));
        tci.setEmail(email);
        tci.setEndereco(endereco);
        tci.setFundamento(fundamento);
        tci.setGrau(grau);
        tci.setOrganizacao_nome(organizacao_nome);
        tci.setOrganizacao_sigla(organizacao_sigla);
        tci.setOrgao_telefone(orgao_telefone);
        tci.setPrazo_data(new Date(Long.parseLong(prazo_data)));
        tci.setPrazo_evento(prazo_evento);
        tci.setRazao_classificacao(razao_classificacao);
        tci.setStatus(status);
        tci.setTipo_documento(tipo_documento);

        return tci;

    }

}
