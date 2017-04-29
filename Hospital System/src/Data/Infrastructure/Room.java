/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Infrastructure;

/**
 *
 * @author Juan
 */
public class Room {
 
	/**
	 * número entero que identifica al cuarto
	 * van del 1 al número máximo de habitaciones definida por el hospital
	 */
	public int roomID;
	
	/**
	 *	número de seguridad social del paciente asignado al cuarto
	 */
	public String patientID;

	/**
	 *
	 * @param patientID
	 * número de seguridad social del paciente asignado al cuarto
	 */
	public Room(String patientID) {
		this.patientID = patientID;
		//TODO make roomID incremental (how ? ask team)
		this.roomID = 1; 
	}
	
	/**
	 *
	 * @param room
	 * objeto room para copiar
	 */
	public Room(Room room) {
		this.roomID = room.roomID;
		this.patientID = room.patientID;
	}
	
	/**
	 * patientID será "undefined patientID"
	 */
	public Room() {
		this.patientID = "undefined patientID";
		this.roomID = 1;
	}
	
	
}
