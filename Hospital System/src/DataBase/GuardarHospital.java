/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import Data.Infrastructure.Hospital;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan
 */
public class GuardarHospital {
    protected Hospital hospitalAGuardar;
    protected XStream xstream = new XStream();
   
    
    public GuardarHospital(Hospital H){
        
        this.hospitalAGuardar = H;
        this.xstream.alias("Hospital", Hospital.class);
        this.toXMl();
        
    }
    
    public GuardarHospital(){
        this.xstream.alias("Hospital", Hospital.class);
    }
    
    protected void toXMl(){
        String xml = this.xstream.toXML(this.hospitalAGuardar);
        this.Save(xml);
    }
    
    public String toXMl(Hospital H){
        return this.xstream.toXML(H);
    }
    
    protected void Save(String Xml){
        
        String name = System.getProperty("user.home") +  "/Documents/Hospitals/Hospital.txt";
        String path = System.getProperty("user.home") +  "/Documents/Hospitals";
        
        File theDir = new File(path);
        
        if (!theDir.exists()) {
            System.out.println("creating directory: " + theDir.getName());
            boolean result = false;

            try{
              theDir.mkdir();
                result = true;
            } 
            catch(SecurityException se){
                
            }        
            if(result) {    
                System.out.println("DIR created");  
            }
        }
        
        try(  PrintWriter out = new PrintWriter(name)  ){
            out.println(Xml);
            out.close();
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Archivo no encontrado...", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public void saveHospital(Hospital H, String Xml){
         
        String name = System.getProperty("user.home") +  "/Documents/Hospitals/Hospital.txt";
        String path = System.getProperty("user.home") +  "/Documents/Hospitals";
        
        File theDir = new File(path);
        
        if (!theDir.exists()) {
            System.out.println("creating directory: " + theDir.getName());
            boolean result = false;

            try{
              theDir.mkdir();
                result = true;
            } 
            catch(SecurityException se){
                
            }        
            if(result) {    
                System.out.println("DIR created");  
            }
        }
        
        try(  PrintWriter out = new PrintWriter(name)  ){
            out.println(Xml);
            out.close();
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Archivo no encontrado...", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    
    
    
}
