package checkpoint2;


import java.util.Random;

public class OurMethod {
	private String[]  selection = {"animal","carro","dinheiro","avião"};
	private int number;
	private int  option;
	private boolean stats;


	private int getOption() {
		return option;
	}

	protected void setOption(int option) {
		this.option = option;
	}
	
	private int  chosseComputer(){
	  this.number =  new Random().nextInt(3);
	  return this.number;
    	 		
	}
    
	private boolean   winLose() { 
	   if(this.option == this.chosseComputer()) {
          return this.stats = true; 
	   }else {
		   return this.stats = false;   
	   }
       
    }	
	
	public void  mesgUser() {
       System.out.println(winLose()?":) Você acertou eu estava pensando "+this.selection[this.option] 
    		   :":( Voce perdeu eu estava pensando em "+ this.selection[this.chosseComputer()]); 
		
	}
	

}
