package checkpoint2;

public class AverageSpeed {
     private double distance;
     private double time;
     private double speed;
    
     
     private double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	private double getTime() {
		return time;
	}
	public void setTime(double time) {
		this.time = time;
	}
     
    protected void Average() {
    	this.speed = this.distance/this.time;
        System.out.printf("\nVelocidade media, foi:%.2f",this.speed+"km/h");
    }  
	
	
}
