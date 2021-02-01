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
public class ExecutiveNewLocationRequest extends WorkRequest{
    Coordinate requestedLocation;
    CompanyEnterprise sendingCompany;
    ContractorEnterprise recevingContractor;
    String fullAddress;
    String StationName;
    int numPiles;

    public ExecutiveNewLocationRequest() {
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

    public ContractorEnterprise getRecevingContractor() {
        return recevingContractor;
    }

    public void setRecevingContractor(ContractorEnterprise recevingContractor) {
        this.recevingContractor = recevingContractor;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    public CompanyEnterprise getSendingCompany() {
        return sendingCompany;
    }

    public void setSendingCompany(CompanyEnterprise sendingCompany) {
        this.sendingCompany = sendingCompany;
    }

    public String getStationName() {
        return StationName;
    }

    public void setStationName(String StationName) {
        this.StationName = StationName;
    }
    
    
    
}
