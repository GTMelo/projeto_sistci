package com.github.gtmelo.sistci_api.security;

import com.github.gtmelo.sistci_api.security.rule.ExampleRule;
import com.github.gtmelo.sistci_api.security.rule.ISecurityRule;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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

    private Logger log = LogManager.getLogger(RequestValidator.class);

    public boolean validarRequest(String dados) {

        try {
            for (ISecurityRule regra : regras) {
                regra.validate(dados);
            }
        } catch (Exception e) {
            log.warn("Uma tentativa de acesso a dados foi negada: " + dados);

            return false;
        }

        return true;

    }
}
