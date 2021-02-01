/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkRequest;

import Business.Enterprise.CompanyEnterprise;
import Business.Enterprise.ContractorEnterprise;
import Business.StationMap.ChargingPile;
import Business.StationMap.ChargingStation;
import Business.StationMap.Coordinate;
import Business.WorkQueue.WorkRequest;

/**
 *
 * @author shaohanghu
 */
public class ContractorRepairRequest extends WorkRequest{
      ContractorEnterprise recevingContractor;
    ChargingStation requestedStation;
    ChargingPile requestedPile;

    public ContractorRepairRequest() {
    }

   public ChargingStation getRequestedStation() {
        return requestedStation;
    }

    public void setRequestedStation(ChargingStation requestedStation) {
        this.requestedStation = requestedStation;
    }

    public ChargingPile getRequestedPile() {
        return requestedPile;
    }

    public void setRequestedPile(ChargingPile requestedPile) {
        this.requestedPile = requestedPile;
    }

    public ContractorEnterprise getRecevingContractor() {
        return recevingContractor;
    }

    public void setRecevingContractor(ContractorEnterprise recevingContractor) {
        this.recevingContractor = recevingContractor;
    }
    
    
    
}
