/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Candidate;

import javax.swing.JPanel;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkRequest.CandidateRequest;
import java.awt.CardLayout;
import java.awt.Component;


/**
 *
 * @author jindou
 */
public class ViewResultDetailJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    CandidateRequest request;
    /**
     * Creates new form ViewResultDetailJPanel
     */
    public ViewResultDetailJPanel(JPanel userProcessContainer, CandidateRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        displayResume(request);
    }
    
    private void displayResume(CandidateRequest request){
        String name = request.getName();
        txtName.setText(name);
        
        String contact = request.getContact();
        txtContact.setText(contact);
        
        Enterprise ent = request.getEnterprise();
        String enterprise = ent.toString();
        txtCompany.setText(enterprise);
        
        String feedback = request.getFeedback();
        txtResult.setText(feedback);
        txtResult.setEditable(false);
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        namelbl5 = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        namelbl7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResult = new javax.swing.JTextArea();
        btnBack = new javax.swing.JButton();
        lblName3 = new javax.swing.JLabel();
        lblName4 = new javax.swing.JLabel();
        txtCompany = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1150, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        namelbl5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        namelbl5.setText("Result");
        add(namelbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 120, 40));

        title.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        title.setText(" View Result Detail");
        add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 300, 43));

        txtName.setEditable(false);
        txtName.setText(" ");
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 190, 30));

        txtContact.setEditable(false);
        add(txtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 190, 30));

        namelbl7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        namelbl7.setText("Full Name");
        add(namelbl7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 100, 34));

        txtResult.setColumns(20);
        txtResult.setRows(5);
        jScrollPane1.setViewportView(txtResult);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 300, 210));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(40, 113, 162));
        btnBack.setText("< Back");
        btnBack.setBorder(null);
        btnBack.setBorderPainted(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 100, 30));

        lblName3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblName3.setText("Contact");
        add(lblName3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        lblName4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblName4.setText("Desired Company");
        add(lblName4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, -1, -1));

        txtCompany.setEditable(false);
        add(txtCompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 190, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/resumeBG.jpg"))); // NOI18N
        jLabel2.setText(" ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 680));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        JobSearchStatusJPanel jssjp = (JobSearchStatusJPanel) component;
        jssjp.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblName3;
    private javax.swing.JLabel lblName4;
    private javax.swing.JLabel namelbl5;
    private javax.swing.JLabel namelbl7;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtCompany;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextArea txtResult;
    // End of variables declaration//GEN-END:variables
}
