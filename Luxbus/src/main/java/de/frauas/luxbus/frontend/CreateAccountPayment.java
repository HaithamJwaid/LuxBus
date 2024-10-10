/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.frauas.luxbus.frontend;

import de.frauas.luxbus.backend.DBHandler;
import de.frauas.luxbus.backend.Encryption;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.apache.commons.validator.routines.EmailValidator;

/**
 *
 * @author haith
 */
public class CreateAccountPayment extends javax.swing.JFrame {

    /**
     * Creates new form CreateAccountPayment
     */
    public CreateAccountPayment() {
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
        luxpaymentCreateAccountLabel = new javax.swing.JLabel();
        UserNamePaymentLabel = new javax.swing.JLabel();
        firstNamePaymentLable = new javax.swing.JLabel();
        lastNamePaymentLabel = new javax.swing.JLabel();
        AddressPaymentLabel = new javax.swing.JLabel();
        eMailPaymentLabel = new javax.swing.JLabel();
        createPasswordPaymetLabel = new javax.swing.JLabel();
        rewritePasswordPaymentLabel = new javax.swing.JLabel();
        CreateAccountPaymentButton = new javax.swing.JButton();
        usernamePaymentTextField = new javax.swing.JTextField();
        firstNamePaymentTextField = new javax.swing.JTextField();
        lastNamePaymentTextField = new javax.swing.JTextField();
        addressPaymentTextField = new javax.swing.JTextField();
        eMailPaymentTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        createPasswordPaymentTextField = new javax.swing.JPasswordField();
        rewritePasswordPaymentTextField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sign up LUXPAYMENT");

        luxpaymentCreateAccountLabel.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        luxpaymentCreateAccountLabel.setText("Luxpayment create account");

        UserNamePaymentLabel.setText("Username:");

        firstNamePaymentLable.setText("First name:");

        lastNamePaymentLabel.setText("Last name:");

        AddressPaymentLabel.setText("Address:");

        eMailPaymentLabel.setText("E-Mail Address:");

        createPasswordPaymetLabel.setText("Create password:");

        rewritePasswordPaymentLabel.setText("Rewrite password:");

        CreateAccountPaymentButton.setText("Create");
        CreateAccountPaymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateAccountPaymentButtonActionPerformed(evt);
            }
        });

        usernamePaymentTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernamePaymentTextFieldActionPerformed(evt);
            }
        });

        firstNamePaymentTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNamePaymentTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Date of birth ");

        jDateChooser1.setDateFormatString("dd.MM.yyyy");
        jDateChooser1.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(luxpaymentCreateAccountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(CreateAccountPaymentButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(UserNamePaymentLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rewritePasswordPaymentLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(createPasswordPaymetLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(eMailPaymentLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AddressPaymentLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lastNamePaymentLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(firstNamePaymentLable, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(eMailPaymentTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addressPaymentTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastNamePaymentTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstNamePaymentTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernamePaymentTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(createPasswordPaymentTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rewritePasswordPaymentTextField, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(luxpaymentCreateAccountLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserNamePaymentLabel)
                    .addComponent(usernamePaymentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNamePaymentLable)
                    .addComponent(firstNamePaymentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNamePaymentLabel)
                    .addComponent(lastNamePaymentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddressPaymentLabel)
                    .addComponent(addressPaymentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eMailPaymentLabel)
                    .addComponent(eMailPaymentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createPasswordPaymetLabel)
                    .addComponent(createPasswordPaymentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rewritePasswordPaymentLabel)
                    .addComponent(rewritePasswordPaymentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(CreateAccountPaymentButton)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstNamePaymentTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNamePaymentTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNamePaymentTextFieldActionPerformed

    private void CreateAccountPaymentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateAccountPaymentButtonActionPerformed
        
        boolean Validate= EmailValidator.getInstance().isValid(eMailPaymentTextField.getText());
        
        if( Validate== false)
        {
              JOptionPane.showMessageDialog(null, "Please enter a valid E-Mail address!","ERROR", JOptionPane.ERROR_MESSAGE); 
        }
        else
        {
       DBHandler mydbhandler= new DBHandler();
       String password = createPasswordPaymentTextField.getText();
       String confirmationPassword= rewritePasswordPaymentTextField.getText();
       boolean createUser= true;
       
       ResultSet rsForUser= mydbhandler.Selectdata("paymentUsers", "usernamep",  usernamePaymentTextField.getText());
       ResultSet rsForEmail= mydbhandler.Selectdata("paymentUsers", "emailp",  eMailPaymentTextField.getText());

       if (mydbhandler.checkstatmentExsist(rsForUser))
       {
            JOptionPane.showMessageDialog(null, "please take other username","ERROR", JOptionPane.ERROR_MESSAGE);
            createUser=false;
       }
        if (mydbhandler.checkstatmentExsist(rsForEmail))
       {
            JOptionPane.showMessageDialog(null, "E-Mail is already exists","ERROR", JOptionPane.ERROR_MESSAGE);
            createUser=false;
       }
       //System.out.println(password+ " "+confirmationPassword);
       if(!password.equals(confirmationPassword))
        {
           JOptionPane.showMessageDialog(null, "Password and Password Confirmation are not equal!","ERROR", JOptionPane.ERROR_MESSAGE);
            createUser=false;
        }
       
       //get information to insert them in DB newUser
       
        String firstname= firstNamePaymentTextField.getText();
        String lastname= lastNamePaymentTextField.getText();
        String username= usernamePaymentTextField.getText();
        String email= eMailPaymentTextField.getText();
        String address = addressPaymentTextField.getText();
        String dob = ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText();

                //jDateChooser1.get;
        
        if( createUser){
                Encryption enc= new Encryption(password);
                String hash= enc.HaschCode();
                mydbhandler.newUserPayment(firstname, lastname, username, hash, address, email, dob);
                mydbhandler.createUserstoryP(username);
                JOptionPane.showMessageDialog(null, "Successfully completed","INFO", JOptionPane.INFORMATION_MESSAGE);
                dispose();
        }
        }
    }//GEN-LAST:event_CreateAccountPaymentButtonActionPerformed

    private void usernamePaymentTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernamePaymentTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernamePaymentTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressPaymentLabel;
    public static javax.swing.JButton CreateAccountPaymentButton;
    private javax.swing.JLabel UserNamePaymentLabel;
    public static javax.swing.JTextField addressPaymentTextField;
    public static javax.swing.JPasswordField createPasswordPaymentTextField;
    private javax.swing.JLabel createPasswordPaymetLabel;
    private javax.swing.JLabel eMailPaymentLabel;
    public static javax.swing.JTextField eMailPaymentTextField;
    private javax.swing.JLabel firstNamePaymentLable;
    public javax.swing.JTextField firstNamePaymentTextField;
    public static com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lastNamePaymentLabel;
    public static javax.swing.JTextField lastNamePaymentTextField;
    private javax.swing.JLabel luxpaymentCreateAccountLabel;
    private javax.swing.JLabel rewritePasswordPaymentLabel;
    public static javax.swing.JPasswordField rewritePasswordPaymentTextField;
    public static javax.swing.JTextField usernamePaymentTextField;
    // End of variables declaration//GEN-END:variables

}
