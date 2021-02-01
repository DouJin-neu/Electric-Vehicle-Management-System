/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Contractor;


import Business.Organization.*;
import Business.Role.Contractor.ContractorAdminRole;

import Business.Role.Role;
import Business.WorkQueue.CandidateWorkQueue;
import Business.WorkQueue.ContractorImplementationWorkQueue;
import Business.WorkRequest.ContractorImplementRequest;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class ContractorAdminOrganization extends Organization{
 
     private CandidateWorkQueue candidateWorkQueue;
     private ContractorImplementationWorkQueue contractorImplementationWorkQueue;
    public ContractorAdminOrganization() {
        super(Type.ContractorAdmin.getValue());
        candidateWorkQueue = new CandidateWorkQueue();
        contractorImplementationWorkQueue = new ContractorImplementationWorkQueue();
    }
   
    
   @Override
    public ArrayList<Role> getSupportedRole() {
      ArrayList<Role> roles = new ArrayList();
      roles.add(new ContractorAdminRole());
       return roles;
    }

    public CandidateWorkQueue getCandidateWorkQueue() {
        return candidateWorkQueue;
    }

    public ContractorImplementationWorkQueue getContractorImplementationWorkQueue() {
        return contractorImplementationWorkQueue;
    }
    

}
