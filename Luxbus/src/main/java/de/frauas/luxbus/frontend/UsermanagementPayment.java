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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.validator.routines.EmailValidator;

/**
 *
 * @author User
 */
public class UsermanagementPayment extends javax.swing.JFrame {
    
    String username;
    /**
     * Creates new form Usermanagement
     */
    public UsermanagementPayment() {
        initComponents();
    }
userPayment user;

    /**
     * Constructor of UserManagement JFrame
     *
     * @param username
     */
    public UsermanagementPayment(String username) {
        initComponents();
        this.username = username;
    }

    /**
     * Opens EventAddJframe
     *
     * @see backButton
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        User_name_jLabel = new javax.swing.JLabel();
        userName_jTextField = new javax.swing.JTextField();
        email_address_jLabel = new javax.swing.JLabel();
        password_jLabel = new javax.swing.JLabel();
        email_address_jTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        show_all_user_jButton = new javax.swing.JButton();
        isAdmin_jCheckBox = new javax.swing.JCheckBox();
        search_user_jLabel = new javax.swing.JLabel();
        Search_user_jTextField = new javax.swing.JTextField();
        Search_User_jButton = new javax.swing.JButton();
        editAndSaveButton1 = new javax.swing.JButton();
        DeleteUserjButton1 = new javax.swing.JButton();
        jTextField1Password = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("Usermanagement ");

        User_name_jLabel.setText("Username ");

        email_address_jLabel.setText("Email Addresse: ");

        password_jLabel.setText("Password ");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Email Addresse", "Password ", "IsAdmin"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        show_all_user_jButton.setText("Show all Users");
        show_all_user_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_all_user_jButtonActionPerformed(evt);
            }
        });

        isAdmin_jCheckBox.setText("isAdmin");

        search_user_jLabel.setText("Search User:");

        Search_User_jButton.setText("Search");
        Search_User_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_User_jButtonActionPerformed(evt);
            }
        });

        editAndSaveButton1.setText("Edit and save");
        editAndSaveButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editAndSaveButton1ActionPerformed(evt);
            }
        });

        DeleteUserjButton1.setText("Delete user");
        DeleteUserjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteUserjButton1ActionPerformed(evt);
            }
        });

        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(email_address_jLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(email_address_jTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                                    .addComponent(isAdmin_jCheckBox, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(userName_jTextField, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(User_name_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(search_user_jLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(Search_user_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(password_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(Search_User_jButton))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(DeleteUserjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTextField1Password, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(editAndSaveButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(show_all_user_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(show_all_user_jButton)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 79, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(search_user_jLabel)
                            .addComponent(Search_user_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(Search_User_jButton)
                        .addGap(18, 18, 18)
                        .addComponent(User_name_jLabel)
                        .addGap(18, 18, 18)
                        .addComponent(userName_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(email_address_jLabel)
                        .addGap(18, 18, 18)
                        .addComponent(email_address_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(password_jLabel)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(isAdmin_jCheckBox)
                                    .addComponent(editAndSaveButton1))
                                .addGap(45, 45, 45)
                                .addComponent(DeleteUserjButton1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void show_all_user_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_all_user_jButtonActionPerformed
        // TODO add your handling code here:  private void jButtonAcessToUsersActionPerformed(java.awt.event.ActionEvent evt) {                                                    

        ArrayList<userPayment> userList = new ArrayList<>();
        DBHandler mydbhandler = new DBHandler();
        //Connection myConn = mydbhandler.connect();
        ResultSet rs = mydbhandler.GetAllUserp(/*myConn*/"paymentUsers");
        userPayment user;
        
            try {
                while (rs.next()) {
                    user = new userPayment(rs.getString("usernamep"), rs.getString("emailp"), rs.getString("passwordp"), rs.getBoolean("isAdminp"));
                    userList.add(user);
                }
            } catch (SQLException ex) {
                Logger.getLogger(UsermanagementPayment.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setNumRows(0);
        Object[] row = new Object[4];
        for (int i = 0; i < userList.size(); i++) {
            row[0] = userList.get(i).usernamep;
            row[1] = userList.get(i).emailp;
            row[2] = userList.get(i).passwordp;
            row[3] = userList.get(i).isAdminp;

            model.addRow(row);
        }
        /*try {
            myConn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Usermanagement.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_show_all_user_jButtonActionPerformed

    
  
    private void Search_User_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_User_jButtonActionPerformed
        // TODO add your handling code here:
        
        String userTObeEdit = Search_user_jTextField.getText();
        DBHandler mydbhandler= new DBHandler();
        //Connection myConn = mydbhandler.connect();
        ResultSet rsForUser= mydbhandler.Selectdata(/*myConn,*/"paymentUsers", "usernamep", Search_user_jTextField.getText());
        
        if(!mydbhandler.checkstatmentExsist(rsForUser))
        {
            JOptionPane.showMessageDialog(null, "username does not exist", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else {
            userPayment user = mydbhandler.GetUserPayment(userTObeEdit);
            //user= mydbhandler.GetUserPayment(/*myConn,*/userTObeEdit);
            userName_jTextField.setText(user.usernamep);
            email_address_jTextField.setText(user.emailp);
            jTextField1Password.setText(user.passwordp);
            
            if(user.isAdminp)
            {
               isAdmin_jCheckBox.setSelected(true);
            }
            else{
                isAdmin_jCheckBox.setSelected(false);
            }
            
        }/*
        try {
            myConn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Usermanagement.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_Search_User_jButtonActionPerformed

    private void editAndSaveButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editAndSaveButton1ActionPerformed
        // TODO add your handling code here:
        String emailGiven=email_address_jTextField.getText();
        String usernameGiven=Search_user_jTextField.getText();
        DBHandler mydbhandler = new DBHandler();
        //Connection myConn = mydbhandler.connect();
        
         userPayment toBeEditedUser = mydbhandler.GetUserPayment(/*myConn,*/"PaymentUsers");
        String hash;
        
//        System.out.println(toBeEditedUser.passwordp.toString() );
        
        System.out.println( jTextField1Password.getText());

        if (!jTextField1Password.getText().matches(toBeEditedUser.passwordp)) {

            Encryption enc = new Encryption(jTextField1Password.getText());

            hash = enc.HaschCode();
        } 
        else {
            hash = toBeEditedUser.passwordp;
        }
        mydbhandler.EditUserPayment(/*myConn,*/"paymentUsers", "usernamep", userName_jTextField.getText(), "usernamep", Search_user_jTextField.getText());
        mydbhandler.EditUserPayment(/*myConn,*/"paymentUsers", "passwordp",hash,"usernamep" ,Search_user_jTextField.getText());


        

        boolean Validate = EmailValidator.getInstance().isValid(email_address_jTextField.getText());

        if (Validate == false) {
            JOptionPane.showMessageDialog(null, "Please enter a valid E-Mail address!", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            mydbhandler.EditUserPayment(/*myConn,*/"paymentUsers", "emailp",email_address_jTextField.getText(),"usernamep" ,Search_user_jTextField.getText());


        }

        if (isAdmin_jCheckBox.isSelected()) {
            mydbhandler.EditUserPayment(/*myConn,*/"paymentUsers", "isAdminp", "yes", "usernamep", Search_user_jTextField.getText());
        } else {
            mydbhandler.EditUserPayment(/*myConn,*/"paymentUsers", "isAdminp", "no", "usernamep", Search_user_jTextField.getText());

        }

        JOptionPane.showMessageDialog(null, "User edited !", "Info", JOptionPane.INFORMATION_MESSAGE);
        /*try {
            myConn.close();
            // mydbhandler.close(myConn);
        } catch (SQLException ex) {
            Logger.getLogger(Usermanagement.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_editAndSaveButton1ActionPerformed

    private void DeleteUserjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteUserjButton1ActionPerformed
        // TODO add your handling code here:
        String user= Search_user_jTextField.getText();
        DBHandler mydbhandler= new DBHandler();
        //Connection myConn = mydbhandler.connect();
        int updated= mydbhandler.DeleteUser(/*myConn,*/"paymentUsers", "usernamep", user);
        if(updated==1 )
        {
            JOptionPane.showMessageDialog(null, "User deleted !", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
       /* try {
            myConn.close();
        } catch (SQLException ex) {
            Logger.getLogger(UsermanagementPayment.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_DeleteUserjButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
   //   System.exit(0);
    dispose();
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        /*
         DefaultTableModel model =(DefaultTableModel)jTable1.getModel();
        int  selectedRowIndex = jTable1.getSelectedRow();
        userName_jTextField.setText((String) model.getValueAt(selectedRowIndex,0).toString());
        email_address_jTextField.setText((String) model.getValueAt(selectedRowIndex,1).toString());
        jTextField1Password.setText((String) model.getValueAt(selectedRowIndex,2).toString());
        String isadmin= ((String) model.getValueAt(selectedRowIndex,3).toString());
        
        if(isadmin=="true")
            {
               isAdmin_jCheckBox.setSelected(true);
            }
            else{
                isAdmin_jCheckBox.setSelected(false);
            }    
        */
    }//GEN-LAST:event_jTable1MouseClicked

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteUserjButton1;
    private javax.swing.JButton Search_User_jButton;
    private javax.swing.JTextField Search_user_jTextField;
    private javax.swing.JLabel User_name_jLabel;
    private javax.swing.JButton editAndSaveButton1;
    private javax.swing.JLabel email_address_jLabel;
    private javax.swing.JTextField email_address_jTextField;
    private javax.swing.JCheckBox isAdmin_jCheckBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1Password;
    private javax.swing.JLabel password_jLabel;
    private javax.swing.JLabel search_user_jLabel;
    private javax.swing.JButton show_all_user_jButton;
    private javax.swing.JTextField userName_jTextField;
    // End of variables declaration//GEN-END:variables
}
