/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role.Contractor;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import userinterface.Contractor.AdminRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class ContractorAdminRole extends Role{

//    @Override
//    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
//        return new AdminWorkAreaJPanel(userProcessContainer, enterprise);
//    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,
            UserAccount account, Organization organization,
            Enterprise enterprise, EcoSystem business, Network network) {
        return new AdminWorkAreaJPanel(userProcessContainer,business, enterprise,account,organization,network);
    }
   

    
    
}
