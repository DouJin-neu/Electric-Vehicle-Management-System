/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role.Company;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.Company.Analytics.CompAnalyticsWorkArea;
import userinterface.Contractor.AdminRole.AdminWorkAreaJPanel;

/**
 *
 * @author jindou
 */
public class CompanyAnalyticsRole extends Role{

//    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
//        return new CompAnalyticsWorkArea(userProcessContainer, business, enterprise, account, organization);
//    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,
            UserAccount account, Organization organization,
            Enterprise enterprise, EcoSystem business, Network network) {
         return new CompAnalyticsWorkArea(userProcessContainer, business, enterprise, account, organization, network);
    }
    
    
    
}
