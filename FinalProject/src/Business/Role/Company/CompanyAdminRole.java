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
import userinterface.Contractor.AdminRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;
import userinterface.Company.Admin.CompAdminWorkAreaJPanel;
/**
 *
 * @author jindou
 */
public class CompanyAdminRole extends Role{

//    @Override
//    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
//        return new CompAdminWorkAreaJPanel(userProcessContainer, enterprise, business);
//    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,
            UserAccount account, Organization organization,
            Enterprise enterprise, EcoSystem business, Network network) {
         return new CompAdminWorkAreaJPanel(userProcessContainer, enterprise, business, network);
    }
    
    
    
}
