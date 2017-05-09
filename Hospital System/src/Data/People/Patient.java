/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.People;
import javax.swing.JOptionPane;
import Exceptions.NotValidNumber;
import Exceptions.OverSize;
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
        this.doctorID = new ArrayList<>();
        this.doctorID.add("NOT DEFINED");
        this.status = "UNKNOWN";
                
    }
    
    /**
     * Constructor de copia
     * @param paciente
     */
    public Patient(Patient paciente){
        super(paciente.firstName, paciente.address, paciente.email, paciente.lastName, paciente.telephone, paciente.age);
        this.securityNumber = paciente.securityNumber;
        this.weigth= paciente.weigth;
        this.size = paciente.size;
        this.disease= paciente.disease;
        this.roomID= paciente.roomID;
        this.doctorID = paciente.doctorID;
        this.status = paciente.status;
    }
    
    /**
     * Constructor que recibe todos los valores aislados, incluyendo los de Person
     * @param firstName
     * @param lastName
     * @param age
     * @param address
     * @param telephone
     * @param e_mail
     * @param securityNumber
     * @param weigth
     * @param size
     * @param disease
     * @param roomID
     * @param doctorID
     * @param status
     */
    public Patient(String firstName, String lastName, int age, String address, String telephone, String e_mail, String securityNumber, float weigth, float size, String disease, int roomID, ArrayList<String> doctorID, String status){
        super(firstName, address, e_mail, lastName, telephone, age);
        try{
            this.setSecurityNumber(securityNumber);
        }catch(NotValidNumber error){
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR.", JOptionPane.ERROR_MESSAGE);
        }
        
        try{
           this.setWeigth(weigth);
        }catch(NotValidNumber error){
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR.", JOptionPane.ERROR_MESSAGE);
        }
        
        try{
           this.setSize(size);
        }catch(NotValidNumber error){
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR.", JOptionPane.ERROR_MESSAGE);
        }
        
        this.setDisease(disease);
        
        try{
           this.setRoomID(roomID);
        }catch(NotValidNumber error){
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR.", JOptionPane.ERROR_MESSAGE);
        }
        
        try{
            this.doctorID = new ArrayList<>();
            for(int i=0;i<doctorID.size();i++){
                this.setDoctorID(doctorID.get(i));
            }
        }catch(NotValidNumber error){
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR,", JOptionPane.ERROR_MESSAGE);
        }
        
        this.setStatus(status);
       
    }
    
    /**
     * Constructor que recibe un objeto Persona y el restro de los atributos aislados
     * @param persona
     * @param securityNumber
     * @param weigth
     * @param size
     * @param disease
     * @param roomID
     * @param doctorID
     * @param status
     */
    public Patient(Person persona, String securityNumber, float weigth, float size, String disease, int roomID, ArrayList<String> doctorID, String status){
        super(persona);
        try{
            this.setSecurityNumber(securityNumber);
        }catch(NotValidNumber error){
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR.", JOptionPane.ERROR_MESSAGE);
        }
        
        try{
           this.setWeigth(weigth);
        }catch(NotValidNumber error){
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR.", JOptionPane.ERROR_MESSAGE);
        }
        
        try{
           this.setSize(size);
        }catch(NotValidNumber error){
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR.", JOptionPane.ERROR_MESSAGE);
        }
        
        this.setDisease(disease);
        
        try{
           this.setRoomID(roomID);
        }catch(NotValidNumber error){
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR.", JOptionPane.ERROR_MESSAGE);
        }
        
        try{
            this.doctorID = new ArrayList<>();
            for(int i=0;i<doctorID.size();i++){
                this.setDoctorID(doctorID.get(i));
            }
        }catch(NotValidNumber error){
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR,", JOptionPane.ERROR_MESSAGE);
        }
        
        this.setStatus(status);
    }
    
    /**
     * Método set para asignar un número de seguridad a un Paciente
     * @param securityNumber
     * @throws Exceptions.NotValidNumber
     */
    public void setSecurityNumber(String securityNumber) throws NotValidNumber{
        if(securityNumber.length() == 11)
            this.securityNumber = securityNumber;
        else
            throw new NotValidNumber("El número de seguridad es incorrecto.\nSe ha asignado 'Not Defined' por omisión.\nPara modificar esto acceda al menú 'Editar'");
    }
    
    /**
     *Método set para asignar un peso al Paciente
     * @param weigth
     * @throws Exceptions.NotValidNumber
     */
    public void setWeigth(float weigth) throws NotValidNumber{
        if(weigth >0.0f)
            this.weigth = weigth;
        else
            throw new NotValidNumber();
    }
    
    /**
     * Método set para asignar una altura al Paciente
     * @param size
     * @throws Exceptions.NotValidNumber
     */
    public void setSize(float size) throws NotValidNumber{
        if(size>0.0f)
            this.size=size;
        else
            throw new NotValidNumber();
    }
    
    /**
     * Método set para asignar la enfermedad que padece el Paciente
     * @param disease
     */
    public void setDisease(String disease){
        this.disease = disease;
    }
    
    /**
     * Método set para que en caso de estar hospitalizado el Paciente se le asigne una habitacion
     * @param roomID
     * @throws NotValidNumber
     */
    public void setRoomID(int roomID) throws NotValidNumber{
        if(roomID>0)
            this.roomID = roomID;
        else
            throw new NotValidNumber();
    }
    
    /**
     * Método set para que en caso de estar hospitalizado el Paciente se le asigne una habitacion
     * @param roomID
     * @throws NotValidNumber
     */
    public void setRoomID(String roomID) throws NotValidNumber{
        if(Integer.valueOf(roomID) > 0)
            this.roomID = Integer.valueOf(roomID);
        else
            throw new NotValidNumber();
    }
    
    /**
     *Método set para asignarle un nuevo doctor a un Paciente
     * @param doctorID
     * @throws Exceptions.NotValidNumber
     */
    public void setDoctorID(String doctorID) throws NotValidNumber{
        if(doctorID.length()==4){
            this.doctorID.add(doctorID);
            JOptionPane.showConfirmDialog(null, "El doctor "+doctorID+" ha sido agregado satisfactoriamente.", "OPERACION EXITOSA", JOptionPane.OK_OPTION);
        }
        else
            throw new NotValidNumber("El ID de un doctor introducido es erróneo.\nSe ha asignado 'Not Defined' por omisión.\nPara modificar esto acceda al menú 'Editar'");
            
    }
    
    /**
     *Método set para asginar un status al Paciente
     * @param status
     */
    public void setStatus(String status){
        this.status=status;
    }
    
    /**
     * Método get para obtener el numero de seguridad de un paciente
     * @return securityNumber
     */
    public String getSecurityNumber(){
        return this.securityNumber;
    }
    
    /**
     *Método get para obtener el peso de un paciente
     * @return weigth
     */
    public float getWeigth(){
        return this.weigth;
    }
    
    /**
     *Método get para obtener la altura de un paciente
     * @return size
     */
    public float getSize(){
        return this.size;
    }
    
    /**
     *Método get para obtener la enfermedad que padece un Paciente
     * @return disease
     */
    public String getDisease(){
        return this.disease;
    }
    
    /**
     *Método get para obtener el numero de habitacion en la que esta un paciente
     * @return roomID
     */
    public int getRoomID(){
        return this.roomID;
    }
    
    /**
     *Método get para obtener el conjunto que doctores que atienden a un Paciente
     * @return doctorID
     */
    public ArrayList<String> getDoctorID(){
        return this.doctorID;
    }
    
    /**
     *Método get para obtener el status de un Paciente
     * @return status
     */
    public String getStatus(){
        return this.status;
    }
    
    /**
     *Método set para agregar a un Doctor a la lista de doctores que atienden a un Paciente
     * @param idDoctor
     * @throws Exceptions.OverSize
     * @throws Exceptions.NotValidNumber
     */
    public void setNewDoc(String idDoctor) throws OverSize, NotValidNumber{
        if(this.doctorID.size()<6){
            this.setDoctorID(idDoctor);
        }
        else
            throw new OverSize();
    }
    
    /**
     *Método para dar de baja a un doctor de la lista de doctores que atienden a un Paciente
     * @param idDoctor
     */
    public void freeDoc(String idDoctor){
        boolean doctorRemoved = false;
        for(int i=0;i<this.doctorID.size();i++){
            if(this.doctorID.get(i).equals(idDoctor))
                i=this.doctorID.size();
                this.doctorID.remove(i);
                doctorRemoved=true;
        }
        if(doctorRemoved==false)
            JOptionPane.showMessageDialog(null, "El ID introducido no ha podido ser encontrado", "NOT FOUND", JOptionPane.ERROR_MESSAGE);
        else
            JOptionPane.showConfirmDialog(null, "El doctor" + idDoctor + " ha sido satisfactoriamente eliminado.", "OPERACION EXITOSA", JOptionPane.OK_OPTION);
    }
    /**
     * Método toString para obtener todos los datos de un Paciente
     * @return toString
     */
    @Override
    public String toString(){
        return "NOMBRE: " + this.firstName + "\nAPELLIDO: " + this.lastName + "\nEDAD: " + this.age + "\nEMAIL: " + this.email + "\nTELEFONO: " + this.telephone + "\nDIRECCION: " + this.address +"\nNUMERO DE SEGURIDAD: "+this.securityNumber+"\nPESO: "+this.weigth+"\nALTURA"+this.size+"\nPADECIMIENTO: "+this.disease+"\nHABITACION:"+this.roomID+"\nDOCTORES: "+this.doctorID+"\nSTATUS:"+this.status;
    }
    
    
}
