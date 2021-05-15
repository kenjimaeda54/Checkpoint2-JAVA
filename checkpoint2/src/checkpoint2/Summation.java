package checkpoint2;

public class Summation {
	 private int number;
     private int initial;
     private int results;
     private int value;

	 
	private int getNumber() {
		return number;
	}

	protected void setNumber(int number) {
		this.number = number;
	}
	 
	private int   colletions() {
		for(initial=0;initial < number; initial++) {
			this.results = number - initial  ;
			this.value += this.results; 
		   
		}
	   return this.value;
		
	}
	
	  void printResults() {
       System.out.println("Valor da soma de todos os numeros entre 1 ate seu numero é "+ this.colletions());
	}
	

}
