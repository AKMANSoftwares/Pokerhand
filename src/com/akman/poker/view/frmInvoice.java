/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akman.poker.view;

import com.akman.poker.controller.CURDCustomer;
import com.akman.poker.controller.CURDTime;
import com.akman.poker.main.Main;
import com.akman.poker.model.Time;
import com.akman.poker.utils.Constants;
import com.akman.poker.utils.Javaconnect;
import com.akman.poker.utils.Membership;
import com.akman.poker.utils.Status;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.dbutils.DbUtils;
import org.jdesktop.swingx.prompt.PromptSupport;

/**
 *
 * @author AKL SOFT
 */
public class frmInvoice extends javax.swing.JFrame {

    /**
     * Creates new form frmInvoice
     */
    Time time;
    
    List<Time> timelist = new ArrayList<>();
    
    DefaultTableModel model;

    SimpleDateFormat format = new SimpleDateFormat("MMM d, yyyy HH:mm:ss ");

    SimpleDateFormat datformat = new SimpleDateFormat("yyyy-MM-dd");

    Date date = new Date();
    
    String TodayDate;

    public frmInvoice() {
        
        initComponents();
        
        lblHeader.setBackground(Constants.HEADER_COLOR);

        model = (DefaultTableModel) tblCustomer.getModel();
        
        TodayDate = datformat.format(date);
        
        fillTable();
        
        this.setExtendedState(getExtendedState() | Main.MAXIMIZED_VERT | Main.MAXIMIZED_HORIZ);
        
        PromptSupport.setPrompt("Search Members", txtSearch);

    }

    public void fillTable() {

        timelist = CURDCustomer.select(TodayDate);
        lblTotalCustomer.setText(String.valueOf(timelist.size()));
        model.setRowCount(0);
        for (Time time : timelist) {
            addRow(time);
        }
    }

    private void addRow(Time time) {

        String Name = time.getName();
        String TimeIn = time.getTimeIN();
        String StartTime = time.getStartPlaying();

        Object row[] = {time, Name, TimeIn, StartTime};
        model.addRow(row);

    }

    private void Clear() {
        lblName.setText(null);
        lblTimeIN.setText(null);
        StartTime.setDate(new Date());
        TimeOut.setDate(new Date());
//        lblTotalCustomer.setText(String.valueOf(timelist.size()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        lblHeader = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cbSearchByDate = new com.lavantech.gui.comp.DateTimePicker();
        lblName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblTimeIN = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        StartTime = new com.lavantech.gui.comp.DateTimePicker();
        jLabel5 = new javax.swing.JLabel();
        txtsubTotal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCash = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnAddCustomer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomer = new org.jdesktop.swingx.JXTable();
        jLabel9 = new javax.swing.JLabel();
        TimeOut = new com.lavantech.gui.comp.DateTimePicker();
        btnSavePlayingTime = new javax.swing.JButton();
        btnCalculate = new javax.swing.JButton();
        lblTime = new org.jdesktop.swingx.JXLabel();
        lblTotalCustomer = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Time Managment");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        lblHeader.setBackground(new java.awt.Color(0, 102, 153));
        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader.setText("Time Managment");
        lblHeader.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(lblHeader, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Search By Date");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(30, 20, 5, 5);
        jPanel1.add(jLabel1, gridBagConstraints);

        cbSearchByDate.setOpaque(true);
        cbSearchByDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSearchByDateActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 5, 10, 5);
        jPanel1.add(cbSearchByDate, gridBagConstraints);

        lblName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblName.setText(" ");
        lblName.setToolTipText("");
        lblName.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 5, 5);
        jPanel1.add(lblName, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 30, 5, 5);
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Time In");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 30, 5, 5);
        jPanel1.add(jLabel4, gridBagConstraints);

