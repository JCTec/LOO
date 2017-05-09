/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.People;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Juan
 */
public class Doctor extends Person {
    
	/**
	 * el identificador de un médico del hospital
	 */
	private String id;
	
	/**
	 * el departamento del hospital al que pertenece el médico
	 */
	private String department;
	
	/**
	 * 	indica la cédula profesional del médico
	 */
	private String licence;
	
	/**
	 * los números de seguridad social de los pacientes que están asignados al médico
	 */
	private ArrayList<String> patientSet;

	/** 
         *      Constructor vacío
	 *	id : "NOT DEFINED";
	 *	department : "UNDEFINED DEPARTMENT";
	 *	licence : "UNDEFINED LICENCE";
	 */
	public Doctor() {
		super();
		this.id = "UNDEFINED ID";
		this.department = "UNDEFINED DEPARTMENT";
		this.licence = "UNDEFINED LICENCE";
		this.patientSet = new ArrayList<>();
	}
	
	/**
	 * Constructor de copia
	 * @param doctor
	 * objeto doctor para copiar
	 */
	public Doctor(Doctor doctor) {
		super(doctor);
		this.setDepartment(doctor.department);
		this.setId(doctor.id);
		this.setLicence(doctor.licence);
		this.patientSet = doctor.patientSet;
	}
	
	/**
	 * Constructor con valores sueltos
	 * @see Person
	 * @param id
	 * el identificador de un médico del hospital
	 * @param departamento
	 * el departamento del hospital al que pertenece el médico
	 * @param licence
	 * el departamento del hospital al que pertenece el médico
	 */
	public Doctor(String firstName, String lastName, String address, String e_mail, String telephone, int age, String id, String departamento, String licence) {
		super(firstName, address, e_mail, lastName, telephone, age);
		this.setDepartment(department);
		this.setId(id);
		this.setLicence(licence);
		this.patientSet = new ArrayList<>();
	}

    /**
     * Método para obtener el ID de un Doctor
     * @return id
     */
    public String getId() {
		return this.id;
	}

    /**
     * Método para asginar un ID a un Doctor
     * @param id
     */
    public void setId(String id) {
		String pattern = "^[1-9][0-9]{3}$";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(id);
		
		if(m.find()){
			this.id = id;			
		}
		else{
			this.id = "UNDEFINED ID";
		}
	}

    /**
     * Método para obtener el departamento de un Doctor
     * @return department
     */
    public String getDepartment() {
		return department;
	}

    /**
     * Método para asignar un departamento a un Doctor
     * @param department
     */
    public void setDepartment(String department) {
		this.department = department;
	}

    /**
     * Método para obtener la matrícula de un Doctor
     * @return licence
     */
    public String getLicence() {
		return licence;
	}

    /**
     *Método interfaz para la asignación de una matrícula a un Doctor
     * @param licence
     */
    public void setLicence(String licence) {
		String pattern = "^[1-9]{11}$";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(licence);
		
		if(m.find()){
			this.licence = licence;
		}
		else{
			this.licence = "UNDEFINED LICENCE";
		}
	}
	
	/**
	 * añade un paciente al conjunto de pacientes que el médico atiende
	 * 
	 * @param patientID
	 * número de seguro social del paciente que debe anadir
	 */
	public void addPatientID(String patientID){
		if(this.patientSet.contains(patientID)){
			System.out.println("error using addPatientID : patientID already in list");
		}
		else{
			this.patientSet.add(patientID);
		}
	}
	
	/**
	 * elimina un paciente del conjunto de pacientes que el médico atiende
	 * 
	 * @param patientID
	 * número de seguro social del paciente que debe anadir
	 */
	public void erasePatient(String patientID){
		if(this.patientSet.contains(patientID)){
			this.patientSet.remove(patientID);
		}
		else{
			System.out.println("error using removePatientID : patientID not in list");			
		}
	}
	
	@Override
	public String toString(){
		String result = super.toString();
		result += ("\nDOCTOR ID: " + this.id);
		result += ("\nDEPARTMENT: " + this.department);
		result += ("\nLICENCE: " + this.licence);
		result += "\nPATIENTS:";
		if(this.patientSet.isEmpty()){
			result += " NONE";
		}
		else{
			for(int i = 0 ; i < this.patientSet.size() ; i++){
				result += (" " + this.patientSet.get(i)); 
			}
		}
		return result;
	}
	
}
