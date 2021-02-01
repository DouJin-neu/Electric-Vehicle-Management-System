/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.WorkQueue.DriverNewLocationWorkQueue;
import Business.WorkQueue.DriverMaintenanceWorkQueue;
import Business.Role.EVDriverRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author jindou
 */
public class EVDriverOrganization extends Organization{

    private DriverNewLocationWorkQueue driverNewLocationWorkQueue;
    private DriverMaintenanceWorkQueue driverMaintenanceWorkQueue;
    
    public EVDriverOrganization() {
        super(Organization.Type.EVDriver.getValue());
        driverNewLocationWorkQueue= new DriverNewLocationWorkQueue();
        driverMaintenanceWorkQueue  = new DriverMaintenanceWorkQueue();
    }

   @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new EVDriverRole());
        return roles;
    }

    public DriverNewLocationWorkQueue getDriverNewLocationWorkQueue() {
        return driverNewLocationWorkQueue;
    }

    public DriverMaintenanceWorkQueue getDriverMaintenanceWorkQueue() {
        return driverMaintenanceWorkQueue;
    }
    
    
}