        lblTimeIN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTimeIN.setText(" ");
        lblTimeIN.setToolTipText("");
        lblTimeIN.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(lblTimeIN, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Start Time");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 30, 5, 5);
        jPanel1.add(jLabel2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(StartTime, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Sub Total:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(jLabel5, gridBagConstraints);

        txtsubTotal.setFont(new java.awt.Font("Time", 0, 18)); // NOI18N
        txtsubTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtsubTotal.setText("0.00");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 20);
        jPanel1.add(txtsubTotal, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Cash:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(jLabel6, gridBagConstraints);

        jTextField2.setFont(new java.awt.Font("Time", 0, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(204, 0, 0));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField2.setText("0.00");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 20);
        jPanel1.add(jTextField2, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Balance:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(jLabel7, gridBagConstraints);

        txtCash.setFont(new java.awt.Font("Time", 0, 18)); // NOI18N
        txtCash.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCash.setText("0.00");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 20);
        jPanel1.add(txtCash, gridBagConstraints);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/dollar.png"))); // NOI18N
        jButton1.setText("Paid");
        jButton1.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 20, 20);
        jPanel1.add(jButton1, gridBagConstraints);

        btnAddCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user_add.png"))); // NOI18N
        btnAddCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCustomerActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = -20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 5, 5, 5);
        jPanel1.add(btnAddCustomer, gridBagConstraints);

        tblCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Time", "Name", "Time IN", "Start Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCustomer.setRowHeight(25);
        tblCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCustomerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCustomer);
        if (tblCustomer.getColumnModel().getColumnCount() > 0) {
            tblCustomer.getColumnModel().getColumn(0).setMinWidth(0);
            tblCustomer.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblCustomer.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 5, 5);
        jPanel1.add(jScrollPane1, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Time Out");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 30, 5, 5);
        jPanel1.add(jLabel9, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(TimeOut, gridBagConstraints);

        btnSavePlayingTime.setText("Save");
        btnSavePlayingTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSavePlayingTimeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(btnSavePlayingTime, gridBagConstraints);

        btnCalculate.setText("Calculte");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(btnCalculate, gridBagConstraints);

        lblTime.setBackground(new java.awt.Color(0, 0, 0));
        lblTime.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/clock1.png"))); // NOI18N
        lblTime.setText("  00:00:00");
        lblTime.setFont(new java.awt.Font("Time", 1, 36)); // NOI18N
        lblTime.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(200, 5, 5, 20);
        jPanel1.add(lblTime, gridBagConstraints);

        lblTotalCustomer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(lblTotalCustomer, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Total Number of Customers:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 5, 5);
        jPanel1.add(jLabel10, gridBagConstraints);

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(30, 30, 5, 5);
        jPanel1.add(txtSearch, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 896, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCustomerActionPerformed
        frmAddMembershipType type = new frmAddMembershipType(this, true);
        type.setVisible(true);

    }//GEN-LAST:event_btnAddCustomerActionPerformed

    private void tblCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCustomerMouseClicked
        if (evt.getClickCount() == 2) {
            Clear();

            int row = tblCustomer.getSelectedRow();
            time = (Time) tblCustomer.getValueAt(row, 0);

            String Name = (String) tblCustomer.getValueAt(row, 1);
            String TimeIn = (String) tblCustomer.getValueAt(row, 2);
            String TimeOut = (String) tblCustomer.getValueAt(row, 3);

            String startTime = time.getStartPlaying();

            if (startTime != null) {
                try {
                    StartTime.setDate(format.parse(startTime));
                } catch (ParseException ex) {
                    Logger.getLogger(frmInvoice.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                StartTime.setDate(new Date());
            }

            lblName.setText(Name);
            lblTimeIN.setText(TimeIn);

        }
    }//GEN-LAST:event_tblCustomerMouseClicked

    private void btnSavePlayingTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavePlayingTimeActionPerformed
        
        if (time != null) {
            
            Date startTime = StartTime.getDate();
            
            time.setStartPlaying(format.format(startTime));
            
            CURDTime.UpdateStartTime(time);
            

            fillTable();
        }
    }//GEN-LAST:event_btnSavePlayingTimeActionPerformed

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed

        if(lblTimeIN.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Start Playing time is not set. ", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Date timeout = TimeOut.getDate();

        time.setTimeOut(format.format(timeout));

        if (time.CalulateTime()) {

            lblTime.setText(time.getTimePlayed());
        }
        txtsubTotal.setText(null);
        txtsubTotal.setText(time.CalculteAmount().toString());

    }//GEN-LAST:event_btnCalculateActionPerformed

    private void cbSearchByDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSearchByDateActionPerformed
        Date SearhTime = cbSearchByDate.getDate();

        this.TodayDate = datformat.format(SearhTime);

        fillTable();
    }//GEN-LAST:event_cbSearchByDateActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if(txtSearch.getText().trim().equals("")){
                return;
            }
            for (Time time1 : timelist) {
                if(time1.getMemberCode().equals(txtSearch.getText())){
                    JOptionPane.showMessageDialog(null, "Member is already playing..", "", JOptionPane.ERROR_MESSAGE);
                    txtSearch.setText(null);
                    return;
                                       
                }
            }
            Connection conn = Javaconnect.ConnecrDb();
            PreparedStatement pst =null;
            ResultSet rs = null;
            
