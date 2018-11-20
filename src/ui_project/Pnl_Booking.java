/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui_project;

import java.awt.*;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Owen
 */
public class Pnl_Booking extends javax.swing.JPanel {
    private MainUser mu;
    private Pnl_Floor1 pf1;
    private Pnl_Floor2 pf2;
    private String f, user, fname, lname;
    Object selected_car;


    Pnl_Booking(MainUser mu) {
        this.mu = mu;
	this.user = mu.getUser();
        initComponents();
        GridBagLayout layout = new GridBagLayout();
        pf1 = new Pnl_Floor1(this, user);
        pf2 = new Pnl_Floor2(this);
	System.out.println(user);
        divers.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        divers.add(pf1, c);
        divers.add(pf2, c);
        pf1.setVisible(true);
        pf2.setVisible(false);
	setName();
    }
    
    public void setName(){
	try{
	    String sql = "SELECT * FROM `test` WHERE user = ? ";
	    Connection con = MyConnection.getConnection();
	    PreparedStatement pst = con.prepareStatement(sql);
	    pst.setString(1, user);
	    ResultSet rs_form = pst.executeQuery();
	    rs_form.next();
	    pf1.setFname(rs_form.getString("fname"));
	    pf1.setLname(rs_form.getString("lname"));
	    
	}catch(Exception e){
	    JOptionPane.showMessageDialog(null, e);
	}
    }
    
    public void check(){
	pf1.checkFloor1();
    }

    public void CarComboUpdate(String usercar){
	car_com.addItem(usercar);
    }
    
    public void resetCarCombo(){
	car_com.removeAllItems();
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
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        divers = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        car_com = new javax.swing.JComboBox<>();

        setMinimumSize(new java.awt.Dimension(710, 580));

        jPanel1.setBackground(new java.awt.Color(76, 19, 168));
        jPanel1.setEnabled(false);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Floor 1", "Floor 2", "Floor 3", "Floor 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 254));
        jLabel1.setText("Floor :");

        divers.setBackground(new java.awt.Color(153, 153, 255));
        divers.setMinimumSize(new java.awt.Dimension(710, 562));

        javax.swing.GroupLayout diversLayout = new javax.swing.GroupLayout(divers);
        divers.setLayout(diversLayout);
        diversLayout.setHorizontalGroup(
            diversLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );
        diversLayout.setVerticalGroup(
            diversLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 574, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 254));
        jLabel2.setText("Car :");

        car_com.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                car_comActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(car_com, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(divers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(car_com, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(divers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        JComboBox combo = (JComboBox) evt.getSource();
	this.f = (String) combo.getSelectedItem();
        if(f=="Floor 1"){
            pf1.setVisible(true);
            pf2.setVisible(false);
        }else if(f=="Floor 2"){
            pf1.setVisible(false);
            pf2.setVisible(true);
        }
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void car_comActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_car_comActionPerformed
	JComboBox combo = (JComboBox) evt.getSource();
	this.selected_car = combo.getSelectedItem();
	pf1.setCar(selected_car+"");
    }//GEN-LAST:event_car_comActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> car_com;
    private javax.swing.JPanel divers;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
