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
	private int roomID;
	
    /**
	 *	número de seguridad social del paciente asignado al cuarto
	 */
	private String patientID;

	/**
	 * patientID será "undefined patientID"
	 *
	 * @param roomID
	 * número entero que identifica al cuarto
	 * 
	 */
	public Room(int roomID) {
		this.setRoomID(roomID);
		this.patientID = "undefined patientID";
	}
	
	/**
	 *
	 * @param room
	 * objeto room para copiar
	 */
	public Room(Room room) {
		this.setRoomID(room.roomID);
		this.setPatientID(room.patientID);
	}
	
	/**
	 * patientID será "undefined patientID"
	 * roomID será 0
	 */
	public Room() {
		this.patientID = "undefined patientID";
		//TODO make roomID incremental (how ? ask team)
		this.roomID = 0;
	}

	public int getRoomID() {
		return roomID;
	}

	public void setRoomID(int roomID) {
		this.roomID = roomID;
	}

	public String getPatientID() {
		return patientID;
	}

	public void setPatientID(String patientID) {
		//TODO : transform this as try/catch
		if(patientID.length() == 11){
			this.patientID = patientID;		
		}
		else{
			System.out.println("error using setPatientID : patientID.length() != 11");
		}
	}
	
	
	
}
