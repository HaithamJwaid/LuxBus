/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.frauas.luxbus.frontend;

import com.toedter.calendar.JDateChooser;
import de.frauas.luxbus.backend.DBHandler;
import de.frauas.luxbus.backend.Encryption;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author haith
 */
public class PaymentStartWindowAdmin extends javax.swing.JFrame {
    String username2;
    /**
     * Creates new form PaymentStartWindow
     */
    public PaymentStartWindowAdmin() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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
        SetCoinLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        welcomeUSERLabel = new javax.swing.JLabel();
        fromDatabaseLabel = new javax.swing.JLabel();
        showStoryLabel = new javax.swing.JLabel();
        giveCodeLabel = new javax.swing.JLabel();
        showStryButton = new javax.swing.JButton();
        giveCodeButton = new javax.swing.JButton();
        sendLuxcoinLabel = new javax.swing.JLabel();
        sendLuxcoinButton = new javax.swing.JButton();
        infoLabel = new javax.swing.JLabel();
        changingLabel = new javax.swing.JLabel();
        changingButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        userNameTextField = new javax.swing.JTextField();
        passordTextField = new javax.swing.JTextField();
        userNameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        closeButton = new javax.swing.JButton();
        userManagmentButton = new javax.swing.JButton();
        codeGeneratorButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcomein Luxpayment start window");

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setToolTipText("");

        SetCoinLabel.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("your current coins ");

        welcomeUSERLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        welcomeUSERLabel.setText("welcome Username Luxpayment ");

        fromDatabaseLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        showStoryLabel.setText("Click on Button \"show Know\" to show your Payment story:");

        giveCodeLabel.setText("Click on Button \"give code\" to give a code of Luxcoin coupon");

