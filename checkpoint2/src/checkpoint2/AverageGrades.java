package checkpoint2;

public class AverageGrades {
	 double value1;
	 double value2;
	 double value3;
	 double results;
	 
	 protected double  grades(double value1,double value2,double value3) {
	      this.results = (value1 + value2+value3) /3;  	  
		  return results;
	 }
	
	 protected  void   check() {
	        if(this.results <5 ) {
	        	System.out.printf("\nAluno foi reprovado.Nota do aluno: %.2f ",this.results);
	        }else if(this.results >=5 && this.results <6){
	        	System.out.printf("\nAluno precisa fazer prova substituta. Nota do aluno: %.2f ",this.results);
	        }else {
	        	System.out.printf("\nAluno foi aprovado. Nota do aluno: %.2f ",this.results);
	        }
	        
	        		
	 }
	 
	 
	
	
}
