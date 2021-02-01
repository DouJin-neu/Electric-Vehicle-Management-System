/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role.Contractor;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Contractor.ContractorTedererOrganization;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.Contractor.AdminRole.AdminWorkAreaJPanel;
import userinterface.Contractor.Tenderer.ContTendererWorkJPanel;

/**
 *
 * @author jindou
 */
public class ContractorTendererRole extends Role{

//    @Override
//    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
//        return new AdminWorkAreaJPanel(userProcessContainer, enterprise);
//    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,
            UserAccount account, Organization organization,
            Enterprise enterprise, EcoSystem business, Network network) {
         return new ContTendererWorkJPanel(userProcessContainer, account,enterprise,network,business,(ContractorTedererOrganization) organization);
    }
    
    
}
