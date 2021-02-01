/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.WorkRequest.AnalyticsMaintenanceRequest;
import Business.WorkRequest.AnalyticsNewStationRequest;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adam
 */
public class AnalyticsNewStationWorkQueue
{
    private List<AnalyticsNewStationRequest> list;
    
    public AnalyticsNewStationWorkQueue(){
        list=  new ArrayList<AnalyticsNewStationRequest>();
    }

    public List<AnalyticsNewStationRequest> getList ()
    {
        return list;
    }

    public void setList (List<AnalyticsNewStationRequest> list)
    {
        this.list = list;
    }
    
    public AnalyticsNewStationRequest add(AnalyticsNewStationRequest r){
        list.add(r);
        return r;
    }
    
    public AnalyticsNewStationRequest remove(AnalyticsNewStationRequest r){
        list.remove(r);
        return r;
    }
}
