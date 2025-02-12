/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Company.Analytics;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Company.AnalyticsOrganization;
import Business.StationMap.ChargingPile;
import Business.StationMap.ChargingStation;
import Business.UserAccount.UserAccount;
import java.awt.Color;
import java.text.DecimalFormat;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author shaohanghu
 */
public class AnalyticsCharts extends javax.swing.JPanel {

    /**
     * Creates new form AnalyticsCharts
     */
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount account; 
    AnalyticsOrganization org;
    
    public AnalyticsCharts(JPanel compAnalyticsWorkArea, EcoSystem system,
            UserAccount account, AnalyticsOrganization org) {
        initComponents();
        this.userProcessContainer = compAnalyticsWorkArea;
        this.system = system;
        this.account = account;
        DisplayPieChart();
        DisplayBarChart();
//        DisplayBarChart1();
//        DisplayBarChart2();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PiejPanel = new javax.swing.JPanel();
        BarJPanel = new javax.swing.JPanel();
        buttonViewUsage = new javax.swing.JButton();
        buttonViewUsage1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        PiejPanel.setLayout(new java.awt.BorderLayout());

        BarJPanel.setLayout(new java.awt.BorderLayout());

        buttonViewUsage.setText("View Usage Analytics");
        buttonViewUsage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonViewUsageActionPerformed(evt);
            }
        });

        buttonViewUsage1.setText("View General Analytics");
        buttonViewUsage1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonViewUsage1ActionPerformed(evt);
            }
        });

        jButton1.setText("Performace In Network");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BarJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PiejPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonViewUsage1)
                        .addGap(18, 18, 18)
                        .addComponent(buttonViewUsage)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PiejPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(BarJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonViewUsage1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonViewUsage, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonViewUsageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonViewUsageActionPerformed
        // TODO add your handling code here:
        DisplayBarChart1();
        DisplayBarChart2();
    }//GEN-LAST:event_buttonViewUsageActionPerformed

    private void buttonViewUsage1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonViewUsage1ActionPerformed
        // TODO add your handling code here:
        DisplayPieChart();
        DisplayBarChart();
    }//GEN-LAST:event_buttonViewUsage1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DisplayPieChart2();
        //DisplayPieByNetwork();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarJPanel;
    private javax.swing.JPanel PiejPanel;
    private javax.swing.JButton buttonViewUsage;
    private javax.swing.JButton buttonViewUsage1;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables

    private void DisplayPieChart() {
        DefaultPieDataset dataset = new DefaultPieDataset();

        for (ChargingStation r : system.getStationmap().getMap()) {
               dataset.setValue(r.getName(), r.getPileList().size());
           }
        // create pir chart
        JFreeChart chart = ChartFactory.createPieChart3D(
                "Charging Pile Distribution", // chart title                   
                dataset, // data 
                true, // include legend                   
                true,
                false);
        // set chart properties
        final PiePlot3D plot = (PiePlot3D) chart.getPlot();
        PieSectionLabelGenerator gen = new StandardPieSectionLabelGenerator(
            "{0}: {1}Piles ({2})", new DecimalFormat("0"), new DecimalFormat("0%"));
        plot.setLabelGenerator(gen);
        plot.setStartAngle(270);
        plot.setForegroundAlpha(0.60f);
        plot.setInteriorGap(0.02);
        // create chart panel the add it to swing panel in  jframe
        ChartPanel chartPanel = new ChartPanel(chart);
        PiejPanel.removeAll();        // clear panel before add new chart
        PiejPanel.add(chartPanel);
        PiejPanel.setVisible(true);
        PiejPanel.validate();         // refresh panel to display new chart
    }

    private void DisplayBarChart() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for (ChargingStation r : system.getStationmap().getMap()) {
            int numPiles = r.getPileList().size();
            int usage = 0;
            for(ChargingPile p : r.getPileList()){
                usage += p.getUsage();
            }
            dataset.addValue(usage/numPiles, "Pile", r.getName());
           }
        JFreeChart barChart = ChartFactory.createBarChart("Average Pile Usage",
                "Charging Station", "HRs of Usage", dataset,
                PlotOrientation.VERTICAL,
                true, true, false);
        // set color
        CategoryPlot plot = (CategoryPlot) barChart.getPlot();
        plot.getRenderer().setSeriesPaint(0, Color.BLUE);
        // create chart panel the add it to swing panel in  jframe
        ChartPanel chartPanel = new ChartPanel(barChart);
        BarJPanel.removeAll();        // clear panel before add new chart
        BarJPanel.add(chartPanel);
        BarJPanel.validate();
    }

    private void DisplayBarChart1() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for (ChargingStation r : system.getStationmap().getMap()) {
            int numPiles = r.getPileList().size();
            int inUse = 0;
            int avaliable = 0;
            for(ChargingPile p : r.getPileList()){
                if(p.isIsOccupied() == true){
                    inUse ++;
                }
                else{
                    avaliable++;
                }
            }
            dataset.addValue(inUse, "In Use", r.getName());
            dataset.addValue(avaliable, "Not In Use", r.getName());
           }
        JFreeChart barChart = ChartFactory.createBarChart("Usage Now",
                "#Stations", "Number of Piles", dataset,
                PlotOrientation.VERTICAL,
                true, true, false);
        // set color
        CategoryPlot plot = (CategoryPlot) barChart.getPlot();
        plot.getRenderer().setSeriesPaint(0, Color.BLUE);
        // create chart panel the add it to swing panel in  jframe
        ChartPanel chartPanel = new ChartPanel(barChart);
        BarJPanel.removeAll();        // clear panel before add new chart
        BarJPanel.add(chartPanel);
        BarJPanel.validate();
    }

    private void DisplayBarChart2() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for (ChargingStation r : system.getStationmap().getMap()) {
            Double numPiles = Double.valueOf(r.getPileList().size());
            Double usage = 0.0;
            for(ChargingPile p : r.getPileList()){
                usage += p.getUsage();
            }
            dataset.addValue(usage/24, "Pile", r.getName());
           }
        JFreeChart barChart = ChartFactory.createBarChart("Usage Rate",
                "Charging Station", "Usage Rate", dataset,
                PlotOrientation.VERTICAL,
                true, true, false);
        // set color
        CategoryPlot plot = (CategoryPlot) barChart.getPlot();
        plot.getRenderer().setSeriesPaint(0, Color.ORANGE);
        // create chart panel the add it to swing panel in  jframe
        ChartPanel chartPanel = new ChartPanel(barChart);
        PiejPanel.removeAll();        // clear panel before add new chart
        PiejPanel.add(chartPanel);
        PiejPanel.validate();
    }

    private void DisplayPieByNetwork() {
       DefaultPieDataset dataset = new DefaultPieDataset();
 
        for (ChargingStation r : system.getStationmap().getMap()) {
               dataset.setValue(r.getName(), r.getPileList().size());
           }
        // create pir chart
        JFreeChart chart = ChartFactory.createPieChart3D(
                "Charging Pile Distribution", // chart title                   
                dataset, // data 
                true, // include legend                   
                true,
                false);
        // set chart properties
        final PiePlot3D plot = (PiePlot3D) chart.getPlot();
        PieSectionLabelGenerator gen = new StandardPieSectionLabelGenerator(
            "{0}: {1}Piles ({2})", new DecimalFormat("0"), new DecimalFormat("0%"));
        plot.setLabelGenerator(gen);
        plot.setStartAngle(270);
        plot.setForegroundAlpha(0.60f);
        plot.setInteriorGap(0.02);
        // create chart panel the add it to swing panel in  jframe
        ChartPanel chartPanel = new ChartPanel(chart);
        PiejPanel.removeAll();        // clear panel before add new chart
        PiejPanel.add(chartPanel);
        PiejPanel.setVisible(true);
        PiejPanel.validate(); 
    }

    private void DisplayPieChart2() {
        DefaultPieDataset dataset = new DefaultPieDataset();
//        int NetworkAmount = system.getNetworkList().size();
        
        for (ChargingStation r : system.getStationmap().getMap()) {
               dataset.setValue(r.getNetwork().getName(), r.getPileList().size());
           }
        // create pir chart
        JFreeChart chart = ChartFactory.createPieChart3D(
                "Charging Pile Distribution", // chart title                   
                dataset, // data 
                true, // include legend                   
                true,
                false);
        // set chart properties
        final PiePlot3D plot = (PiePlot3D) chart.getPlot();
        PieSectionLabelGenerator gen = new StandardPieSectionLabelGenerator(
            "{0}: {1}Piles ({2})", new DecimalFormat("0"), new DecimalFormat("0%"));
        plot.setLabelGenerator(null);
        plot.setStartAngle(270);
        plot.setForegroundAlpha(0.60f);
        plot.setInteriorGap(0.02);
        // create chart panel the add it to swing panel in  jframe
        ChartPanel chartPanel = new ChartPanel(chart);
        PiejPanel.removeAll();        // clear panel before add new chart
        PiejPanel.add(chartPanel);
        PiejPanel.setVisible(true);
        PiejPanel.validate();   
    }
}
