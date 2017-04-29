/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Infrastructure;

import Data.People.*;
import Exceptions.NotValidNumber;
import java.util.ArrayList;

/**
 *
 * @author Juan
 */
public class Hospital {
    
    /**
     * Declarando todas las variables necesarias para la aplicacion,
     * de la clase Hospital se va a crear un XML donde se va almacenar toda la informacion.
     */
    
    private String name;
    private String address;
    private String telephone;
    private int numOfDoctorsOffices;
    private int numOfRooms;
    private ArrayList<DoctorsOffice> offices;
    private ArrayList<Room> rooms;
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;
    
    public Hospital(){
        this.name = "NOT DEFINED";
        this.address = "NOT DEFINED";
        this.telephone = "NOT DEFINED";
        this.numOfDoctorsOffices = 0;
        this.numOfRooms = 0;
        this.offices = new ArrayList<>();
        this.rooms = new ArrayList<>();
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }
    
    public Hospital(Hospital H){
        this.name = H.name;
        this.address = H.address;
        this.telephone = H.telephone;
        this.numOfDoctorsOffices = H.numOfDoctorsOffices;
        this.numOfRooms = H.numOfRooms;
        this.offices = H.offices;
        this.rooms = H.rooms;
        this.doctors = H.doctors;
        this.patients = H.patients;
    }
    
    public Hospital(String name, String address, String telephone, int numOfDoctorsOffices, int numOfRooms){
        if(name != null){
            this.name = name;
        }
        else{
            this.name = "NOT DEFINED";
        }
        
        if(address != null){
            this.address = address;
        }else{
            this.address = "NOT DEFINED";
        }
        
        if(telephone != null || telephone.length() == 10){
            this.telephone = telephone;
        }else{
            this.telephone = "NOT DEFINED";
        }
        
        try {
            this.setdoctorID(doctorID);
        }catch(NotValidNumber error){
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
            this.doctorID = "NOT DEFINED";
        }
        
        if()
        this.numOfDoctorsOffices = numOfDoctorsOffices;
        this.numOfRooms = numOfRooms;
        this.offices = new ArrayList<>();
        this.rooms = new ArrayList<>();
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }
    
    public void settelephone(String telephone) throws NotValidNumber{
       
        if(telephone != null || telephone.length() == 10){ 
            this.telephone = telephone; 
       }else {
            throw new NotValidNumber("El numero de telefono no es valido");
        }
    }
    
    
    // Alan ------------------------------
    
    //TODO
    
    //Termina Alan ----------------------- 
}
