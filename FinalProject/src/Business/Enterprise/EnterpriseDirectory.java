/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;


import Business.Network.Network;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.CompanyEnterprise){
            enterprise=new CompanyEnterprise(name);
            enterpriseList.add(enterprise);
        }else if(type==Enterprise.EnterpriseType.ContractorEnterprise){
            enterprise=new ContractorEnterprise(name);
            enterpriseList.add(enterprise);
        }else if(type==Enterprise.EnterpriseType.EVDriver){
            enterprise=new EVDriver(name);
            enterpriseList.add(enterprise);
        }else if(type==Enterprise.EnterpriseType.Investor){
            enterprise=new Investor(name);
            enterpriseList.add(enterprise);
        }else if(type==Enterprise.EnterpriseType.Candidate){
            enterprise=new Candidate(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
    
    public void deleteEnterprise(Enterprise enterprise){
        enterpriseList.remove(enterprise);
    }

    public Enterprise createAndAddEnterprise(String name,
            Enterprise.EnterpriseType type, Network network) {
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.CompanyEnterprise){
            enterprise=new CompanyEnterprise(name, network);
            
            enterpriseList.add(enterprise);
        }else if(type==Enterprise.EnterpriseType.ContractorEnterprise){
            enterprise=new ContractorEnterprise(name);
            enterpriseList.add(enterprise);
        }else if(type==Enterprise.EnterpriseType.EVDriver){
            enterprise=new EVDriver(name);
            enterpriseList.add(enterprise);
        }else if(type==Enterprise.EnterpriseType.Investor){
            enterprise=new Investor(name);
            enterpriseList.add(enterprise);
        }else if(type==Enterprise.EnterpriseType.Candidate){
            enterprise=new Candidate(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
}
