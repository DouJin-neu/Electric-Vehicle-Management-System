/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Company.Analytics;

import Business.Organization.Company.AnalyticsOrganization;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkRequest.DriverNewLocationRequest;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shaohanghu
 */
public class CompAnalyticsProcessNewRequest extends javax.swing.JPanel {

    /**
     * Creates new form CompAnalyticsProcessNewRequest
     */
    JPanel userProcessContainer;
    OrganizationDirectory organizationDirectory;
    List<DriverNewLocationRequest> locationReqList;
    UserAccount account;
    AnalyticsOrganization org;
    
    public  CompAnalyticsProcessNewRequest(JPanel compAnalyticsWorkArea,
            OrganizationDirectory organizationDirectory,
            List<DriverNewLocationRequest> locationReqList, UserAccount account,
            AnalyticsOrganization org) {
            initComponents();
            this.userProcessContainer = compAnalyticsWorkArea;
            this.organizationDirectory = organizationDirectory;
            this.locationReqList = locationReqList;
            this.account = account;
            this.org = org;
            refreshTable();
    }


    private void refreshTable() {
          DefaultTableModel model = (DefaultTableModel) table.getModel();
          SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            model.setRowCount(0);
            if(locationReqList == null){
                
            }
            else{
                for (DriverNewLocationRequest r : locationReqList) {
               Object row[] = new Object[5];
               row[0] = r;
               row[1] = r.getSender();
               row[2] = format.format(r.getRequestDate());
               row[4] = r.getStatus();
               row[3] = r.getFullAddress();
               model.addRow(row);
           }
            }
           
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
        table = new javax.swing.JTable();
        buttonViewDetail = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        refreshJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "User", "Date", "Suggested Location", "Status"
            }
        ));
        table.setSelectionBackground(new java.awt.Color(153, 153, 153));
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setMinWidth(20);
            table.getColumnModel().getColumn(0).setPreferredWidth(20);
            table.getColumnModel().getColumn(1).setMinWidth(20);
            table.getColumnModel().getColumn(1).setPreferredWidth(20);
            table.getColumnModel().getColumn(2).setMinWidth(80);
            table.getColumnModel().getColumn(2).setPreferredWidth(80);
            table.getColumnModel().getColumn(3).setPreferredWidth(250);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 686, 375));

        buttonViewDetail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonViewDetail.setForeground(new java.awt.Color(40, 113, 162));
        buttonViewDetail.setText("View Ticket Detail");
        buttonViewDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonViewDetailActionPerformed(evt);
            }
        });
        add(buttonViewDetail, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, -1, 43));

        jLabel1.setBackground(new java.awt.Color(0, 102, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(40, 113, 162));
        jLabel1.setText("New Station Requests From User");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 441, 34));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/LOGO1.png"))); // NOI18N
        jLabel2.setText(" ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 460, 190, 110));

        refreshJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        refreshJButton.setForeground(new java.awt.Color(40, 113, 162));
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, 97, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void buttonViewDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonViewDetailActionPerformed
        // TODO add your handling code here:
        int row = table.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        DriverNewLocationRequest o = (DriverNewLocationRequest)table.getValueAt(row,0);
        CompAnalyticsNewStationDetailJPanrl panel = new CompAnalyticsNewStationDetailJPanrl(userProcessContainer, o, account, org);
        userProcessContainer.add("UserNewLocationDetail", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_buttonViewDetailActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        refreshTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonViewDetail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
