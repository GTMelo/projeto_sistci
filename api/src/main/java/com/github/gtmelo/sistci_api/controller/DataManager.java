package com.github.gtmelo.sistci_api.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by 02364114110 on 10/11/2016.
 */
public class DataManager {

    private static DataManager instance;
    private Connection connection;

    private DataManager() {

//        MysqlDataSource dataSource = new MysqlDataSource();
//        dataSource.setUser("root");
//        dataSource.setPassword("root");
//        dataSource.setServerName("localhost");
//        dataSource.setPort(3306);
//        dataSource.setDatabaseName("sistci");
        try {
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistci?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "root");
        } catch (SQLException e) {
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
