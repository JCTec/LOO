/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Infrastructure;

import Exceptions.NotValidNumber;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan
 */
public class Room {

    /**
     * número entero que identifica al cuarto van del 1 al número máximo de
     * habitaciones definida por el hospital
     */
    private int roomID;

    /**
     * número de seguridad social del paciente asignado al cuarto
     */
    private String patientID;

    /**
     * patientID será "NOT DEFINED"
     *
     * @param roomID número entero que identifica al cuarto
     *
     */
    public Room(int roomID) {
        try {
            this.setRoomID(roomID);
        } catch (NotValidNumber error) {
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR.", JOptionPane.ERROR_MESSAGE);
        }
        this.patientID = "NOT DEFINED";
    }

    /**
     *
     * @param room objeto room para copiar
     */
    public Room(Room room) {
        this.patientID = room.patientID;
        this.roomID = room.roomID;
    }

    /**
     * patientID será "undefined patientID" roomID será 0
     */
    public Room() {
        this.patientID = "NOT DEFINED";
        //TODO make roomID incremental (how ? ask team)
        this.roomID = 0;
    }

    /**
     * Constructor que recibe ambos valores aislados
     *
     * @param roomID
     * @param patientID
     */
    public Room(int roomID, String patientID) {
        try {
            this.setRoomID(roomID);
        } catch (NotValidNumber error) {
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR.", JOptionPane.ERROR_MESSAGE);
        }
        try {
            this.setPatientID(patientID);
        } catch (NotValidNumber error) {
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR.", JOptionPane.ERROR_MESSAGE);
        }
        
    }

    /**
     * Método get que obtiene el ID de la habitación
     *
     * @return roomID
     */
    public int getRoomID() {
        return roomID;
    }

    /**
     * Método set para asignar un ID a la Habitación
     *
     * @param roomID
     */
    public void setRoomID(int roomID) throws NotValidNumber {
        if(roomID>0)
            this.roomID = roomID;
        else
            throw new NotValidNumber();
    }

    /**
     * Método get para obtener el ID del paciente hospitalizado en esa
     * habitación
     *
     * @return patientID
     */
    public String getPatientID() {
        return patientID;
    }

    /**
     * Método set para asignar un ID de paciente a la habitación
     *
     * @param patientID
     * @throws NotValidNumber
     */
    public void setPatientID(String patientID) throws NotValidNumber {
        if (patientID.length() == 11) {
            if(this.patientID.isEmpty())
                this.patientID = patientID;
            else
                JOptionPane.showMessageDialog(null, "Ya hay un paciente asignado (" + this.patientID+")", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            throw new NotValidNumber("El ID del paciente es incorrecto.\nSe ha asginado 'NOT DEFINED' por omisión.\nSi desea configurar esto acceda al menú 'Editar'");
        }
    }

    /**
     *
     * @return una cadena de texto que contiene el roomID y el patientID
     */
    @Override
    public String toString() {
        return "roomID: " + this.roomID + "\npatientID: " + this.patientID;
    }

}
