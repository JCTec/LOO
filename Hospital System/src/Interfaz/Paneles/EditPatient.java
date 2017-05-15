/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz.Paneles;

import Data.Infrastructure.Hospital;
import Data.People.Doctor;
import Data.People.Patient;
import java.util.ArrayList;
import javax.swing.AbstractListModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.ListModel;

/**
 *
 * @author oscar
 */
public class EditPatient extends javax.swing.JPanel {

	private Patient patient;
	private Hospital hospital;
	DefaultListModel<String> doctorForPatient = new DefaultListModel<>();
	DefaultListModel<String> otherDoctors = new DefaultListModel<>();
	
	/**
	 * Creates new form EditPatient
	 */
	public EditPatient() {
		initComponents();
		this.patient = null;
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelFirstName = new javax.swing.JLabel();
        labelLastName = new javax.swing.JLabel();
        labelAge = new javax.swing.JLabel();
        labelTelephone = new javax.swing.JLabel();
        labelAddress = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelSecurityNumber = new javax.swing.JLabel();
        labelHeight = new javax.swing.JLabel();
        labelWeight = new javax.swing.JLabel();
        labelSickness = new javax.swing.JLabel();
        labelStatus = new javax.swing.JLabel();
        labelRoomID = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        fieldFirstName = new javax.swing.JTextField();
        fieldLastName = new javax.swing.JTextField();
        fieldAge = new javax.swing.JTextField();
        fieldTelephone = new javax.swing.JTextField();
        fieldAddress = new javax.swing.JTextField();
        fieldEmail = new javax.swing.JTextField();
        fieldSecurityNumber = new javax.swing.JTextField();
        fieldHeight = new javax.swing.JTextField();
        fieldWeight = new javax.swing.JTextField();
        fieldSickness = new javax.swing.JTextField();
        fieldStatus = new javax.swing.JTextField();
        fieldRoomID = new javax.swing.JTextField();
        selectPatient = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        patientDoctorList = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        otherDoctorList = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        doctorToPatientButton = new javax.swing.JButton();
        doctorToOtherButton = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Edit Patient"));
        jPanel1.setToolTipText("");

        jLabel1.setText("Select the patient you wish to edit:");

        labelFirstName.setText("Name:");

        labelLastName.setText("Surname:");

        labelAge.setText("Age:");

        labelTelephone.setText("Telephone:");

        labelAddress.setText("Address:");

        labelEmail.setText("E_mail:");

        labelSecurityNumber.setText("Security Number:");

        labelHeight.setText("Height:");

        labelWeight.setText("Weight:");

        labelSickness.setText("Sickness:");

        labelStatus.setText("Status:");

        labelRoomID.setText("Room ID:");

        saveButton.setText("Save");

        selectPatient.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        selectPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectPatientActionPerformed(evt);
            }
        });

        patientDoctorList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(patientDoctorList);

        otherDoctorList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1"," a","e",",","what","test","another", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(otherDoctorList);

        jLabel2.setText("Doctors following this patient");

        jLabel3.setText("Other doctors");

        doctorToPatientButton.setText("<");
        doctorToPatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorToPatientButtonActionPerformed(evt);
            }
        });

        doctorToOtherButton.setText(">");
        doctorToOtherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorToOtherButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelRoomID, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(fieldRoomID))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(fieldStatus))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelSickness, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(fieldSickness))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(fieldWeight))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(fieldHeight))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelSecurityNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(fieldSecurityNumber))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(fieldEmail))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(fieldAddress))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(fieldTelephone))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelAge, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(fieldAge))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(fieldLastName))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(fieldFirstName))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selectPatient, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(doctorToPatientButton)
                                    .addComponent(doctorToOtherButton)))
                            .addComponent(jLabel2))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(0, 152, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(saveButton)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(selectPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFirstName)
                    .addComponent(fieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLastName)
                    .addComponent(fieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAge)
                    .addComponent(fieldAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTelephone)
                    .addComponent(fieldTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAddress)
                    .addComponent(fieldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmail)
                    .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSecurityNumber)
                    .addComponent(fieldSecurityNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelHeight)
                    .addComponent(fieldHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelWeight)
                    .addComponent(fieldWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSickness)
                    .addComponent(fieldSickness, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelStatus)
                    .addComponent(fieldStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRoomID)
                    .addComponent(fieldRoomID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(saveButton)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(doctorToPatientButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(doctorToOtherButton)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void doctorToPatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorToPatientButtonActionPerformed
		if(!this.otherDoctors.isEmpty() && !this.otherDoctorList.isSelectionEmpty()){
			int index = this.otherDoctorList.getSelectedIndex();
			this.doctorForPatient.addElement(this.otherDoctors.getElementAt(index));
			this.otherDoctors.remove(index);
		}
    }//GEN-LAST:event_doctorToPatientButtonActionPerformed

    private void doctorToOtherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorToOtherButtonActionPerformed
        if(!this.doctorForPatient.isEmpty() && !this.patientDoctorList.isSelectionEmpty()){
			int index = this.patientDoctorList.getSelectedIndex();
			this.otherDoctors.addElement(this.doctorForPatient.getElementAt(index));
			this.doctorForPatient.remove(index);
		}
    }//GEN-LAST:event_doctorToOtherButtonActionPerformed

    private void selectPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectPatientActionPerformed
        this.refreshPatient();
    }//GEN-LAST:event_selectPatientActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton doctorToOtherButton;
    private javax.swing.JButton doctorToPatientButton;
    private javax.swing.JTextField fieldAddress;
    private javax.swing.JTextField fieldAge;
    private javax.swing.JTextField fieldEmail;
    private javax.swing.JTextField fieldFirstName;
    private javax.swing.JTextField fieldHeight;
    private javax.swing.JTextField fieldLastName;
    private javax.swing.JTextField fieldRoomID;
    private javax.swing.JTextField fieldSecurityNumber;
    private javax.swing.JTextField fieldSickness;
    private javax.swing.JTextField fieldStatus;
    private javax.swing.JTextField fieldTelephone;
    private javax.swing.JTextField fieldWeight;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelAddress;
    private javax.swing.JLabel labelAge;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelFirstName;
    private javax.swing.JLabel labelHeight;
    private javax.swing.JLabel labelLastName;
    private javax.swing.JLabel labelRoomID;
    private javax.swing.JLabel labelSecurityNumber;
    private javax.swing.JLabel labelSickness;
    private javax.swing.JLabel labelStatus;
    private javax.swing.JLabel labelTelephone;
    private javax.swing.JLabel labelWeight;
    private javax.swing.JList<String> otherDoctorList;
    private javax.swing.JList<String> patientDoctorList;
    private javax.swing.JButton saveButton;
    private javax.swing.JComboBox<String> selectPatient;
    // End of variables declaration//GEN-END:variables

	public void setHospital(Hospital hospital){	
		this.hospital = hospital;
		int patientNumber = hospital.getPatients().size();
		String[] items = new String[patientNumber];
		for(int i = 0 ; i < patientNumber ; i++){
			Patient pat = hospital.getPatients().get(i);
			items[i] = i + " " + pat.getFirstName() + " " + pat.getLastName();
		}
		this.selectPatient.setModel(new DefaultComboBoxModel<>(items));
		this.refreshPatient();
	}
	
	private int getSelectedIndex(){
		return Integer.parseInt(this.selectPatient.getSelectedItem().toString().split(" ")[0]);
	}
	
	private void refreshPatient() {
		int patientIndex = this.getSelectedIndex();
		this.patient = this.hospital.getPatients().get(patientIndex);
		
		this.putDoctorsInLists();
		this.fillFields();
	}
	
	private void fillFields(){
		this.fieldAddress.setText(this.patient.getAddress());
		this.fieldAge.setText(Integer.toString(this.patient.getAge()));
		this.fieldEmail.setText(this.patient.getEmail());
		this.fieldFirstName.setText(this.patient.getFirstName());
		this.fieldHeight.setText(Float.toString(this.patient.getSize()));
		this.fieldLastName.setText(this.patient.getLastName());
		this.fieldRoomID.setText(Integer.toString(this.patient.getRoomID()));
		this.fieldSecurityNumber.setText(this.patient.getSecurityNumber());
		this.fieldSickness.setText(this.patient.getDisease());
		this.fieldStatus.setText(this.patient.getStatus());
		this.fieldTelephone.setText(this.patient.getTelephone());
		this.fieldWeight.setText(Float.toString(this.patient.getWeigth()));
	}
	
	private void clearFields(){
		this.fieldAddress.setText("");
		this.fieldAge.setText("");
		this.fieldEmail.setText("");
		this.fieldFirstName.setText("");
		this.fieldHeight.setText("");
		this.fieldLastName.setText("");
		this.fieldRoomID.setText("");
		this.fieldSecurityNumber.setText("");
		this.fieldSickness.setText("");
		this.fieldStatus.setText("");
		this.fieldTelephone.setText("");
		this.fieldWeight.setText("");
	}

	public JButton getSaveButton() {
		return saveButton;
	}

	Patient getPatient() {
		return new Patient(
			this.fieldFirstName.getText(),
			this.fieldLastName.getText(),
			Integer.parseInt(this.fieldAge.getText()),
			this.fieldAddress.getText(),
			this.fieldTelephone.getText(),
			this.fieldEmail.getText(),
			this.fieldSecurityNumber.getText(),
			Float.parseFloat(this.fieldWeight.getText()),
			Float.parseFloat(this.fieldHeight.getText()),
			this.fieldSickness.getText(),
			Integer.parseInt(this.fieldRoomID.getText()),
			this.getDoctorIDs(),
			this.fieldStatus.getText()
		);
	}

	private void putDoctorsInLists() {
		int patientDoctorAmount = this.patient.getDoctorID().size();
		int m = 0, n = 0;
		this.patientDoctorList.setModel(doctorForPatient);
		this.otherDoctorList.setModel(otherDoctors);
		//All these fors are for adding the patient's doctor to the list
		for(int i = 0 ; i < this.hospital.getDoctors().size() ; i++){
			Doctor doc = this.hospital.getDoctors().get(i);
			boolean isFollowingPatient = false;
			for(int j = 0 ; j < patientDoctorAmount ; j++){
				//this if checks if the doctor id from hospital doctors loop is in the patient's doctor list
				if(doc.getId().equals(this.patient.getDoctorID().get(j))){
					isFollowingPatient = true;
				}
			}
			if(isFollowingPatient){
				doctorForPatient.addElement(doc.getId() + " " + doc.getLastName() + " (" + doc.getDepartment() + ")");
			}
			else{
				otherDoctors.addElement(doc.getId() + " " + doc.getLastName() + " (" + doc.getDepartment() + ")");
			}
		}
	}

	private ArrayList<String> getDoctorIDs() {
		ArrayList<String> doctorIDs = new ArrayList<>();
		for(int i = 0 ; i < this.doctorForPatient.getSize() ; i++){
			//the following line extracts the doctor ID from the line of text in the list
			doctorIDs.add(this.doctorForPatient.getElementAt(i).split(" ")[0]);
		}
		return doctorIDs;
	}

	Patient getOldPatient() {
		return this.patient;
	}

}
