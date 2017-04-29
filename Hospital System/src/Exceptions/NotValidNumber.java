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
public class NotValidNumber extends Exception {
    private String strErr;
    
    public NotValidNumber(){
        this.strErr = "No ha introducido un valor numérico";
    }
    
    public NotValidNumber(String error){
        this.strErr = error;
    }
    
    @Override
    public String toString(){
        return this.strErr;
    }
}

