package checkpoint2;

import java.util.Scanner;

public class Menu {

             int number;    
		
		    Scanner sc = new Scanner(System.in);
            
            Convert convert = new Convert();
            Rectangle rectangle = new Rectangle();
            Circle circle = new Circle();
            AverageSpeed averageSpeed = new  AverageSpeed();
            AverageGrades averageGrades = new AverageGrades();
            AverageGradesWeigth  averageGW = new AverageGradesWeigth();
            Math    math = new Math();
            Summation sum = new Summation();
            OurMethod ourMethod = new OurMethod();
            
            protected void calc(int number) {
                switch  (number) {
                   case 1:
                	  System.out.println("\n------------------------");
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
                	 System.out.println("\n------------------------");  
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
                	  System.out.println("\n------------------------"); 
                	  System.out.println("A opção escolhida foi calcular area do circulo");   
                	  System.out.println("Qual valor do raio");
                      double radius = sc.nextDouble();
    				  circle.setRadius(radius);
    				  circle.field();
    				  break;
                   case 4:
                	   System.out.println("\n------------------------"); 
                	   System.out.println("A opção escolhida foi velocidade media");   
                	   System.out.println("Quantos km tem entre os dois pontos?");
                	   double distance = sc.nextDouble();
                	   System.out.println("Quanto tempo levou a viagem em horas ?");
                	   double time = sc.nextDouble();
                	   averageSpeed.setDistance(distance);
                	   averageSpeed.setTime(time);
                	   averageSpeed.Average();  
                	   break;
                   case 5:
                	   System.out.println("\n------------------------"); 
                	   System.out.println("A opção escolhida foi calculo da média aritimética");   
                	   System.out.println("Por favor digite a primeira nota do aluno");
                	   double first = sc.nextDouble();
                	   System.out.println("Por favor digite a segunda nota do aluno");
                	   double second = sc.nextDouble();
                	   System.out.println("Por favor digite a terceira nota do aluno");
                	   double third = sc.nextDouble();
                	   averageGrades.grades(first, second, third);
                	   averageGrades.check();
                	   break;
                   case 6:
                	   System.out.println("\n------------------------"); 
                	   System.out.println("A opção escolhida foi calculo da média ponderada");   
                	   System.out.println("Por favor digite a primeira nota do aluno");
                	   double value1 = sc.nextDouble();
                	   System.out.println("Por favor digite a segunda nota do aluno");
                	   double value2 = sc.nextDouble();
                	   averageGW.grades(value1,value2);
                	   averageGW.check();
                	   break;
                   case 7:
                	   System.out.println("\n------------------------"); 
                	   System.out.println("A opção escolhida foi calculos matematicos");
                	   System.out.println("Digite o primeiro numero");
                	   double number1 = sc.nextDouble();
                	   System.out.println("Digite o segundo numero");
                	   double number2 = sc.nextDouble();
                	   math.setNumber1(number1);
                	   math.setNumber2(number2);
                	   System.out.println("Otimo agora digite as opções para realizar operação");
                	   System.out.println("Digite 1 para soma");
                	   System.out.println("Digite 2 para subtração");
                	   System.out.println("Digite 3 para multiplicação");
                	   System.out.println("Digite 4 para divisão");
                	   int chosse = sc.nextInt();
                	   math.option(chosse);
                	   math.printAll();  
                	   break;
                   case 8:
                	   System.out.println("\n------------------------"); 
                	   System.out.println("A opção escolhida foi a soma de todos numeros. Entre 1 ate seu numero");
                	   System.out.println("Entre com numero inteiro para realizar a soma");
                	   int numbers = sc.nextInt();
                	   sum.setNumber(numbers);
                	   sum.printResults();
                	   break;
                   case 9:
                	   System.out.println("\n------------------------"); 
                	   System.out.println("A opção escolhida joguinho de adivinhação");
                	   System.out.println("Digite de numero entre 0 a 3");
                	   System.out.println("Digite--0 Voce acha que estou pensando em um animal.");
                	   System.out.println("Digite--1 Voce acha que estou pensando em um carro.");
                	   System.out.println("Digite--2 Voce acha que estou pensando em dinheiro.");
                	   System.out.println("Digite--3 Voce acha que estou pensando em avião.");
                	   int option = sc.nextInt();
                	   ourMethod.setOption(option);
                	   ourMethod.mesgUser();
                	   break;
                	   
                	   
                default:
                	System.out.println("Ops! Valor errado");
                
                  }	
                         
                
                }
             
            
}
