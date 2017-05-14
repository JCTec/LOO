/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz.Paneles;

import Data.Infrastructure.Hospital;
import Data.People.Doctor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author oscar
 */
public class EditDoctor extends javax.swing.JPanel {

	private Hospital hospital;
	private Doctor doctor;
	
	/**
	 * Creates new form EditDoctor
	 */
	public EditDoctor() {
		initComponents();
		doctor = null;
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
        labelDepartment = new javax.swing.JLabel();
        labelName = new javax.swing.JLabel();
        labelSurname = new javax.swing.JLabel();
        labelAge = new javax.swing.JLabel();
        labelAddress = new javax.swing.JLabel();
        labelTelephone = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelLicence = new javax.swing.JLabel();
        fieldName = new javax.swing.JTextField();
        fieldSurname = new javax.swing.JTextField();
        fieldAge = new javax.swing.JTextField();
        fieldAddress = new javax.swing.JTextField();
        fieldTelephone = new javax.swing.JTextField();
        fieldEmail = new javax.swing.JTextField();
        fieldDepartment = new javax.swing.JTextField();
        fieldLicence = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        labelFindID = new javax.swing.JLabel();
        selectDoctor = new javax.swing.JComboBox<>();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Edit Doctor"));

        labelDepartment.setText("Department:");

        labelName.setText("Name:");

        labelSurname.setText("Surname:");

        labelAge.setText("Age:");

        labelAddress.setText("Address:");

        labelTelephone.setText("Telephone:");

        labelEmail.setText("E-mail:");

        labelLicence.setText("Licence:");

        saveButton.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        saveButton.setText("Guardar");

        labelFindID.setText("Select the doctor:");

        selectDoctor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        selectDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectDoctorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelLicence, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelDepartment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelTelephone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelName)
                    .addComponent(labelSurname)
                    .addComponent(labelAge)
                    .addComponent(labelFindID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldSurname)
                    .addComponent(fieldName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fieldAge, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(selectDoctor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fieldAddress)
                    .addComponent(fieldTelephone)
                    .addComponent(fieldEmail)
                    .addComponent(fieldDepartment)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(saveButton)
                        .addGap(0, 201, Short.MAX_VALUE))
                    .addComponent(fieldLicence))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFindID)
                    .addComponent(selectDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelName)
                    .addComponent(fieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSurname)
                    .addComponent(fieldSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAge)
                    .addComponent(fieldAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAddress)
                    .addComponent(fieldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTelephone)
                    .addComponent(fieldTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmail)
                    .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDepartment)
                    .addComponent(fieldDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLicence)
                    .addComponent(fieldLicence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saveButton)
                .addContainerGap(73, Short.MAX_VALUE))
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

    private void selectDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectDoctorActionPerformed
		this.refreshDoctor();
    }//GEN-LAST:event_selectDoctorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fieldAddress;
    private javax.swing.JTextField fieldAge;
    private javax.swing.JTextField fieldDepartment;
    private javax.swing.JTextField fieldEmail;
    private javax.swing.JTextField fieldLicence;
    private javax.swing.JTextField fieldName;
    private javax.swing.JTextField fieldSurname;
    private javax.swing.JTextField fieldTelephone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelAddress;
    private javax.swing.JLabel labelAge;
    private javax.swing.JLabel labelDepartment;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelFindID;
    private javax.swing.JLabel labelLicence;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelSurname;
    private javax.swing.JLabel labelTelephone;
    private javax.swing.JButton saveButton;
    private javax.swing.JComboBox<String> selectDoctor;
    // End of variables declaration//GEN-END:variables

	public JButton getSaveButton() {
		return saveButton;
	}

	public void setHospital(Hospital hospital){	
                this.hospital = hospital;
		int doctorNumber = hospital.getDoctors().size();
		String[] items = new String[doctorNumber];
		for(int i = 0 ; i < doctorNumber ; i++){
			Doctor doc = hospital.getDoctors().get(i);
			items[i] = doc.getId() + " " + doc.getFirstName() + " " + doc.getLastName();
		}
		this.selectDoctor.setModel(new DefaultComboBoxModel<>(items));
		this.refreshDoctor();
	}

	private void fillFields() {
		this.fieldAddress.setText(doctor.getAddress());
		this.fieldAge.setText("" + doctor.getAge());
		this.fieldDepartment.setText(doctor.getDepartment());
		this.fieldEmail.setText(doctor.getEmail());
		this.fieldLicence.setText(doctor.getLicence());
		this.fieldName.setText(doctor.getFirstName());
		this.fieldSurname.setText(doctor.getLastName());
		this.fieldTelephone.setText(doctor.getTelephone());
	}

	public void clearFields(){
		this.fieldAddress.setText("");
		this.fieldAge.setText("");
		this.fieldDepartment.setText("");
		this.fieldEmail.setText("");
		this.fieldLicence.setText("");
		this.fieldName.setText("");
		this.fieldSurname.setText("");
		this.fieldTelephone.setText("");		
	}
	
	private String getSelectedDoctorId(){
		return this.selectDoctor.getSelectedItem().toString().split(" ")[0];
	}
	
	public Doctor getDoctor(){
		Doctor d = new Doctor(
			fieldName.getText(),
			fieldSurname.getText(),
			fieldAddress.getText(),
			fieldEmail.getText(),
			fieldTelephone.getText(),
			Integer.parseInt(fieldAge.getText()),
			this.getSelectedDoctorId(),
			fieldDepartment.getText(),
			fieldLicence.getText()
		);
		return d;
	}

	private void refreshDoctor() {
		String doctorId = this.getSelectedDoctorId();
		for(int i = 0 ; i < this.hospital.getDoctors().size() ; i++){
			if(doctorId.equals(this.hospital.getDoctors().get(i).getId())){
				this.doctor = this.hospital.getDoctors().get(i);
			}
		}
		this.fillFields();
	}
}
