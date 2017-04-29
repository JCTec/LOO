/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.People;

import java.util.ArrayList;

/**
 *
 * @author Juan
 */
public class Doctor extends Person {
    
	el identificador de un médico del hospital
	
	private String id;
	
	//el departamento del hospital al que pertenece el médico
	private String department;
	
	//indica la cédula profesional del médico
	private String licence;
	
	//los números de seguridad social de los pacientes que están asignados al médico
	private ArrayList<String> patientSet;

	/**
	 *	id : "undefined id";
	 *	department : "undefined department";
	 *	licence : "undefined licence";
	 */
	public Doctor() {
		super();
		this.id = "undefined id";
		this.department = "undefined department";
		this.licence = "undefined licence";
		this.patientSet = new ArrayList<>();
	}
	
	/**
	 *
	 * @param doctor
	 * objeto doctor para copiar
	 */
	public Doctor(Doctor doctor) {
		super(doctor);
		this.setDepartment(doctor.department);
		this.setId(doctor.id);
		this.setLicence(doctor.licence);
	}
	
	//TODO : finish this constructor
	/*
	public Doctor() {
		
	}
	*/

	//TODO : check if setters need validations
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getLicence() {
		return licence;
	}

	public void setLicence(String licence) {
		this.licence = licence;
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
	
	public void erasePatient(String patientID){
		if(this.patientSet.contains(patientID)){
			this.patientSet.remove(patientID);
		}
		else{
			System.out.println("error using removePatientID : patientID already in list");			
		}
	}
	
	
}
