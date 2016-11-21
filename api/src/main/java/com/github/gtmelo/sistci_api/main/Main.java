package com.github.gtmelo.sistci_api.main;

import com.github.gtmelo.sistci_api.services.v1.TciResource;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import util.ConfigManager;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ResourceBundle;

/**
 * Created by 02364114110 on 09/11/2016.
 */
public class Main {

    public static final Logger log = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        tBF();

    }

    public static void tBF(){

        ConfigManager c = ConfigManager.getInstance();

        log.debug(c.getDbHost());
        log.debug(c.getDbPort());
        log.debug(c.getDbName());
        log.debug(c.getDbUser());
        log.debug(c.getDbPass());

    }

    public static void tGetTci() {

        TciResource tciResource = new TciResource();

        log.debug(tciResource.getTci(1).getEntity().toString());
        log.debug(tciResource.getTci(2).getEntity().toString());
        log.debug(tciResource.getTci(3).getEntity().toString());
        log.debug(tciResource.getTci(4).getEntity().toString());
        log.debug(tciResource.getTci(5).getEntity().toString());
        log.debug(tciResource.getTci(200).getEntity().toString());
        log.debug(tciResource.getTci(1000).getEntity().toString());
        log.debug(tciResource.getTci(1001).getEntity().toString());


    }

}
