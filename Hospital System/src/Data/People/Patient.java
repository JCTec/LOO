/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.People;
import javax.swing.JOptionPane;
import Exceptions.NotValidNumber;
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
    private String[] doctorID;
    //indica si el paciente está en espera de ser tratado, si ya está en tratamiento o si está listo para ser dado de alta. 
    private String status;
    
    /**
     *Constructor con datos de omisión
     */
    public Patient(){
        
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
    public void setsecurityNumber(String securityNumber){
        
    }
    
    /**
     *Método set para asignar un peso al Paciente
     * @param weigth
     */
    public void setweigth(float weigth){
        
    }
    
    /**
     * Método set para asignar una altura al Paciente
     * @param size
     */
    public void setsize(float size){
        
    }
    
    /**
     * Método set para asignar la enfermedad que padece el Paciente
     * @param disease
     */
    public void setdisease(String disease){
        
    }
    
    /**
     * Método set para que en caso de estar hospitalizado el Paciente se le asigne una habitacion
     * @param roomID
     */
    public void setroomID(int roomID){
        
    }
    
    /**
     *Método set para asignarle un nuevo doctor a un Paciente
     * @param doctorID
     */
    public void setdoctorID(String[] doctorID){
        
    }
    
    /**
     *Método set para asginar un status al Paciente
     * @param status
     */
    public void setstatus(String status){
        
    }
    
    /**
     * Método get para obtener el numero de seguridad de un paciente
     * @return
     */
    public String getsecurityNumber(){
        
    }
    
    /**
     *Método get para obtener el peso de un paciente
     * @return
     */
    public float getweigth(){
        
    }
    
    /**
     *Método get para obtener la altura de un paciente
     * @return
     */
    public float getsize(){
        
    }
    
    /**
     *Método get para obtener la enfermedad que padece un Paciente
     * @return
     */
    public String getdisease(){
        
    }
    
    /**
     *Método get para obtener el numero de habitacion en la que esta un paciente
     * @return
     */
    public int getroomID(){
        
    }
    
    /**
     *Método get para obtener el conjunto que doctores que atienden a un Paciente
     * @return
     */
    public String[] getdoctorID(){
        
    }
    
    /**
     *Método get para obtener el status de un Paciente
     * @return
     */
    public String getstatus(){
        
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
     * @return 
     */
    @Override
    public String toString(){
        
    }
    
    
}
