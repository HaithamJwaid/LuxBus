/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.frauas.luxbus.frontend;

import de.frauas.luxbus.backend.DBHandler;
import de.frauas.luxbus.backend.Encryption;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author haith
 */
public class PaymentLogin extends javax.swing.JFrame {

    /**
     * Creates new form Payment
     */
    public PaymentLogin() {
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

        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        txtLable = new javax.swing.JLabel();
        WelcomeLabla = new javax.swing.JLabel();
        usernameLable = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        createAccountButton = new javax.swing.JButton();
        passwordTextField = new javax.swing.JPasswordField();
        showpasssowrd = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("sign in  LUXPAYMENT");

        jPanel1.setPreferredSize(new java.awt.Dimension(600, 300));

        txtLable.setText("For the customer's security you should give your email address and your password");

        WelcomeLabla.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        WelcomeLabla.setForeground(new java.awt.Color(51, 51, 0));
        WelcomeLabla.setText("Welcome to Luxpayment");
        WelcomeLabla.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        WelcomeLabla.setMaximumSize(new java.awt.Dimension(142, 20));
        WelcomeLabla.setPreferredSize(new java.awt.Dimension(120, 30));

        usernameLable.setText("Username");

        passwordLabel.setText("Password");

        usernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextFieldActionPerformed(evt);
            }
        });

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        createAccountButton.setText("Create account");
        createAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccountButtonActionPerformed(evt);
            }
        });

        passwordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextFieldActionPerformed(evt);
            }
        });

        showpasssowrd.setText("show password");
        showpasssowrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpasssowrdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(createAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(WelcomeLabla, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameLable, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(showpasssowrd, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLable, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(WelcomeLabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtLable, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(usernameLable)
                .addGap(11, 11, 11)
                .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(showpasssowrd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createAccountButton)
                    .addComponent(loginButton))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextFieldActionPerformed
        
    }//GEN-LAST:event_usernameTextFieldActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        //new PaymentStartWindow().setVisible(true);
        String pw = passwordTextField.getText();
        Encryption enc = new Encryption(pw);
        String hash= enc.HaschCode();
        DBHandler mydbhandler= new DBHandler();
        ResultSet checkSec= mydbhandler.SelectData2colmn("paymentUsers", "usernamep", "passwordp",usernameTextField.getText(),hash);
        if(usernameTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"please enter a valid Username");
        }
        else if(passwordTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"please enter a valid password");
        }
        else if (!mydbhandler.checkstatmentExsist(checkSec))
        {
            JOptionPane.showMessageDialog(null,"E-Mail or passwor are not correct");
        }
        else {
            /*
            try {
                mydbhandler.SelectData2colmn("paymentUsers", "usernamep", "passwordp",usernameTextField.getText(),hash).close();
            } catch (SQLException ex) {
                Logger.getLogger(PaymentLogin.class.getName()).log(Level.SEVERE, null, ex);
            }*/
            ResultSet checkAdmin = mydbhandler.checkAdminPayment(usernameTextField.getText());
            if (!mydbhandler.checkstatmentExsist(checkAdmin))
            {
               dispose();
               PaymentStartWindow payment = new PaymentStartWindow();
               payment.setVisible(true);
               payment.Setcurrentamount(usernameTextField.getText());
               
            }
            else {
               dispose();
               PaymentStartWindowAdmin payment2 = new PaymentStartWindowAdmin();
               payment2.setVisible(true);
               payment2.Setcurrentamount(usernameTextField.getText());
            }
        }
    }//GEN-LAST:event_loginButtonActionPerformed

 
    private void createAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccountButtonActionPerformed
        CreateAccountPayment myAccount= new CreateAccountPayment();
        myAccount.setVisible(true);
    }//GEN-LAST:event_createAccountButtonActionPerformed

    private void passwordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextFieldActionPerformed
        
    }//GEN-LAST:event_passwordTextFieldActionPerformed

    private void showpasssowrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpasssowrdActionPerformed
        showpasssowrd.isSelected();
       if (evt.getSource() == showpasssowrd) {
            if (showpasssowrd.isSelected()) {
                passwordTextField.setEchoChar((char) 0);
            }
            else {
                passwordTextField.setEchoChar('*');
            } 
         }
    }//GEN-LAST:event_showpasssowrdActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel WelcomeLabla;
    private javax.swing.JButton createAccountButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JCheckBox showpasssowrd;
    private javax.swing.JLabel txtLable;
    private javax.swing.JLabel usernameLable;
    public static javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables

}
