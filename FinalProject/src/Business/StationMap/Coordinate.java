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
public class Coordinate
{
    private double x,y;
    private String fullAddress;


    

    public Coordinate (double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public Coordinate ()
    {
        x=0;
        y=0;
    }

    public double getX ()
    {
        return x;
    }

    public void setX (double x)
    {
        this.x = x;
    }

    public double getY ()
    {
        return y;
    }

    public void setY (double y)
    {
        this.y = y;
    }
    
    public double getDistance(Coordinate coordinate){
        double x1 = this.x;
        double y1=this.y;
        double x2= coordinate.getX();
        double y2=coordinate.getY();
        return distance(x1,y1,x2,y2,"M");
        
    }
    
        public String getFullAddress ()
    {
        return fullAddress;
    }

    public void setFullAddress (String fullAddress)
    {
        this.fullAddress = fullAddress;
    }
    private double distance(double lat1, double lon1, double lat2, double lon2, String unit){
        if ((lat1 == lat2) && (lon1 == lon2)) {
			return 0;
		}
		else {
			double theta = lon1 - lon2;
			double dist = Math.sin(Math.toRadians(lat1)) * Math.sin(Math.toRadians(lat2)) + 
                                Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) * Math.cos(Math.toRadians(theta));
			dist = Math.acos(dist);
			dist = Math.toDegrees(dist);
			dist = dist * 60 * 1.1515;
			if (unit.equals("K")) {
				dist = dist * 1.609344;
			} else if (unit.equals("N")) {
				dist = dist * 0.8684;
			}
			return (dist);
		}
        
        
    }
    
    public String toString(){
        return "Latitude: "+this.getX()+" Longtitude: "+this.getY();
    }
    
}
