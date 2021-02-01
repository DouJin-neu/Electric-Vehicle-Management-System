/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.WorkQueue.InverstmentWorkQueue;
import Business.Role.InvestorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author jindou
 */
public class InvestorOrganization extends Organization{

    private InverstmentWorkQueue inverstmentWorkQueue;
    public InvestorOrganization() {
        super(Organization.Type.Investor.getValue());
        inverstmentWorkQueue= new InverstmentWorkQueue();
    }

   @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new InvestorRole());
        return roles;
    }

    public InverstmentWorkQueue getInverstmentWorkQueue() {
        return inverstmentWorkQueue;
    }
    
    
}
