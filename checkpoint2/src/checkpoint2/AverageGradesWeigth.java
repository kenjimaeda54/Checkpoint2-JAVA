package checkpoint2;

public class AverageGradesWeigth {
	 double value1;
	 double value2;
	 double results;
	 
	 protected double  grades(double value1,double value2) {
	      this.results = (value1*0.4) + (value2*0.6);  	  
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
