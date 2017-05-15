/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Infrastructure;
import javax.swing.JOptionPane;
import Exceptions.NotValidNumber;
/**
 *
 * @author Juan
 */
public class DoctorsOffice {
    //Atributos
    private int id; // número entero que sirve de identificador de un consultorio dentro del hospital.
    private int floor; //número entero que indica el piso en el que se encuentra el consultorio.
    private float monthlyRent; // número real que indica cuánto cuesta mensualmente la renta del consultorio. 
    private String doctorID; //identificador del médico al que está asignado el consultorio. 
    private float lastPayment; // número real que indica el último pago realizado por el médico. 
    
    //Métodos
    
    //Constructores

    /**
     * Constructor con datos de omisión
     */
    public DoctorsOffice(){
        this.id=0;
        this.floor=0;
        this.monthlyRent = 0.0f;
        this.doctorID = "NOT DEFINED";
        this.lastPayment = 0.0f;
    }
    
    /**
     *  Constrocutor con datos aislados
     * @param id
     * @param floor
     * @param monthlyRent
     * @param doctorID
     * @param lastPayment
     */
    public DoctorsOffice(int id, int floor, float monthlyRent, String doctorID, float lastPayment){
        try {
            this.setId(id);
        }catch(NotValidNumber error){
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
            this.id=0;
        }
        
        try {
            this.setFloor(floor);
        }catch(NotValidNumber error){
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
            this.floor=0;
        }
        
        try {
            this.setMonthlyRent(monthlyRent);
        }catch(NotValidNumber error){
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
            this.monthlyRent = 0.0f;
        }
        
        try {
            this.setDoctorID(doctorID);
        }catch(NotValidNumber error){
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
            this.doctorID = "NOT DEFINED";
        }
        
        try {
            this.setLastPayment(lastPayment);
        }catch(NotValidNumber error){
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
            this.lastPayment = 0.0f;
        }
    }
    
    /**
     *  Constructor que permite la creacion de un consultorio sin doctor asignado
     * @param id
     * @param floor
     * @param monthlyRent
     */
    public DoctorsOffice(int id, int floor, float monthlyRent){
        try {
            this.setId(id);
        }catch(NotValidNumber error){
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
            this.id = 0;
        }
        
        try {
            this.setFloor(floor);
        }catch(NotValidNumber error){
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
            this.floor = 0;
        }
        
        try {
            this.setMonthlyRent(monthlyRent);
        }catch(NotValidNumber error){
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
            this.monthlyRent = 0.0f;
        }
        
        this.doctorID = "NOT DEFINED";
        this.lastPayment = 0.0f;
    }
    
    /**
     * Constructor que no recibe ni id de oficina ni id de doctores
     * @param floor
     * @param monthlyRent
     */
    public DoctorsOffice(int floor, float monthlyRent){
        
        try {
            this.setFloor(floor);
        }catch(NotValidNumber error){
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
            this.floor = 0;
        }
        
        try {
            this.setMonthlyRent(monthlyRent);
        }catch(NotValidNumber error){
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
            this.monthlyRent = 0.0f;
        }
        
        this.doctorID = "NOT DEFINED";
        this.lastPayment = 0.0f;
        this.id =0;
    }
    
    /**
     * Constructor que no recibe id de habitacion, si recibe id de doctor
     * @param floor
     * @param monthlyRent
     * @param doctorID
     */
    public DoctorsOffice(int floor, float monthlyRent, String doctorID){
        
        try {
            this.setFloor(floor);
        }catch(NotValidNumber error){
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
            this.floor = 0;
        }
        
        try {
            this.setMonthlyRent(monthlyRent);
        }catch(NotValidNumber error){
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
            this.monthlyRent = 0.0f;
        }
        
        try {
            this.setDoctorID(doctorID);
        }catch(NotValidNumber error){
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
            this.doctorID = "NOT DEFINED";
        }
        
        this.lastPayment = 0.0f;
        this.id =0;
    }
    /**
     * Constructor de copia
     * @param office
     */
    public DoctorsOffice(DoctorsOffice office){
        try {
            this.setId(office.id);
        }catch(NotValidNumber error){
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
            this.id = 0;
        }
        
        try {
            this.setFloor(office.floor);
        }catch(NotValidNumber error){
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
            this.floor = 0;
        }
        
        try {
            this.setMonthlyRent(office.monthlyRent);
        }catch(NotValidNumber error){
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
            this.monthlyRent = 0.0f;
        }
        
        try {
            this.setDoctorID(office.doctorID);
        }catch(NotValidNumber error){
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
            this.doctorID = "NOT DEFINED";
        }
        
        try {
            this.setLastPayment(office.lastPayment);
        }catch(NotValidNumber error){
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
            this.lastPayment = 0.0f;
        }
    }
    
    /**
     * Método set para asignar un identificador al consultorio
     * @param id
     */
    public void setId (int id) throws NotValidNumber{
        if (id>0)
            this.id = id;
        else
            throw new NotValidNumber();
               
    }
   
    
    /**
     *  Método set para asignar un piso a un consultorio
     * @param floor
     */
    public void setFloor(int floor) throws NotValidNumber{
        if (floor>0)
            this.floor = floor;
        else
            throw new NotValidNumber();
    }
    
    /**
     *  Método set para asignar un costo mensual de renta de un consultorio
     * @param monthlyRent
     */
    public void setMonthlyRent(float monthlyRent) throws NotValidNumber{
        if (monthlyRent>0)
            this.monthlyRent = monthlyRent;
        else
            throw new NotValidNumber();
    }
    
    /**
     * Método set para asignar un doctor a un consultorio
     * @param doctorID
     */
    public void setDoctorID(String doctorID) throws NotValidNumber{
        if (doctorID.length()==4)
            this.doctorID = doctorID;
        else
            throw new NotValidNumber("El ID del doctor introducido es erróneo.\nSe ha asignado 'Not Defined' por omisión.\nPara modificar esto acceda al menú 'Editar'");
    }
    
    /**
     * Método set para asignar el ultimo pago de un médico de un consultorio
     * @param lastPayment
     */
    public void setLastPayment(float lastPayment) throws NotValidNumber{
        if (lastPayment>0)
            this.lastPayment = lastPayment;
        else
            throw new NotValidNumber();
    }
    
    /**
     * Método get para obtener el id de un consultorio
     * @return id
     */
    public int getId(){
        return this.id;
    }
    
    /**
     *  Método get para obtener el piso de un consultorio
     * @return floor
     */
    public int getFloor(){
        return this.floor;
    }
    
    /**
     * Método get para obtener el costo mensual de un consultorio
     * @return monthlyRent
     */
    public float getMonthlyRent(){
        return this.monthlyRent;
    }
    
    /**
     * Método get para obtener el ID del doctor de ese consultorio
     * @return doctorID
     */
    public String getDoctorID(){
        return this.doctorID;
    }
    
    /**
     * Método get para obtener el último pago del doctor de un consultorio
     * @return lastPayment
     */
    public float getLastPayment(){
        return this.lastPayment;
    }
    
    /**
     * Método toString para obtener todos los atributos de un consultorio
     * @return string con todos los valores y datos de un DoctorsOffice
     */
    @Override
    public String toString(){
        return "ID: " + Integer.toString(id) + "\nPISO: " + Integer.toString(this.floor) + "\nRENTA MENSUAL: " + Float.toString(monthlyRent) + "\nDOCTOR ID: 0" + this.doctorID + "\nULTIMO PAGO: "+ Float.toString(lastPayment);
    }
    
    
    
    
}
