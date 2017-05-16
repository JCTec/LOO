/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Infrastructure;

import Data.People.*;
import Exceptions.NotValidNumber;
import Exceptions.OverSize;
import Interfaz.Paneles.FrameWithCloseButton;
import Interfaz.Paneles.ShowDoctor;
import Interfaz.Paneles.ShowOffice;
import Interfaz.Paneles.ShowPerson;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan
 */
public class Hospital {

    /**
     * Declarando todas las variables necesarias para la aplicacion, de la clase
     * Hospital se va a crear un XML donde se va almacenar toda la informacion.
     */
    private int doctorsIds;

    private String name; //El nombre del Hospital
    private String address; //La dirección del Hospital
    private String telephone; //El teléfono del Hospital
    private int numOfDoctorsOffices; //El número de consultorios de un Hospital
    private int numOfRooms; //El número de habitaciones de un Hospital
    private ArrayList<DoctorsOffice> offices; //Arreglo con los consultoros del Hospital
    private ArrayList<Room> rooms; //Arreglo con las habitaciones del Hospital
    private ArrayList<Doctor> doctors; //Arreglo con los doctores que laboran en el Hospital
    private ArrayList<Patient> patients; //Arreglo con los pacientes atendidos por los doctores

    /**
     * Constructor con valores por omisión
     */
    public Hospital() {
        this.doctorsIds = 1000;

        this.name = "NOT DEFINED";
        this.address = "NOT DEFINED";
        this.telephone = "NOT DEFINED";
        this.numOfDoctorsOffices = 0;
        this.numOfRooms = 0;
        this.offices = new ArrayList<>();
        this.rooms = new ArrayList<>();
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
        this.fillRoomsAndOffice();
    }

    /**
     * Constructor de copia
     *
     * @param H recibe un objeto Hospital y copia sus datos
     */
    public Hospital(Hospital H) {
        this.doctorsIds = 1000;

        this.name = H.name;
        this.address = H.address;
        this.telephone = H.telephone;
        this.numOfDoctorsOffices = H.numOfDoctorsOffices;
        this.numOfRooms = H.numOfRooms;
        this.offices = H.offices;
        this.rooms = H.rooms;
        this.doctors = H.doctors;
        this.patients = H.patients;
    }

