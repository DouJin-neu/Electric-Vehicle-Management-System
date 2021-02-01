/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkRequest;

import Business.StationMap.ChargingPile;
import Business.StationMap.ChargingStation;
import Business.WorkQueue.WorkRequest;

/**
 *
 * @author shaohanghu
 */
public class DriverMaintenanceRequest extends WorkRequest{
    String Reason;
    ChargingStation requestedLocation;
    ChargingPile requestedPile;

    public DriverMaintenanceRequest() {
    }

    public String getReason() {
        return Reason;
    }

    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public ChargingStation getRequestedLocation() {
        return requestedLocation;
    }

    public void setRequestedLocation(ChargingStation requestedLocation) {
        this.requestedLocation = requestedLocation;
    }

    public ChargingPile getRequestedPile() {
        return requestedPile;
    }

    public void setRequestedPile(ChargingPile requestedPile) {
        this.requestedPile = requestedPile;
    }
    
    
}
