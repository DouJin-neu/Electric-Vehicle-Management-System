/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.CandidateOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.Candidate.JobSearchStatusJPanel;
import userinterface.Contractor.AdminRole.AdminWorkAreaJPanel;

/**
 *
 * @author jindou
 */
public class CandidateRole extends Role{

//    @Override
//    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
//        return new JobSearchStatusJPanel(userProcessContainer, account,(CandidateOrganization)organization,business);
//    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,
            UserAccount account, Organization organization,
            Enterprise enterprise, EcoSystem business, Network network) {
        return new JobSearchStatusJPanel(userProcessContainer, account,(CandidateOrganization)organization,business);
    }
    
    
}
