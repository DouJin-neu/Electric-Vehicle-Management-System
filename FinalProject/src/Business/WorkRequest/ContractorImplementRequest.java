/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkRequest;

import Business.Enterprise.CompanyEnterprise;
import Business.Enterprise.ContractorEnterprise;
import Business.StationMap.Coordinate;
import Business.WorkQueue.WorkRequest;

/**
 *
 * @author shaohanghu
 */
public class ContractorImplementRequest extends WorkRequest{
    Coordinate requestedLocation;
    CompanyEnterprise sendingCompany;
    int numPiles;

    public ContractorImplementRequest() {
    }

    public Coordinate getRequestedLocation() {
        return requestedLocation;
    }

    public void setRequestedLocation(Coordinate requestedLocation) {
        this.requestedLocation = requestedLocation;
    }

    public int getNumPiles() {
        return numPiles;
    }

    public void setNumPiles(int numPiles) {
        this.numPiles = numPiles;
    }

    public CompanyEnterprise getSendingCompany() {
        return sendingCompany;
    }

    public void setRecevingCompany(CompanyEnterprise sendingCompany) {
        this.sendingCompany = sendingCompany;
    }
    
    
    
}
