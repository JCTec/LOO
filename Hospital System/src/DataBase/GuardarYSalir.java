/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import Data.Infrastructure.Hospital;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan
 */
public class GuardarYSalir extends GuardarHospital{
    
    
    
    public GuardarYSalir(Hospital H){
        this.hospitalAGuardar = H;
        this.xstream.alias("Hospital", Hospital.class);
        this.toXMl();
        System.exit(0);
    }
    
    
    
    
}
