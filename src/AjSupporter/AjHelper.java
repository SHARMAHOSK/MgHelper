/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AjSupporter;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Properties;

/**
 *
 * @author pos08
 */
public class AjHelper implements AjInterface{

    @Override
    public String xNull(final String str) {
        if (str == null) return "";
        return str;
    }

    @Override
    public Date getCurruntDate() {
        return new Date();
    }

    @Override
    public HashMap<String, String> getPropertyInformation(final String configpath) {
        FileInputStream file = null;
        final HashMap<String, String> hashMap = new HashMap<>();
        try {
            final Properties props = new Properties();
            file = new FileInputStream(configpath);
            props.load(file);
            file.close();
            props.keySet().forEach(key -> {hashMap.put(key.toString(),props.getProperty(key.toString(),""));
            });
        } catch (IOException e) {
            System.out.println("AjHelper->getPropertyInformation(final String configpath) \n" + getCurruntDate() + e.getMessage());
        } finally {
            try {
                if (file != null) {
                    file.close();
                }
            } catch (IOException e) {
                System.out.println("AjHelper->getPropertyInformation(final String configpath) \n" + getCurruntDate() + e.getMessage());
            }
        }
        return hashMap;
    }

   
}
