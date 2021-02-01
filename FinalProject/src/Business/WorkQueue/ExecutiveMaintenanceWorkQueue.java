/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.WorkRequest.ExecutiveNewLocationRequest;
import Business.WorkRequest.ExecutiveMaintenanceRequest;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adam
 */
public class ExecutiveMaintenanceWorkQueue
{
    private List<ExecutiveMaintenanceRequest> list;
    
    public ExecutiveMaintenanceWorkQueue(){
        list=  new ArrayList<ExecutiveMaintenanceRequest>();
    }

    public List<ExecutiveMaintenanceRequest> getList ()
    {
        return list;
    }

    public void setList (List<ExecutiveMaintenanceRequest> list)
    {
        this.list = list;
    }
    
    public ExecutiveMaintenanceRequest add(ExecutiveMaintenanceRequest r){
        list.add(r);
        return r;
    }
    
    public ExecutiveMaintenanceRequest remove(ExecutiveMaintenanceRequest r){
        list.remove(r);
        return r;
    }
}