    /**
     * Constructor con valores aislados
     *
     * @param name
     * @param address
     * @param telephone
     * @param numOfDoctorsOffices
     * @param numOfRooms
     */
    public Hospital(String name, String address, String telephone, int numOfDoctorsOffices, int numOfRooms) {
        this.doctorsIds = 1000;

        if (name != null) {
            this.name = name;
        } else {
            this.name = "NOT DEFINED";
        }

        if (address != null) {
            this.address = address;
        } else {
            this.address = "NOT DEFINED";
        }

        try {
            this.setTelephone(telephone);
        } catch (NotValidNumber error) {
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        try {
            this.setNumOfDoctorsOffices(numOfDoctorsOffices);
        } catch (NotValidNumber error) {
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        try {
            this.setNumOfRooms(numOfRooms);
        } catch (NotValidNumber error) {
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        this.offices = new ArrayList<>();
        this.rooms = new ArrayList<>();
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();

        this.fillRoomsAndOffice();

    }

    //Método que automáticamente crea el numero de habitaciones y oficinas que se señalaron en el constructor
    public void fillRoomsAndOffice() {

        for (int x = 0; x < this.numOfRooms; x++) {
            Room newRoom = new Room(x + 1);
            this.rooms.add(newRoom);
        }

        for (int x = 0; x < this.numOfDoctorsOffices; x++) {
            DoctorsOffice newDoctorsOffice = new DoctorsOffice();

            try {
                newDoctorsOffice.setId(x + 1);
            } catch (NotValidNumber error) {
                JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }

            this.offices.add(newDoctorsOffice);
        }
    }

    /**
     * Método set para asignar un nombre a un Hospital
     *
     * @param name
     */
    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    /**
     * Método set para asignar una dirección a un Hospital
     *
     * @param address
     */
    public void setAddress(String address) {
        if (address != null) {
            this.address = address;
        }
    }

    /**
     * Método set para asginar un teléfono a un Hospital
     *
     * @param telephone
     * @throws NotValidNumber
     */
    public void setTelephone(String telephone) throws NotValidNumber {

        if (telephone != null && telephone.length() == 10) {
            this.telephone = telephone;
        } else {
            this.telephone = "0000000000";
            throw new NotValidNumber("El numero de telefono no es valido, telefono asignado por omision (000) 00 00 000");
        }
    }

    /**
     * Método set para asignar un número de oficinas a un Hospital
     *
     * @param numOfDoctorsOffices
     * @throws NotValidNumber
     */
    public void setNumOfDoctorsOffices(int numOfDoctorsOffices) throws NotValidNumber {

        if (numOfDoctorsOffices >= 0) {
            this.numOfDoctorsOffices = numOfDoctorsOffices;
        } else {
            this.numOfDoctorsOffices = 0;
            throw new NotValidNumber("El numero de oficinas no es valido, numero de oficinas asignado por omision: 0");
        }
    }

    /**
     * Método set para asignar un número de habitaciones a un Hospital
     *
     * @param numOfRooms
     * @throws NotValidNumber
     */
    public void setNumOfRooms(int numOfRooms) throws NotValidNumber {

        if (numOfRooms >= 0) {
            this.numOfRooms = numOfRooms;
        } else {
            this.numOfRooms = 0;
            throw new NotValidNumber("El numero de cuartos no es valido, numero de cuartos asignado por omision: 0");
        }
    }

    /**
     * Método get para obtener el nombre de un Hospital
     *
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Método get para obtener la dirección de un Hospital
     *
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Método get para obtener el número de consultorios
     *
     * @return numOfDoctorsOffice
     */
    public int getNumOfDoctorsOffices() {
        return this.numOfDoctorsOffices;
    }

    /**
     * Método get para obtener el número de habitaciones
     *
     * @return numOfRooms
     */
    public int getNumOfRooms() {
        return this.numOfRooms;
    }

    /**
     * Mpetodo get para obtener los datos de los consultorios
     *
     * @return offices
     */
    public ArrayList<DoctorsOffice> getOffices() {
        return this.offices;
    }

    /**
     * Método get para obtener los datos de las habitaciones
     *
     * @return rooms
     */
    public ArrayList<Room> getRooms() {
        return this.rooms;
    }

    /**
     * Método get para obtener los datos de los doctores de un Hospital
     *
     * @return doctos
     */
    public ArrayList<Doctor> getDoctors() {
        return this.doctors;
    }

    /**
     * Método get para obtener los datos de los pacientes de un Hospital
     *
     * @return patients
     */
    public ArrayList<Patient> getPatients() {
        return this.patients;
    }

    /**
     * Funcion para buscar un paciente por su Numero de Seguridad Social. Si lo
     * encuetra regresa su posicion en el arreglo de pacientes, en caso de no
     * encontrarlo regresa un String vacio.
     *
     * Se recomienda usar if (!securityNumberFounded.isEmpty()){ //TODO }
     *
     * @param securityNumber
     * @return securityNumberFounded
     */
    public String findPatientBySecurityNumber(String securityNumber) {
        String securityNumberFounded = "";
        for (int i = 0; i < this.patients.size(); i++) {
            if (securityNumber.equals(this.patients.get(i).getSecurityNumber())) {
                securityNumberFounded = String.valueOf(i);
                i = this.patients.size();
            }
        }
        if (securityNumberFounded.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Paciente no encontrado, revise el Numero de Seguro Social", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return securityNumberFounded;
    }
    
    /**
     * Método para buscar un doctor a través de su ID. Si lo encuentra regresa
     * su posición en el arreglo de doctores, en caso de no encontrarlo regresa
     * un string vacío
     * @param doctorID
     * @return idFounded
     */
    public String findDoctorById(String doctorID){
        String idFounded = "";
        for(int i=0;i<this.doctors.size();i++){
            if(doctorID.equals(this.doctors.get(i).getId())){
                idFounded = String.valueOf(i);
                i = this.doctors.size();
            }
        }
        if(idFounded.isEmpty())
            JOptionPane.showMessageDialog(null, "Doctor no encontrado revise el ID", "ERROR", JOptionPane.ERROR_MESSAGE);
        return idFounded;
    }

    /**
     * Método para agregar un consultorio a un Hospital con un doctor
     *
     * @param floor
     * @param monthlyRent
     * @param doctorID
     * @param lastPayment
     */
    public void addDoctorOffice(int floor, float monthlyRent, String doctorID, float lastPayment) {
        if (this.validateDoctor(doctorID) == true) {
            this.numOfDoctorsOffices++;
            int id = this.numOfDoctorsOffices;
            DoctorsOffice newOffice = new DoctorsOffice(id, floor, monthlyRent, doctorID, lastPayment);
            this.offices.add(newOffice);
        }
    }

    public void addDoctorOffice(DoctorsOffice dof) {
        this.numOfDoctorsOffices++;
        int id = this.numOfDoctorsOffices;
        try {
            dof.setId(id);
        } catch (NotValidNumber error) {
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        this.offices.add(dof);
    }

    /**
     * Segundo método para agregar un consultorio vacío
     *
     * @param floor
     * @param monthlyRent
     */
    public void addDoctorOffice(int floor, float monthlyRent) {
        this.numOfDoctorsOffices++;
        int id = this.numOfDoctorsOffices;
        DoctorsOffice newOffice = new DoctorsOffice();

        try {
            newOffice.setId(id);
        } catch (NotValidNumber error) {
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        try {
            newOffice.setFloor(floor);
        } catch (NotValidNumber error) {
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        try {
            newOffice.setMonthlyRent(monthlyRent);
        } catch (NotValidNumber error) {
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        this.offices.add(newOffice);

    }

    /**
     * Tercer método para agregar un consultorio pero en este caso sin un costo
     * asignado por mes
     *
     * @param floor
     */
    public void addDoctorOffice(int floor) {
        this.numOfDoctorsOffices++;
        int id = this.numOfDoctorsOffices;
        DoctorsOffice newOffice = new DoctorsOffice();

        try {
            newOffice.setId(id);
        } catch (NotValidNumber error) {
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        try {
            newOffice.setFloor(floor);
        } catch (NotValidNumber error) {
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        this.offices.add(newOffice);

    }

    /**
     * Método para crear oficinas de doctor en un Hospital
     */
    public void addDoctorOffice() {
        this.numOfDoctorsOffices++;
        int id = this.numOfDoctorsOffices;
        DoctorsOffice newOffice = new DoctorsOffice();

        try {
            newOffice.setId(id);
        } catch (NotValidNumber error) {
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        this.offices.add(newOffice);
    }

    //addDoctorOffice -------------------------------------------------
    /**
     * Método para crear una Habitación sin un Paciente
     */
    public void addRoom() {
        this.numOfRooms++;
        Room newRoom = new Room(this.numOfRooms);

        this.rooms.add(newRoom);
    }

    /**
     * Método para crear una Habitación con un Paciente
     *
     * @param patientID
     * @throws Exceptions.NotValidNumber
     */
    public void addRoom(String patientID) throws NotValidNumber {
        this.numOfRooms++;
        Room newRoom = new Room(this.numOfRooms);

        newRoom.setPatientID(patientID);

        this.rooms.add(newRoom);
    }

    /**
     * Método para hacer búsquedas de consultorio y mostrar su información
     *
     * @param doctorsOfficeId
     */
    public void showDoctorsOfficeInfo(String doctorsOfficeId) {

        int idFounded = -1;

        for (int i = 0; i < this.getNumOfDoctorsOffices(); i++) {
            if (doctorsOfficeId.equals(this.offices.get(i).getId())) {
                idFounded = i;
                i = this.getNumOfDoctorsOffices();
            }
        }

        if (idFounded >= 0) {
            ShowOffice office = new ShowOffice();
            office.setFields(Integer.toString(this.offices.get(idFounded).getId()), Float.toString(this.offices.get(idFounded).getMonthlyRent()), this.offices.get(idFounded).getDoctorID(), Float.toString(this.offices.get(idFounded).getLastPayment()));//Falta codigo aquí
            office.setVisible(true);
            FrameWithCloseButton f = new FrameWithCloseButton();

            f.setSize(500, 600);
            f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            f.setVisible(true);

            f.setContent(office);
        }
    }

    /**
     * Metodo para hacer búsquedas de Doctores y mostrar su información
     *
     * @param doctorId
     */
    public void showDoctorInfo(String doctorId) {
        int idFounded = -1;

        for (int i = 0; i < this.doctors.size(); i++) {
            if (doctorId.equals(this.doctors.get(i).getId())) {
                idFounded = i;
                i = this.doctors.size();
            }
        }

        if (idFounded != -1) {
            ArrayList<String> IDPatients = this.doctors.get(idFounded).getPatientID();
            DefaultListModel<String> model = new DefaultListModel<>();

            if (IDPatients != null) {
                if (!IDPatients.isEmpty()) {
                    for (int x = 0; x < IDPatients.size(); x++) {
                        model.addElement(IDPatients.get(x));
                    }
                }

            } else {
                model.addElement("Ningún paciente es atendido por este doctor.");
            }

            if (idFounded >= 0) {

                ShowDoctor doctor = new ShowDoctor();

                doctor.setFields(this.doctors.get(idFounded).getFirstName(), this.doctors.get(idFounded).getLastName(), this.doctors.get(idFounded).getLicence(), this.doctors.get(idFounded).getTelephone(), this.doctors.get(idFounded).getAddress(), this.doctors.get(idFounded).getEmail(), Integer.toString(this.doctors.get(idFounded).getAge()), this.doctors.get(idFounded).getDepartment(), this.doctors.get(idFounded).getId(), model);

                doctor.setVisible(true);

                FrameWithCloseButton f = new FrameWithCloseButton();

                f.setSize(500, 600);
                f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                f.setVisible(true);

                f.setContent(doctor);

                doctor.getSaveButton().addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        Doctor p = doctor.getDoctor();

                        modifyDoctor(p);
                    }
                });
            }

        }
    }

    /**
     * Método mostrar la informacion del paciente con su NSS.
     *
     * @param securityNumber
     */
    public void showPatientInfo(String securityNumber) {
        String securityNumberFounded = this.findPatientBySecurityNumber(securityNumber);

        //Donde se encuentra el paciente en el arreglo;
        int indice = Integer.parseInt(securityNumberFounded);

        if (!securityNumberFounded.isEmpty()) {
            ArrayList<String> IDDoctors = this.patients.get(indice).getDoctorID();
            DefaultListModel<String> model = new DefaultListModel<>();

            if (IDDoctors != null) {
                if (!IDDoctors.isEmpty()) {
                    for (int x = 0; x < IDDoctors.size(); x++) {
                        model.addElement(IDDoctors.get(x));
                    }
                }

            } else {
                model.addElement("Ningún doctor atiende a este paciente.");
            }

            ShowPerson Patient = new ShowPerson();

            Patient.setFields(this.patients.get(indice).getFirstName(), this.patients.get(indice).getLastName(), this.patients.get(indice).getSecurityNumber(), Float.toString(this.patients.get(indice).getWeigth()), this.patients.get(indice).getTelephone(), Float.toString(this.patients.get(indice).getSize()), this.patients.get(indice).getAddress(), this.patients.get(indice).getEmail(), Integer.toString(this.patients.get(indice).getAge()), this.patients.get(indice).getDisease(), this.patients.get(indice).getStatus(), Integer.toString(this.patients.get(indice).getRoomID()), model);

            Patient.setVisible(true);

            JFrame f = new JFrame();

            f.getContentPane().add(Patient);
            f.pack();
            f.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "No se encontró al paciente.", "NOT FOUNDED.", JOptionPane.ERROR_MESSAGE);
        }

    }

    /**
     * Método utilizado para la creación de un nuevo Paciente //Recibe como
     * atributos todas las características de un Paciente
     *
     * @param name
     * @param lastName
     * @param nSS
     * @param age
     * @param e_mail
     * @param address
     * @param telephone
     * @param disease
     * @param size
     * @param weigth
     */
    public void addPatient(String name, String lastName, String nSS, int age, String e_mail, String address, String telephone, String disease, float size, float weigth) {
        Patient newPatient = new Patient();
        newPatient.setFirstName(name);
        newPatient.setLastName(lastName);
        newPatient.setAge(age);
        newPatient.setDisease(disease);
        newPatient.setEmail(e_mail);
        newPatient.setStatus("Ingreso");
        newPatient.setTelephone(telephone);
        newPatient.setAddress(address);

        try {
            newPatient.setSecurityNumber(nSS);
        } catch (NotValidNumber ex) {
            JOptionPane.showMessageDialog(null, ex.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        try {
            newPatient.setSize(size);
        } catch (NotValidNumber ex) {
            JOptionPane.showMessageDialog(null, ex.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        try {
            newPatient.setWeigth(weigth);
        } catch (NotValidNumber ex) {
            JOptionPane.showMessageDialog(null, ex.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        this.patients.add(newPatient);

    }

    /**
     * Método de copia utilizado para la creación de un nuevo paciente
     *
     * @param p
     */
    public void addPatient(Patient p) {
        this.patients.add(p);
    }

    public void addDoctor(String name, String lastName, String licence, int age, String e_mail, String address, String telephone, String Department) {
        Doctor newDoc = new Doctor();
        newDoc.setFirstName(name);
        newDoc.setLastName(lastName);
        newDoc.setAge(age);
        newDoc.setLicence(licence);
        newDoc.setEmail(e_mail);
        newDoc.setDepartment(Department);
        newDoc.setAddress(address);
        newDoc.setTelephone(telephone);
        newDoc.setId(Integer.toString(this.doctorsIds));
        this.doctorsIds++;
        this.doctors.add(newDoc);
    }

    /**
     * Método para asignarle un Doctor a un Paciente
     *
     * @param doctorId
     * @param securityNumber
     */
    public void assignDoctorToPatient(String doctorId, String securityNumber) {
        String securityNumberFounded = this.findPatientBySecurityNumber(securityNumber);
        String idFounded = this.findDoctorById(doctorId);
        if (!securityNumberFounded.isEmpty() && !idFounded.isEmpty()) {
            try {
                this.patients.get(Integer.valueOf(securityNumberFounded)).setNewDoc(doctorId);
                this.doctors.get(Integer.valueOf(idFounded)).addPatientID(securityNumber);
            } catch (OverSize error) {
                JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
            } catch (NotValidNumber ex) {
                JOptionPane.showMessageDialog(null, ex.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    /**
     * Método para asignarle un cuarto a un Paciente
     *
     * @param securityNumber
     * @param roomId
     */
    public void assignRoomToPatient(String securityNumber, String roomId) {
        String securityNumberFounded = this.findPatientBySecurityNumber(securityNumber);
        if (!securityNumberFounded.isEmpty()) {
            try {
                this.patients.get(Integer.valueOf(securityNumberFounded)).setRoomID(roomId);
                this.rooms.get(Integer.valueOf(securityNumberFounded)).setPatientID(securityNumber);
            } catch (NotValidNumber error) {
                JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    /**
     * Método para asignarle un consultorio a un Doctor
     *
     * @param idDoctor
     * @param doctorsOfficeId
     */
    public void assignOfficeToDoctor(String idDoctor, String doctorsOfficeId) {

        try {
            this.offices.get(Integer.valueOf(doctorsOfficeId) - 1).setDoctorID(idDoctor);
        } catch (NotValidNumber error) {
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    public void assignOfficeToDoctorNOTDEFINED(String doctorsOfficeId) {
        this.offices.get(Integer.valueOf(doctorsOfficeId) - 1).setDoctorIDND();
    }

    /**
     * Método para modificiar el status de un Paciente
     *
     * @param securityNumber
     * @param Status
     */
    public void changeStatusOfPatient(String securityNumber, String Status) {
        String securityNumberFounded = this.findPatientBySecurityNumber(securityNumber);

        if (!securityNumberFounded.isEmpty()) {
            this.patients.get(Integer.valueOf(securityNumberFounded)).setStatus(Status);
        }
    }

    /**
     * Método para modificar el status de un Paciente a "Alta"
     *
     * @return patientsReady
     */
    public ArrayList<Patient> showPatientsReadyToGoHome() {

        ArrayList<Patient> patientsReady = new ArrayList<>();

        for (int i = 0; i < this.patients.size(); i++) {
            if (this.patients.get(i).getStatus().equals("Alta")) {
                patientsReady.add(this.patients.get(i));
            }
        }
        return patientsReady;
    }

    /**
     * Método para dar de baja a un Paciente
     *
     * @param securityNumber
     * @throws Exceptions.NotValidNumber
     */
    public void dischargePatient(String securityNumber) throws NotValidNumber {
        String securityNumberFounded = this.findPatientBySecurityNumber(securityNumber);

        for (int x = 0; x < this.numOfRooms; x++) {
            if (this.rooms.get(x).getPatientID().equals(securityNumber)) {
                this.rooms.get(x).setPatientID("NOT DEFINED");

                x = this.numOfRooms;
            }

        }

        for (int x = 0; x < this.doctors.size(); x++) {
            this.doctors.get(x).erasePatient(securityNumber);
        }

        if (!securityNumberFounded.isEmpty()) {
            this.patients.remove(securityNumberFounded);
        }
    }

    /**
     * Método para validar la existencia de un Doctor
     *
     * @param idDoctor
     * @return validacion
     */
    public boolean validateDoctor(String idDoctor) {
        boolean validacion = false;

        for (int i = 0; i < this.doctors.size(); i++) {
            if (idDoctor.equals(this.doctors.get(i).getId())) {
                validacion = true;
                i = this.doctors.size();
            }
        }
        return validacion;
    }

    /**
     * Método para validar la existencia de un consultorio
     *
     * @param id
     * @return validacion
     */
    public boolean validateDoctorOffice(int id) {
        boolean validacion = false;

        for (int i = 0; i < this.offices.size(); i++) {
            if (id == this.offices.get(i).getId()) {
                validacion = true;
                i = this.offices.size();
            }
        }
        return validacion;
    }

    private void modifyDoctor(Doctor newInfo) {
        for (int x = 0; x < this.doctors.size(); x++) {
            if (this.doctors.get(x).getId().equals(newInfo.getId())) {

                this.doctors.get(x).setAddress(newInfo.getAddress());

                this.doctors.get(x).setFirstName(newInfo.getFirstName());

                this.doctors.get(x).setLastName(newInfo.getLastName());

                this.doctors.get(x).setAge(newInfo.getAge());

                this.doctors.get(x).setDepartment(newInfo.getDepartment());

                this.doctors.get(x).setEmail(newInfo.getEmail());

                this.doctors.get(x).setLicence(newInfo.getLicence());

                this.doctors.get(x).setTelephone(newInfo.getTelephone());

            }
        }
    }

    /**
     * Método get para el Teléfono
     *
     * @return telephone
     */
    public String getTelephone() {
        return this.telephone;
    }

    /**
     * Método de copia para la creación de un nuevo doctor
     *
     * @param d
     */
    public void addDoctor(Doctor d) {
        d.setId(Integer.toString(this.doctorsIds));
        this.doctorsIds++;
        this.doctors.add(d);
        System.out.println(this.doctors.size());
        System.out.println(this.doctors.get(0).toString());
    }

}
