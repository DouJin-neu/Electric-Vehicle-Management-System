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
import userinterface.Company.Tenderee.CompTendereeWorkArea;
import userinterface.Contractor.AdminRole.AdminWorkAreaJPanel;

/**
 *
 * @author jindou
 */
public class CompanyTendererRole extends Role{

//    @Override
//    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
//        return new CompTendereeWorkArea(userProcessContainer, enterprise);
//    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,
            UserAccount account, Organization organization,
            Enterprise enterprise, EcoSystem business, Network network) {
        return new CompTendereeWorkArea(userProcessContainer,account, enterprise,network,business);
    }
    
    
}
