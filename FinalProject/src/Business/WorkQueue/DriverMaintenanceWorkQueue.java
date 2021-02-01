/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.WorkRequest.ContractorTenderRequest;
import Business.WorkRequest.DriverMaintenanceRequest;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adam
 */
public class DriverMaintenanceWorkQueue
{
    private List<DriverMaintenanceRequest> list;
    
    public DriverMaintenanceWorkQueue(){
        list=  new ArrayList<DriverMaintenanceRequest>();
    }

    public List<DriverMaintenanceRequest> getList ()
    {
        return list;
    }

    public void setList (List<DriverMaintenanceRequest> list)
    {
        this.list = list;
    }
    
    public DriverMaintenanceRequest add(DriverMaintenanceRequest r){
        list.add(r);
        return r;
    }
    
    public DriverMaintenanceRequest remove(DriverMaintenanceRequest r){
        list.remove(r);
        return r;
    }
}
