/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.WorkRequest.DriverNewLocationRequest;
import Business.WorkRequest.ExecutiveNewLocationRequest;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adam
 */
public class ExecutiveImplementationWorkQueue
{
    private List<ExecutiveNewLocationRequest> list;
    
    public ExecutiveImplementationWorkQueue(){
        list=  new ArrayList<ExecutiveNewLocationRequest>();
    }

    public List<ExecutiveNewLocationRequest> getList ()
    {
        return list;
    }

    public void setList (List<ExecutiveNewLocationRequest> list)
    {
        this.list = list;
    }
    
    public ExecutiveNewLocationRequest add(ExecutiveNewLocationRequest r){
        list.add(r);
        return r;
    }
    
    public ExecutiveNewLocationRequest remove(ExecutiveNewLocationRequest r){
        list.remove(r);
        return r;
    }
}
