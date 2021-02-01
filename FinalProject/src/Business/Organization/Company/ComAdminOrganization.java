/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Company;

import Business.Organization.*;
import Business.Role.Company.CompanyAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class ComAdminOrganization extends Organization{

    public ComAdminOrganization() {
        super(Type.CompanyAdmin.getValue());
    }
    
   @Override
    public ArrayList<Role> getSupportedRole() {
      ArrayList<Role> roles = new ArrayList();
      roles.add(new CompanyAdminRole());
       return roles;
    }
     
}
