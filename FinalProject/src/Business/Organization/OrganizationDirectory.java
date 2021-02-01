/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Company.ComAdminOrganization;
import Business.Organization.Company.AnalyticsOrganization;
import Business.Organization.Company.ExecutiveOrganization;
import Business.Organization.Company.ComTedererOrganization;
import Business.Organization.Contractor.ContractorAdminOrganization;
import Business.Organization.Contractor.ImplementorOrganization;
import Business.Organization.Contractor.MaintenanceOrganization;
import Business.Organization.Contractor.ContractorTedererOrganization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type,String name){
        Organization organization = null;
        if (type.getValue().equals(Type.CompanyAdmin.getValue())){
            organization = new ComAdminOrganization();
            organization.setType(type);
            organization.setName(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.CompanyAnalytics.getValue())){
            organization = new AnalyticsOrganization();
            organization.setType(type);
            organization.setName(name);
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.CompanyTenderer.getValue())){
            organization = new ComTedererOrganization();
            organization.setType(type);
            organization.setName(name);
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.CompanyExecutive.getValue())){
            organization = new ExecutiveOrganization();
            organization.setType(type);
            organization.setName(name);
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.ContractorAdmin.getValue())){
            organization = new ContractorAdminOrganization();
            organization.setType(type);
            organization.setName(name);
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.ContractorImplementor.getValue())){
            organization = new ImplementorOrganization();
            organization.setType(type);
            organization.setName(name);
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.ContractorMaintenance.getValue())){
            organization = new MaintenanceOrganization();
            organization.setType(type);
            organization.setName(name);
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.ContractorTenderer.getValue())){
            organization = new ContractorTedererOrganization();
            organization.setType(type);
            organization.setName(name);
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Candidate.getValue())){
            organization = new CandidateOrganization();
            organization.setType(type);
            organization.setName(name);
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Investor.getValue())){
            organization = new InvestorOrganization();
            organization.setType(type);
            organization.setName(name);
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.EVDriver.getValue())){
            organization = new EVDriverOrganization();
            organization.setType(type);
            organization.setName(name);
            organizationList.add(organization);
        }
        return organization;
    }
    
    public void deleteOrganization(Organization organization){
        organizationList.remove(organization);
    }
}