            try {
                String sql = "SELECT * FROM customer where MemberCode ='" + txtSearch.getText() + "' ";
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();

                System.out.println(txtSearch.getText());
                while (rs.next()) {
                    int CustomerID = rs.getInt("CustomerID");
                    String Name = rs.getString("Name");
                    System.out.println(Name);

                    //int c = JOptionPane.showConfirmDialog(this, "Do you want to add client code "+ txtCustomerSerach.getText()+" and Name  "+Name+ "?",JOptionPane.YES_NO_OPTION);
                    int option = JOptionPane.showConfirmDialog(null, "Do you want to add client code " + txtSearch.getText() + " and Name  " + Name + "?", "Add Customer", JOptionPane.YES_NO_OPTION);

                    if (option == 0) { //The ISSUE is here
                        System.out.print("Yes");

                        CURDTime.save(CustomerID, conn);

                        String sql2 = "SELECT * FROM customer C INNER JOIN Time T"
                                + " ON C.CustomerID = T.CustomerID WHERE C.CustomerID"
                                + " = " + CustomerID + " AND  T.ID = (SELECT MAX(ID) from Time Where CustomerID = " + CustomerID + ")";

                        pst = conn.prepareStatement(sql2);
                        rs = pst.executeQuery();

                        if (rs.next()) {

                            String gender = rs.getString("Gender");
                            String address = rs.getString("Address");
                            String Phone = rs.getString("PhoneNo");
                            String Mobile = rs.getString("MobileNo");
                            String City = rs.getString("City");
                            String Zipcode = rs.getString("ZipCode");
                            Boolean isActive = rs.getBoolean("IsActive");
                            String email = rs.getString("Email");
                            String membershiptype = rs.getString("MembershipType");
                            String status = rs.getString("Status");
                            String Membercode = rs.getString("MemberCode");
                            int timeID = rs.getInt("ID");
                            String timein = rs.getString("TimeIn");
                            String Playingtime = rs.getString("StartPlaying");
                            String TimeOut = rs.getString("TimeOut");

                            Time time = new Time(timeID, timein, Playingtime, TimeOut, CustomerID,
                                    Membercode, Name, gender, address, Phone, Mobile, City, Zipcode,
                                    isActive, email, Membership.valueOf(membershiptype), Status.valueOf(status));

                            addRow(time);
                        }
                    } else {
                        System.out.print("no");

                    }
                }

            } catch (SQLException ex) {
                Logger.getLogger(frmInvoice.class
                        .getName()).log(Level.SEVERE, null, ex);
            } finally {
                DbUtils.closeQuietly(pst);
                DbUtils.closeQuietly(conn);
                DbUtils.closeQuietly(rs);
            }

        }

    }//GEN-LAST:event_txtSearchKeyReleased

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
            java.util.logging.Logger.getLogger(frmInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmInvoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.lavantech.gui.comp.DateTimePicker StartTime;
    private com.lavantech.gui.comp.DateTimePicker TimeOut;
    private javax.swing.JButton btnAddCustomer;
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnSavePlayingTime;
    private com.lavantech.gui.comp.DateTimePicker cbSearchByDate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblName;
    private org.jdesktop.swingx.JXLabel lblTime;
    private javax.swing.JLabel lblTimeIN;
    private javax.swing.JLabel lblTotalCustomer;
    private org.jdesktop.swingx.JXTable tblCustomer;
    private javax.swing.JTextField txtCash;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtsubTotal;
    // End of variables declaration//GEN-END:variables
}
