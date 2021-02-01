/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.WorkRequest.AnalyticsMaintenanceRequest;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adam
 */
public class AnalyticsMaintenanceWorkQueue
{
    private List<AnalyticsMaintenanceRequest> list;
    
    public AnalyticsMaintenanceWorkQueue(){
        list=  new ArrayList<AnalyticsMaintenanceRequest>();
    }

    public List<AnalyticsMaintenanceRequest> getList ()
    {
        return list;
    }

    public void setList (List<AnalyticsMaintenanceRequest> list)
    {
        this.list = list;
    }
    
    public AnalyticsMaintenanceRequest add(AnalyticsMaintenanceRequest r){
        list.add(r);
        return r;
    }
    
    public AnalyticsMaintenanceRequest remove(AnalyticsMaintenanceRequest r){
        list.remove(r);
        return r;
    }
}
