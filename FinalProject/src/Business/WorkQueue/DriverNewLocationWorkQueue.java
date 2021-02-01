/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.WorkRequest.DriverMaintenanceRequest;
import Business.WorkRequest.DriverNewLocationRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author adam
 */
public class DriverNewLocationWorkQueue
{
    private List<DriverNewLocationRequest> list;
    
    public DriverNewLocationWorkQueue(){
        list=  new ArrayList<DriverNewLocationRequest>();
    }

    public List<DriverNewLocationRequest> getList ()
    {
        return list;
    }

    public void setList (List<DriverNewLocationRequest> list)
    {
        this.list = list;
    }
    
    public DriverNewLocationRequest add(DriverNewLocationRequest r){
        list.add(r);
        return r;
    }
    
    public DriverNewLocationRequest remove(DriverNewLocationRequest r){
        list.remove(r);
        return r;
    }
//    public List<DriverNewLocationRequest> combine(DriverNewLocationWorkQueue otherQueue){
//        list.addAll(otherQueue.getList());
//        return list;
//    }
}
