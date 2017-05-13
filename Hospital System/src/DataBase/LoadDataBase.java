/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import Data.Infrastructure.Hospital;
import java.io.IOException;
import com.thoughtworks.xstream.XStream;
import java.nio.file.Files;
import java.nio.file.Paths;


/**
 *
 * @author Juan
 */
public class LoadDataBase {
    private Hospital hospital;
    private XStream xstream = new XStream();
    
    public LoadDataBase(){
        this.xstream.alias("Hospital", Hospital.class);
        
        String Xml = this.Get();
        
        if(Xml != "NOT_FOUND"){
            this.hospital = (Hospital)this.xstream.fromXML(Xml);
            
        }
    }
    
    public Hospital LoadHospital(){
        return this.hospital;
    }
    
    private String Get(){
        String name = System.getProperty("user.home") +  "/Documents/Hospitals/Hospital.txt";
        
        try {
            return new String(Files.readAllBytes(Paths.get(name)));
        } catch (IOException ex) {
            return "NOT_FOUND";
        }
        
    }
}
