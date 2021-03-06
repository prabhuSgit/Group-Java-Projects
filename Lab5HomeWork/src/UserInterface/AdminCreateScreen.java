/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Abstract.User;
import Business.Users.Admin;
import Business.Users.Customer;
import Business.Users.Supplier;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.text.SimpleDateFormat;

/**
 *
 * @author harshalneelkamal
 */
public class AdminCreateScreen extends javax.swing.JPanel {

    /**
     * Creates new form AdminScreen
     */
    private JPanel panelRight;
    private Admin admin;

    public AdminCreateScreen(JPanel panelRight, Admin admin) {
        initComponents();
        this.panelRight = panelRight;
        this.admin = admin;
        initialize();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radioUserBtnGrp = new javax.swing.ButtonGroup();
        btnCreate = new javax.swing.JButton();
        txtUser = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        radioCustomer = new javax.swing.JRadioButton();
        radioSupplier = new javax.swing.JRadioButton();
        btnBack = new javax.swing.JButton();
        txtPword = new javax.swing.JPasswordField();
        txtRePword = new javax.swing.JPasswordField();
        userError = new javax.swing.JLabel();

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUserKeyTyped(evt);
            }
        });

        jLabel1.setText("Username:");

        jLabel2.setText("Password:");

        jLabel3.setText("Re-enter Password:");

        radioUserBtnGrp.add(radioCustomer);
        radioCustomer.setText("Customer");
        radioCustomer.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radiobtngrp(evt);
            }
        });
        radioCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupingbtn(evt);
            }
        });

        radioUserBtnGrp.add(radioSupplier);
        radioSupplier.setText("Supplier");
        radioSupplier.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radiobtngrp(evt);
            }
        });
        radioSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupingbtn(evt);
            }
        });

        btnBack.setText("< BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtPword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPwordKeyTyped(evt);
            }
        });

        txtRePword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRePwordKeyTyped(evt);
            }
        });

        userError.setForeground(new java.awt.Color(255, 51, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addComponent(btnCreate, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radioSupplier)
                                    .addComponent(radioCustomer)))
                            .addComponent(txtPword)
                            .addComponent(txtRePword))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userError, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnBack)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btnBack)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtRePword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radioCustomer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioSupplier)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCreate))
                    .addComponent(txtPword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(125, 125, 125))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        if (txtUser.getText().isEmpty()) {
            userError.setText("Kindly enter the username");
        } else {
            userError.setText("");
            if (passwordPatternCorrect() == true) {
                JOptionPane.showMessageDialog(this, "Password not as per the Password policy below:\n"
                        + "A special character\n"
                        + "A number\n"
                        + "A uppercase\n"
                        + "A lowercase");
                return;
            }
            if (radioUserBtnGrp.isSelected(radioCustomer.getModel())) {
                Customer customer = new Customer(new Date(), txtPword.getText(), txtUser.getText());
                admin.getCustDir().getCustomerList().add(customer);
                System.out.println(customer.getPassword());
                JOptionPane.showMessageDialog(this, "Customer created successfully");
                txtUser.setText("");
                txtPword.setText("");
                txtRePword.setText("");
                radioUserBtnGrp.clearSelection();
            } else if (radioUserBtnGrp.isSelected(radioSupplier.getModel())) {
                Supplier supplier = new Supplier(txtPword.getText(), txtUser.getText());
                admin.getSuppDir().getSupplierList().add(supplier);
                System.out.println(supplier.getPassword());
                JOptionPane.showMessageDialog(this, "Supplier created successfully");
                txtUser.setText("");
                txtPword.setText("");
                txtRePword.setText("");
                radioUserBtnGrp.clearSelection();
            } else {
                JOptionPane.showMessageDialog(this, "Please select a type");
            }
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        panelRight.remove(this);
        Component[] componentArray = panelRight.getComponents();
        Component component = componentArray[componentArray.length - 1];
        AdminMainScreen adminMainScreen = (AdminMainScreen) component;
        adminMainScreen.populate();
        CardLayout layout = (CardLayout) panelRight.getLayout();
        layout.previous(panelRight);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyTyped
        // TODO add your handling code here:
        checkForButtonVisibility();
    }//GEN-LAST:event_txtUserKeyTyped

    private void txtPwordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPwordKeyTyped
        // TODO add your handling code here:
        checkForButtonVisibility();
    }//GEN-LAST:event_txtPwordKeyTyped

    private void groupingbtn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupingbtn
        // TODO add your handling code here:
        if (txtUser.getText().isEmpty()) {
            userError.setText("User name required");
        } else {
            if (radioCustomer.isSelected()) {
                for (User customer : admin.custDir.getCustomerList()) {
                    if (customer.getUserName().contains(txtUser.getText())) {
                        JOptionPane.showMessageDialog(null, "The Customer name already exists. Kindly use another name");
                        radioUserBtnGrp.clearSelection();
                    }
                }
            } else if (radioSupplier.isSelected()) {
                for (User supplier : admin.suppDir.getSupplierList()) {
                    if (supplier.getUserName().contains(txtUser.getText())) {
                        JOptionPane.showMessageDialog(null, "The Supplier name already exists. Kindly use another name");
                        radioUserBtnGrp.clearSelection();
                    }
                }
            }
        }
    }//GEN-LAST:event_groupingbtn

    private void radiobtngrp(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radiobtngrp
        // TODO add your handling code here:
    }//GEN-LAST:event_radiobtngrp

    private void txtRePwordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRePwordKeyTyped
        // TODO add your handling code here:
        checkForButtonVisibility();
        String check = "" + evt.getKeyChar();
        String compare = txtRePword.getText();
        if (!check.isEmpty()) {
            compare += check;
        }
        if (txtPword.getText().equals(compare)) {
            btnCreate.setEnabled(true);
            txtRePword.setBackground(Color.white);
        } else {
            btnCreate.setEnabled(false);
            txtRePword.setBackground(Color.red);
        }
    }//GEN-LAST:event_txtRePwordKeyTyped

    public boolean passwordPatternCorrect() {
        Pattern p = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{4,}$");
        Matcher m = p.matcher(txtPword.getText());
        boolean b = m.matches();
        if (b == true) {
            System.out.println("There is special character in my string");
            return false;
        } else {
            System.out.println("There is no speacial character");
            return true;
        }

    }

    public void checkForButtonVisibility() {
        if (!txtUser.getText().isEmpty() && !txtPword.getText().isEmpty() && !txtRePword.getText().isEmpty()) {
            btnCreate.setEnabled(true);
        } else {
            btnCreate.setEnabled(false);
        }

    }

    private void initialize() {
        checkForButtonVisibility();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton radioCustomer;
    private javax.swing.JRadioButton radioSupplier;
    private javax.swing.ButtonGroup radioUserBtnGrp;
    private javax.swing.JPasswordField txtPword;
    private javax.swing.JPasswordField txtRePword;
    private javax.swing.JTextField txtUser;
    private javax.swing.JLabel userError;
    // End of variables declaration//GEN-END:variables
}
