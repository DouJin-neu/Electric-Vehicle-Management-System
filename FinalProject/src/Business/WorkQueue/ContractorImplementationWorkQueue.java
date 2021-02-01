/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.WorkRequest.DriverNewLocationRequest;
import Business.WorkRequest.ExecutiveNewLocationRequest;
import Business.WorkRequest.ContractorImplementRequest;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adam
 */
public class ContractorImplementationWorkQueue
{
    private List<ContractorImplementRequest> list;
    
    public ContractorImplementationWorkQueue(){
        list=  new ArrayList<ContractorImplementRequest>();
    }

    public List<ContractorImplementRequest> getList ()
    {
        return list;
    }

    public void setList (List<ContractorImplementRequest> list)
    {
        this.list = list;
    }
    
    public ContractorImplementRequest add(ContractorImplementRequest r){
        list.add(r);
        return r;
    }
    
    public ContractorImplementRequest remove(ContractorImplementRequest r){
        list.remove(r);
        return r;
    }
}
