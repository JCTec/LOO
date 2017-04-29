/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Infrastructure;

import Data.People.*;
import Exceptions.NotValidNumber;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan
 */
public class Hospital {
    
    /**
     * Declarando todas las variables necesarias para la aplicacion,
     * de la clase Hospital se va a crear un XML donde se va almacenar toda la informacion.
     */
    private int doctorsIds;
    private int doctorsOfficeIds;
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
        this.doctorsIds = 1000;
        this.doctorsOfficeIds = 1;

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
        this.doctorsIds = 1000;
        this.doctorsOfficeIds = 0;

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
        this.doctorsIds = 1000;
        this.doctorsOfficeIds = 1;

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

        try {
            this.settelephone(telephone);
        }catch(NotValidNumber error){
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        try {
            this.setnumOfDoctorsOffices(numOfDoctorsOffices);
        }catch(NotValidNumber error){
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        try {
            this.setnumOfRooms(numOfRooms);
        }catch(NotValidNumber error){
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        this.offices = new ArrayList<>();
        this.rooms = new ArrayList<>();
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
        
        for(int x = 0; x < this.numOfRooms; x++){
            Room newRoom = new Room(x + 1);
            this.rooms.add(newRoom);
        }
        
        for(int x = 0; x < this.numOfDoctorsOffices; x++){
            Doc newRoom = new Room(x + 1);
            this.rooms.add(newRoom);
        }
        
    }
    
    public void setname(String name){
        if(name != null){
            this.name = name;
        }
    }
    
    public void setaddress(String address){
        if(address != null){
            this.address = address;
        }
    }
    
    public void settelephone(String telephone) throws NotValidNumber{
       
        if(telephone != null && telephone.length() == 10){ 
            this.telephone = telephone; 
       }else {
            this.telephone = "0000000000";
            throw new NotValidNumber("El numero de telefono no es valido, telefono asignado por omision (000) 00 00 000");
        }
    }
    
    public void setnumOfDoctorsOffices(int numOfDoctorsOffices) throws NotValidNumber{
       
        if(numOfDoctorsOffices >= 0){ 
            this.numOfDoctorsOffices = numOfDoctorsOffices; 
       }else {
            this.numOfDoctorsOffices = 0; 
            throw new NotValidNumber("El numero de oficinas no es valido, numero de oficinas asignado por omision: 0");
        }
    }
    
    public void setnumOfRooms(int numOfRooms) throws NotValidNumber{
       
        if(numOfRooms >= 0){ 
            this.numOfRooms = numOfRooms; 
       }else {
            this.numOfRooms = 0; 
            throw new NotValidNumber("El numero de cuartos no es valido, numero de cuartos asignado por omision: 0");
        }
    }
    
    public String getname(){
        return this.name;
    }
    
    public String getaddress(){
        return this.address;
    }
    
    public int getnumOfDoctorsOffices(){
        return this.numOfDoctorsOffices;
    }
    
    public int getnumOfRooms(){
        return this.numOfRooms;
    }
    
    public ArrayList<DoctorsOffice> getoffices(){
        return this.offices;
    }
    
    public ArrayList<Room> getrooms(){
        return this.rooms;
    }
    
    public ArrayList<Doctor> getdoctors(){
        return this.doctors;
    }
    
    public ArrayList<Patient> getpatients(){
        return this.patients;
    }
    
    /*
        private int id; // número entero que sirve de identificador de un consultorio dentro del hospital.
    private int floor; //número entero que indica el piso en el que se encuentra el consultorio.
    private float monthlyRent; // número real que indica cuánto cuesta mensualmente la renta del consultorio. 
    private String doctorID; //identificador del médico al que está asignado el consultorio. 
    private float lastPayment;
    */
    
    public void addDoctorOffice(int floor, float monthlyRent, String doctorID, float lastPayment){
        if(this.validateDoctor(doctorID) ==  true){
            this.doctorsOfficeIds ++;
            int id = this.doctorsOfficeIds;
            DoctorsOffice newOffice = new DoctorsOffice(id, floor, monthlyRent, doctorID, lastPayment);
            this.offices.add(newOffice);
        }
    }
    
    public void addRoom(){
        this.numOfRooms ++;
        Room newRoom = new Room(this.numOfRooms);
        
        this.rooms.add(newRoom);
    }
    
    // Alan ------------------------------
    public void assignOfficeToDoctor(int id, String idDoctor){  
        int roomFounded = 0;
        String idFounded = "";
        if(this.validateDoctor(idDoctor)==true && this.validateRoom(id) == true){
            for(int i=0; i<this.offices.size();i++){
                if(id == this.offices.get(i).getid()){
                    roomFounded = i;
                    i= this.offices.size();
                }
            }
            
            for(int i=0; i<this.doctors.size();i++){
                if(idDoctor.equals(this.doctors.get(i).getId())){
                    idFounded = this.doctors.get(i).getId();
                    i = this.doctors.size(); 
            }
        }
             this.offices.get(roomFounded).setdoctorID(idFounded);
        }    
           
        
        }
    
    
    
    public boolean validateDoctor(String idDoctor){
        boolean validacion = false;

        for(int i=0; i<this.doctors.size();i++){
            if(idDoctor.equals(this.doctors.get(i).getId())){
                validacion = true;
                i = this.doctors.size(); 
            }
        }
        return validacion;
    }
    
     public boolean validateDoctorOffice(int id){
        boolean validacion = false;

        for(int i=0; i<this.offices.size();i++){
            if(id == this.offices.get(i).getid()){
                validacion= true;
                i= this.offices.size();
            }
        }
        return validacion;
    }

    
    //Termina Alan ----------------------- 
}
