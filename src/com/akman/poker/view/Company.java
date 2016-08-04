package com.akman.poker.view;

import com.akman.poker.utils.Constants;
import com.akman.poker.utils.ImageX;
import com.akman.poker.utils.Javaconnect;

import java.awt.HeadlessException;

import java.sql.CallableStatement;

import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.SQLException;

import javax.swing.Action;

import javax.swing.JOptionPane;

public class Company extends javax.swing.JFrame
{

    Connection conn = null;
    
    ResultSet rs = null;
    
    PreparedStatement pst = null;
    
    CallableStatement cst = null;

    Integer CreatedBy = 1;
    
    Integer Company = 1;
    
    Integer CompanyID = 1;
    
    String companyName;
    
    byte[] ByteImage = null;

    public Company()
    {
        initComponents();
        
        conn = Javaconnect.ConnecrDb();

        UpdateCompany();
        
        lblHeader.setBackground(Constants.HEADER_COLOR);
    }

    public String getCompanyName()
    {
        return companyName;
    }

    public byte[] getByteImage()
    {
        return ByteImage;
    }

    
    private void UpdateCompany()
    {
        try {
            String sql = "Select * from Company";
            
            pst = conn.prepareStatement(sql);
            
            rs = pst.executeQuery();
            
            // Checking if there is no data in database..
            
            if (!rs.isBeforeFirst()) {
                CompanyID = 0;
            }
            else {
                while (rs.next()) {
                    
                    CompanyID = rs.getInt("ID");
                    
                    companyName = rs.getString("Name");
                    
                    String Address = rs.getString("Address");
                    
                    String Address1 = rs.getString("Address1");
                    
                    String Address2 = rs.getString("Address2");
                    
                    String Phone = rs.getString("Phone");
                    
                    String Fax = rs.getString("Fax");
                    
                    String Email = rs.getString("Email");
                    
                    String Website = rs.getString("Website");
                    
                    ByteImage = rs.getBytes("Logo");
                    
                    ImageVeiw.setImage(ImageX.getImage(ByteImage));

                    txtCompany.setText(companyName);
                    
                    txtAdress.setText(Address);
                    
                    txtAddressLine2.setText(Address1);
                    
                    txtAddressLine3.setText(Address2);
                    
                    txtPhone.setText(Phone);
                    
                    txtFax.setText(Fax);
                    
                    txtEmail.setText(Email);
                    
                    txtWebsite.setText(Website);
                }
            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, e);

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        ImageVeiw = new org.jdesktop.swingx.JXImageView();
        jButton2 = new javax.swing.JButton();
        lblHeader = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCompany = new javax.swing.JTextField();
        txtAdress = new javax.swing.JTextField();
        txtAddressLine2 = new javax.swing.JTextField();
        txtAddressLine3 = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtFax = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtWebsite = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtComments = new javax.swing.JTextArea();
        btnUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Company Detail");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setToolTipText("");
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Rotate Left.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 13;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        jPanel2.add(jButton4, gridBagConstraints);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Rotate Right.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 13;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        jPanel2.add(jButton6, gridBagConstraints);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Search 24.png"))); // NOI18N
        jButton3.setText("Find Picture");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel2.add(jButton3, gridBagConstraints);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Zoom Out.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 13;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        jPanel2.add(jButton1, gridBagConstraints);

        ImageVeiw.setPreferredSize(new java.awt.Dimension(130, 170));

        javax.swing.GroupLayout ImageVeiwLayout = new javax.swing.GroupLayout(ImageVeiw);
        ImageVeiw.setLayout(ImageVeiwLayout);
        ImageVeiwLayout.setHorizontalGroup(
            ImageVeiwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        ImageVeiwLayout.setVerticalGroup(
            ImageVeiwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 10, 0);
        jPanel2.add(ImageVeiw, gridBagConstraints);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Zoom In.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 13;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        jPanel2.add(jButton2, gridBagConstraints);

        lblHeader.setBackground(new java.awt.Color(204, 204, 204));
        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader.setText(" Company Detail");
        lblHeader.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.weighty = 20.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 30, 0);
        jPanel2.add(lblHeader, gridBagConstraints);

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/DeleteRed.png"))); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(30, 10, 10, 10);
        jPanel2.add(btnClose, gridBagConstraints);

        jLabel1.setText("Company");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(2, 12, 2, 12);
        jPanel2.add(jLabel1, gridBagConstraints);

        jLabel2.setText("Address");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(2, 12, 2, 12);
        jPanel2.add(jLabel2, gridBagConstraints);

        jLabel3.setText("Phone");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(2, 12, 2, 12);
        jPanel2.add(jLabel3, gridBagConstraints);

        jLabel4.setText("Fax");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(2, 12, 2, 12);
        jPanel2.add(jLabel4, gridBagConstraints);

        jLabel5.setText("Email");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(2, 12, 2, 12);
        jPanel2.add(jLabel5, gridBagConstraints);

        jLabel6.setText("Website");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(2, 12, 2, 12);
        jPanel2.add(jLabel6, gridBagConstraints);

        txtCompany.setMinimumSize(new java.awt.Dimension(10, 30));
        txtCompany.setPreferredSize(new java.awt.Dimension(30, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 100.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 4, 2, 5);
        jPanel2.add(txtCompany, gridBagConstraints);

        txtAdress.setMinimumSize(new java.awt.Dimension(10, 30));
        txtAdress.setPreferredSize(new java.awt.Dimension(30, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 100.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 4, 2, 5);
        jPanel2.add(txtAdress, gridBagConstraints);

        txtAddressLine2.setMinimumSize(new java.awt.Dimension(10, 30));
        txtAddressLine2.setPreferredSize(new java.awt.Dimension(30, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 100.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 4, 2, 5);
        jPanel2.add(txtAddressLine2, gridBagConstraints);

        txtAddressLine3.setMinimumSize(new java.awt.Dimension(10, 30));
        txtAddressLine3.setPreferredSize(new java.awt.Dimension(30, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 100.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 4, 2, 5);
        jPanel2.add(txtAddressLine3, gridBagConstraints);

        txtPhone.setMinimumSize(new java.awt.Dimension(10, 30));
        txtPhone.setPreferredSize(new java.awt.Dimension(30, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 100.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 4, 2, 5);
        jPanel2.add(txtPhone, gridBagConstraints);

        txtFax.setMinimumSize(new java.awt.Dimension(10, 30));
        txtFax.setPreferredSize(new java.awt.Dimension(30, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 100.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 4, 2, 5);
        jPanel2.add(txtFax, gridBagConstraints);

        txtEmail.setMinimumSize(new java.awt.Dimension(10, 30));
        txtEmail.setPreferredSize(new java.awt.Dimension(30, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 100.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 4, 2, 5);
        jPanel2.add(txtEmail, gridBagConstraints);

        txtWebsite.setMinimumSize(new java.awt.Dimension(10, 30));
        txtWebsite.setPreferredSize(new java.awt.Dimension(30, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 100.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 4, 2, 5);
        jPanel2.add(txtWebsite, gridBagConstraints);

        jLabel7.setText("Comments");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(jLabel7, gridBagConstraints);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(30, 80));

        txtComments.setColumns(20);
        txtComments.setRows(2);
        jScrollPane1.setViewportView(txtComments);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 100.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 4, 2, 5);
        jPanel2.add(jScrollPane1, gridBagConstraints);

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/tick-icon.png"))); // NOI18N
        btnUpdate.setText("Save / Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(30, 50, 10, 0);
        jPanel2.add(btnUpdate, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(541, 583));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            // Getting image from image veiw from byte image by calling the Funcation Image.

            ByteImage = ImageX.Image(ImageVeiw);

            conn.setAutoCommit(false);

            cst = conn.prepareCall("EXEC Insert_Into_Company ?,?,?,?,?,?,?,?,?,?,?");
            
            cst.setInt(1, CompanyID);
            
            cst.setString(2, txtCompany.getText());
            
            cst.setString(3, txtAdress.getText());
            
            cst.setString(4, txtAddressLine2.getText());
            
            cst.setString(5, txtAddressLine3.getText());
            
            cst.setString(6, txtPhone.getText());
            
            cst.setString(7, txtFax.getText());
            
            cst.setString(8, txtEmail.getText());
            
            cst.setString(9, txtWebsite.getText());
            
            cst.setInt(10, CreatedBy);
            
            cst.setBytes(11, ByteImage);
            
            cst.execute();
            
            cst.close();

            conn.commit();
            
            conn.setAutoCommit(true);
            
            if (CompanyID == 0) {
                
                JOptionPane.showMessageDialog(null, "Company is Created");
            }
            else {
                
                JOptionPane.showMessageDialog(null, "Company is Update");
            }

        } catch (SQLException | NumberFormatException | HeadlessException e) {
            
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            // If there is an error then rollback the changes.
            System.out.println("Rolling back data here....");
            try {
                if (conn != null) {
                    
                    conn.rollback();
                }
            } catch (SQLException se2) {
            }//end try
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton3ActionPerformed
    {//GEN-HEADEREND:event_jButton3ActionPerformed

        Action openAction = ImageVeiw.getOpenAction();
        
        openAction.actionPerformed(evt);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton6ActionPerformed
    {//GEN-HEADEREND:event_jButton6ActionPerformed
        Action zoomOutAction = ImageVeiw.getRotateClockwiseAction();
        
        zoomOutAction.actionPerformed(evt);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton4ActionPerformed
    {//GEN-HEADEREND:event_jButton4ActionPerformed
        Action zoomOutAction = ImageVeiw.getRotateCounterClockwiseAction();
        
        zoomOutAction.actionPerformed(evt);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        Action zoomOutAction = ImageVeiw.getZoomOutAction();
        
        zoomOutAction.actionPerformed(evt);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton2ActionPerformed
    {//GEN-HEADEREND:event_jButton2ActionPerformed
        Action zoomOutAction = ImageVeiw.getZoomInAction();
        
        zoomOutAction.actionPerformed(evt);
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[])
    {
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
            java.util.logging.Logger.getLogger(Company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Company().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public org.jdesktop.swingx.JXImageView ImageVeiw;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    public javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JTextField txtAddressLine2;
    private javax.swing.JTextField txtAddressLine3;
    private javax.swing.JTextField txtAdress;
    private javax.swing.JTextArea txtComments;
    private javax.swing.JTextField txtCompany;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFax;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtWebsite;
    // End of variables declaration//GEN-END:variables
}
