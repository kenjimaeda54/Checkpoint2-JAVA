package checkpoint2;

public class Rectangle {
       private  double field;
       private double basis;
       private  double heigth;
 
	
		private double getHeigth() {
			return heigth;
		}
		
		public void setHeigth(double heigth) {
			this.heigth = heigth;
		}
		
		private double getBasis() {
			return basis;
		}
		
		public void setBasis(double basis) {
			this.basis = basis;
		}
	     
		
	    
        protected  void rectangle() {
            this.field =  basis*heigth;
            System.out.println("Valor da area do retangulo é "+this.field);
        }
	     
	
	
}
