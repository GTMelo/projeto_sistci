package com.github.gtmelo.sistci_api.security;

import com.github.gtmelo.sistci_api.security.rule.ExampleRule;
import com.github.gtmelo.sistci_api.security.rule.ISecurityRule;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 02364114110 on 10/11/2016.
 */
public class RequestValidator {

    private static RequestValidator instance;
    private List<ISecurityRule> regras;

    private RequestValidator() {

        regras = new ArrayList<ISecurityRule>();
        this.regras.add(new ExampleRule());

    }

    public static RequestValidator getInstance() {
        if (instance == null) instance = new RequestValidator();
        return instance;
    }

    public List<ISecurityRule> getRegras() {
        return regras;
    }

    /**
     * Roda a rotina de checagens de segurança. Para adicionar uma regra, adicione seu resultado à arraylist
     *
     * @return String "ok" para requests aceitas, código do erro para erros
     */
    public boolean validarRequest(String dados) {

        try {
            for (ISecurityRule regra : regras) {
                regra.validate(dados);
            }
        } catch (Exception e) {
            // TODO Log a exceção
            System.out.println(e.getMessage());
            return false;
        }

        return true;

    }
}
