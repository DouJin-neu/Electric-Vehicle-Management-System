/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Contractor;

import Business.Enterprise.ContractorEnterprise;

/**
 *
 * @author shaohanghu
 */
public class CoopContractor {
    private ContractorEnterprise contractor;
    private int StationPrice;
    private int PilePrice;
    private String Name;

    public CoopContractor(ContractorEnterprise contractor, int StationPrice,
            int PilePrice, String Name) {
        this.contractor = contractor;
        this.StationPrice = StationPrice;
        this.PilePrice = PilePrice;
        this.Name = Name;
    }
    

    public ContractorEnterprise getContractor() {
        return contractor;
    }

    public void setContractor(ContractorEnterprise contractor) {
        this.contractor = contractor;
    }

    public int getStationPrice() {
        return StationPrice;
    }

    public void setStationPrice(int StationPrice) {
        this.StationPrice = StationPrice;
    }

    public int getPilePrice() {
        return PilePrice;
    }

    public void setPilePrice(int PilePrice) {
        this.PilePrice = PilePrice;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    @Override
    public String toString(){
        return Name;
        
    }
    
}
