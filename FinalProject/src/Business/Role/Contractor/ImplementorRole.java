/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role.Contractor;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Contractor.ImplementorOrganization;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.Contractor.ImplementorRole.ImplementorWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class ImplementorRole extends Role{

//    @Override
//    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
//        return new DoctorWorkAreaJPanel(userProcessContainer, account, (ExecutiveOrganization)organization, enterprise);
//    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,
            UserAccount account, Organization organization,
            Enterprise enterprise, EcoSystem business, Network network) {
        return new ImplementorWorkAreaJPanel(userProcessContainer,business, enterprise,account,organization,network );
    }
   
    
}
