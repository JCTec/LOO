/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.People;

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
    
    private String[] doctorID;
    private String status;
}
