/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role.Contractor;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Contractor.MaintenanceOrganization;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.Contractor.MaintainenceRole.MaintainenceWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class MaintenanceRole extends Role {

//    @Override
//    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
//        return new LabAssistantWorkAreaJPanel(userProcessContainer, account, organization, business);
//    }

    @Override
   public JPanel createWorkArea(JPanel userProcessContainer,
            UserAccount account, Organization organization,
            Enterprise enterprise, EcoSystem business, Network network) {
        return new MaintainenceWorkAreaJPanel(userProcessContainer,business, enterprise,account,organization,network );
    }
    
    
}
