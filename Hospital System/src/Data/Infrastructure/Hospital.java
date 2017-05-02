/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Infrastructure;

import Data.People.*;
import Exceptions.NotValidNumber;
import Exceptions.OverSize;
import Interfaz.Paneles.ShowPerson;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
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
    
    /**
     *Constructor con valores por omisión
     */
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
    
    /**
     *Constructor de copia
     * @param H
     */
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
    
    /**
     * Constructor con valores aislados
     * @param name
     * @param address
     * @param telephone
     * @param numOfDoctorsOffices
     * @param numOfRooms
     */
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
    
    /**
     *Método set para asignar un nombre a un Hospital
     * @param name
     */
    public void setname(String name){
        if(name != null){
            this.name = name;
        }
    }
    
    /**
     *Método set para asignar una dirección a un Hospital
     * @param address
     */
    public void setaddress(String address){
        if(address != null){
            this.address = address;
        }
    }
    
    /**
     *Método set para asginar un teléfono a un Hospital
     * @param telephone
     * @throws NotValidNumber
     */
    public void settelephone(String telephone) throws NotValidNumber{
       
        if(telephone != null && telephone.length() == 10){ 
            this.telephone = telephone; 
       }else {
            this.telephone = "0000000000";
            throw new NotValidNumber("El numero de telefono no es valido, telefono asignado por omision (000) 00 00 000");
        }
    }
    
    /**
     *Método set para asignar un número de oficinas a un Hospital
     * @param numOfDoctorsOffices
     * @throws NotValidNumber
     */
    public void setnumOfDoctorsOffices(int numOfDoctorsOffices) throws NotValidNumber{
       
        if(numOfDoctorsOffices >= 0){ 
            this.numOfDoctorsOffices = numOfDoctorsOffices; 
       }else {
            this.numOfDoctorsOffices = 0; 
            throw new NotValidNumber("El numero de oficinas no es valido, numero de oficinas asignado por omision: 0");
        }
    }
    
    /**
     *Método set para asignar un número de habitaciones a un Hospital
     * @param numOfRooms
     * @throws NotValidNumber
     */
    public void setnumOfRooms(int numOfRooms) throws NotValidNumber{
       
        if(numOfRooms >= 0){ 
            this.numOfRooms = numOfRooms; 
       }else {
            this.numOfRooms = 0; 
            throw new NotValidNumber("El numero de cuartos no es valido, numero de cuartos asignado por omision: 0");
        }
    }
    
    /**
     *Método get para obtener el nombre de un Hospital
     * @return name
     */
    public String getname(){
        return this.name;
    }
    
    /**
     *Método get para obtener la dirección de un Hospital
     * @return address
     */
    public String getaddress(){
        return this.address;
    }
    
    /**
     *Método get para obtener el número de consultorios
     * @return numOfDoctorsOffice
     */
    public int getnumOfDoctorsOffices(){
        return this.numOfDoctorsOffices;
    }
    
    /**
     *Método get para obtener el número de habitaciones
     * @return numOfRooms
     */
    public int getnumOfRooms(){
        return this.numOfRooms;
    }
    
    /**
     *Mpetodo get para obtener los datos de los consultorios
     * @return offices
     */
    public ArrayList<DoctorsOffice> getoffices(){
        return this.offices;
    }
    
    /**
     *Método get para obtener los datos de las habitaciones
     * @return rooms
     */
    public ArrayList<Room> getrooms(){
        return this.rooms;
    }
    
    /**
     *Método get para obtener los datos de los doctores de un Hospital
     * @return doctos
     */
    public ArrayList<Doctor> getdoctors(){
        return this.doctors;
    }
    
    /**
     *Método get para obtener los datos de los pacientes de un Hospital
     * @return patients
     */
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
     * @return securityNumberFounded
     */
    public String findPatientBySecurityNumber(String securityNumber){
        String securityNumberFounded = "";
        
        
        for(int i=0; i<this.patients.size();i++){
            if(securityNumber.equals(this.patients.get(i).getsecurityNumber())){
                securityNumberFounded = String.valueOf(i);
                i = this.patients.size(); 
            }
        }
        if(securityNumberFounded.isEmpty()){
         JOptionPane.showMessageDialog(null, "Paciente no encontrado, revise el Numero de Seguridad Social", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        return securityNumberFounded;
    }
    
    /**
     * Método para agregar un consultorio a un Hospital con un doctor
     * @param floor
     * @param monthlyRent
     * @param doctorID
     * @param lastPayment
     */
    public void addDoctorOffice(int floor, float monthlyRent, String doctorID, float lastPayment){
        if(this.validateDoctor(doctorID) ==  true){
            this.numOfDoctorsOffices ++;
            int id = this.numOfDoctorsOffices;
            DoctorsOffice newOffice = new DoctorsOffice(id, floor, monthlyRent, doctorID, lastPayment);
            this.offices.add(newOffice);
        }
    }
    
    /**
     *Segundo método para agregar un consultorio vacío
     * @param floor
     * @param monthlyRent
     */
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
    
    /**
     *Tercer método para agregar un consultorio pero en este caso sin un costo asignado por mes
     * @param floor
     */
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

    /**
     *Método para crear una Habitación sin un Paciente
     */
    
    public void addRoom(){
        this.numOfRooms ++;
        Room newRoom = new Room(this.numOfRooms);
        
        this.rooms.add(newRoom);
    }
    
    /**
     *Método para crear una Habitación con un Paciente
     * @param patientID
     * @throws Exceptions.NotValidNumber
     */
    public void addRoom(String patientID) throws NotValidNumber{
        this.numOfRooms ++;
        Room newRoom = new Room(this.numOfRooms);
        
        newRoom.setPatientID(patientID);
        
        this.rooms.add(newRoom);
    }
    
    /**
     *Método para hacer búsquedas de consultorio
     * @param doctorsOfficeId
     */
    public void showDoctorsOfficeInfo(String doctorsOfficeId){
        
        DoctorsOffice officeFound = this.offices.get(Integer.valueOf(doctorsOfficeId) - 1);

        //officeFound.
    }
    
    /**
     *Mpetodo para hacer búsquedas de Doctores
     * @param doctorId
     */
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
    
    /**
     *Método mostrar la informacion del paciente con su NSS.
     * @param securityNumber
     */
    public void showPatientInfo(String securityNumber){
        String securityNumberFounded = this.findPatientBySecurityNumber(securityNumber);
        
        //Donde se encuentra el paciente en el arreglo;
        int indice = Integer.valueOf(securityNumberFounded);
        
        if (!securityNumberFounded.isEmpty()){
            ArrayList<String> IDDoctors = this.patients.get(indice).getdoctorID();
            
            DefaultListModel<String> model = new DefaultListModel<String>();
            
            for(int x = 0; x < IDDoctors.size(); x++){
              model.addElement(IDDoctors.get(x));
            }
            
            ShowPerson Patient = new ShowPerson();
            
            Patient.setFields(this.patients.get(indice).getfirstName(), this.patients.get(indice).getlastName(), this.patients.get(indice).getsecurityNumber(), Float.toString(this.patients.get(indice).getweigth()), this.patients.get(indice).gettelephone(), Float.toString(this.patients.get(indice).getsize()), this.patients.get(indice).getaddress(), this.patients.get(indice).gete_mail(), Integer.toString(this.patients.get(indice).getage()), this.patients.get(indice).getdisease(), this.patients.get(indice).getstatus(), Integer.toString(this.patients.get(indice).getroomID()), model);
            
            Patient.setVisible(true);
            
            JFrame f = new JFrame();
            
            f.getContentPane().add(Patient);
            f.pack();
            f.setVisible(true);
            
        }
        
    }
    
    public void addPatient(String name, String lastName, String nSS, int age, String e_mail, String address, String telephone, String disease, float size, float weigth){
        Patient newPatient = new Patient();
        newPatient.setfirstName(name);
        newPatient.setlastName(lastName);
        newPatient.setage(age);
        newPatient.setdisease(disease);
        newPatient.sete_mail(e_mail);
        newPatient.setstatus("Ingreso");
        newPatient.settelephone(telephone);
        newPatient.setaddress(address);
        
        try {
            newPatient.setsecurityNumber(nSS);
        } catch (NotValidNumber ex) {
            JOptionPane.showMessageDialog(null, ex.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        try {
            newPatient.setsize(size);
        } catch (NotValidNumber ex) {
            JOptionPane.showMessageDialog(null, ex.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        try {
            newPatient.setweigth(weigth);
        } catch (NotValidNumber ex) {
            JOptionPane.showMessageDialog(null, ex.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        this.patients.add(newPatient);
        
    }
    
    /**
     *Método para asignarle un Doctor a un Paciente
     * @param doctorId
     * @param securityNumber
     */
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
    
    /**
     *Método para asignarle un cuarto a un Paciente
     * @param securityNumber
     * @param roomId
     */
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

    /**
     *Método para asignarle un consultorio a un Doctor
     * @param idDoctor
     * @param doctorsOfficeId
     */
    public void assignOfficeToDoctor(String idDoctor, String doctorsOfficeId){
        
        try {
            this.offices.get(doctorsIds - 1).setdoctorID(idDoctor);
        } catch (NotValidNumber error) {
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    /**
     *Método para modificiar el status de un Paciente
     * @param securityNumber
     * @param Status
     */
    public void changeStatusOfPatient(String securityNumber, String Status){
        String securityNumberFounded = this.findPatientBySecurityNumber(securityNumber);
        
        if (!securityNumberFounded.isEmpty()){
            this.patients.get(Integer.valueOf(securityNumberFounded)).setstatus(Status);
        }
    }
    
    /**
     *Método para modificar el status de un Paciente a "Alta"
     * @return patientsReady
     */
    public ArrayList<Patient> showPatientsReadyToGoHome(){
        
        ArrayList<Patient> patientsReady = new ArrayList<>();
        
        for(int i=0; i<this.patients.size();i++){
            if(this.patients.get(i).getstatus().equals("Alta")){
                patientsReady.add(this.patients.get(i));
            }
        }
        return patientsReady;
    }
    
    /**
     *Método para dar de baja a un Paciente
     * @param securityNumber
     * @throws Exceptions.NotValidNumber
     */
    public void dischargePatient(String securityNumber) throws NotValidNumber{
        String securityNumberFounded = this.findPatientBySecurityNumber(securityNumber);
        
        for(int x = 0; x < this.numOfRooms; x++){
            if(this.rooms.get(x).getPatientID().equals(securityNumber)){
                this.rooms.get(x).setPatientID("NOT DEFINED");
                
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
    
    /**
     *Método para validar la existencia de un Doctor
     * @param idDoctor
     * @return validacion
     */
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
    
    /**
     * Método para validar la existencia de un consultorio
     * @param id
     * @return validacion
     */
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
