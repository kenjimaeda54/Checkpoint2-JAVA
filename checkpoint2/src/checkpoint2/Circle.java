package checkpoint2;

import java.lang.Math;

public class Circle {
	   private double radius;
       private  double field;
       private double results;
 
        
        
		private double getRadius() {
			return radius;
		}
		
		protected void setRadius(double radius) {
			this.radius = radius;
		}
		

	
        
        protected  void   field(){
        	 this.field =  (radius*radius) * 3.14;
        	 System.out.printf("Valor da area do ciruclo é %.2f",this.field);
        	
        }
	    
    
	
}
