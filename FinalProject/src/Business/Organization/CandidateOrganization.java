/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization;
import Business.Organization.Organization;
import Business.Organization.Organization;
import Business.Role.CandidateRole;
import Business.Role.Role;
import java.util.ArrayList;
import Business.WorkQueue.CandidateWorkQueue;

/**
 *
 * @author jindou
 */
public class CandidateOrganization extends Organization{

    public CandidateOrganization() {
        super(Organization.Type.Candidate.getValue());
    }
    private CandidateWorkQueue candidateWorkQueue;

   @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CandidateRole());
        return roles;
    }

    public CandidateWorkQueue getCandidateWorkQueue() {
        return candidateWorkQueue;
    }
    
    
}
