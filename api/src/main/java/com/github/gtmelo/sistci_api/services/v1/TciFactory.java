package com.github.gtmelo.sistci_api.services.v1;

import org.json.simple.JSONObject;

/**
 * Created by 02364114110 on 09/11/2016.
 */
public class TciFactory {

    public static Tci build() {

        Tci tci = Tci.build();

        tci.setId("1");
        tci.setOrgaoId("1");
        tci.setPessoaId("1");
        tci.setPessoaId("1");
        tci.setPrazoId("1");
        tci.setCategoriaId("1");
        tci.setFundamentoId("1");
        tci.setGrau_sigiloId("1");
        tci.setStatusId("1");
        tci.setCidicId("1");
        tci.setNup("nup1");
        tci.setData_producao("01/01/2016");
        tci.setTipo("Memorando 1/2016");
        tci.setRazaoClassificacao("Razão XYZ");

        return tci;
    }

    public static Tci build(JSONObject jsonObject) {

        Tci tci = Tci.build();

        String id = String.valueOf(jsonObject.get("id"));
        String orgaoId = String.valueOf(jsonObject.get("orgaoId"));
        String pessoaId = String.valueOf(jsonObject.get("pessoaId"));
        String categoriaId = String.valueOf(jsonObject.get("categoriaId"));
        String prazoId = String.valueOf(jsonObject.get("prazoId"));
        String fundamentoId = String.valueOf(jsonObject.get("fundamentoId"));
        String grau_sigiloId = String.valueOf(jsonObject.get("grau_sigiloId"));
        String statusId = String.valueOf(jsonObject.get("statusId"));
        String cidicId = String.valueOf(jsonObject.get("cidicId"));
        String nup = (String) jsonObject.get("nup");
        String data_producao = (String) jsonObject.get("data_producao");
        String tipo = (String) jsonObject.get("tipo");
        String razaoClassificacao = (String) jsonObject.get("razaoClassificacao");

        tci.setId(id);
        tci.setOrgaoId(orgaoId);
        tci.setPessoaId(pessoaId);
        tci.setCategoriaId(categoriaId);
        tci.setPrazoId(prazoId);
        tci.setFundamentoId(fundamentoId);
        tci.setGrau_sigiloId(grau_sigiloId);
        tci.setStatusId(statusId);
        tci.setCidicId(cidicId);
        tci.setNup(nup);
        tci.setData_producao(data_producao);
        tci.setTipo(tipo);
        tci.setRazaoClassificacao(razaoClassificacao);

        return tci;

    }

}
