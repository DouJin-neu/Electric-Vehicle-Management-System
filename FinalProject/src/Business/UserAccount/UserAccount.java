/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

//import Business.Employee.Employee;
import Business.Employee.Employee;
import Business.Role.Role;
import Business.StationMap.Coordinate;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author raunak
 */
public class UserAccount {
    
    private String username;
    private String password;
    private Role role;
    private WorkQueue workQueue;
    private Coordinate coordinate;
    private String accountNumber;
    private String investLevel;
    private String name;
    private String emailAdress;
    private Boolean isWorking;

    public String getEmailAdress ()
    {
        return emailAdress;
    }

    public void setEmailAdress (String emailAdress)
    {
        this.emailAdress = emailAdress;
    }
    private int id;
    private static int count = 1;

    public UserAccount() {
        workQueue = new WorkQueue();
        count++;
        id = count;
        coordinate= new Coordinate();
    }

    
           public String getAccountNumber ()
    {
        return accountNumber;
    }

    public void setAccountNumber (String accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public String getInvestLevel ()
    {
        return investLevel;
    }

    public void setInvestLevel (String investLevel)
    {
        this.investLevel = investLevel;
    }
    public Coordinate getCoordinate ()
    {
        return coordinate;
    }

    public void setCoordinate (Coordinate coordinate)
    {
        this.coordinate = coordinate;
    }
    
        public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public int getId ()
    {
        return id;
    }

    public void setId (int id)
    {
        this.id = id;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }


    public void setRole(Role role) {
        this.role = role;
    }



    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public Boolean getIsWorking() {
        return isWorking;
    }

    public void setIsWorking(Boolean isWorking) {
        this.isWorking = isWorking;
    }
    
    

    
    
    @Override
    public String toString() {
        return username;
    }
    
    
    
}