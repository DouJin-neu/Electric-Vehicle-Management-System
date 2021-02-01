/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.Contractor.AdminRole.AdminWorkAreaJPanel;
import userinterface.Investor.InvestRequestJPanel;
import userinterface.Investor.InvestWorkAreaJPanel;

/**
 *
 * @author jindou
 */
public class InvestorRole extends Role{

//    @Override
//    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
//        return new InvestorWorkArea(userProcessContainer, business,account, organization);
//    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,
            UserAccount account, Organization organization,
            Enterprise enterprise, EcoSystem business, Network network) {
         return new InvestWorkAreaJPanel(userProcessContainer, business,account, organization);
    }
    
}
