/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Infrastructure;

import Data.People.*;
import Exceptions.NotValidNumber;
import Exceptions.OverSize;
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
        
        this.fillRoomsAndOffice();
        
    }
    
    private void fillRoomsAndOffice(){
        
        for(int x = 0; x < this.numOfRooms; x++){
            Room newRoom = new Room(x + 1);
            this.rooms.add(newRoom);
        }
        
        for(int x = 0; x < this.numOfDoctorsOffices; x++){
            DoctorsOffice newDoctorsOffice = new DoctorsOffice();
            
            try {
                newDoctorsOffice.setid(x + 1);
            } catch (NotValidNumber error) {
                JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            
            this.offices.add(newDoctorsOffice);
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
    
    /**
     * Funcion para buscar un paciente por su Numero de Seguridad Social.
     * Si lo encuetra regresa su posicion en el arreglo de pacientes, en caso de no encontrarlo regresa un String vacio.
     * 
     * Se recomienda usar if (!securityNumberFounded.isEmpty()){ //TODO }
     * 
     * @param securityNumber
     * @return
     */
    public String findPatientBySecurityNumber(String securityNumber){
        String securityNumberFounded = "";
        
        
        for(int i=0; i<this.patients.size();i++){
            if(securityNumber.equals(this.patients.get(i).getsecurityNumber())){
                securityNumberFounded = this.patients.get(i).getsecurityNumber();
                i = this.patients.size(); 
            }
        }
        if(securityNumberFounded.isEmpty()){
         JOptionPane.showMessageDialog(null, "Paciente no encontrado, revise el Numero de Seguridad Social", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        return securityNumberFounded;
    }
    
    public void addDoctorOffice(int floor, float monthlyRent, String doctorID, float lastPayment){
        if(this.validateDoctor(doctorID) ==  true){
            this.numOfDoctorsOffices ++;
            int id = this.numOfDoctorsOffices;
            DoctorsOffice newOffice = new DoctorsOffice(id, floor, monthlyRent, doctorID, lastPayment);
            this.offices.add(newOffice);
        }
    }
    
    public void addDoctorOffice(int floor, float monthlyRent){
            this.numOfDoctorsOffices ++;
            int id = this.numOfDoctorsOffices;
            DoctorsOffice newOffice = new DoctorsOffice();
            
            try {
                newOffice.setid(id);
            } catch (NotValidNumber error) {
                JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            
            try {
                newOffice.setfloor(floor);
            } catch (NotValidNumber error) {
                JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            
            try {
                newOffice.setmonthlyRent(monthlyRent);
            } catch (NotValidNumber error) {
                JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            
            this.offices.add(newOffice);
        
    }
    
    public void addDoctorOffice(int floor){
            this.numOfDoctorsOffices ++;
            int id = this.numOfDoctorsOffices;
            DoctorsOffice newOffice = new DoctorsOffice();
            
            try {
                newOffice.setid(id);
            } catch (NotValidNumber error) {
                JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            
            try {
                newOffice.setfloor(floor);
            } catch (NotValidNumber error) {
                JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            
            this.offices.add(newOffice);
        
    }
    
    public void addDoctorOffice(){
            this.numOfDoctorsOffices ++;
            int id = this.numOfDoctorsOffices;
            DoctorsOffice newOffice = new DoctorsOffice();
            
        try {
            newOffice.setid(id);
        } catch (NotValidNumber error) {
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
            
            this.offices.add(newOffice);
    }
    
    //addDoctorOffice -------------------------------------------------
    
    public void addRoom(){
        this.numOfRooms ++;
        Room newRoom = new Room(this.numOfRooms);
        
        this.rooms.add(newRoom);
    }
    
    public void addRoom(String patientID){
        this.numOfRooms ++;
        Room newRoom = new Room(this.numOfRooms);
        
        newRoom.setPatientID(patientID);
        
        this.rooms.add(newRoom);
    }
    
    public void showDoctorsOfficeInfo(String doctorsOfficeId){
        
        DoctorsOffice officeFound = this.offices.get(Integer.valueOf(doctorsOfficeId) - 1);

        //officeFound.
    }
    
    public void showDoctorInfo(String doctorId){
        String idFounded = "";
        
        
        for(int i=0; i<this.doctors.size();i++){
            if(doctorId.equals(this.doctors.get(i).getId())){
                idFounded = this.doctors.get(i).getId();
                i = this.doctors.size(); 
            }
        }
        
        if (!idFounded.isEmpty()){
            //Display info
        }
        
    }
    
    public void showPatientInfo(String securityNumber){
        String securityNumberFounded = this.findPatientBySecurityNumber(securityNumber);
        
        if (!securityNumberFounded.isEmpty()){
            //Display info
        }
        
    }
    
    public void assignDoctorToPatient(String doctorId, String securityNumber){
        String securityNumberFounded = this.findPatientBySecurityNumber(securityNumber);
        
        if (!securityNumberFounded.isEmpty()){
            try {
                this.patients.get(Integer.valueOf(securityNumberFounded)).setNewDoc(doctorId);
            } catch (OverSize error) {
                JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
            } catch (NotValidNumber ex) {
                JOptionPane.showMessageDialog(null, ex.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public void assignRoomToPatient(String securityNumber, String roomId){
        String securityNumberFounded = this.findPatientBySecurityNumber(securityNumber);
        
        if (!securityNumberFounded.isEmpty()){
            try {
                this.patients.get(Integer.valueOf(securityNumberFounded)).setroomID(roomId);
            } catch (NotValidNumber error) {
                JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void assignOfficeToDoctor(String idDoctor, String doctorsOfficeId){
        
        try {
            this.offices.get(doctorsIds - 1).setdoctorID(idDoctor);
        } catch (NotValidNumber error) {
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public void changeStatusOfPatient(String securityNumber, String Status){
        String securityNumberFounded = this.findPatientBySecurityNumber(securityNumber);
        
        if (!securityNumberFounded.isEmpty()){
            this.patients.get(Integer.valueOf(securityNumberFounded)).setstatus(Status);
        }
    }
    
    public ArrayList<Patient> showPatientsReadyToGoHome(){
        
        ArrayList<Patient> patientsReady = new ArrayList<>();
        
        for(int i=0; i<this.patients.size();i++){
            if(this.patients.get(i).getstatus().equals("Alta")){
                patientsReady.add(this.patients.get(i));
            }
        }
        return patientsReady;
    }
    
    public void dischargePatient(String securityNumber){
        String securityNumberFounded = this.findPatientBySecurityNumber(securityNumber);
        
        for(int x = 0; x < this.numOfRooms; x++){
            if(this.rooms.get(x).getPatientID().equals(securityNumber)){
                this.rooms.get(x).setPatientID("Vacío");
                
                x = this.numOfRooms;
            }
            
        }
        
        for(int x = 0; x < this.doctors.size(); x++){
            this.doctors.get(x).erasePatient(securityNumber);
        }
        
        if (!securityNumberFounded.isEmpty()){
            this.patients.remove(securityNumberFounded);
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

}
