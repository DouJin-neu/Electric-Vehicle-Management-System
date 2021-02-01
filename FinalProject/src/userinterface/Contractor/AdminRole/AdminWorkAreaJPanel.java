

package userinterface.Contractor.AdminRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Company.ExecutiveOrganization;
import Business.Organization.Contractor.ContractorAdminOrganization;
import Business.Organization.Contractor.ImplementorOrganization;
import Business.Organization.Contractor.MaintenanceOrganization;
import Business.Organization.EVDriverOrganization;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkRequest.DriverNewLocationRequest;
import Business.WorkRequest.ExecutiveMaintenanceRequest;
import Business.WorkRequest.ExecutiveNewLocationRequest;
import java.awt.CardLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author  raunak
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    Enterprise enterprise;
    UserAccount account;
     Organization organization;
     OrganizationDirectory organizationDirectory;
     EcoSystem system;
     Network network;
     List<ExecutiveNewLocationRequest> locationReqList;
    List<ExecutiveMaintenanceRequest> maintenanceReqList;
     
    /** Creates new form AdminWorkAreaJPanel */
    public AdminWorkAreaJPanel(JPanel userProcessContainer, EcoSystem business,
            Enterprise enterprise, UserAccount account,
            Organization organization, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account = account;
        this.network = network;
        this.system = business;
        this.organization = (ContractorAdminOrganization)organization;
         locationReqList = new ArrayList<>();
        maintenanceReqList = new ArrayList<>();
        valueLabel.setText(enterprise.getName());
        getMaintainenceWorkQueue();
        getNewStationWorkQueue();
         
    }
    
     private List<ExecutiveMaintenanceRequest> getMaintainenceWorkQueue(){
         ExecutiveOrganization executiveOrganization;
        
        for(Network network : system.getNetworkList()){
            for(Enterprise enterp : network.getEnterpriseDirectory().getEnterpriseList()){
                 System.out.println(
                                "ENTERPRISE is" + enterp.getName());
//                if(enterp.getName().equals("EVDriver") ){
                  if(enterp.getEnterpriseType().getValue().equals("Company") ){
                    System.out.println(
                                "ENTERPRISE IN is" + enterp.getType());
                    for(Organization comExecutive : enterp.getOrganizationDirectory().getOrganizationList()){
                        if(comExecutive.getType() == Organization.Type.CompanyExecutive){
                            executiveOrganization = (ExecutiveOrganization)comExecutive;
                             maintenanceReqList.addAll(executiveOrganization.getExecutiveMaintenanceWorkQueue().getList());
                        }
                        //executiveOrganization = (ExecutiveOrganization) comExecutive;
//                       locationReqList.addAll(temp.getDriverNewLocationWorkQueue().getList());
                           // System.out.println(
                             //   "new station list is" + executiveOrganization.getExecutiveMaintenanceWorkQueue().getList());
                        
                        // locationReqList.addAll(temp.getExecutiveImplementationWorkQueue().getList());
                         
                    }
                }
            }
        }
        return maintenanceReqList;
    }
     
     private List<ExecutiveNewLocationRequest>  getNewStationWorkQueue(){
         ExecutiveOrganization executiveOrganization;
        
        for(Network network : system.getNetworkList()){
            for(Enterprise enterp : network.getEnterpriseDirectory().getEnterpriseList()){
                 System.out.println(
                                "ENTERPRISE is" + enterp.getName());
//                if(enterp.getName().equals("EVDriver") ){
                  if(enterp.getEnterpriseType().getValue().equals("Company") ){
                    System.out.println(
                                "ENTERPRISE IN is" + enterp.getType());
                    for(Organization comExecutive : enterp.getOrganizationDirectory().getOrganizationList()){
                        if(comExecutive.getType() == Organization.Type.CompanyExecutive){
                            executiveOrganization = (ExecutiveOrganization)comExecutive;
                             locationReqList.addAll(executiveOrganization.getExecutiveImplementationWorkQueue().getList());
                        }
                         
                    }
                }
            }
        }
        return locationReqList;
    }

    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        btnMngOrganization = new javax.swing.JButton();
        btnMngUA = new javax.swing.JButton();
        btnMngNewEmployee = new javax.swing.JButton();
        btnMngNewStation = new javax.swing.JButton();
        btnMngMaintain = new javax.swing.JButton();
        contractorAdminWorkPanel = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1150, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSplitPane1.setDividerLocation(300);

        jPanel2.setBackground(new java.awt.Color(128, 172, 216));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(255, 255, 255));
        enterpriseLabel.setText("EnterPrise :");
        jPanel2.add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 120, 30));

        valueLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(255, 255, 255));
        valueLabel.setText("<value>");
        jPanel2.add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 150, -1));

        btnMngOrganization.setBackground(new java.awt.Color(255, 255, 255));
        btnMngOrganization.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMngOrganization.setForeground(new java.awt.Color(40, 113, 162));
        btnMngOrganization.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/organ.png"))); // NOI18N
        btnMngOrganization.setText("Manage Organization");
        btnMngOrganization.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMngOrganization.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMngOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMngOrganizationActionPerformed(evt);
            }
        });
        jPanel2.add(btnMngOrganization, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 250, 50));

        btnMngUA.setBackground(new java.awt.Color(255, 255, 255));
        btnMngUA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMngUA.setForeground(new java.awt.Color(40, 113, 162));
        btnMngUA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/useracc.png"))); // NOI18N
        btnMngUA.setText("Manage User Account");
        btnMngUA.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMngUA.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMngUA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMngUAActionPerformed(evt);
            }
        });
        jPanel2.add(btnMngUA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 250, 50));

        btnMngNewEmployee.setBackground(new java.awt.Color(255, 255, 255));
        btnMngNewEmployee.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMngNewEmployee.setForeground(new java.awt.Color(40, 113, 162));
        btnMngNewEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/admin.png"))); // NOI18N
        btnMngNewEmployee.setText("Hire New Employee");
        btnMngNewEmployee.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMngNewEmployee.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMngNewEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMngNewEmployeeActionPerformed(evt);
            }
        });
        jPanel2.add(btnMngNewEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 250, 50));

        btnMngNewStation.setBackground(new java.awt.Color(255, 255, 255));
        btnMngNewStation.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMngNewStation.setForeground(new java.awt.Color(40, 113, 162));
        btnMngNewStation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/newStation.png"))); // NOI18N
        btnMngNewStation.setText("Manage New Station");
        btnMngNewStation.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMngNewStation.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMngNewStation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMngNewStationActionPerformed(evt);
            }
        });
        jPanel2.add(btnMngNewStation, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 250, 50));

        btnMngMaintain.setBackground(new java.awt.Color(255, 255, 255));
        btnMngMaintain.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMngMaintain.setForeground(new java.awt.Color(40, 113, 162));
        btnMngMaintain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/Maintain.png"))); // NOI18N
        btnMngMaintain.setText("Manage Maintenance");
        btnMngMaintain.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMngMaintain.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMngMaintain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMngMaintainActionPerformed(evt);
            }
        });
        jPanel2.add(btnMngMaintain, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 250, 50));

        jSplitPane1.setLeftComponent(jPanel2);

        contractorAdminWorkPanel.setBackground(new java.awt.Color(255, 255, 255));
        contractorAdminWorkPanel.setPreferredSize(new java.awt.Dimension(1150, 600));
        contractorAdminWorkPanel.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(contractorAdminWorkPanel);

        add(jSplitPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 780));
    }// </editor-fold>//GEN-END:initComponents

    private void btnMngOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMngOrganizationActionPerformed
        // TODO add your handling code here:
        ManageContractorOrganizationJPanel manageContractorOrganizationJPanel = new ManageContractorOrganizationJPanel(contractorAdminWorkPanel, enterprise.getOrganizationDirectory());
        contractorAdminWorkPanel.add("manageContractorOrganizationJPanel", manageContractorOrganizationJPanel);
        CardLayout layout = (CardLayout) contractorAdminWorkPanel.getLayout();
        layout.next(contractorAdminWorkPanel);
    }//GEN-LAST:event_btnMngOrganizationActionPerformed

    private void btnMngUAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMngUAActionPerformed
        // TODO add your handling code here:
        ManageUserAccountJPanel muajp = new ManageUserAccountJPanel(contractorAdminWorkPanel, enterprise);
        contractorAdminWorkPanel.add("ManageContractorUserAccountJPanel", muajp);
        CardLayout layout = (CardLayout) contractorAdminWorkPanel.getLayout();
        layout.next(contractorAdminWorkPanel);
    }//GEN-LAST:event_btnMngUAActionPerformed

    private void btnMngNewEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMngNewEmployeeActionPerformed
        // TODO add your handling code here:
                ManageCandidateRequestJPanel mcejp = new ManageCandidateRequestJPanel(contractorAdminWorkPanel,account, enterprise);
                contractorAdminWorkPanel.add("ManageCandidateRequestJPanel", mcejp);
                CardLayout layout = (CardLayout) contractorAdminWorkPanel.getLayout();
                layout.next(contractorAdminWorkPanel);
    }//GEN-LAST:event_btnMngNewEmployeeActionPerformed

    private void btnMngNewStationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMngNewStationActionPerformed
        // TODO add your handling code here:
        ImplementRequestJPanel irjp = new ImplementRequestJPanel(contractorAdminWorkPanel,organizationDirectory,
                       locationReqList,
                       account,
                       (ContractorAdminOrganization)organization,enterprise,network);
                contractorAdminWorkPanel.add("ImplementRequestJPanel", irjp);
                CardLayout layout = (CardLayout) contractorAdminWorkPanel.getLayout();
                layout.next(contractorAdminWorkPanel);
    }//GEN-LAST:event_btnMngNewStationActionPerformed

    private void btnMngMaintainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMngMaintainActionPerformed
        // TODO add your handling code here:
        MaintenanceRequestJPanel mrjp = new MaintenanceRequestJPanel(contractorAdminWorkPanel,organizationDirectory,
                       maintenanceReqList,
                       account,
                       (ContractorAdminOrganization)organization,enterprise,network);
                contractorAdminWorkPanel.add("MaintenanceRequestJPanel", mrjp);
                CardLayout layout = (CardLayout) contractorAdminWorkPanel.getLayout();
                layout.next(contractorAdminWorkPanel);
    }//GEN-LAST:event_btnMngMaintainActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMngMaintain;
    private javax.swing.JButton btnMngNewEmployee;
    private javax.swing.JButton btnMngNewStation;
    private javax.swing.JButton btnMngOrganization;
    private javax.swing.JButton btnMngUA;
    private javax.swing.JPanel contractorAdminWorkPanel;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
    
}
