/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.People;
import javax.swing.JOptionPane;
import Exceptions.NotValidNumber;
import java.util.ArrayList;
/**
 *
 * @author Juan
 */
public class Patient extends Person {
    // cadena de texto que guarda en número de seguridad social de un paciente.
    private String securityNumber;
    //número real que guarda el peso en kg de un paciente. 
    private float weigth;
    //número real que guarda la altura de un paciente.
    private float size;
    //cadena de texto que indica la enfermedad del paciente.
    private String disease;
    //número entero que guarda el número de habitación donde está un paciente 
    private int roomID;
    //arreglo de cadenas de texto que guarda un identificador por cada médico que atiende al paciente. 
    private ArrayList<String> doctorID;
    //indica si el paciente está en espera de ser tratado, si ya está en tratamiento o si está listo para ser dado de alta. 
    private String status;
    
    /**
     *Constructor con datos de omisión
     */
    public Patient(){
        super();
        this.securityNumber = "NOT DEFINED";
        this.weigth=0.0f;
        this.size = 0.0f;
        this.disease="UNKNOWN";
        this.roomID=0;
        this.doctorID = new ArrayList<String>();
        this.doctorID.add("NOT DEFINED");
        this.status = "UNKNOWN";
                
    }
    
    /**
     * Constructor de copia
     * @param paciente
     */
    public Patient(Patient paciente){
        
    }
    
    /**
     * Constructor que recibe todos los valores aislados, incluyendo los de Person
     * @param firstName
     * @param lastName
     * @param age
     * @param address
     * @param telephone
     * @param e_mail
     * @param secutiryNumber
     * @param weigth
     * @param size
     * @param disease
     * @param roomID
     * @param doctorID
     * @param status
     */
    public Patient(String firstName, String lastName, int age, String address, String telephone, String e_mail, String secutiryNumber, float weigth, float size, String disease, int roomID, String[] doctorID, String status){
        super(firstName, address, e_mail, lastName, telephone, age);
        
    }
    
    /**
     * Constructor que recibe un objeto Persona y el restro de los atributos aislados
     * @param persona
     * @param secutiryNumber
     * @param weigth
     * @param size
     * @param disease
     * @param roomID
     * @param doctorID
     * @param status
     */
    public Patient(Person persona, String secutiryNumber, float weigth, float size, String disease, int roomID, String[] doctorID, String status){
        
    }
    
    /**
     * Método set para asignar un número de seguridad a un Paciente
     * @param securityNumber
     */
    public void setsecurityNumber(String securityNumber) throws NotValidNumber{
        if(securityNumber.length() == 11)
            this.securityNumber = securityNumber;
        else
            throw new NotValidNumber("El número de seguridad es incorrecto.\nSe ha asignado 'Not Defined' por omisión.\nPara modificar esto acceda al menú 'Editar'");
    }
    
    /**
     *Método set para asignar un peso al Paciente
     * @param weigth
     */
    public void setweigth(float weigth) throws NotValidNumber{
        if(weigth >0.0f)
            this.weigth = weigth;
        else
            throw new NotValidNumber();
    }
    
    /**
     * Método set para asignar una altura al Paciente
     * @param size
     */
    public void setsize(float size) throws NotValidNumber{
        if(size>0.0f)
            this.size=size;
        else
            throw new NotValidNumber();
    }
    
    /**
     * Método set para asignar la enfermedad que padece el Paciente
     * @param disease
     */
    public void setdisease(String disease){
        this.disease = disease;
    }
    
    /**
     * Método set para que en caso de estar hospitalizado el Paciente se le asigne una habitacion
     * @param roomID
     */
    public void setroomID(int roomID) throws NotValidNumber{
        if(roomID>0)
            this.roomID = roomID;
        else
            throw new NotValidNumber();
    }
    
    /**
     *Método set para asignarle un nuevo doctor a un Paciente
     * @param doctorID
     */
    public void setdoctorID(String doctorID) throws NotValidNumber{
        if(doctorID.length()==4)
            this.doctorID.add(doctorID);
        else
            throw new NotValidNumber("El ID del doctor introducido es erróneo.\nSe ha asignado 'Not Defined' por omisión.\nPara modificar esto acceda al menú 'Editar'");
            
    }
    
    /**
     *Método set para asginar un status al Paciente
     * @param status
     */
    public void setstatus(String status){
        this.status=status;
    }
    
    /**
     * Método get para obtener el numero de seguridad de un paciente
     * @return securityNumber
     */
    public String getsecurityNumber(){
        return this.securityNumber;
    }
    
    /**
     *Método get para obtener el peso de un paciente
     * @return weigth
     */
    public float getweigth(){
        return this.weigth;
    }
    
    /**
     *Método get para obtener la altura de un paciente
     * @return size
     */
    public float getsize(){
        return this.size;
    }
    
    /**
     *Método get para obtener la enfermedad que padece un Paciente
     * @return disease
     */
    public String getdisease(){
        return this.disease;
    }
    
    /**
     *Método get para obtener el numero de habitacion en la que esta un paciente
     * @return roomID
     */
    public int getroomID(){
        return this.roomID;
    }
    
    /**
     *Método get para obtener el conjunto que doctores que atienden a un Paciente
     * @return doctorID
     */
    public ArrayList<String> getdoctorID(){
        return this.doctorID;
    }
    
    /**
     *Método get para obtener el status de un Paciente
     * @return status
     */
    public String getstatus(){
        return this.status;
    }
    
    /**
     *Método set para agregar a un Doctor a la lista de doctores que atienden a un Paciente
     * @param idDoctor
     */
    public void setNewDoc(String idDoctor){
        
    }
    
    /**
     *Método para dar de baja a un doctor de la lista de doctores que atienden a un Paciente
     * @param idDoctor
     */
    public void freeDoc(String idDoctor){
        
    }
    /**
     * Método toString para obtener todos los datos de un Paciente
     * @return toString
     */
    @Override
    public String toString(){
        return "NOMBRE: " + this.firstName + "\nAPELLIDO: " + this.lastName + "\nEDAD: " + this.age + "\nEMAIL: " + this.e_mail + "\nTELEFONO: " + this.telephone + "\nDIRECCION: " + this.address +"\nNUMERO DE SEGURIDAD: "+this.securityNumber+"\nPESO: "+this.weigth+"\nALTURA"+this.size+"\nPADECIMIENTO: "+this.disease+"\nHABITACION:"+this.roomID+"\nDOCTORES: "+this.doctorID+"\nSTATUS:"+this.status;
    }
    
    
}
