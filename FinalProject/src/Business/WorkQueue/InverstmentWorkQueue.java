/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.WorkRequest.ExecutiveMaintenanceRequest;
import Business.WorkRequest.InvestmentRequest;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adam
 */
public class InverstmentWorkQueue
{
    private List<InvestmentRequest> list;
    
    public InverstmentWorkQueue(){
        list=  new ArrayList<InvestmentRequest>();
    }

    public List<InvestmentRequest> getList ()
    {
        return list;
    }

    public void setList (List<InvestmentRequest> list)
    {
        this.list = list;
    }
    
    public InvestmentRequest add(InvestmentRequest r){
        list.add(r);
        return r;
    }
    
    public InvestmentRequest remove(InvestmentRequest r){
        list.remove(r);
        return r;
    }
}
