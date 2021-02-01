/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Contractor;

import Business.Organization.Organization;
import Business.Implementor.ImplementorDirectory;
import Business.Role.Contractor.ImplementorRole;
import Business.Role.Role;
import Business.WorkQueue.ContractorImplementationWorkQueue;
import java.util.ArrayList;

/**
 *
 * @author jindou
 */
public class ImplementorOrganization extends Organization{
    
    private ImplementorDirectory implementorDirectory;
     private ContractorImplementationWorkQueue contractorImplementationWorkQueue;
     
    public ImplementorOrganization() {
        super(Organization.Type.ContractorImplementor.getValue());
        contractorImplementationWorkQueue = new ContractorImplementationWorkQueue();
    }

   @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ImplementorRole());
        return roles;
    }

    public ImplementorDirectory getImplementorDirectory() {
        return implementorDirectory;
    }
     public ContractorImplementationWorkQueue getContractorImplementationWorkQueue() {
        return contractorImplementationWorkQueue;
    }
    
    
}
