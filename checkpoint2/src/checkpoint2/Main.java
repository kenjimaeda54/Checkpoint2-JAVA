package checkpoint2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
         
	     Menu menu = new Menu();
	     System.out.println("Seja bem vindo a nossa calculadora");
	     System.out.println("Digite- 1 para conveter celisus para fahrenheit");
	     System.out.println("Digite- 2 para calculo area do retangulo");
	     System.out.println("Digite- 3 para calculo area do circulo");
	     System.out.println("Digite- 4 para calculo da velocidade media");
	     System.out.println("Digite- 5 para calculo da  média aritimética");
	     System.out.println("Digite- 6 para calculo da  média ponderada");
	     System.out.println("Digite- 7 para operação matematica");
	     System.out.println("Digite- 8 para resultado da soma de todos numeros entre 1 ate seu numero");
	     System.out.println("Digite- 9 para um joguinho de adivinhação");
	     int number = sc.nextInt();
	     menu.calc(number);
	   
				 
				 
				 
         sc.close();
	}

}
