/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz.Paneles;

import Data.Infrastructure.DoctorsOffice;
import Data.Infrastructure.Hospital;
import Data.People.Doctor;
import DataBase.GuardarHospital;
import DataBase.LoadDataBase;
import Exceptions.NotValidNumber;
import java.awt.CardLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author oscar
 */
public class MainWindow extends javax.swing.JFrame {

	/**
	 * Variable keeping all the data from all the hospitals
	 */
	private Hospital hospital;
	
	/**
	 * Creates new form MainWindow
	 */
	public MainWindow() {
            
            
                initComponents();
		initSaveButtonsListeners();
		//intiFakeData();
            
                this.setVisible(false);
                
		LoadDataBase DB = new LoadDataBase();
                this.hospital = DB.LoadHospital();
                
                if(this.hospital == null){
          
                    this.createNewHospitalForm.setVisible(true);

                    this.Frame.setSize(500, 600);
                    this.Frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    this.Frame.setVisible(true);
 
                    this.Frame.getContentPane().add(this.createNewHospitalForm);
 
                }else {
                    this.setVisible(true);
                }
                
		
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        inicioPanel = new javax.swing.JPanel();
        inicioPanel1 = new Interfaz.Paneles.InicioPanel();
        newHospital = new javax.swing.JPanel();
        createNewHospitalForm = new Interfaz.Paneles.CreateNewHospital();
        newOffice = new javax.swing.JPanel();
        createNewDoctorsOffice1 = new Interfaz.Paneles.CreateNewDoctorsOffice();
        newPatient = new javax.swing.JPanel();
        createNewPatient1 = new Interfaz.Paneles.CreateNewPatient();
        newDoctor = new javax.swing.JPanel();
        createNewDoctor2 = new Interfaz.Paneles.CreateNewDoctor();
        editPatient = new javax.swing.JPanel();
        editPatient1 = new Interfaz.Paneles.EditPatient();
        editOffice = new javax.swing.JPanel();
        editDoctorsOffice1 = new Interfaz.Paneles.EditDoctorsOffice();
        editDoctor = new javax.swing.JPanel();
        editDoctor1 = new Interfaz.Paneles.EditDoctor();
        removePatient = new javax.swing.JPanel();
        removeOffice = new javax.swing.JPanel();
        removeDoctor = new javax.swing.JPanel();
        aboutHospital = new javax.swing.JPanel();
        aboutHospital1 = new Interfaz.Paneles.aboutHospital();
        editHospital = new javax.swing.JPanel();
        editHospital1 = new Interfaz.Paneles.EditHospital();
        menuBar = new javax.swing.JMenuBar();
        menuHospital = new javax.swing.JMenu();
        menuEditHospital = new javax.swing.JMenuItem();
        menuAboutHospital = new javax.swing.JMenuItem();
        menuOffice = new javax.swing.JMenu();
        menuNewOffice = new javax.swing.JMenuItem();
        menuEditOffice = new javax.swing.JMenuItem();
        menuRemoveOffice = new javax.swing.JMenuItem();
        menuDoctor = new javax.swing.JMenu();
        menuNewDoctor = new javax.swing.JMenuItem();
        menuEditDoctor = new javax.swing.JMenuItem();
        menuRemoveDoctor = new javax.swing.JMenuItem();
        menuPatient = new javax.swing.JMenu();
        menuNewPatient = new javax.swing.JMenuItem();
        menuEditPatient = new javax.swing.JMenuItem();
        menuRemovePatient = new javax.swing.JMenuItem();
        menuReport = new javax.swing.JMenu();
        menuReportDoctor = new javax.swing.JMenuItem();
        menuReportPerson = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout inicioPanelLayout = new javax.swing.GroupLayout(inicioPanel);
        inicioPanel.setLayout(inicioPanelLayout);
        inicioPanelLayout.setHorizontalGroup(
            inicioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(inicioPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(54, 54, 54))
        );
        inicioPanelLayout.setVerticalGroup(
            inicioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inicioPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(132, 132, 132))
        );

