package util;

import java.util.ResourceBundle;

/**
 * Created by Gustavo on 19/11/2016.
 */
public class ConfigManager {

    private static ConfigManager instance;
    private ResourceBundle resourceBundle;
    private String dbHost;
    private int dbPort;
    private String dbName;
    private String dbUser;
    private String dbPass;

    private ConfigManager() {
        this.resourceBundle = ResourceBundle.getBundle("config");
        this.dbHost = resourceBundle.getString("dbHost");
        this.dbPort = Integer.parseInt(resourceBundle.getString("dbPort"));
        this.dbName = resourceBundle.getString("dbName");
        this.dbUser = resourceBundle.getString("dbUser");
        this.dbPass = resourceBundle.getString("dbPass");
    }

    public static ConfigManager getInstance() {
        if(instance == null) instance = new ConfigManager();
        return instance;
    }

    public String getDbHost() {
        return dbHost;
    }

    public int getDbPort() {
        return dbPort;
    }

    public String getDbName() {
        return dbName;
    }

    public String getDbUser() {
        return dbUser;
    }

    public String getDbPass() {
        return dbPass;
    }
}