        showStryButton.setText("show now");
        showStryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showStryButtonActionPerformed(evt);
            }
        });

        giveCodeButton.setText("give code");
        giveCodeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giveCodeButtonActionPerformed(evt);
            }
        });

        sendLuxcoinLabel.setText("Click on Button \"send Luxcoins\" to send luxcoins to your Friends:");

        sendLuxcoinButton.setText("send Luxcoins");
        sendLuxcoinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendLuxcoinButtonActionPerformed(evt);
            }
        });

        infoLabel.setText("Do you know, that you can get your Luxcoins as mony in euro € in Luxbus station.");

        changingLabel.setText("To change password or other information, give your current Login data and click on \"change register information\":");

        changingButton.setText("change register information");
        changingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changingButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Note: The person should be registred in Luxpyment. Else the operation well be unsuccessfully.");

        userNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTextFieldActionPerformed(evt);
            }
        });

        passordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passordTextFieldActionPerformed(evt);
            }
        });

        userNameLabel.setText("Enter your username");

        passwordLabel.setText("enter your password");

        closeButton.setText("close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        userManagmentButton.setText("User Managment");
        userManagmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userManagmentButtonActionPerformed(evt);
            }
        });

        codeGeneratorButton.setText("Code generator");
        codeGeneratorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeGeneratorButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(welcomeUSERLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fromDatabaseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(showStoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(giveCodeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sendLuxcoinLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(giveCodeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(showStryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(SetCoinLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(jLabel1))))
                            .addComponent(sendLuxcoinButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(infoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codeGeneratorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(userManagmentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addComponent(changingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(welcomeUSERLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fromDatabaseLabel))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(showStoryLabel)
                            .addComponent(showStryButton))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(giveCodeLabel)
                    .addComponent(giveCodeButton)
                    .addComponent(SetCoinLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sendLuxcoinLabel)
                    .addComponent(sendLuxcoinButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(changingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(userNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changingButton))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(closeButton)
                    .addComponent(infoLabel)
                    .addComponent(userManagmentButton)
                    .addComponent(codeGeneratorButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void giveCodeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giveCodeButtonActionPerformed
         
        GiveCouponUser mycode = new  GiveCouponUser(username2);
         mycode.setVisible(true);
         
    }//GEN-LAST:event_giveCodeButtonActionPerformed

    @SuppressWarnings("empty-statement")
    private void changingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changingButtonActionPerformed
        String username = userNameTextField.getText();
        String password = passordTextField.getText();
        Encryption enc= new Encryption(password);
        String hash= enc.HaschCode();
        if(userNameTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"please enter your Username");
        }
        else if(passordTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"please enter your password");
        }
       ResultSet checkSec= mydbhandler.SelectData2colmn("paymentUsers", "usernamep", "passwordp",username,hash);
       if (mydbhandler.checkstatmentExsist(checkSec))
       {
           System.out.println(username);
           
           try {
            System.out.println(username);
            Updating myRegister = new Updating(username2);
            myRegister.setVisible(true);
            String firstname = mydbhandler.SelectdataP("firstnamep", "usernamep", username);
            String lastname = mydbhandler.SelectdataP("lastnamep", "usernamep", username);
            String userN = username;//db.SelectdataP("paymentUsers","usernamep", "usernamep",username);
            String Pass = mydbhandler.SelectdataP("passwordp", "usernamep", username);
            String address = mydbhandler.SelectdataP("addressp", "usernamep", username);
            String date = mydbhandler.SelectdataP("DOBp", "usernamep", username);
            String email= mydbhandler.SelectdataP("emailp", "usernamep", username);
            Encryption enc2= new Encryption(Pass);
            String hash2= enc.HaschCode();
            myRegister.SetDate(userN, firstname, lastname, hash2, email, address, date);
            
           } catch (SQLException ex) {
               Logger.getLogger(PaymentStartWindowAdmin.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       else {
           JOptionPane.showMessageDialog(null,"E-Mail or passwor are not correct");
       }
        //CreateAccountPayment myRegister= new CreateAccountPayment();
        //myRegister.SetDate(userN,firstname, lastname,Pass,email, address,date);
    }//GEN-LAST:event_changingButtonActionPerformed

    public void Setcurrentamount(String username2) {
        this.username2=username2;
        String currentamount = null;
        int counter = 0;
        try {
            currentamount = mydbhandler.SelectPriceFromUsers("currentp", "usernamep", username2);
            counter = mydbhandler.Selectcount();
        } catch (SQLException ex) {
            Logger.getLogger(PaymentStartWindowAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(currentamount);
        SetCoinLabel.setText(currentamount +" Coins");
        welcomeUSERLabel.setText("Welcome " + username2+" in Luxpayment");
        fromDatabaseLabel.setText("do you know that more than "+ (counter - 1)+" persons are using Luxpayment");
    }
    private void passordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passordTextFieldActionPerformed

    private void userNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTextFieldActionPerformed

    private void sendLuxcoinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendLuxcoinButtonActionPerformed
        SendLuxcoin start = new SendLuxcoin(username2);
        start.setVisible(true);
    }//GEN-LAST:event_sendLuxcoinButtonActionPerformed

    private void showStryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showStryButtonActionPerformed
        ShowNow start = new ShowNow(username2);
        start.setVisible(true);
    }//GEN-LAST:event_showStryButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void userManagmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userManagmentButtonActionPerformed
        UsermanagementPayment start = new UsermanagementPayment(username);
        start.setVisible(true);
    }//GEN-LAST:event_userManagmentButtonActionPerformed

    private void codeGeneratorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeGeneratorButtonActionPerformed
        CodegeneratorForAdmin code = new CodegeneratorForAdmin();
        code.setVisible(true);
    }//GEN-LAST:event_codeGeneratorButtonActionPerformed

    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel SetCoinLabel;
    private javax.swing.JButton changingButton;
    private javax.swing.JLabel changingLabel;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton codeGeneratorButton;
    public javax.swing.JLabel fromDatabaseLabel;
    private javax.swing.JButton giveCodeButton;
    private javax.swing.JLabel giveCodeLabel;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField passordTextField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton sendLuxcoinButton;
    private javax.swing.JLabel sendLuxcoinLabel;
    private javax.swing.JLabel showStoryLabel;
    private javax.swing.JButton showStryButton;
    private javax.swing.JButton userManagmentButton;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JTextField userNameTextField;
    public javax.swing.JLabel welcomeUSERLabel;
    // End of variables declaration//GEN-END:variables
String username, password;
DBHandler mydbhandler= new DBHandler();

}
