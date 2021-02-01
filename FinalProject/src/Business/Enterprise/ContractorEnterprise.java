/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author jindou
 */
public class ContractorEnterprise extends Enterprise {

    public ContractorEnterprise(String name) {
        super(name,EnterpriseType.ContractorEnterprise);
    }
    
    
     @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
