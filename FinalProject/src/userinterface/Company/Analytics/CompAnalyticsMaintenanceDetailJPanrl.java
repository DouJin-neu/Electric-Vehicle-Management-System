/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Company.Analytics;

import Business.Organization.Company.AnalyticsOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkRequest.AnalyticsMaintenanceRequest;
import Business.WorkRequest.DriverMaintenanceRequest;
import Business.WorkRequest.DriverNewLocationRequest;
import Business.WorkRequest.ExecutiveMaintenanceRequest;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author shaohanghu
 */
public class CompAnalyticsMaintenanceDetailJPanrl extends javax.swing.JPanel {

    /**
     * Creates new form CompAnalyticsMaintenanceDetailJPanrl
     */
    private JPanel userProcessContainer;
    DriverMaintenanceRequest request;
    UserAccount account;
    AnalyticsOrganization org;
    
    public CompAnalyticsMaintenanceDetailJPanrl(JPanel userProcessContainer,
            DriverMaintenanceRequest o, UserAccount account,
            AnalyticsOrganization org) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
         this.request = o;
         this.account = account;
         this.org = org;
         DisplayContent();
         comboStatus.removeAllItems();
         comboStatus.addItem("REJECTED");
         comboStatus.addItem("APPROVED");
         comboStatus.addItem("INVALID");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtReason = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        txtFromUser = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        comboStatus = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtLocation = new javax.swing.JTextField();
        buttonApprove = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        buttonConfirmStatusChange = new javax.swing.JButton();
        txtPile = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        labelReceiver = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        buttonBack = new javax.swing.JButton();
        labelPileStatus = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setEnabled(false);
        setPreferredSize(new java.awt.Dimension(180, 16));
        setVerifyInputWhenFocusTarget(false);

        txtReason.setColumns(20);
        txtReason.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtReason.setRows(5);
        txtReason.setEnabled(false);
        jScrollPane1.setViewportView(txtReason);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Requested By:");
        jLabel3.setPreferredSize(new java.awt.Dimension(180, 16));
        jLabel3.setVerifyInputWhenFocusTarget(false);

