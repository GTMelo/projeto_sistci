package com.github.gtmelo.sistci_api.services.v1;

/**
 * Created by 02364114110 on 09/11/2016.
 */
public class TciFactory {

    public static Tci build() {

        Tci tci = Tci.build();

        tci.setId(1);
        tci.setOrgaoId(1);
        tci.setPessoaId(1);
        tci.setPessoaId(1);
        tci.setPrazoId(1);
        tci.setFundamentoId(1);
        tci.setGrau_sigiloId(1);
        tci.setStatusId(1);
        tci.setCidicId(1);
        tci.setNup("nup1");
        tci.setData_producao("01/01/2016");
        tci.setTipo("Memorando 1/2016");
        tci.setRazaoClassificacao("Razão XYZ");

        return tci;
    }

}
