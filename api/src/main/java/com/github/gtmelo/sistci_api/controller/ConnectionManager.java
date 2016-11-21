package com.github.gtmelo.sistci_api.controller;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import util.ConfigManager;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by 02364114110 on 10/11/2016.
 */
public class ConnectionManager {

    private static ConnectionManager instance;
    private        Logger            log;
    private        MysqlDataSource   dataSource;
    private        Connection        connection;

    private ConnectionManager() {

        log = LogManager.getLogger(ConnectionManager.class);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            log.fatal("Couldn't load com.mysql.jdbc.Driver");
            e.printStackTrace();
        }

        ConfigManager c = ConfigManager.getInstance();

        String host = c.getDbHost();
        int    port = c.getDbPort();
        String db   = c.getDbName();
        String user = c.getDbUser();
        String pass = c.getDbPass();

        dataSource = new MysqlDataSource();
        dataSource.setServerName(host);
        dataSource.setPortNumber(port);
        dataSource.setDatabaseName(db);
        dataSource.setUser(user);
        dataSource.setPassword(pass);

    }

    public static ConnectionManager getInstance() throws SQLException {

        if (instance == null) instance = new ConnectionManager();
        instance.log.debug("Tentando conexão com banco de dados");
        instance.connection = instance.dataSource.getConnection();
        return instance;
    }

    public Connection getConnection() throws SQLException {
        return this.connection;
    }
}

