/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Network.Network;
import Business.Organization.Contractor.CoopContractor;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class CompanyEnterprise extends Enterprise {
    
    Network network;
    ArrayList<ContractorEnterprise> contractorList;
    ArrayList<CoopContractor> coopContractorList;
    int Balance=1000000;
    int MarketValue=1000000;
    
    
    public CompanyEnterprise(String name){
        super(name,EnterpriseType.CompanyEnterprise);
        contractorList = new ArrayList<ContractorEnterprise>();
        coopContractorList = new ArrayList<CoopContractor>();
    }

    public CompanyEnterprise(String name, Network network) {
         super(name,EnterpriseType.CompanyEnterprise);
        contractorList = new ArrayList<ContractorEnterprise>();
        coopContractorList = new ArrayList<CoopContractor>();
        this.network = network;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    public ArrayList<ContractorEnterprise> getContractorList() {
        return contractorList;
    }

    public void setContractorList(ArrayList<ContractorEnterprise> contractorList) {
        this.contractorList = contractorList;
    }

    public ArrayList<CoopContractor> getCoopContractorList() {
        return coopContractorList;
    }

    public void setCoopContractorList(
            ArrayList<CoopContractor> coopContractorList) {
        this.coopContractorList = coopContractorList;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int Balance) {
        this.Balance = Balance;
    }

    public int getMarketValue() {
        return MarketValue;
    }

    public void setMarketValue(int MarketValue) {
        this.MarketValue = MarketValue;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }
    
    
    
}
