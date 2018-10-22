 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui_project;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author itisowen_
 */
public class UiLogin extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public UiLogin() {
        initComponents();
	jPanel4.setFocusable(true);
	setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        pass = new javax.swing.JPasswordField();
        button1 = new java.awt.Button();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Parking System");
        setBackground(new java.awt.Color(102, 102, 102));
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(35, 43, 43));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(35, 43, 43));
        jLabel1.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(100, 151, 177));
        jLabel1.setText("Username");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, 23));

        jLabel2.setBackground(new java.awt.Color(35, 43, 43));
        jLabel2.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 255, 255));
        jLabel2.setText("Don't have an account?");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, 23));

        user.setBackground(new java.awt.Color(35, 43, 43));
        user.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        user.setForeground(new java.awt.Color(254, 255, 255));
        user.setText("username");
        user.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        user.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userFocusGained(evt);
            }
        });
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        jPanel5.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 371, 36));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 371, 10));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 371, 10));

        pass.setBackground(new java.awt.Color(35, 43, 43));
        pass.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        pass.setForeground(new java.awt.Color(254, 255, 255));
        pass.setText("12345678");
        pass.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passFocusGained(evt);
            }
        });
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        jPanel5.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 371, 36));

        button1.setActionCommand("Sing in");
        button1.setBackground(new java.awt.Color(51, 51, 255));
        button1.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setLabel("Sign in");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        jPanel5.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 370, 50));

        jLabel3.setBackground(new java.awt.Color(35, 43, 43));
        jLabel3.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(100, 151, 177));
        jLabel3.setText("Password");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, 23));

        jLabel4.setBackground(new java.awt.Color(35, 43, 43));
        jLabel4.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Register now!");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, -1, 23));

        jLabel7.setBackground(new java.awt.Color(35, 43, 43));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, -1, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 470, 540));

        jPanel4.setBackground(new java.awt.Color(14, 17, 17));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 40, 60));
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 90, 80));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        String sql="select * from test where user=? and pass=?";
    try{
        con = MyConnection.getConnection();
        pst=con.prepareStatement(sql);
        pst.setString(1,user.getText());
        pst.setString(2,pass.getText());
        rs=pst.executeQuery();
    if(rs.next())
    {
        JOptionPane.showMessageDialog(null,"Connected");
        if(rs.getString("memclass").equals("admin")){
            WelcomeAdmin wela = new WelcomeAdmin();
            wela.setVisible(true);
            wela.pack();
            wela.setLocationRelativeTo(null);
            wela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            wela.jlabel1.setText("Welcome : "+ rs.getString("fname"));
            wela.la_class.setText("Class : "+ rs.getString("memclass"));
            
            this.dispose();
        }
        else{
            Welcome wel = new Welcome();
            wel.setVisible(true);
            wel.pack();
            wel.setLocationRelativeTo(null);
            wel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            wel.jlabel1.setText("Welcome : "+ rs.getString("fname"));
            wel.la_class.setText("Class : "+ rs.getString("memclass"));
        
            this.dispose();
        }
    }
    else
        {   
        JOptionPane.showMessageDialog(null, "Incorrect username or password");
        }
    }
    catch(SQLException | HeadlessException ex)
    {
        JOptionPane.showMessageDialog(null,ex);
    }
    }//GEN-LAST:event_button1ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
       
    }//GEN-LAST:event_passActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseDragged

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        Register regi = new Register();
        regi.setVisible(true);
        regi.pack();
        regi.setLocationRelativeTo(null);
        regi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void userFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userFocusGained
        if(user.getText().equals("username")){
	    user.setText("");
	}
	if(pass.getText().equals("")){
	    pass.setText("12345678");
	}
	
    }//GEN-LAST:event_userFocusGained

    private void passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFocusGained
        if(pass.getText().equals("12345678")){
	    pass.setText("");
	}
	if(user.getText().equals("")){
	    user.setText("username");
	}
	   
	
    }//GEN-LAST:event_passFocusGained

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
            java.util.logging.Logger.getLogger(UiLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UiLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UiLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UiLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UiLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
