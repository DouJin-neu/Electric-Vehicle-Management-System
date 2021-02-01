/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.EVDriverOrganization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author jindou
 */
public class EVDriver extends Enterprise{

    public EVDriver(String name) {
        super(name,EnterpriseType.EVDriver);
        EVDriverOrganization evd = new EVDriverOrganization();
        this.getOrganizationDirectory().getOrganizationList().add(evd);
    }
     @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
