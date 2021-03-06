/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz.Paneles;

import Data.Infrastructure.Hospital;
import Data.People.Doctor;
import Data.People.Patient;
import Data.People.Person;
import Exceptions.NotValidNumber;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JButton;

/**
 *
 * @author alanp
 */
public class CreateNewPatient extends javax.swing.JPanel {

    private Patient patient;
	private Hospital hospital;
	DefaultListModel<String> doctorForPatient = new DefaultListModel<>();
	DefaultListModel<String> otherDoctors = new DefaultListModel<>();

    /**
     * Creates new form CreateNewPatient
     */
    public CreateNewPatient() {
        initComponents();
		this.patient = null;
		this.patientDoctorList.setModel(doctorForPatient);
		this.otherDoctorList.setModel(otherDoctors);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        surnameLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        telphoneLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        emialLabel = new javax.swing.JLabel();
        NSSLabel = new javax.swing.JLabel();
        highLabel = new javax.swing.JLabel();
        weightLabel = new javax.swing.JLabel();
        deseaseLabel = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        nameField = new javax.swing.JTextField();
        surnameField = new javax.swing.JTextField();
        ageField = new javax.swing.JTextField();
        telphoneField = new javax.swing.JTextField();
        addressField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        nssField = new javax.swing.JTextField();
        highField = new javax.swing.JTextField();
        weightField = new javax.swing.JTextField();
        deseaseField = new javax.swing.JTextField();
        statusField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        otherDoctorList = new javax.swing.JList<>();
        doctorToOtherButton = new javax.swing.JButton();
        doctorToPatientButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        patientDoctorList = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Agregar Paciente"));

        nameLabel.setText("Nombre(s):");

        surnameLabel.setText("Apellido(s):");

        ageLabel.setText("Edad:");

        telphoneLabel.setText("Teléfono:");

        addressLabel.setText("Dirección:");

        emialLabel.setText("E-mail:");

        NSSLabel.setText("NSS:");

        highLabel.setText("Altura:");

        weightLabel.setText("Peso:");

        deseaseLabel.setText("Enfermedad:");

        statusLabel.setText("Estatus:");

        saveButton.setText("Guardar");

        otherDoctorList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(otherDoctorList);

        doctorToOtherButton.setText(">");
        doctorToOtherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorToOtherButtonActionPerformed(evt);
            }
        });

        doctorToPatientButton.setText("<");
        doctorToPatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorToPatientButtonActionPerformed(evt);
            }
        });

        patientDoctorList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(patientDoctorList);

        jLabel1.setText("Doctors following the patient");

        jLabel2.setText("Other doctors");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameLabel)
                                    .addComponent(surnameLabel)
                                    .addComponent(ageLabel)
                                    .addComponent(telphoneLabel)
                                    .addComponent(addressLabel)
                                    .addComponent(emialLabel)
                                    .addComponent(NSSLabel)
                                    .addComponent(highLabel)
                                    .addComponent(deseaseLabel)
                                    .addComponent(weightLabel)
                                    .addComponent(statusLabel))
                                .addGap(96, 96, 96))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deseaseField)
                            .addComponent(nssField)
                            .addComponent(surnameField)
                            .addComponent(addressField)
                            .addComponent(nameField)
                            .addComponent(ageField)
                            .addComponent(telphoneField)
                            .addComponent(emailField)
                            .addComponent(highField)
                            .addComponent(weightField)
                            .addComponent(statusField)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(doctorToPatientButton)
                                    .addComponent(doctorToOtherButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(saveButton)
                                        .addGap(33, 33, 33))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLabel)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(surnameLabel)
                    .addComponent(surnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ageLabel)
                    .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telphoneLabel)
                    .addComponent(telphoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addressLabel)
                    .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emialLabel)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NSSLabel)
                    .addComponent(nssField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(highLabel)
                    .addComponent(highField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weightLabel)
                    .addComponent(weightField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deseaseLabel)
                    .addComponent(deseaseField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(statusLabel)
                    .addComponent(statusField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(saveButton))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(doctorToOtherButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(doctorToPatientButton))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void doctorToOtherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorToOtherButtonActionPerformed
        if(!this.doctorForPatient.isEmpty() && !this.patientDoctorList.isSelectionEmpty()){
			int index = this.patientDoctorList.getSelectedIndex();
			this.otherDoctors.addElement(this.doctorForPatient.getElementAt(index));
			this.doctorForPatient.remove(index);
		}
    }//GEN-LAST:event_doctorToOtherButtonActionPerformed

    private void doctorToPatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorToPatientButtonActionPerformed
        if(!this.otherDoctors.isEmpty() && !this.otherDoctorList.isSelectionEmpty()){
			int index = this.otherDoctorList.getSelectedIndex();
			this.doctorForPatient.addElement(this.otherDoctors.getElementAt(index));
			this.otherDoctors.remove(index);
		}
    }//GEN-LAST:event_doctorToPatientButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NSSLabel;
    private javax.swing.JTextField addressField;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField ageField;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField deseaseField;
    private javax.swing.JLabel deseaseLabel;
    private javax.swing.JButton doctorToOtherButton;
    private javax.swing.JButton doctorToPatientButton;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emialLabel;
    private javax.swing.JTextField highField;
    private javax.swing.JLabel highLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nssField;
    private javax.swing.JList<String> otherDoctorList;
    private javax.swing.JList<String> patientDoctorList;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField statusField;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JTextField surnameField;
    private javax.swing.JLabel surnameLabel;
    private javax.swing.JTextField telphoneField;
    private javax.swing.JLabel telphoneLabel;
    private javax.swing.JTextField weightField;
    private javax.swing.JLabel weightLabel;
    // End of variables declaration//GEN-END:variables
    
	public JButton getSaveButton() {
        return saveButton;
    }

    public Patient getPatient() {
        Patient p;
        //Se crea la parte de Persona
        Person person = new Person(
                this.nameField.getText(),
                this.addressField.getText(),
                this.emailField.getText(),
                this.surnameField.getText(),
                this.telphoneField.getText(),
                Integer.parseInt(this.ageField.getText())
        );

            p = new Patient(
                person,
                this.nssField.getText(),
                Float.parseFloat(this.weightField.getText()),
                Float.parseFloat(this.highField.getText()),
                this.deseaseField.getText(),
                this.statusField.getText()
        );
        
        
		
        //Adding the doctors to the patient
		ArrayList<String> docIDs = this.getDoctorIDs();
		for(int i = 0 ; i < docIDs.size() ; i++){
			try {
				p.setDoctorID(docIDs.get(i));
			} catch (NotValidNumber ex) {
				Logger.getLogger(CreateNewPatient.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
		
        this.patient = p;
        return this.patient;
    }
    
    public String getNSS(){
        return this.nssField.getText();
    }
    

    public void clearFields() {
        this.nameField.setText("");
        this.addressField.setText("");
        this.emailField.setText("");
        this.surnameField.setText("");
        this.telphoneField.setText("");
        this.nssField.setText("");
        this.weightField.setText("");
        this.highField.setText("");
        this.deseaseField.setText("");
        this.statusField.setText("");
        this.ageField.setText("");
    }
    
	public void setHospital(Hospital hospital){	
		this.hospital = hospital;
		this.putDoctorsInLists();
	}
  
	private void putDoctorsInLists() {
		//First we should empty the list for refreshing
		this.otherDoctors.clear();
		this.doctorForPatient.clear();
		System.out.println(this.hospital);
		//All these fors are for adding the patient's doctor to the list
		for(int i = 0 ; i < this.hospital.getDoctors().size() ; i++){
			Doctor doc = this.hospital.getDoctors().get(i);
			otherDoctors.addElement(doc.getId() + " " + doc.getLastName() + " (" + doc.getDepartment() + ")");
		}
	}

	public ArrayList<String> getDoctorIDs() {
		ArrayList<String> doctorIDs = new ArrayList<>();
		for(int i = 0 ; i < this.doctorForPatient.getSize() ; i++){
			//the following line extracts the doctor ID from the line of text in the list
			doctorIDs.add(this.doctorForPatient.getElementAt(i).split(" ")[0]);
		}
		return doctorIDs;
	}
	
}
