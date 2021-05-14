package checkpoint2;

public class Convert {
   public double temperature;
   protected double  results;
   public int decision;
	
	
	
	
	public  void verficate(int decision, double temperature ){
		if(decision == 1) {
	       this.celsius(temperature); 		
		}else if(decision == 2   ) {
		   this.fahrenheit(temperature);	
		}else {
		   System.out.println("Ops! A opção " +decision+ " não existe");	
		}
	}



	private void celsius(double temperature) {
	    this.results =  (temperature * 1.8) + 32;
	    System.out.printf("Valor convertido em celsius para fahrenheit é %.2f",results); 
		
	}
	private void fahrenheit(double temperature) {
	    this.results =  (temperature -32) * 5/9;
	    System.out.printf("\nValor convertido  fahrenheit para celsius é %.2f",results); 
		
	}
	
	
	
	

}
