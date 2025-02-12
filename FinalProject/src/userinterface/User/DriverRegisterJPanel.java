/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.User;

import Business.EcoSystem;
import Business.Enterprise.EVDriver;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.EVDriverOrganization;
import Business.Organization.Organization;
import Business.Role.EVDriverRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

/**
 *
 * @author adam
 */
public class DriverRegisterJPanel extends javax.swing.JPanel
{

    JPanel userProcessContainer;
    EcoSystem system;

    public DriverRegisterJPanel (JPanel userProcessContainer, EcoSystem system)
    {
        
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system;  
        populateComboBox();
    }
    
    private void populateComboBox(){
        comboRegion.removeAllItems();
        for(Network network : system.getNetworkList() ){
            comboRegion.addItem(network.toString());
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel2 = new javax.swing.JLabel();
        comboRegion = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1150, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Please select the Network");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        add(comboRegion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 240, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("Register As An EV Driver ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 310, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Name");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, 20));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 240, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Username");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, -1, 20));
        add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 240, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Password");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, -1, 20));
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 240, 40));

        jButton2.setBackground(new java.awt.Color(0, 153, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Sign Up");
        jButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 240, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Contact");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, -1, 20));
        add(txtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 240, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/evDriverBG.png"))); // NOI18N
        jLabel6.setText(" ");
        jLabel6.setPreferredSize(new java.awt.Dimension(1150, 600));
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1010, 580));
    }// </editor-fold>//GEN-END:initComponents
    public  boolean patternCorrect(String input){
        Pattern p = Pattern.compile("^[a-zA-Z0-9 ]+$");
        Matcher m = p.matcher(input);
        boolean b = m.matches();
        return b;
    }
    public Boolean userUnique(String username){
         
          for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount ua : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    if (ua.getUsername().equalsIgnoreCase(txtUsername.getText())) {
                        return false;
                    }
                }
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                        if (ua.getUsername().equalsIgnoreCase(txtUsername.getText())) {
                            return false;
                        }
                    }
                }
            }
          }
          return true;
        
     }
    public  boolean passwordCorrect(String input){
        Pattern p = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=\\S+$).{4,20}$");
        Matcher m = p.matcher(input);
        boolean b = m.matches();
        return b;
    }
        
        public  boolean digitalCorrect(String input){
        Pattern p = Pattern.compile("^[0-9]+(.[0-9]{2})?$");
        Matcher m = p.matcher(input);
        boolean b = m.matches();
        return b;
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton2ActionPerformed
    {//GEN-HEADEREND:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String network = (String)comboRegion.getSelectedItem();
        boolean flag=false;
        flag=patternCorrect(txtName.getText());
        if (!flag){
            txtName.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtName.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, "Name format not acceptable!!", "Warning", JOptionPane.WARNING_MESSAGE);
            txtName.setBorder(new JTextField().getBorder());
            txtName.setForeground(Color.BLACK);
            
            return;
        }
        String name = txtName.getText();
        flag=patternCorrect(txtUsername.getText());
        
        if (!flag){
            txtUsername.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtUsername.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, "Username format not acceptable!!", "Warning", JOptionPane.WARNING_MESSAGE);
            txtUsername.setBorder(new JTextField().getBorder());
            txtUsername.setForeground(Color.BLACK);
            return;
        }
        String username = txtUsername.getText();
        boolean unique = userUnique(username);
        if (!unique){
            txtUsername.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtUsername.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, "Username Already Exist!!", "Warning", JOptionPane.WARNING_MESSAGE);
            txtUsername.setBorder(new JTextField().getBorder());
            txtUsername.setForeground(Color.BLACK);
            return;
        }
        flag=passwordCorrect(txtPassword.getText());
        if (!flag){
            txtPassword.setBorder(BorderFactory.createLineBorder(Color.RED));
            txtPassword.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, "Password should contain at least 4 characters and one number, one alphabet!!", "Warning", JOptionPane.WARNING_MESSAGE);
            txtPassword.setBorder(new JTextField().getBorder());
            txtPassword.setForeground(Color.BLACK);
            return;
        }
        String password = txtPassword.getText();
        Enterprise driveEnterprise=null;
        for (Network net: system.getNetworkList()){
            //find the selected network.
            if (net.toString().equals(network)){
                for (Enterprise e:net.getEnterpriseDirectory().getEnterpriseList()){
//                    System.out.println(e.getName());
                    if (e.getName().equals("EVDriver")){
                        driveEnterprise=e;
                    }
                }
                if (driveEnterprise==null){
                    JOptionPane.showMessageDialog(null, "There is no such an enterprise!!", "Warning", JOptionPane.WARNING_MESSAGE);
                }else{
//                    for (Organization evo : driveEnterprise.getOrganizationDirectory().getOrganizationList()){
//                        System.out.println(evo.toString());
//                    }
                    txtName.setText("");
                    txtUsername.setText("");
                    txtPassword.setText("");
                    txtContact.setText("");
                    
                    
                    
                    EVDriverOrganization driveOrganization = (EVDriverOrganization)driveEnterprise.getOrganizationDirectory().getOrganizationList().get(0);
                    driveOrganization.getUserAccountDirectory().createUserAccount(username, password,name, new EVDriverRole());
                    JOptionPane.showMessageDialog(null, "Success!!", "Message", JOptionPane.INFORMATION_MESSAGE);
                }
                
                
            
            
            }
        
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboRegion;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
