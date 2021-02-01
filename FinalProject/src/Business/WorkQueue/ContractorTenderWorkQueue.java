/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.WorkRequest.CandidateRequest;
import Business.WorkRequest.ContractorTenderRequest;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adam
 */
public class ContractorTenderWorkQueue
{
    private List<ContractorTenderRequest> list;
    
    public ContractorTenderWorkQueue(){
        list=  new ArrayList<ContractorTenderRequest>();
    }

    public List<ContractorTenderRequest> getList ()
    {
        return list;
    }

    public void setList (List<ContractorTenderRequest> list)
    {
        this.list = list;
    }
    
    public ContractorTenderRequest add(ContractorTenderRequest r){
        list.add(r);
        return r;
    }
    
    public ContractorTenderRequest remove(ContractorTenderRequest r){
        list.remove(r);
        return r;
    }
}
