/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author alanp
 */
public class OverSize extends Exception {
    private String strErr;
    
    public OverSize(){
        this.strErr = "El paciente ya alcanzó el máximo número de doctores posibles";
    }
    
    public OverSize(String error){
        this.strErr = error;
    }
    
    @Override
    public String toString(){
        return this.strErr;
    }
}
