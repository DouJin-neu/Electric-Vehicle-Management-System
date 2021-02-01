/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkRequest;

import Business.StationMap.Coordinate;
import Business.WorkQueue.WorkRequest;

/**
 *
 * @author shaohanghu
 */
public class DriverNewLocationRequest extends WorkRequest{
    private int ID;
    Coordinate requestedLocation;
    String fullAddress;
    int numPiles;

    public DriverNewLocationRequest() {
    }

    public int getNumPiles() {
        return numPiles;
    }

    public void setNumPiles(int numPiles) {
        this.numPiles = numPiles;
    }

    public Coordinate getRequestedLocation() {
        return requestedLocation;
    }

    public void setRequestedLocation(Coordinate requestedLocation) {
        this.requestedLocation = requestedLocation;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

}
