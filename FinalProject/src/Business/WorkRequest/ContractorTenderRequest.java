/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkRequest;

import Business.Enterprise.ContractorEnterprise;
import Business.Enterprise.Enterprise;
import Business.WorkQueue.WorkRequest;

/**
 *
 * @author shaohanghu
 */
public class ContractorTenderRequest extends WorkRequest{

    int ticketID;
    ContractorEnterprise sendingContractor; 
    int newLocationPrice;
    int priceEachPile;
     private static int count=0;
    

    public ContractorTenderRequest() {
        count++;
        this.ticketID = count;
        
    }

    public int getNewLocationPrice() {
        return newLocationPrice;
    }

    public void setNewLocationPrice(int newLocationPrice) {
        this.newLocationPrice = newLocationPrice;
    }

    public int getPriceEachPile() {
        return priceEachPile;
    }

    public void setPriceEachPile(int priceEachPile) {
        this.priceEachPile = priceEachPile;
    }

    public ContractorEnterprise getSendingContractor() {
        return sendingContractor;
    }

    public void setSendingContractor(ContractorEnterprise sendingContractor) {
        this.sendingContractor = sendingContractor;
    }

    public int getTicketID() {
        return ticketID;
    }
    
    @Override
    public String toString(){
        return String.valueOf(ticketID);
    }
    
    
    
    
    
    
}
