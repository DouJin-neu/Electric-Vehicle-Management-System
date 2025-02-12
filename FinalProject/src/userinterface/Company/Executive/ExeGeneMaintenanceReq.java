/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Company.Executive;

import Business.Enterprise.CompanyEnterprise;
import Business.Enterprise.ContractorEnterprise;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Company.ExecutiveOrganization;
import Business.Organization.Contractor.CoopContractor;
import Business.UserAccount.UserAccount;
import Business.WorkRequest.AnalyticsMaintenanceRequest;
import Business.WorkRequest.ExecutiveMaintenanceRequest;
import Business.WorkRequest.ExecutiveNewLocationRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author shaohanghu
 */
public class ExeGeneMaintenanceReq extends javax.swing.JPanel {

    /**
     * Creates new form ExeGeneMaintenanceReq
     */
    JPanel userProcessContainer;
    ExecutiveMaintenanceRequest request;
    UserAccount account;
    ExecutiveOrganization org;
    CompanyEnterprise enterprise;
   
    public      ExeGeneMaintenanceReq(JPanel userProcessContainer,
            AnalyticsMaintenanceRequest request, UserAccount account,
            ExecutiveOrganization org, ExecutiveMaintenanceRequest geneReq,
            Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = geneReq;
        this.account = account;
        this.org = org;
        this.enterprise = (CompanyEnterprise) enterprise;
        DisplayContent();
    }




    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtPile = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtReason = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        txtStation = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtFromUser = new javax.swing.JTextField();
        confirm = new javax.swing.JButton();
        comboContract = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        buttonBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("Message:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 255, 150, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 122, 164));
        jLabel1.setText("Maintenance Request for Contractor");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 427, 50));

        txtPile.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtPile.setEnabled(false);
        add(txtPile, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 220, 200, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel9.setText("Pile:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 223, 150, -1));

        txtReason.setColumns(20);
        txtReason.setRows(5);
        jScrollPane1.setViewportView(txtReason);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 255, 320, 164));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Station:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 188, 150, -1));

        txtStation.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtStation.setEnabled(false);
        add(txtStation, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 185, 200, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Requested By:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 116, 150, -1));

        txtFromUser.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtFromUser.setEnabled(false);
        add(txtFromUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 113, 200, -1));

        confirm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        confirm.setForeground(new java.awt.Color(102, 122, 164));
        confirm.setText("Confirm");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });
        add(confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 437, 150, 30));

        comboContract.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        comboContract.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(comboContract, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 148, 200, 24));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Contractor Assignment:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 152, 190, -1));

        buttonBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonBack.setForeground(new java.awt.Color(102, 122, 164));
        buttonBack.setText("<< Back");
        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackActionPerformed(evt);
            }
        });
        add(buttonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 13, 101, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/cooperate.png"))); // NOI18N
        jLabel2.setText(" ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 120, 880, 520));
    }// </editor-fold>//GEN-END:initComponents

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        // TODO add your handling code here:

        //        request.setRequestedLocation(location);
        //        request.s(Integer.parseInt(txtPile.getText()));
        request.setMessage(txtReason.getText());
        request.setStatus("PENDING");
        request.setMessage(txtReason.getText());
        CoopContractor temp = (CoopContractor) comboContract.getSelectedItem();
        request.setRecevingContractor(temp.getContractor());
        //request.setRecevingContractor((ContractorEnterprise) comboContract.getSelectedItem());
        request.setSendingCompany(enterprise);
        
         
        org.getExecutiveMaintenanceWorkQueue().add(request);
            for(ExecutiveMaintenanceRequest request : org.getExecutiveMaintenanceWorkQueue().getList()){
                System.out.println(request.getRequestedPile().getId());
                System.out.println(request.getRecevingContractor());
          } 
        JOptionPane.showMessageDialog(null, "Request Submitted!");
        userProcessContainer.remove(this);
    }//GEN-LAST:event_confirmActionPerformed

    private void buttonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_buttonBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBack;
    private javax.swing.JComboBox comboContract;
    private javax.swing.JButton confirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtFromUser;
    private javax.swing.JTextField txtPile;
    private javax.swing.JTextArea txtReason;
    private javax.swing.JTextField txtStation;
    // End of variables declaration//GEN-END:variables

    private void DisplayContent() {
        txtFromUser.setText(request.getSender().getUsername());
        txtStation.setText(request.getRequestedStation().toString());
        txtPile.setText(request.getRequestedPile().toString());
        txtReason.setText(request.getMessage() + "\n---Executive Message---\nTYPE HERE\n---End Executive Message---\n");
        
        comboContract.removeAllItems();
        for(CoopContractor c : enterprise.getCoopContractorList()){
            comboContract.addItem(c);
        }
    }
}
