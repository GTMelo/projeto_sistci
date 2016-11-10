package com.github.gtmelo.sistci_api.security.exception;

/**
 * Created by 02364114110 on 10/11/2016.
 */
public class SecurityException extends Exception {

    private String callerName;

    public SecurityException(String callerName, String message) {
        super(callerName + "::" + message);
    }

    public String getCallerName() {
        return callerName;
    }

    public void setCallerName(String callerName) {
        this.callerName = callerName;
    }
}
