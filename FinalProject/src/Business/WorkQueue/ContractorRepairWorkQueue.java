/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.WorkRequest.DriverNewLocationRequest;
import Business.WorkRequest.ExecutiveNewLocationRequest;
import Business.WorkRequest.ContractorImplementRequest;
import Business.WorkRequest.ContractorRepairRequest;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adam
 */
public class ContractorRepairWorkQueue
{
    private List<ContractorRepairRequest> list;
    
    public ContractorRepairWorkQueue(){
        list=  new ArrayList<ContractorRepairRequest>();
    }

    public List<ContractorRepairRequest> getList ()
    {
        return list;
    }

    public void setList (List<ContractorRepairRequest> list)
    {
        this.list = list;
    }
    
    public ContractorRepairRequest add(ContractorRepairRequest r){
        list.add(r);
        return r;
    }
    
    public ContractorRepairRequest remove(ContractorRepairRequest r){
        list.remove(r);
        return r;
    }
}
