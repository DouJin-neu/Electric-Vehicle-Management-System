/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkRequest;

import Business.WorkQueue.WorkRequest;

/**
 *
 * @author shaohanghu
 */
public class InvestmentRequest extends WorkRequest{
    int amount;

    public InvestmentRequest() {
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
}
