package com.github.gtmelo.sistci_api.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by 02364114110 on 10/11/2016.
 */
public class DataManager {

    private Logger log;

    private static DataManager instance;
    private Connection connection;

    private DataManager() {

        log = LogManager.getLogger(DataManager.class);

        String host = "192.168.56.100";
        String port = "3306";
        String db = "sistci";
        String user = "teste";
        String pass = "teste";

        String url = String.format("jdbc:mysql://%s:%s/%s", host, port, db);

        try {
            log.debug("Attempting to connect to db now");
            connection = DriverManager.getConnection(url,user,pass);
        } catch (SQLException e) {
            log.fatal("Failed to connect to db");
            e.printStackTrace();
        }

    }

    public static DataManager getInstance() {

        if (instance == null) instance = new DataManager();

        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}
