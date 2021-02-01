/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Company;

import Business.Organization.Organization;
import Business.Role.Company.CompanyExecutiveRole;
import Business.WorkQueue.ExecutiveImplementationWorkQueue;
import Business.WorkQueue.ExecutiveMaintenanceWorkQueue;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class ExecutiveOrganization extends Organization{

    private ExecutiveImplementationWorkQueue executiveImplementationWorkQueue;
    private ExecutiveMaintenanceWorkQueue executiveMaintenanceWorkQueue;
    
    public ExecutiveOrganization() {
        super(Organization.Type.CompanyExecutive.getValue());
        executiveImplementationWorkQueue = new ExecutiveImplementationWorkQueue();
        executiveMaintenanceWorkQueue = new ExecutiveMaintenanceWorkQueue();
    }
    
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CompanyExecutiveRole());
        return roles;
    }

    public ExecutiveImplementationWorkQueue getExecutiveImplementationWorkQueue() {
        return executiveImplementationWorkQueue;
    }

    public ExecutiveMaintenanceWorkQueue getExecutiveMaintenanceWorkQueue() {
        return executiveMaintenanceWorkQueue;
    }
    
    

     
}