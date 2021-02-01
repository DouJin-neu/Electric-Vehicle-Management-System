/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Company;

import Business.Organization.Organization;
import Business.Role.Company.CompanyTendererRole;
import Business.Role.Contractor.ContractorAdminRole;
import Business.Role.Role;
import Business.WorkQueue.ContractorTenderWorkQueue;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class ComTedererOrganization extends Organization{

     private ContractorTenderWorkQueue contractorTenderWorkQueue;
    public ComTedererOrganization() {
        super(Type.CompanyTenderer.getValue());
        contractorTenderWorkQueue = new ContractorTenderWorkQueue();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CompanyTendererRole());
        return roles;
    }
    public ContractorTenderWorkQueue getContractorTenderWorkQueue() {
        return contractorTenderWorkQueue;
    }
     
}
