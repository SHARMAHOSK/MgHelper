/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SkDatabase;

import AjSupporter.AjHelper;
import java.sql.Connection;
import java.util.HashMap;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author pos08
 */
public class MyDb extends AjHelper implements MyDb_inf {

    @Override
    public Connection getMySqlConnection(String configPath) {
        Connection con = null;
        try {
            HashMap<String, String> configData = getPropertyInformation(configPath);
            String driver = configData.get("driver"),
                    dbName = configData.get("dbName"),
                    dbUser = configData.get("dbUser"),
                    dbPass = configData.get("dbPass"),
                    database = configData.get("database"),
                    port = configData.get("port"),
                    host = configData.get("host"),
                    dbUrl = "jdbc:" + database + "://" + host + ":" + port + "/" + dbName
                    + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            Class.forName(driver);
            con = DriverManager.getConnection(dbUrl, dbUser, dbPass);
        } catch (ClassNotFoundException | SQLException e) {
            
        }
        return con;
    }

}


//
