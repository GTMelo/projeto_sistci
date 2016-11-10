package com.github.gtmelo.sistci_api.security.rule;

import com.github.gtmelo.sistci_api.security.exception.SecurityException;

/**
 * Created by 02364114110 on 10/11/2016.
 */
public interface ISecurityRule {
    void validate(String dados) throws SecurityException;

    void handleDados(String dados) throws SecurityException;
}
