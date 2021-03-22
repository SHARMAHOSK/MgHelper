/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AjSupporter;

import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author pos08
 */
public interface AjInterface {
    
    public String xNull(String str);

    public HashMap<String, String> getPropertyInformation(String configpath);

    public Date getCurruntDate();
}
