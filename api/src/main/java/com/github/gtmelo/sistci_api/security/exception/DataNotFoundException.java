package com.github.gtmelo.sistci_api.security.exception;

/**
 * Created by 02364114110 on 10/11/2016.
 */
public class DataNotFoundException extends Exception {

    public DataNotFoundException(String caller, String message) {
        super(caller + "::" + message);
    }
}
