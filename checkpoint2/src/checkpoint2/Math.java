package checkpoint2;

public class Math {
      private double number1;
      private double number2;
      private double results;
      private int chosse;
      private boolean stats = false;
      
	private double getNumber1() {
		return number1;
	}
	public void setNumber1(double number1) {
		this.number1 = number1;
	}
	private double getNumber2() {
		return number2;
	}
	public void setNumber2(double number2) {
		this.number2 = number2;
	}
	
	 
	protected void  option(int chosse  ) {
		switch(chosse) {
		  case 1:
		      sum();
		      break;
		  case 2:
			  subtraction();
			  break;
		  case 3:
			  multiplication();
			  break;
		  case 4:
			  division();
			  break;
		default:
			this.stats = true;
		
		}
	}
    
	private double sum(){
	  this.results = number1+number2;
	  return results;
	}
	
	private double subtraction(){
		  this.results = number1 - number2;
		  return results;
	}
	
	private double multiplication(){
		  this.results = number1 * number2;
		  return results;
	}

	
	private double  division(){
		 if(number2 <= 0 ) {
			this.stats = true;  
		 }
		  
		  this.results = number1 / number2;	  
		  return results;
	}
	
	protected void  printAll() {
		System.out.printf(stats? "\nPosivelmente voce dividiu por zero ou digitou "
	     + "valor não corrrespondente as opções tente novamente":"Resultado da operação é %.2f",this.results);
		
	}
		
            
}
