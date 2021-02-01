/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.WorkRequest.AnalyticsNewStationRequest;
import Business.WorkRequest.CandidateRequest;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adam
 */
public class CandidateWorkQueue
{
    private List<CandidateRequest> list;
    
    public CandidateWorkQueue(){
        list=  new ArrayList<CandidateRequest>();
    }

    public List<CandidateRequest> getList ()
    {
        return list;
    }

    public void setList (List<CandidateRequest> list)
    {
        this.list = list;
    }
    
    public CandidateRequest add(CandidateRequest r){
        list.add(r);
        return r;
    }
    
    public CandidateRequest remove(CandidateRequest r){
        list.remove(r);
        return r;
    }
}
