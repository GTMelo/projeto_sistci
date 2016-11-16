package com.github.gtmelo.sistci_api.controller;

import com.github.gtmelo.sistci_api.data.Tables;
import com.mysql.cj.jdbc.MysqlDataSource;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by 02364114110 on 10/11/2016.
 */
public class DataManager {

    private static DataManager     instance;
    private        Logger          log;
    private        MysqlDataSource dataSource;
    private        Connection      connection;

    private DataManager() {

        log = LogManager.getLogger(DataManager.class);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            log.fatal("Couldn't load com.mysql.jdbc.Driver");
            e.printStackTrace();
        }

        String host = "192.168.0.98";
        int    port = 3306;
        String db   = "sistci";
        String user = "webserver";
        String pass = "webserver";

        dataSource = new MysqlDataSource();
        dataSource.setServerName(host);
        dataSource.setPortNumber(port);
        dataSource.setDatabaseName(db);
        dataSource.setUser(user);
        dataSource.setPassword(pass);

//            connection = DriverManager.getConnection(url,user,pass);
    }

    public static DataManager getInstance() throws SQLException {

        instance.log.debug("Tentando conexão com banco de dados");
        if (instance == null) instance = new DataManager();
        instance.connection = instance.dataSource.getConnection();
        return instance;
    }

    public Connection getConnection() throws SQLException {
        return this.connection;
    }
}

