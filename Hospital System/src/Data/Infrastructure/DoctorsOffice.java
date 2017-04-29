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
            this.setid(id);
        }catch(NotValidNumber error){
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        try {
            this.setfloor(floor);
        }catch(NotValidNumber error){
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        try {
            this.setmonthlyRent(monthlyRent);
        }catch(NotValidNumber error){
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        try {
            this.setdoctorID(doctorID);
        }catch(NotValidNumber error){
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        try {
            this.setlastPayment(lastPayment);
        }catch(NotValidNumber error){
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
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
            this.setid(id);
        }catch(NotValidNumber error){
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        try {
            this.setfloor(floor);
        }catch(NotValidNumber error){
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        try {
            this.setmonthlyRent(monthlyRent);
        }catch(NotValidNumber error){
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        this.doctorID = "NOT DEFINED";
        this.lastPayment = 0.0f;
    }
    /**
     * Constructor de copia
     * @param office
     */
    public DoctorsOffice(DoctorsOffice office){
        try {
            this.setid(office.id);
        }catch(NotValidNumber error){
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        try {
            this.setfloor(office.floor);
        }catch(NotValidNumber error){
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        try {
            this.setmonthlyRent(office.monthlyRent);
        }catch(NotValidNumber error){
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        try {
            this.setdoctorID(office.doctorID);
        }catch(NotValidNumber error){
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        try {
            this.setlastPayment(office.lastPayment);
        }catch(NotValidNumber error){
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * Método set para asignar un identificador al consultorio
     * @param id
     */
    public void setid (int id) throws NotValidNumber{
        if (id>0)
            this.id = id;
        else
            throw new NotValidNumber();
               
    }
   
    
    /**
     *  Método set para asignar un piso a un consultorio
     * @param floor
     */
    public void setfloor(int floor) throws NotValidNumber{
        if (id>0)
            this.floor = floor;
        else
            throw new NotValidNumber();
    }
    
    /**
     *  Método set para asignar un costo mensual de renta de un consultorio
     * @param monthlyRent
     */
    public void setmonthlyRent(float monthlyRent) throws NotValidNumber{
        if (monthlyRent>0)
            this.monthlyRent = monthlyRent;
        else
            throw new NotValidNumber();
    }
    
    /**
     * Método set para asignar un doctor a un consultorio
     * @param doctorID
     */
    public void setdoctorID(String doctorID) throws NotValidNumber{
        if (!doctorID.isEmpty() && doctorID.length()==11)
            this.doctorID = doctorID;
        else
            throw new NotValidNumber("El ID del doctor introducido es erróneo.\nSe ha asignado 'Not Defined' por omisión.\nPara modificar esto acceda al menú 'Editar'");
    }
    
    /**
     * Método set para asignar el ultimo pago de un médico de un consultorio
     * @param lastPayment
     */
    public void setlastPayment(float lastPayment) throws NotValidNumber{
        if (lastPayment>0)
            this.lastPayment = lastPayment;
        else
            throw new NotValidNumber();
    }
    
    /**
     * Método get para obtener el id de un consultorio
     * @return id
     */
    public int getid(){
        return this.id;
    }
    
    /**
     *  Método get para obtener el piso de un consultorio
     * @return floor
     */
    public int getfloor(){
        return this.floor;
    }
    
    /**
     * Método get para obtener el costo mensual de un consultorio
     * @return monthlyRent
     */
    public float getmonthlyRent(){
        return this.monthlyRent;
    }
    
    /**
     * Método get para obtener el ID del doctor de ese consultorio
     * @return doctorID
     */
    public String getdoctorID(){
        return this.doctorID;
    }
    
    /**
     * Método get para obtener el último pago del doctor de un consultorio
     * @return lastPayment
     */
    public float getlastPayment(){
        return this.lastPayment;
    }
    
    /**
     * Método toString para obtener todos los atributos de un consultorio
     * @return 
     */
    @Override
    public String toString(){
        return "ID: " + Integer.toString(id) + "\nPISO: " + Integer.toString(this.floor) + "\nRENTA MENSUAL: " + Float.toString(monthlyRent) + "\nDOCTOR ID: 0" + this.doctorID + "\nULTIMO PAGO: "+ Float.toString(lastPayment);
    }
    
    
    
    
}
