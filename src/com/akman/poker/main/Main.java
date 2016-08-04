/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akman.poker.main;

import com.akman.poker.model.Users;
import com.akman.poker.view.frmAddMembershipType;
import com.akman.poker.view.frmInvoice;
import com.akman.poker.view.frmLogin;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.Painter;

/**
 *
 * @author AKMAN
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form test
     */
    
    Users user;
    public Main() {

        initComponents();
//        if(user.getEmployeeType()==EmployeeType.ADMIN){
//            menuCompany.setVisible(true);
//            menuReistration.setVisible(true);
//            menuAddProject.setVisible(true);
//            menuProjectMail.setVisible(true);
//            menuSettings.setVisible(true);
//        }
        this.setExtendedState(getExtendedState() | Main.MAXIMIZED_VERT | Main.MAXIMIZED_HORIZ);
//        this.user = user;
//        
//        System.out.println(user);

    }

    public static class DesktopPainter implements Painter<JComponent> {

        private Image image;

        public DesktopPainter() {
            try {
                image = ImageIO.read(new File("image/background 2.jpg"));
            } catch (IOException e) {
            }
        }

        @Override
        public void paint(Graphics2D g, JComponent object, int width, int height) {
            g.drawImage(image, 0, 0, width, height, null);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainFrame = new javax.swing.JDesktopPane();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuCompany = new javax.swing.JMenuItem();
        menuReistration = new javax.swing.JMenuItem();
        menuCustomerDetail = new javax.swing.JMenuItem();
        menuLogOff = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        menuSettings = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Poker Hand");

        javax.swing.GroupLayout MainFrameLayout = new javax.swing.GroupLayout(MainFrame);
        MainFrame.setLayout(MainFrameLayout);
        MainFrameLayout.setHorizontalGroup(
            MainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1021, Short.MAX_VALUE)
        );
        MainFrameLayout.setVerticalGroup(
            MainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 719, Short.MAX_VALUE)
        );

        jToolBar1.setRollover(true);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user_add.png"))); // NOI18N
        jButton1.setText("Add Customer");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/coins-700000-icon.png"))); // NOI18N
        jButton2.setText("Calculate");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        jMenu1.setText("File");

        menuCompany.setText("Company ");
        menuCompany.setEnabled(false);
        menuCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCompanyActionPerformed(evt);
            }
        });
        jMenu1.add(menuCompany);

        menuReistration.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        menuReistration.setText("Registration");
        menuReistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuReistrationActionPerformed(evt);
            }
        });
        jMenu1.add(menuReistration);

        menuCustomerDetail.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_MASK));
        menuCustomerDetail.setText("Time Managment");
        menuCustomerDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCustomerDetailActionPerformed(evt);
            }
        });
        jMenu1.add(menuCustomerDetail);

        menuLogOff.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        menuLogOff.setText("Log off");
        menuLogOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLogOffActionPerformed(evt);
            }
        });
        jMenu1.add(menuLogOff);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem6.setText("Exit");
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        menuSettings.setText("Settings");
        menuSettings.setEnabled(false);

        jMenuItem5.setText("User Managment");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        menuSettings.add(jMenuItem5);

        jMenuItem1.setText("Project Mail Template");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuSettings.add(jMenuItem1);

        jMenuItem2.setText("Email Real Hrs and Cost");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuSettings.add(jMenuItem2);

        jMenuItem3.setText("Database Connection");
        menuSettings.add(jMenuItem3);

        jMenuItem8.setText("Backup");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        menuSettings.add(jMenuItem8);

        jMenuBar1.add(menuSettings);

        jMenu2.setText("Help");
        jMenu2.setEnabled(false);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainFrame)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(MainFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuReistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuReistrationActionPerformed
        frmAddMembershipType membership = new frmAddMembershipType(this, true);
        membership.setVisible(true);
    }//GEN-LAST:event_menuReistrationActionPerformed

    private void menuCustomerDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCustomerDetailActionPerformed
        frmInvoice invoice = new frmInvoice();
        invoice.setVisible(true);
    }//GEN-LAST:event_menuCustomerDetailActionPerformed

    private void menuCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCompanyActionPerformed
        /*frmCompany company = new frmCompany();
        company.setVisible(true);*/
    }//GEN-LAST:event_menuCompanyActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        /*frmUsers users = new frmUsers();
        users.setVisible(true);*/
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void menuLogOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLogOffActionPerformed
        frmLogin login  = new frmLogin();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuLogOffActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       // frmEmailTemplete em = new frmEmailTemplete();
        //em.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       // frmEmailTemplete1 em = new frmEmailTemplete1();
       // em.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        //frmBackupAndRestore BR = new frmBackupAndRestore();
        //BR.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        frmAddMembershipType membership = new frmAddMembershipType(this, true);
        membership.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        frmInvoice invoice = new frmInvoice();
        invoice.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String[] args) {
        Main main = new Main();
        main.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane MainFrame;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem menuCompany;
    private javax.swing.JMenuItem menuCustomerDetail;
    private javax.swing.JMenuItem menuLogOff;
    private javax.swing.JMenuItem menuReistration;
    private javax.swing.JMenu menuSettings;
    // End of variables declaration//GEN-END:variables
}
