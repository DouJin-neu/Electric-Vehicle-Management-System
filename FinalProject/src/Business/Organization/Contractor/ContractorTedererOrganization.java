/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Contractor;

import Business.Organization.Organization;
import Business.Role.Contractor.ContractorTendererRole;
import Business.WorkQueue.ContractorTenderWorkQueue;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 * 
 */
public class ContractorTedererOrganization extends Organization{

    private ContractorTenderWorkQueue contractorTenderWorkQueue;
    
    public ContractorTedererOrganization() {
        super(Type.ContractorTenderer.getValue());
        contractorTenderWorkQueue = new ContractorTenderWorkQueue();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ContractorTendererRole());
        return roles;
    }
    
     public ContractorTenderWorkQueue getContractorTenderWorkQueue() {
        return contractorTenderWorkQueue;
    }
}
