/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import SkDatabase.MyDb;
import java.sql.*;

/**
 *
 * @author pos08
 */
public class Shubham {
    public static void main(String [] args){
        try{
            MyDb myDb = new MyDb();
            Connection con = myDb.getMySqlConnection("C:/Users/pos08/Documents/NetBeansProjects/MgHelper/src/SkDatabase/config.properties");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from profile where pid=1000");
            if(rs.next()){
                System.out.println(rs.getString("name"));
            }
        }catch(Exception e){
            
        }
    }
}
