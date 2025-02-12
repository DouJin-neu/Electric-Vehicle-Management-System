/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.User;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author adam
 */
public class SubmitRequestSuccessJPanel extends javax.swing.JPanel
{

    /**
     * Creates new form SubmitRequestSuccessJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount account;


    SubmitRequestSuccessJPanel (JPanel userProcessContainer, EcoSystem system, UserAccount account)
    {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system;
        this.account=account;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1150, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("You have submitted the broken pile report successfully!");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Your request has been received! We will send our maintainance team to fix the issue as soon as possible. ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, 102));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Our goal is to maintain the Charging System run as well as possible.Thank you for your help to keep our system healthy!");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        btnHome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnHome.setText("Go Back To Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 180, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/valid.png"))); // NOI18N
        jLabel4.setText(" ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 100, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/thankYou.png"))); // NOI18N
        jLabel6.setText(" ");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 280, 450, 280));
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnHomeActionPerformed
    {//GEN-HEADEREND:event_btnHomeActionPerformed
        // TODO add your handling code here:
         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        Component[] componentArray = userProcessContainer.getComponents();        
        for (Component c: componentArray){
            userProcessContainer.remove(c);
        }
        UserReportBrokenPileJPanel panel = new UserReportBrokenPileJPanel(userProcessContainer, system, account);
        userProcessContainer.add("UserReportBrokenPileJPanel",panel);
        layout.first(userProcessContainer);
        
        
//        layout.p
    }//GEN-LAST:event_btnHomeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
