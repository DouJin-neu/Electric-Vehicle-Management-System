/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Contractor;

import Business.Organization.Organization;
import Business.Role.Contractor.MaintenanceRole;
import Business.Role.Role;
import Business.WorkQueue.ContractorRepairWorkQueue;
import java.util.ArrayList;

/**
 *
 * @author jindou
 */
public class MaintenanceOrganization extends Organization{

    private ContractorRepairWorkQueue contractorRepairWorkQueue;
    
    public MaintenanceOrganization() {
        super(Organization.Type.ContractorMaintenance.getValue());
        contractorRepairWorkQueue = new ContractorRepairWorkQueue();
    }

   @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new MaintenanceRole());
        return roles;
    }

    public ContractorRepairWorkQueue getContractorRepairWorkQueue() {
        return contractorRepairWorkQueue;
    }
    
    
}
