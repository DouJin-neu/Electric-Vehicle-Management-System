/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Company.Analytics;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Company.AnalyticsOrganization;
import Business.Organization.EVDriverOrganization;
import Business.Organization.Organization;
import Business.StationMap.ChargingPile;
import Business.StationMap.ChargingStation;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AnalyticsMaintenanceWorkQueue;
import Business.WorkQueue.AnalyticsNewStationWorkQueue;
import Business.WorkQueue.DriverNewLocationWorkQueue;
import Business.WorkQueue.ExecutiveImplementationWorkQueue;
import Business.WorkQueue.ExecutiveMaintenanceWorkQueue;
import Business.WorkRequest.DriverMaintenanceRequest;
import Business.WorkRequest.DriverNewLocationRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import userinterface.Company.Admin.CompCreateUserJPanel;

/**
 *
 * @author shaohanghu
 */
public class CompAnalyticsWorkArea extends javax.swing.JPanel {
    JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem system;
    List<DriverNewLocationRequest> locationReqList;
    List<DriverMaintenanceRequest> maintenanceReqList;
    AnalyticsMaintenanceWorkQueue analyticsMaintenanceWorkQueue;
    AnalyticsNewStationWorkQueue analyticsNewStationWorkQueue;
    UserAccount account;
    AnalyticsOrganization org;
    Network network;
    /**
     * Creates new form CompAnalyticsWorkArea
     */
    public CompAnalyticsWorkArea(JPanel userProcessContainer, EcoSystem business,
            Enterprise enterprise, UserAccount account,
            Organization organization, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.system = business;
        this.analyticsMaintenanceWorkQueue = new AnalyticsMaintenanceWorkQueue();
        this.analyticsNewStationWorkQueue = new AnalyticsNewStationWorkQueue();
        locationReqList = new ArrayList<>();
        maintenanceReqList = new ArrayList<>();
        this.account = account;
        this.org = (AnalyticsOrganization) organization;
        this.network = network;
        valueLabel.setText(enterprise.getName());
        getNewLocationQueue();
        DisplayChart();
        //getMaintenanceQueue();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    //Get the user request tickets from all driver across the system
    private List<DriverNewLocationRequest> getNewLocationQueue(){
        EVDriverOrganization driver;
        
//        for(Network network : system.getNetworkList()){
            for(Enterprise enterp : network.getEnterpriseDirectory().getEnterpriseList()){
                 System.out.println(
                                "ENTERPRISE is" + enterp.getName());
//                if(enterp.getName().equals("EVDriver") ){
                  if(enterp.getEnterpriseType().getValue().equals("EV Driver") ){
                    System.out.println(
                                "ENTERPRISE IN is" + enterp.getType());
                    for(Organization evDriver : enterp.getOrganizationDirectory().getOrganizationList()){
                        EVDriverOrganization temp = (EVDriverOrganization) evDriver;
//                       locationReqList.addAll(temp.getDriverNewLocationWorkQueue().getList());
                            System.out.println(
                                "new station list is" + temp.getDriverNewLocationWorkQueue().getList());
                         locationReqList.addAll(temp.getDriverNewLocationWorkQueue().getList());
                         maintenanceReqList.addAll(temp.getDriverMaintenanceWorkQueue().getList());
                         
                    }
                }
            }
//        }
        return locationReqList;
    }
    
//    //Get the user request tickets from all driver across the system
//     private List<DriverMaintenanceRequest> getMaintenanceQueue(){
//        EVDriverOrganization driver;
//        
//        
//            for(Enterprise enterp : network.getEnterpriseDirectory().getEnterpriseList()){
//                if(enterp.getType() == Enterprise.Type.EVDriver){
//                    for(Organization evDriver : enterp.getOrganizationDirectory().getOrganizationList()){
//                        EVDriverOrganization temp = (EVDriverOrganization) evDriver;
////                       maintenanceReqList.addAll(temp.getDriverMaintenanceWorkQueue().getList());
//                            maintenanceReqList = (temp.getDriverMaintenanceWorkQueue().getList());
//                    }
//                }
//            }
//        
//        return maintenanceReqList;
//    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        compAnalyticsWorkArea = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        buttonNewReq = new javax.swing.JButton();
        buttonMainReq = new javax.swing.JButton();
        buttonApprovedNewStation = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        buttonApprovedMaintenance = new javax.swing.JButton();
        valueLabel1 = new javax.swing.JLabel();
        buttonApprovedMaintenance1 = new javax.swing.JButton();
        healthChartPanel = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1150, 600));

        jSplitPane1.setBackground(new java.awt.Color(255, 255, 255));
        jSplitPane1.setDividerLocation(300);

        compAnalyticsWorkArea.setBackground(new java.awt.Color(255, 255, 255));
        compAnalyticsWorkArea.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(compAnalyticsWorkArea);

        jPanel2.setBackground(new java.awt.Color(128, 172, 216));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Analytics");

        buttonNewReq.setBackground(new java.awt.Color(128, 172, 216));
        buttonNewReq.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonNewReq.setForeground(new java.awt.Color(255, 255, 255));
        buttonNewReq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/newStation.png"))); // NOI18N
        buttonNewReq.setText("User New Station Request");
        buttonNewReq.setToolTipText("");
        buttonNewReq.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        buttonNewReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNewReqActionPerformed(evt);
            }
        });

        buttonMainReq.setBackground(new java.awt.Color(128, 172, 216));
        buttonMainReq.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonMainReq.setForeground(new java.awt.Color(255, 255, 255));
        buttonMainReq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/Maintain.png"))); // NOI18N
        buttonMainReq.setText("User Maintenance Request");
        buttonMainReq.setToolTipText("");
        buttonMainReq.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        buttonMainReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMainReqActionPerformed(evt);
            }
        });

        buttonApprovedNewStation.setBackground(new java.awt.Color(128, 172, 216));
        buttonApprovedNewStation.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonApprovedNewStation.setForeground(new java.awt.Color(255, 255, 255));
        buttonApprovedNewStation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/newStation.png"))); // NOI18N
        buttonApprovedNewStation.setText("Approv. Station Request");
        buttonApprovedNewStation.setToolTipText("");
        buttonApprovedNewStation.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        buttonApprovedNewStation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonApprovedNewStationActionPerformed(evt);
            }
        });

        valueLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(255, 255, 255));
        valueLabel.setText("<value>");

        buttonApprovedMaintenance.setBackground(new java.awt.Color(128, 172, 216));
        buttonApprovedMaintenance.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonApprovedMaintenance.setForeground(new java.awt.Color(255, 255, 255));
        buttonApprovedMaintenance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/Maintain.png"))); // NOI18N
        buttonApprovedMaintenance.setText("Approv. Maintenance Request");
        buttonApprovedMaintenance.setToolTipText("");
        buttonApprovedMaintenance.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        buttonApprovedMaintenance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonApprovedMaintenanceActionPerformed(evt);
            }
        });

        valueLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        valueLabel1.setForeground(new java.awt.Color(255, 255, 255));
        valueLabel1.setText("Enterprise:");

        buttonApprovedMaintenance1.setBackground(new java.awt.Color(128, 172, 216));
        buttonApprovedMaintenance1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonApprovedMaintenance1.setForeground(new java.awt.Color(255, 255, 255));
        buttonApprovedMaintenance1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/anaIcon.png"))); // NOI18N
        buttonApprovedMaintenance1.setText("Analytics");
        buttonApprovedMaintenance1.setToolTipText("");
        buttonApprovedMaintenance1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        buttonApprovedMaintenance1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonApprovedMaintenance1ActionPerformed(evt);
            }
        });

        healthChartPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(valueLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(buttonMainReq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonApprovedNewStation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonNewReq, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buttonApprovedMaintenance, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonApprovedMaintenance1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(healthChartPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonNewReq, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonMainReq, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonApprovedNewStation, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonApprovedMaintenance, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonApprovedMaintenance1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(healthChartPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSplitPane1.setLeftComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonNewReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNewReqActionPerformed
        compAnalyticsWorkArea.removeAll();
        CompAnalyticsProcessNewRequest panel = new CompAnalyticsProcessNewRequest(compAnalyticsWorkArea, enterprise.getOrganizationDirectory(), locationReqList, account, org);
        compAnalyticsWorkArea.add("ViewUserNewLocationReq", panel);
        CardLayout layout = (CardLayout) compAnalyticsWorkArea.getLayout();
        layout.next(compAnalyticsWorkArea);
    }//GEN-LAST:event_buttonNewReqActionPerformed

    private void buttonMainReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMainReqActionPerformed
        // TODO add your handling code here:
        compAnalyticsWorkArea.removeAll();
        CompAnalyticsProcessMaintenRequest panel = new CompAnalyticsProcessMaintenRequest(compAnalyticsWorkArea, enterprise.getOrganizationDirectory(), maintenanceReqList, account, org, network);
        compAnalyticsWorkArea.add("ViewUserMaintenanceReq", panel);
        CardLayout layout = (CardLayout) compAnalyticsWorkArea.getLayout();
        layout.next(compAnalyticsWorkArea);
    }//GEN-LAST:event_buttonMainReqActionPerformed

    private void buttonApprovedNewStationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonApprovedNewStationActionPerformed
        // TODO add your handling code here:
        compAnalyticsWorkArea.removeAll();
        CompAnalyticsApprovedNewStationRequests panel = new CompAnalyticsApprovedNewStationRequests(compAnalyticsWorkArea, enterprise.getOrganizationDirectory(), account, org);
        compAnalyticsWorkArea.add("ManageApprovedNewLocationReq", panel);
        CardLayout layout = (CardLayout) compAnalyticsWorkArea.getLayout();
        layout.next(compAnalyticsWorkArea);
    }//GEN-LAST:event_buttonApprovedNewStationActionPerformed

    private void buttonApprovedMaintenanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonApprovedMaintenanceActionPerformed
        // TODO add your handling code here:
        compAnalyticsWorkArea.removeAll();
        CompAnalyticsApprovedMaintenanceRequests panel = new CompAnalyticsApprovedMaintenanceRequests(compAnalyticsWorkArea, enterprise.getOrganizationDirectory(), account, org);
        compAnalyticsWorkArea.add("ManageApprovedNewLocationReq", panel);
        CardLayout layout = (CardLayout) compAnalyticsWorkArea.getLayout();
        layout.next(compAnalyticsWorkArea);
    }//GEN-LAST:event_buttonApprovedMaintenanceActionPerformed

    private void buttonApprovedMaintenance1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonApprovedMaintenance1ActionPerformed
        // TODO add your handling code here:
        compAnalyticsWorkArea.removeAll();
        AnalyticsCharts panel = new AnalyticsCharts(compAnalyticsWorkArea, system, account, org);
        compAnalyticsWorkArea.add("ManageApprovedNewLocationReq", panel);
        CardLayout layout = (CardLayout) compAnalyticsWorkArea.getLayout();
        layout.next(compAnalyticsWorkArea);
    }//GEN-LAST:event_buttonApprovedMaintenance1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonApprovedMaintenance;
    private javax.swing.JButton buttonApprovedMaintenance1;
    private javax.swing.JButton buttonApprovedNewStation;
    private javax.swing.JButton buttonMainReq;
    private javax.swing.JButton buttonNewReq;
    private javax.swing.JPanel compAnalyticsWorkArea;
    private javax.swing.JPanel healthChartPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JLabel valueLabel1;
    // End of variables declaration//GEN-END:variables

    private void DisplayChart() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        int brokenCount =0;
        int healthyCount = 0;
        for (ChargingStation r : system.getStationmap().getMap()) {
            for(ChargingPile p : r.getPileList()){
                if(p.isIsBroken()){
                    brokenCount++;
                   dataset.setValue("BROKEN", brokenCount);
                }
                else{
                    healthyCount++;
                    dataset.setValue("HEALTHY", healthyCount);
                }
            }    
           }
        JFreeChart chart = ChartFactory.createPieChart3D(
                "Charging Pile Status", // chart title                   
                dataset, // data 
                true, // include legend                   
                false,
                false);
        // set chart properties
        final PiePlot3D plot = (PiePlot3D) chart.getPlot();
        PieSectionLabelGenerator gen = new StandardPieSectionLabelGenerator(
            "{1} Piles ({2})", new DecimalFormat("0"), new DecimalFormat("0%"));
        
        for (int i = 0; i < dataset.getItemCount(); i++) {
            if(dataset.getKey(i).equals("HEALTHY")){ 
                plot.setSectionPaint(i, Color.GREEN);
            }
            if(dataset.getKey(i).equals("BROKEN")){ 
                plot.setSectionPaint(i, Color.RED);
            }
        }
        
        plot.setLabelGenerator(gen);
        plot.setStartAngle(270);
        plot.setForegroundAlpha(0.60f);
        plot.setInteriorGap(0.02);
        ChartPanel chartPanel = new ChartPanel(chart);
        healthChartPanel.removeAll();        // clear panel before add new chart
        healthChartPanel.add(chartPanel);
        healthChartPanel.setVisible(true);
        healthChartPanel.validate();         // refresh panel to display new chart
    }
    
}
