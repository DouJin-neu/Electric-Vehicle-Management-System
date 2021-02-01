/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.StationMap;

import Business.Network.Network;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author adam
 */
public class ChargingStation
{
    private List<ChargingPile> pileList;
    private Coordinate coordinate;
    private String fullAddress;
    private String name;
    private Network network;

    public ChargingStation (String name)
    {
        this.name=name;
        pileList= new ArrayList<ChargingPile>();
    }
    
    
    public List<ChargingPile> getAvailableChargingPile(){
        List<ChargingPile> result = new ArrayList<ChargingPile>();
        for (ChargingPile cp : this.pileList){
            //only pile are not occupied and not broken will be returned.
            if (cp.isIsOccupied()==false && cp.isIsBroken()==false){
                result.add(cp);
            }
        }
        return result;
    }
    
    public List<ChargingPile> getBrokenChargingPile(){
        List<ChargingPile> result = new ArrayList<ChargingPile>();
        for (ChargingPile cp : this.pileList){
            //only broken will be returned.
            if (cp.isIsBroken()==true){
                result.add(cp);
            }
        }
        return result;
    }
    
    
    public List<ChargingPile> getLeastUsedChargingPiles(){
        List<ChargingPile> result = new ArrayList<ChargingPile>();
        Map<ChargingPile,Integer> usageMap = new HashMap<ChargingPile,Integer>();
        for (ChargingPile cp : this.pileList){
            usageMap.put(cp,cp.getUsage());
        }
        List<Map.Entry<ChargingPile,Integer>> sortList = new ArrayList(usageMap.entrySet());
        Collections.sort(sortList,(o1,o2)->(o1.getValue()-o2.getValue()));
        for (int i=0;i<5;i++){
            result.add(sortList.get(i).getKey());
        }
        
        return result;
    }
    
    
    public List<ChargingPile> getMostUsedChargingPiles(){
        List<ChargingPile> result = new ArrayList<ChargingPile>();
        Map<ChargingPile,Integer> usageMap = new HashMap<ChargingPile,Integer>();
        for (ChargingPile cp : this.pileList){
            usageMap.put(cp,cp.getUsage());
        }
        List<Map.Entry<ChargingPile,Integer>> sortList = new ArrayList(usageMap.entrySet());
        Collections.sort(sortList,(o1,o2)->(o2.getValue()-o1.getValue()));
        for (int i=0;i<5;i++){
            result.add(sortList.get(i).getKey());
        }
        
        return result;
    }
    
    
    
    public List<ChargingPile> getPileList ()
    {
        return pileList;
    }

    public void setPileList (List<ChargingPile> pileList)
    {
        this.pileList = pileList;
    }
    
    public ChargingPile add(ChargingPile cp){
        this.pileList.add(cp);
        return cp;
    }
    
    public ChargingPile remove(ChargingPile cp){
        this.pileList.remove(cp);
        return cp;
    }
    
    public Coordinate getCoordinate ()
    {
        return coordinate;
    }

    public void setCoordinate (Coordinate coordinate)
    {
        this.coordinate = coordinate;
    }
    
    public String toString(){
        return this.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }
    
    
}