        txtFromUser.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtFromUser.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("Error:");
        jLabel8.setPreferredSize(new java.awt.Dimension(180, 16));
        jLabel8.setVerifyInputWhenFocusTarget(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Requested Date:");
        jLabel4.setPreferredSize(new java.awt.Dimension(180, 16));
        jLabel4.setVerifyInputWhenFocusTarget(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel9.setText("Change Status To:");

        txtDate.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtDate.setEnabled(false);

        comboStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Suggested Location:");
        jLabel5.setPreferredSize(new java.awt.Dimension(180, 16));
        jLabel5.setVerifyInputWhenFocusTarget(false);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Proceed To Executive:");

        txtLocation.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtLocation.setEnabled(false);

        buttonApprove.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonApprove.setForeground(new java.awt.Color(40, 113, 162));
        buttonApprove.setText("Generate Executive Ticket");
        buttonApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonApproveActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Pile ID:");
        jLabel6.setPreferredSize(new java.awt.Dimension(180, 16));
        jLabel6.setVerifyInputWhenFocusTarget(false);

        buttonConfirmStatusChange.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonConfirmStatusChange.setForeground(new java.awt.Color(40, 113, 162));
        buttonConfirmStatusChange.setText("Confirm");
        buttonConfirmStatusChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConfirmStatusChangeActionPerformed(evt);
            }
        });

        txtPile.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtPile.setEnabled(false);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Processing Analytics:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(40, 113, 162));
        jLabel1.setText("Charging Station Maintenance Request from User");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("Request Status:");
        jLabel7.setPreferredSize(new java.awt.Dimension(180, 16));
        jLabel7.setVerifyInputWhenFocusTarget(false);

        labelReceiver.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        txtStatus.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtStatus.setEnabled(false);

        buttonBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonBack.setForeground(new java.awt.Color(40, 113, 162));
        buttonBack.setText("<< Back");
        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackActionPerformed(evt);
            }
        });

        labelPileStatus.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        labelPileStatus.setForeground(new java.awt.Color(255, 0, 51));
        labelPileStatus.setText("jLabel12");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(buttonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txtFromUser, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txtPile, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(comboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(buttonConfirmStatusChange, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel10)
                        .addGap(6, 6, 6)
                        .addComponent(buttonApprove))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelReceiver, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(labelPileStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(255, 255, 255))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(buttonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFromUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(comboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonConfirmStatusChange, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel10))
                    .addComponent(buttonApprove, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(labelReceiver, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelPileStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel3.getAccessibleContext().setAccessibleName("");
        jLabel8.getAccessibleContext().setAccessibleName("");
        jLabel4.getAccessibleContext().setAccessibleName("");
        jLabel5.getAccessibleContext().setAccessibleName("");
        jLabel6.getAccessibleContext().setAccessibleName("");
        jLabel7.getAccessibleContext().setAccessibleName("");

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void buttonApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonApproveActionPerformed
        // TODO add your handling code here:
        if(!request.getStatus().equals("APPROVED")){
            JOptionPane.showMessageDialog(null, "Need Approval Before Proceed to Executive");
        }
        else{
            AnalyticsMaintenanceRequest geneReq = new AnalyticsMaintenanceRequest();
            geneReq.setRequestedPile(request.getRequestedPile());
            geneReq.setMessage(request.getMessage());
            geneReq.setSender(account);
            geneReq.setRequestedLocation(request.getRequestedLocation());

            CompAnalyticsGenerateExecutiveMaintenanceReqJPanel panel = new CompAnalyticsGenerateExecutiveMaintenanceReqJPanel(userProcessContainer, request, account, org, geneReq);
            userProcessContainer.add("generateNewStationReq", panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        
    }//GEN-LAST:event_buttonApproveActionPerformed

    private void buttonConfirmStatusChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConfirmStatusChangeActionPerformed
        // TODO add your handling code here:
        int n = JOptionPane.showConfirmDialog(null, "Make sure confirm the charging pile status before makeing changes.", "Change the Status?", JOptionPane.YES_NO_OPTION);
                    if(n == 0){
                        if(comboStatus.getSelectedItem().toString().equals(
                                "APPROVED")){
                            int m = JOptionPane.showConfirmDialog(null, "This pile will be marked broken and unavaliable to customer.", "Change the Status?", JOptionPane.YES_NO_OPTION);
                            if(n == 0){
                            request.setStatus(comboStatus.getSelectedItem().toString());
                            request.setReceiver(account);
                            request.setResolveDate(new Date());
                            DisplayContent();
                            JOptionPane.showMessageDialog(null, "Status Changed");
                            request.getRequestedPile().setIsBroken(true);
                            labelPileStatus.setText("[Current Status] " + request.getRequestedLocation().getName() + " "+ request.getRequestedPile() + " Broken: " +request.getRequestedPile().isIsBroken());
                            }
                        }
                        else{
                            request.setStatus(comboStatus.getSelectedItem().toString());
                            request.setReceiver(account);
                            request.setResolveDate(new Date());
                            DisplayContent();
                            JOptionPane.showMessageDialog(null, "Status Changed");
                        }
                        
                    }
        
    }//GEN-LAST:event_buttonConfirmStatusChangeActionPerformed

    private void buttonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_buttonBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonApprove;
    private javax.swing.JButton buttonBack;
    private javax.swing.JButton buttonConfirmStatusChange;
    private javax.swing.JComboBox comboStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelPileStatus;
    private javax.swing.JLabel labelReceiver;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtFromUser;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtPile;
    private javax.swing.JTextArea txtReason;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables

    private void DisplayContent() {
        labelPileStatus.setText("[Current Status] " + request.getRequestedLocation().getName() + " "+ request.getRequestedPile() + " Broken: " +request.getRequestedPile().isIsBroken());
        txtFromUser.setText(request.getSender().getUsername());
        txtDate.setText(request.getRequestDate().toString());
        txtLocation.setText(request.getRequestedLocation().getName());
        txtPile.setText(String.valueOf(request.getRequestedPile().getId()));
        txtStatus.setText(request.getStatus());
        txtReason.setText(request.getMessage());
        labelReceiver.setText(account.getUsername());
    }
}
