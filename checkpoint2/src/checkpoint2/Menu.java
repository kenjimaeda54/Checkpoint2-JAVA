spackage checkpoint2;

import java.util.Scanner;

public class Menu {

             int number;    
		
		    Scanner sc = new Scanner(System.in);
            
            Convert convert = new Convert();
            Rectangle rectangle = new Rectangle();
            Circle circle = new Circle();
            
            protected void calc(int number) {
                switch  (number) {
                   case 1:
                	  System.out.println("A opção escolhida foi converter celisus para farenheigth ou farenheigth para celisus"); 
                	  System.out.println("Digite 1 para converter celsius e 2 converter farenheigth");
                	  int decision = sc.nextInt();
                	  convert.decision = decision;
                	  System.out.println("Digite o valor que deseja converter");
                	  double temperature = sc.nextDouble();
                	  convert.temperature = temperature;
                	  convert.verficate(decision, temperature);
                	  break;
                   case 2:
                	 System.out.println("A opção escolhida foi calcular area do retangulo");   
                  	 System.out.println("Qual valor da altura");
                  	 double heigth = sc.nextDouble();
					 rectangle.setHeigth(heigth);
					 System.out.println("Qual valor da base");
					 double basis = sc.nextDouble();
					 rectangle.setBasis(basis);
					 rectangle.rectangle();
					 break;
                   case 3:
                	  System.out.println("A opção escolhida foi calcular area do circulo");   
                	  System.out.println("Qual valor do raio");
                      double radius = sc.nextDouble();
    				  circle.setRadius(radius);
    				  circle.field();
    				  break;   
                
                default:
                	System.out.println("Ops! Valor errado");
                
                  }	
                         
                
                }
             
            
}
