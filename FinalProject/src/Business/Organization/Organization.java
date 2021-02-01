/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

//import Business.Employee.EmployeeDirectory;
import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.StationMap.StationMap;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=0;
    private Type type;
    private StationMap stationmap;
    
    public enum Type{
        //Company
        CompanyAdmin("Company Admin Organization"), 
        CompanyTenderer("Company Tenderer Organization"),
        CompanyAnalytics("Company Analytics Organization"),
        CompanyExecutive("Company Executive Organization"),
        
        //Contractor 
        //people apply for jobs for Contractor
        Candidate("Candidate Organization"),
        ContractorAdmin("Contractor Admin Organization"), 
        ContractorTenderer("Contractor Tenderer Organization"),
        ContractorMaintenance("Contractor Maintenance Organization"),
        ContractorImplementor("Contractor Implementor Organization"),
        
        //Driver
        EVDriver("EVDriver Organization"),
        
        //Investor
        Investor("Investor Organization");
        
       
       
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        this.type = type;
        this.stationmap=new StationMap();
        ++counter;
    }

    public StationMap getStationmap ()
    {
        return stationmap;
    }

    public void setStationmap (StationMap stationmap)
    {
        this.stationmap = stationmap;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
   }
  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public WorkQueue getWorkQueue() {
        return workQueue;
    }
    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    

    @Override
    public String toString() {
        return name;
    }
    
    
}
