/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Company;

import Business.Organization.Organization;
import Business.Role.Company.CompanyAnalyticsRole;
import Business.Role.Contractor.MaintenanceRole;
import Business.Role.Role;
import Business.WorkQueue.AnalyticsMaintenanceWorkQueue;
import Business.WorkQueue.AnalyticsNewStationWorkQueue;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class AnalyticsOrganization extends Organization{
    private AnalyticsMaintenanceWorkQueue analyticsMaintenanceWorkQueue;
    private AnalyticsNewStationWorkQueue analyticsNewStationWorkQueue;
    
    public AnalyticsOrganization() {
        super(Organization.Type.CompanyAnalytics.getValue());
        analyticsMaintenanceWorkQueue = new AnalyticsMaintenanceWorkQueue();
        analyticsNewStationWorkQueue = new AnalyticsNewStationWorkQueue();
    }
   
    

   @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CompanyAnalyticsRole());
        return roles;
    }

    public AnalyticsMaintenanceWorkQueue getAnalyticsMaintenanceWorkQueue() {
        return analyticsMaintenanceWorkQueue;
    }

    public AnalyticsNewStationWorkQueue getAnalyticsNewStationWorkQueue() {
        return analyticsNewStationWorkQueue;
    }
    
    
    
    

    

     
   
    
    
}
