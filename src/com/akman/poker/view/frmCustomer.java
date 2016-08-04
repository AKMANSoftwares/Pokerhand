/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akman.poker.view;

import com.akman.poker.controller.CURDCustomer;
import com.akman.poker.model.Customer;
import com.akman.poker.model.Users;
import com.akman.poker.utils.Constants;
import com.akman.poker.utils.Functions;
import com.akman.poker.utils.Javaconnect;
import com.akman.poker.utils.Membership;
import com.akman.poker.utils.Status;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class frmCustomer extends javax.swing.JFrame {

    Connection conn;

    PreparedStatement pst;

    DefaultListModel model;

    String Gender = "M";

    int CustomerID = 0;

    Users user;
    Enum membershiptype;

    /**
     * Default Constructor of frmCustomer. Initizing the components. Connecting
     * with the database. Setting the color of Label. Intilizing the List
     * contact Array. Filling the Combo Box Type with Enum.
     *
     * @param membershiptype
     * @param inv
     */
    frmInvoice inv;

    public frmCustomer(Enum membershiptype, frmInvoice inv) {
        System.out.println(inv.getTitle());
        if (inv.getTitle().equals("Time Managment")) {
            this.inv = inv;
        }

        initComponents();

        conn = Javaconnect.ConnecrDb();

        lblHeader.setBackground(Constants.HEADER_COLOR);

        model = new DefaultListModel();

        this.membershiptype = membershiptype;

        if (!membershiptype.equals(Membership.Day)) {

            String memberCode = Customer.GenerateMemberCode(membershiptype);

            lblMemberCode.setText(memberCode);
            lblCode.setText("Code");
        }

    }

    /**
     * This method clear all the fields in the form Customer.
     */
    private void Clear() {
        txtName.setText(null);
        txtAddress.setText(null);
        txtCity.setText(null);
        txtPhoneNo.setText(null);
        txtZipCode.setText(null);
        cbIsActive.setSelected(true);
        this.CustomerID = 0;
        txtEmail.setText(null);
        txtMobileNo.setText(null);
        rbMale.setSelected(true);
        lblMailVelidate.setText(null);
        lblMemberCode.setText(null);
        lblCode.setText(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jDayChooser1 = new com.toedter.calendar.JDayChooser();
        buttonGroup1 = new javax.swing.ButtonGroup();
        cbIsActive = new javax.swing.JCheckBox();
        CustomerInfoPanel = new javax.swing.JPanel();
        lblHeader = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtPhoneNo = new javax.swing.JTextField();
        txtMobileNo = new javax.swing.JTextField();
        txtZipCode = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        rbMale = new javax.swing.JRadioButton();
        rbFemale = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        lblMailVelidate = new javax.swing.JLabel();
        lblMemberCode = new javax.swing.JLabel();
        lblCode = new javax.swing.JLabel();
        btnPanel = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        cbIsActive.setBackground(new java.awt.Color(255, 255, 255));
        cbIsActive.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbIsActive.setSelected(true);
        cbIsActive.setText("Is Active");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Customer Information");

        CustomerInfoPanel.setBackground(new java.awt.Color(255, 255, 255));
        CustomerInfoPanel.setLayout(new java.awt.GridBagLayout());

        lblHeader.setBackground(new java.awt.Color(0, 102, 153));
        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader.setText(" Customer Information");
        lblHeader.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 10.0;
        gridBagConstraints.weighty = 10.0;
        CustomerInfoPanel.add(lblHeader, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 5, 5);
        CustomerInfoPanel.add(jLabel2, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Address");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 20, 5);
        CustomerInfoPanel.add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Phone No");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 5, 5);
        CustomerInfoPanel.add(jLabel5, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Mobile No");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 5, 5);
        CustomerInfoPanel.add(jLabel6, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Email");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 5, 5);
        CustomerInfoPanel.add(jLabel7, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 50);
        CustomerInfoPanel.add(txtName, gridBagConstraints);

        txtPhoneNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPhoneNoKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 50);
        CustomerInfoPanel.add(txtPhoneNo, gridBagConstraints);

        txtMobileNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMobileNoActionPerformed(evt);
            }
        });
        txtMobileNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMobileNoKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 50);
        CustomerInfoPanel.add(txtMobileNo, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 50);
        CustomerInfoPanel.add(txtZipCode, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Gender");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 5, 5);
        CustomerInfoPanel.add(jLabel8, gridBagConstraints);

        rbMale.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbMale);
        rbMale.setSelected(true);
        rbMale.setText("Male");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 10);
        CustomerInfoPanel.add(rbMale, gridBagConstraints);

        rbFemale.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbFemale);
        rbFemale.setText("Female");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        CustomerInfoPanel.add(rbFemale, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Zip Code");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 5, 5);
        CustomerInfoPanel.add(jLabel9, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 50);
        CustomerInfoPanel.add(txtCity, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("City");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 5, 5);
        CustomerInfoPanel.add(jLabel10, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 50);
        CustomerInfoPanel.add(txtEmail, gridBagConstraints);

        txtAddress.setColumns(5);
        txtAddress.setLineWrap(true);
        txtAddress.setRows(3);
        jScrollPane2.setViewportView(txtAddress);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 20, 50);
        CustomerInfoPanel.add(jScrollPane2, gridBagConstraints);

        lblMailVelidate.setForeground(new java.awt.Color(255, 0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        CustomerInfoPanel.add(lblMailVelidate, gridBagConstraints);

        lblMemberCode.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblMemberCode.setForeground(new java.awt.Color(153, 153, 153));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 5, 5, 50);
        CustomerInfoPanel.add(lblMemberCode, gridBagConstraints);

        lblCode.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCode.setForeground(new java.awt.Color(153, 153, 153));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(15, 20, 5, 5);
        CustomerInfoPanel.add(lblCode, gridBagConstraints);

        btnPanel.setBackground(new java.awt.Color(255, 255, 255));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT);
        flowLayout1.setAlignOnBaseline(true);
        btnPanel.setLayout(flowLayout1);

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/tick-icon.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        btnPanel.add(btnSave);

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logo.png"))); // NOI18N
        btnClear.setText("Clear");
        btnClear.setPreferredSize(new java.awt.Dimension(101, 41));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        btnPanel.add(btnClear);

        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Log Out 36 x32.png"))); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.setPreferredSize(new java.awt.Dimension(120, 41));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        btnPanel.add(btnCancel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CustomerInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(CustomerInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(btnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtMobileNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMobileNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMobileNoActionPerformed

    /**
     * This Button create an object of Contact person,. Validate the Email
     * field. Add the Object in List<Conatct>. Add into JList. Call the method
     * ClearContact.
     *
     * @param evt
     */
    /**
     * This Button create an object of Customer. Call the method Save to save
     * the Object into database. Call the Clear method. Display the success
     * Message.
     *
     * @param evt
     */
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        if (rbFemale.isSelected()) {
            Gender = "F";
        }

        String name = txtName.getText();
        String gender = Gender;
        String Address = txtAddress.getText();
        String phone = txtPhoneNo.getText();
        String mobile = txtMobileNo.getText();
        String city = txtCity.getText();
        String zipcode = txtZipCode.getText();
        Boolean IsActive = cbIsActive.isSelected();
        String email = txtEmail.getText();

        if (!email.trim().equals("")) {
            if (!Functions.validateEmail(email)) {
                lblMailVelidate.setText("Email is not valid");
                return;

            }
        }

        Customer cus = new Customer(0, lblMemberCode.getText(), name, gender, Address, phone, mobile, city, zipcode, IsActive, email, membershiptype, Status.NotPaid);

        if (CURDCustomer.save(cus)) {
            JOptionPane.showMessageDialog(null, "Member Save Sucessfully. ");
            Clear();
            dispose();
            if (inv.getTitle().equals("Time Managment")) {
                this.inv.fillTable();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Some problem occure.  ", "ERROR", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        Clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtPhoneNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNoKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtPhoneNoKeyTyped

    private void txtMobileNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMobileNoKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtMobileNoKeyTyped

    public static void main(String[] args) {
//        frmCustomer cus = new frmCustomer(Membership.Year);
//        cus.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CustomerInfoPanel;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnClear;
    private javax.swing.JPanel btnPanel;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cbIsActive;
    private com.toedter.calendar.JDayChooser jDayChooser1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCode;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblMailVelidate;
    private javax.swing.JLabel lblMemberCode;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMobileNo;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNo;
    private javax.swing.JTextField txtZipCode;
    // End of variables declaration//GEN-END:variables
}