        mainPanel.add(inicioPanel, "inicioPanel");

        javax.swing.GroupLayout newHospitalLayout = new javax.swing.GroupLayout(newHospital);
        newHospital.setLayout(newHospitalLayout);
        newHospitalLayout.setHorizontalGroup(
            newHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newHospitalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createNewHospitalForm, javax.swing.GroupLayout.DEFAULT_SIZE, 862, Short.MAX_VALUE)
                .addContainerGap())
        );
        newHospitalLayout.setVerticalGroup(
            newHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newHospitalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createNewHospitalForm, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainPanel.add(newHospital, "newHospital");

        javax.swing.GroupLayout newOfficeLayout = new javax.swing.GroupLayout(newOffice);
        newOffice.setLayout(newOfficeLayout);
        newOfficeLayout.setHorizontalGroup(
            newOfficeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newOfficeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createNewDoctorsOffice1, javax.swing.GroupLayout.DEFAULT_SIZE, 862, Short.MAX_VALUE)
                .addContainerGap())
        );
        newOfficeLayout.setVerticalGroup(
            newOfficeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newOfficeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createNewDoctorsOffice1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainPanel.add(newOffice, "newOffice");

        javax.swing.GroupLayout newPatientLayout = new javax.swing.GroupLayout(newPatient);
        newPatient.setLayout(newPatientLayout);
        newPatientLayout.setHorizontalGroup(
            newPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newPatientLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createNewPatient1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );
        newPatientLayout.setVerticalGroup(
            newPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newPatientLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createNewPatient1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.add(newPatient, "newPatient");

        javax.swing.GroupLayout newDoctorLayout = new javax.swing.GroupLayout(newDoctor);
        newDoctor.setLayout(newDoctorLayout);
        newDoctorLayout.setHorizontalGroup(
            newDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newDoctorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createNewDoctor2, javax.swing.GroupLayout.DEFAULT_SIZE, 874, Short.MAX_VALUE)
                .addContainerGap())
        );
        newDoctorLayout.setVerticalGroup(
            newDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newDoctorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createNewDoctor2, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainPanel.add(newDoctor, "newDoctor");

        javax.swing.GroupLayout editPatientLayout = new javax.swing.GroupLayout(editPatient);
        editPatient.setLayout(editPatientLayout);
        editPatientLayout.setHorizontalGroup(
            editPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPatientLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editPatient1, javax.swing.GroupLayout.DEFAULT_SIZE, 874, Short.MAX_VALUE)
                .addContainerGap())
        );
        editPatientLayout.setVerticalGroup(
            editPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPatientLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editPatient1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainPanel.add(editPatient, "editPatient");

        javax.swing.GroupLayout editOfficeLayout = new javax.swing.GroupLayout(editOffice);
        editOffice.setLayout(editOfficeLayout);
        editOfficeLayout.setHorizontalGroup(
            editOfficeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editOfficeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editDoctorsOffice1, javax.swing.GroupLayout.DEFAULT_SIZE, 862, Short.MAX_VALUE)
                .addContainerGap())
        );
        editOfficeLayout.setVerticalGroup(
            editOfficeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editOfficeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editDoctorsOffice1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainPanel.add(editOffice, "editOffice");

        javax.swing.GroupLayout editDoctorLayout = new javax.swing.GroupLayout(editDoctor);
        editDoctor.setLayout(editDoctorLayout);
        editDoctorLayout.setHorizontalGroup(
            editDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editDoctorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editDoctor1, javax.swing.GroupLayout.DEFAULT_SIZE, 874, Short.MAX_VALUE)
                .addContainerGap())
        );
        editDoctorLayout.setVerticalGroup(
            editDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editDoctorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editDoctor1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainPanel.add(editDoctor, "editDoctor");

        javax.swing.GroupLayout removePatientLayout = new javax.swing.GroupLayout(removePatient);
        removePatient.setLayout(removePatientLayout);
        removePatientLayout.setHorizontalGroup(
            removePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 874, Short.MAX_VALUE)
        );
        removePatientLayout.setVerticalGroup(
            removePatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 712, Short.MAX_VALUE)
        );

        mainPanel.add(removePatient, "removePatient");

        javax.swing.GroupLayout removeOfficeLayout = new javax.swing.GroupLayout(removeOffice);
        removeOffice.setLayout(removeOfficeLayout);
        removeOfficeLayout.setHorizontalGroup(
            removeOfficeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 874, Short.MAX_VALUE)
        );
        removeOfficeLayout.setVerticalGroup(
            removeOfficeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 712, Short.MAX_VALUE)
        );

        mainPanel.add(removeOffice, "removeOffice");

        javax.swing.GroupLayout removeDoctorLayout = new javax.swing.GroupLayout(removeDoctor);
        removeDoctor.setLayout(removeDoctorLayout);
        removeDoctorLayout.setHorizontalGroup(
            removeDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 874, Short.MAX_VALUE)
        );
        removeDoctorLayout.setVerticalGroup(
            removeDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 712, Short.MAX_VALUE)
        );

        mainPanel.add(removeDoctor, "removeDoctor");

        javax.swing.GroupLayout aboutHospitalLayout = new javax.swing.GroupLayout(aboutHospital);
        aboutHospital.setLayout(aboutHospitalLayout);
        aboutHospitalLayout.setHorizontalGroup(
            aboutHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutHospitalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aboutHospital1, javax.swing.GroupLayout.DEFAULT_SIZE, 874, Short.MAX_VALUE)
                .addContainerGap())
        );
        aboutHospitalLayout.setVerticalGroup(
            aboutHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutHospitalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aboutHospital1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainPanel.add(aboutHospital, "aboutHospital");

        javax.swing.GroupLayout editHospitalLayout = new javax.swing.GroupLayout(editHospital);
        editHospital.setLayout(editHospitalLayout);
        editHospitalLayout.setHorizontalGroup(
            editHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editHospitalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editHospital1, javax.swing.GroupLayout.DEFAULT_SIZE, 874, Short.MAX_VALUE)
                .addContainerGap())
        );
        editHospitalLayout.setVerticalGroup(
            editHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editHospitalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editHospital1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainPanel.add(editHospital, "editHospital");

        menuHospital.setText("Hospital");

        menuEditHospital.setText("Edit");
        menuEditHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEditHospitalActionPerformed(evt);
            }
        });
        menuHospital.add(menuEditHospital);

        menuAboutHospital.setText("About");
        menuAboutHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAboutHospitalActionPerformed(evt);
            }
        });
        menuHospital.add(menuAboutHospital);

        menuBar.add(menuHospital);

        menuOffice.setText("Office");

        menuNewOffice.setText("Add");
        menuNewOffice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNewOfficeActionPerformed(evt);
            }
        });
        menuOffice.add(menuNewOffice);

        menuEditOffice.setText("Edit");
        menuEditOffice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEditOfficeActionPerformed(evt);
            }
        });
        menuOffice.add(menuEditOffice);

        menuRemoveOffice.setText("Remove");
        menuRemoveOffice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRemoveOfficeActionPerformed(evt);
            }
        });
        menuOffice.add(menuRemoveOffice);

        menuBar.add(menuOffice);

        menuDoctor.setText("Doctor");

        menuNewDoctor.setText("Add");
        menuNewDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNewDoctorActionPerformed(evt);
            }
        });
        menuDoctor.add(menuNewDoctor);

        menuEditDoctor.setText("Edit");
        menuEditDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEditDoctorActionPerformed(evt);
            }
        });
        menuDoctor.add(menuEditDoctor);

        menuRemoveDoctor.setText("Remove");
        menuRemoveDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRemoveDoctorActionPerformed(evt);
            }
        });
        menuDoctor.add(menuRemoveDoctor);

        menuBar.add(menuDoctor);

        menuPatient.setText("Patient");

        menuNewPatient.setText("Add");
        menuNewPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNewPatientActionPerformed(evt);
            }
        });
        menuPatient.add(menuNewPatient);

        menuEditPatient.setText("Edit");
        menuEditPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEditPatientActionPerformed(evt);
            }
        });
        menuPatient.add(menuEditPatient);

        menuRemovePatient.setText("Remove");
        menuRemovePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRemovePatientActionPerformed(evt);
            }
        });
        menuPatient.add(menuRemovePatient);

        menuBar.add(menuPatient);

        menuReport.setText("Report");

        menuReportDoctor.setText("Doctor");
        menuReportDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuReportDoctorActionPerformed(evt);
            }
        });
        menuReport.add(menuReportDoctor);

        menuReportPerson.setText("Person");
        menuReport.add(menuReportPerson);

        menuBar.add(menuReport);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuRemoveOfficeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRemoveOfficeActionPerformed
        CardLayout card = (CardLayout)mainPanel.getLayout();
		card.show(mainPanel, "removeOffice");
    }//GEN-LAST:event_menuRemoveOfficeActionPerformed

    private void menuNewOfficeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNewOfficeActionPerformed
        if(this.hospital != null){
			CardLayout card = (CardLayout)mainPanel.getLayout();
			card.show(mainPanel, "newOffice");
		}
		else{
			JOptionPane.showMessageDialog(null, "Ningun Hosital seleccionado", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
    }//GEN-LAST:event_menuNewOfficeActionPerformed

    private void menuEditOfficeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEditOfficeActionPerformed
		CardLayout card = (CardLayout)mainPanel.getLayout();
		card.show(mainPanel, "editOffice");
    }//GEN-LAST:event_menuEditOfficeActionPerformed

    private void menuNewDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNewDoctorActionPerformed
        CardLayout card = (CardLayout)mainPanel.getLayout();
		card.show(mainPanel, "newDoctor");
    }//GEN-LAST:event_menuNewDoctorActionPerformed

    private void menuEditDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEditDoctorActionPerformed
		if(this.hospital.getDoctors().isEmpty()){
			JOptionPane.showMessageDialog(null, "Please create a doctor first", "ERROR", JOptionPane.ERROR_MESSAGE);
			this.menuNewDoctor.doClick();
		}
		else{
			this.editDoctor1.setHospital(hospital);
			CardLayout card = (CardLayout)mainPanel.getLayout();
			card.show(mainPanel, "editDoctor");
		}
    }//GEN-LAST:event_menuEditDoctorActionPerformed

    private void menuRemoveDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRemoveDoctorActionPerformed
        CardLayout card = (CardLayout)mainPanel.getLayout();
		card.show(mainPanel, "removeDoctor");
    }//GEN-LAST:event_menuRemoveDoctorActionPerformed

    private void menuNewPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNewPatientActionPerformed
        CardLayout card = (CardLayout)mainPanel.getLayout();
		card.show(mainPanel, "newPatient");
    }//GEN-LAST:event_menuNewPatientActionPerformed

    private void menuEditPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEditPatientActionPerformed
        CardLayout card = (CardLayout)mainPanel.getLayout();
		card.show(mainPanel, "editPatient");
    }//GEN-LAST:event_menuEditPatientActionPerformed

    private void menuRemovePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRemovePatientActionPerformed
        CardLayout card = (CardLayout)mainPanel.getLayout();
		card.show(mainPanel, "removePatient");
    }//GEN-LAST:event_menuRemovePatientActionPerformed

    private void menuReportDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuReportDoctorActionPerformed
        
    }//GEN-LAST:event_menuReportDoctorActionPerformed

    private void menuAboutHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAboutHospitalActionPerformed
        this.aboutHospital1.setHospital(hospital);
		CardLayout card = (CardLayout)mainPanel.getLayout();
		card.show(mainPanel, "aboutHospital");
    }//GEN-LAST:event_menuAboutHospitalActionPerformed

    private void menuEditHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEditHospitalActionPerformed
        if(this.hospital != null){
			CardLayout card = (CardLayout)mainPanel.getLayout();
			card.show(mainPanel, "editHospital");
			this.editHospital1.setFields(hospital);
		}
		else{
			JOptionPane.showMessageDialog(null, "Ningun Hosital seleccionado", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
    }//GEN-LAST:event_menuEditHospitalActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
                
                
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MainWindow().setVisible(false);
			}
		});
	}

    private JFrame Frame = new JFrame();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel aboutHospital;
    private Interfaz.Paneles.aboutHospital aboutHospital1;
    private Interfaz.Paneles.CreateNewDoctor createNewDoctor2;
    private Interfaz.Paneles.CreateNewDoctorsOffice createNewDoctorsOffice1;
    private Interfaz.Paneles.CreateNewHospital createNewHospitalForm;
    private Interfaz.Paneles.CreateNewPatient createNewPatient1;
    private javax.swing.JPanel editDoctor;
    private Interfaz.Paneles.EditDoctor editDoctor1;
    private Interfaz.Paneles.EditDoctorsOffice editDoctorsOffice1;
    private javax.swing.JPanel editHospital;
    private Interfaz.Paneles.EditHospital editHospital1;
    private javax.swing.JPanel editOffice;
    private javax.swing.JPanel editPatient;
    private Interfaz.Paneles.EditPatient editPatient1;
    private javax.swing.JPanel inicioPanel;
    private Interfaz.Paneles.InicioPanel inicioPanel1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuItem menuAboutHospital;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuDoctor;
    private javax.swing.JMenuItem menuEditDoctor;
    private javax.swing.JMenuItem menuEditHospital;
    private javax.swing.JMenuItem menuEditOffice;
    private javax.swing.JMenuItem menuEditPatient;
    private javax.swing.JMenu menuHospital;
    private javax.swing.JMenuItem menuNewDoctor;
    private javax.swing.JMenuItem menuNewOffice;
    private javax.swing.JMenuItem menuNewPatient;
    private javax.swing.JMenu menuOffice;
    private javax.swing.JMenu menuPatient;
    private javax.swing.JMenuItem menuRemoveDoctor;
    private javax.swing.JMenuItem menuRemoveOffice;
    private javax.swing.JMenuItem menuRemovePatient;
    private javax.swing.JMenu menuReport;
    private javax.swing.JMenuItem menuReportDoctor;
    private javax.swing.JMenuItem menuReportPerson;
    private javax.swing.JPanel newDoctor;
    private javax.swing.JPanel newHospital;
    private javax.swing.JPanel newOffice;
    private javax.swing.JPanel newPatient;
    private javax.swing.JPanel removeDoctor;
    private javax.swing.JPanel removeOffice;
    private javax.swing.JPanel removePatient;
    // End of variables declaration//GEN-END:variables

	private void initSaveButtonsListeners() {
		this.createNewHospitalForm.getSaveButton().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveNewHospitalAction(evt);
            }
        });
		this.editHospital1.getSaveButton().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveEditHospitalAction(evt);
            }
        });
		this.createNewDoctor2.getSaveButton().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveNewDoctorAction(evt);
            }
        });
		this.editDoctor1.getSaveButton().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveEditDoctorAction(evt);
            }
        });
		this.createNewDoctorsOffice1.getSaveButton().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveNewOfficeAction(evt);
            }
        });
		this.editDoctorsOffice1.getSaveButton().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveEditOfficeAction(evt);
            }
        });
	}
	
	public void saveNewHospitalAction(java.awt.event.ActionEvent evt){
            
                this.createNewHospitalForm.save();

		this.hospital = null;
                
                this.hospital = new Hospital();
                this.hospital.setName(this.createNewHospitalForm.getHospital().getName());
                this.hospital.setAddress(this.createNewHospitalForm.getHospital().getAddress());
                try {
                    this.hospital.setTelephone(this.createNewHospitalForm.getHospital().getTelephone());
                } catch (NotValidNumber ex) {
                    //TODO
                }
                
                try {
                    this.hospital.setNumOfRooms(this.createNewHospitalForm.getHospital().getNumOfRooms());
                } catch (NotValidNumber ex) {
                    //TODO
                }
                
                try {
                    this.hospital.setNumOfDoctorsOffices(this.createNewHospitalForm.getHospital().getNumOfDoctorsOffices());
                } catch (NotValidNumber ex) {
                    //TODO
                }
                
                GuardarHospital GDB = new GuardarHospital(this.hospital);
                
                this.Frame.setVisible(false);
            
                this.setVisible(true);
                
		this.createNewHospitalForm.clearFields();
		this.menuAboutHospital.doClick();
	}
	
	public void saveEditHospitalAction(java.awt.event.ActionEvent evt){
		String name = this.editHospital1.getHospitalName();
		String address = this.editHospital1.getHospitalAddress();
		String telephone = this.editHospital1.getHospitalTelephone();
		this.hospital.setName(name);
		this.hospital.setAddress(address);
		try {
			this.hospital.setTelephone(telephone);		
		}
		catch(NotValidNumber error){
            JOptionPane.showMessageDialog(null, error.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
	}
	
	public void saveNewDoctorAction(java.awt.event.ActionEvent evt){
		Doctor d = this.createNewDoctor2.getDoctor();
		this.hospital.addDoctor(d);
		JOptionPane.showMessageDialog(null, "Doctor created successfully", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
		this.createNewDoctor2.clearFields();
	}
	
	public void saveEditDoctorAction(java.awt.event.ActionEvent evt){
		Doctor oldDoctor = null;
		Doctor newDoctor = this.editDoctor1.getDoctor();
		for (int i = 0; i < this.hospital.getDoctors().size(); i++) {
			if(this.hospital.getDoctors().get(i).getId().equals(newDoctor.getId())){
				oldDoctor = this.hospital.getDoctors().get(i);
			}
		}
		
		if(oldDoctor != null){
			oldDoctor.setFirstName(newDoctor.getFirstName());
			oldDoctor.setLastName(newDoctor.getLastName());
			oldDoctor.setAddress(newDoctor.getAddress());
			oldDoctor.setEmail(newDoctor.getEmail());
			oldDoctor.setTelephone(newDoctor.getTelephone());
			oldDoctor.setAge(newDoctor.getAge());
			oldDoctor.setDepartment(newDoctor.getDepartment());
			oldDoctor.setLicence(newDoctor.getLicence());
			JOptionPane.showMessageDialog(null, "Doctor edited successfully", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);		
			this.menuEditDoctor.doClick();
		}
		else{
			System.out.println("error editing a doctor : the doctor was not found in the hospital");
		}
	}
	
	public void saveNewOfficeAction(java.awt.event.ActionEvent evt){
	}
	
	public void saveEditOfficeAction(java.awt.event.ActionEvent evt){
	}

	private void intiFakeData() {
		this.hospital = new Hospital("Hôpital joseph ducuing", "rue de paris, 31000 Toulouse, frnace", "0783927381", 5, 42);
		this.hospital.addDoctor("Jean", "Leguain", "XWZ182K9281", 34, "test@yopmail.com", "Rue des remparts sud, 09130 Carla-Bayle", "0293047382", "urologie");
		this.hospital.addDoctor("Aude", "Chapelet", "HDU73JSKE9Z", 25, "aude@yopmail.com", "Boulevard du maréchal leclerc, toulouse", "0248273813", "pédiatrie");
		this.hospital.addDoctor("André", "Smith", "9JDUE738SKD", 82, "halo@yopmail.com", "Place de l'europe, moyrazes", "0673849234", "pédiatrie");
		this.hospital.addDoctor("Anne", "Montana", "DUE7283LDM0", 27, "anna@yopmail.com", "Bollywood street, 97120 Mérida, Yucatán", "9992738473", "orthodontie");
	}

}
