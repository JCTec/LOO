/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz.Paneles;

import Data.Infrastructure.DoctorsOffice;
import Exceptions.NotValidNumber;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/**
 *
 * @author Juan
 */
public class Consultorio extends javax.swing.JPanel {

    /**
     * Creates new form Consultorio
     */
    public Consultorio() {
        initComponents();
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
        Id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rent = new javax.swing.JTextField();
        doc = new javax.swing.JTextField();
        lasPay = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        error = new javax.swing.JLabel();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Consultorio"));

        jLabel1.setText("ID");

        Id.setEditable(false);
        Id.setText("jTextField1");

        jLabel2.setText("Renta");

        jLabel3.setText("ID Doctor");

        jLabel4.setText("Ultimo Pago");

        rent.setText("jTextField2");

        doc.setEditable(false);
        doc.setText("jTextField3");
        doc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                docMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                docMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                docMouseEntered(evt);
            }
        });

        lasPay.setText("jTextField4");
        lasPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lasPayActionPerformed(evt);
            }
        });

        jButton1.setText("Save");

        error.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        error.setText("                 ");
        error.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                errorMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Id, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                            .addComponent(rent)
                            .addComponent(doc)
                            .addComponent(lasPay)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(error, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(rent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(lasPay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(error, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addContainerGap())
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

    private void lasPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lasPayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lasPayActionPerformed

    private void errorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_errorMouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_errorMouseEntered

    private void docMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_docMouseEntered
        // TODO add your handling code here:
        this.error.setText("Para asignar un doctor a una oficina vete a Consultorio / Asignar");
    }//GEN-LAST:event_docMouseEntered

    private void docMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_docMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_docMouseClicked

    private void docMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_docMouseExited
        // TODO add your handling code here:
        this.error.setText("  ");
    }//GEN-LAST:event_docMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Id;
    private javax.swing.JTextField doc;
    private javax.swing.JLabel error;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lasPay;
    private javax.swing.JTextField rent;
    // End of variables declaration//GEN-END:variables


    public JButton getButton(){
        return this.jButton1;
    }
    
    public DoctorsOffice getInfo(){
        DoctorsOffice newDO = new DoctorsOffice();
        
        try {
            newDO.setDoctorID(this.doc.getText());
        } catch (NotValidNumber ex) {
            
        }
        try {
            newDO.setMonthlyRent(Float.valueOf(this.rent.getText()));
        } catch (NotValidNumber ex) {
            
        }
        try {
            newDO.setId(Integer.valueOf(this.Id.getText()));
        } catch (NotValidNumber ex) {
            
        }
        try {
            newDO.setLastPayment(Float.valueOf(this.lasPay.getText()));
        } catch (NotValidNumber ex) {
            
        }
        
        return newDO;
    }
    
    public void setData(String Id, String Renta, String Ultimo_Pago, String IDDoctor){
       
       this.Id.setText(Id);
       this.rent.setText(Renta);
       this.lasPay.setText(Ultimo_Pago);
       this.doc.setText(IDDoctor);
       
    }
    
    public Consultorio getThis(){
        return this;
    }
    
}
