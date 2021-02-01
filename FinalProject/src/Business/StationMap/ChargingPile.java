/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.StationMap;

/**
 *
 * @author adam
 */
public class ChargingPile implements Comparable<ChargingPile>
{
    private int id;
    private boolean isOccupied;
    private boolean isBroken;
    private int estimatedTime;
    private int usage;
    int [] available= new int[24];
    private static int count=0;

    
    public ChargingPile(boolean isOccupied, boolean isBroken, int estimatedTime, int usage){
        count++;
        this.id=count;
        this.isOccupied=isOccupied;
        this.isBroken=isBroken;
        this.estimatedTime=estimatedTime;
        this.usage=usage;
        
    
    }
    
    @Override
    public int compareTo(ChargingPile cp){
        if (this.id==cp.id){
        return 0;
        }
        int number = this.id>cp.id?1:-1;
        return number;
    }
    public int getId ()
    {
        return this.id;
    }

    public void setId (int id)
    {
        this.id = id;
    }
    public ChargingPile ()
    {
        count++;
        id=count;

        this.isOccupied=false;
        this.isBroken=false;
        this.estimatedTime=0;
        this.usage=0;
    }

    public int[] getAvailable ()
    {
        return available;
    }

    public void setAvailable (int[] available)
    {
        this.available = available;
    }

    public boolean isIsOccupied ()
    {
        return isOccupied;
    }

    public void setIsOccupied (boolean isOccupied)
    {
        if (isBroken==true){
            System.out.println("Station is borken, can not be occupied");
            return;
        }
        this.isOccupied = isOccupied;
    }

    public boolean isIsBroken ()
    {
        
        return isBroken;
    }

    public void setIsBroken (boolean isBroken)
    {
        if (isBroken==false){
            this.isOccupied=false;
        }
        this.isBroken = isBroken;
    }

    public int getEstimatedTime ()
    {
        if (isOccupied==false){
            return 0;
        }
        return estimatedTime;
    }

    public void setEstimatedTime (int estimatedTime)
    {
        if (isOccupied==false){
            this.estimatedTime=0;
        }
        this.estimatedTime = estimatedTime;
    }

    public int getUsage ()
    {
        return usage;
    }

    public void setUsage (int usage)
    {
        this.usage = usage;
    }
    
    public String toString(){
        return "Charging Pile "+this.id;
    }

}
