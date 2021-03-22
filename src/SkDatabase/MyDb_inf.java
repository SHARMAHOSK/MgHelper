/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SkDatabase;

import java.sql.Connection;

/**
 *
 * @author pos08
 */
public interface MyDb_inf {
    public Connection getMySqlConnection(String configPath);
}
