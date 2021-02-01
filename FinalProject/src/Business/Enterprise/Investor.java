/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.InvestorOrganization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author jindou
 */
public class Investor extends Enterprise{

    public Investor(String name) {
        super(name,EnterpriseType.Investor);
        InvestorOrganization io = new InvestorOrganization();
        this.getOrganizationDirectory().getOrganizationList().add(io);
    }
    
     @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
