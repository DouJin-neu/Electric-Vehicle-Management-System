/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.StationMap;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adam
 */
public class StationMap
{
    List<ChargingStation> map;

    public StationMap ()
    {
        map=new ArrayList<ChargingStation>();
        preload();
    }

    public List<ChargingStation> getMap ()
    {
        return map;
    }
    
    public ChargingStation add (ChargingStation cs){
        map.add(cs);
        return cs;
    }
    
    public ChargingStation remove (ChargingStation cs){
        map.remove(cs);
        return cs;
    }
    
    public int findNumOfChargingStation(int miles, Coordinate co){
        int num = 0;
        for (int i=0;i<map.size();i++){
            ChargingStation current = map.get(i);
            Coordinate coordinate = current.getCoordinate();
            if (coordinate!=null){
                if (co.getDistance(coordinate)<=miles){
                    num++;
                }
            }
            
        }
        return num;
    }
    
    public int findNumOfChargingPiles (int miles, Coordinate co){
        int num=0;
        List<ChargingStation> near = new ArrayList<ChargingStation>();
        for (int i=0;i<map.size();i++){
            ChargingStation current = map.get(i);
            Coordinate coordinate = current.getCoordinate();
            if (coordinate!=null){
                if (co.getDistance(coordinate)<=miles){
                    near.add(current);
                }
            }
        }
        for (int i=0;i<near.size();i++){
            ChargingStation current = map.get(i);
            num+=current.getAvailableChargingPile().size();
        }
        
        
        return num;
        
    }

    public void setMap (List<ChargingStation> map)
    {
        this.map = map;
    }
    
    
    private void generateStationMap(Coordinate c,  String name,int numOfPiles){
        ChargingStation cs = new ChargingStation(name);
        cs.setCoordinate(c);
        for (int i=0;i<numOfPiles;i++){
            int usage =(int)(Math.random()*20);
            double rand = Math.random();
            boolean isAva=false;
            int wait= 0;
            if (rand<0.1){
                isAva=true;
                 wait = (int)(Math.random()*60);
            }
            ChargingPile p = new ChargingPile(isAva,false,wait,usage);
            cs.add(p);
        
        }
        this.map.add(cs);
    }
    private void preload(){
        //parameter sequence: is occupied, is broken, waiting time, use age.
        ChargingPile p1 = new ChargingPile(false,false,0,0);
        ChargingPile p2 = new ChargingPile(true,false,15,3);
        ChargingPile p3 = new ChargingPile(false,true,0,0);
        ChargingPile p4 = new ChargingPile(true,false,40,10);
        ChargingPile p5 = new ChargingPile(false,false,0,0);
        Coordinate c1 = new Coordinate(42.23908289608375, -70.97738810626133);
        ChargingStation cs1= new ChargingStation("Quincy");
        cs1.setCoordinate(c1);
        
        cs1.add(p1);cs1.add(p2);cs1.add(p3);cs1.add(p4);cs1.add(p5);
        
        ChargingPile p6 = new ChargingPile(false,false,0,0);
        ChargingPile p7 = new ChargingPile(true,false,5,7);
        ChargingPile p8 = new ChargingPile(false,false,0,0);
        ChargingPile p9 = new ChargingPile(true,false,60,30);
        ChargingPile p10 = new ChargingPile(false,false,0,0);
        Coordinate c2 = new Coordinate(42.324436125297545, -71.06231427317265);
        ChargingStation cs2= new ChargingStation("Dorchester");
        cs2.setCoordinate(c2);
        
        cs2.add(p6);cs2.add(p7);cs2.add(p8);cs2.add(p9);cs2.add(p10);
        map.add(cs1);
        map.add(cs2);
        ChargingPile p11 = new ChargingPile(false,true,0,2);
        ChargingPile p12 = new ChargingPile(false,false,0,5);
        ChargingPile p13 = new ChargingPile(false,false,0,6);
        ChargingPile p14 = new ChargingPile(false,false,0,9);
        ChargingPile p15 = new ChargingPile(false,false,0,11);
        ChargingPile p16 = new ChargingPile(false,false,0,22);
        Coordinate c3 = new Coordinate(42.33445810658684, -71.06137708624442);
        ChargingStation cs3= new ChargingStation("South End");
        cs3.setCoordinate(c3);
        cs3.add(p11);cs3.add(p12);cs3.add(p13);cs3.add(p14);cs3.add(p15);cs3.add(p16);
        map.add(cs3);
        
        ChargingPile p17 = new ChargingPile(false,true,0,2);
        ChargingPile p18 = new ChargingPile(false,false,0,1);
        ChargingPile p19 = new ChargingPile(false,false,0,25);
        ChargingPile p20 = new ChargingPile(false,false,0,33);
        ChargingPile p21 = new ChargingPile(false,false,0,6);
        ChargingPile p22 = new ChargingPile(false,false,0,7);
        Coordinate c4 = new Coordinate(42.3195970989985, -71.11141509632368);
        ChargingStation cs4= new ChargingStation("South Boston");
        cs4.setCoordinate(c4);
        cs4.add(p17);cs4.add(p18);cs4.add(p19);cs4.add(p20);cs4.add(p21);cs4.add(p22);
        map.add(cs4);
        
        
        
        Coordinate c6 = new Coordinate(42.33517194727262, -71.07303919163719);
        generateStationMap(c6,"South of Washington",8);
        Coordinate c7 = new Coordinate(42.31967186582264, -71.147666876346);
        generateStationMap(c7,"Brookline",7);
        Coordinate c8 = new Coordinate(42.332957883751796, -71.20453989137603);
        generateStationMap(c8,"Green Lawn",6);
        Coordinate c9 = new Coordinate(42.24087741627631, -71.13719744788007);
        generateStationMap(c9,"Reynold",8);
        Coordinate c10 = new Coordinate(42.23260949479635, -71.28674120121386);
        generateStationMap(c10,"Dover",6);
        Coordinate c11 = new Coordinate(42.18245656139486, -71.19142952683326);
        generateStationMap(c11,"Norwood",7);
        Coordinate c12 = new Coordinate(42.453878838609754, -71.25575370807073);
        generateStationMap(c12,"Oxbow",9);
        Coordinate c13 = new Coordinate(42.41906537020934, -71.16484219858845);
        generateStationMap(c13,"Grove",8);
    }
}
