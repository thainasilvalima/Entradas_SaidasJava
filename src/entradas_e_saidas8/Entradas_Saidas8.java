package entradas_e_saidas8;

import java.util.Scanner;

public class Entradas_Saidas8 {

	public static void main(String[] args) {
		Scanner leia8 = new Scanner (System.in); 	
		
		double cc, cf,i,pd;
		
		System.out.println("\n Qual é o custo de fábrica? ");
		 cf = leia8.nextDouble(); 
		 
		pd = cf * 0.28;
		i = cf * 0.45; 
		cc= cf+pd+i; 
	  
	  System.out.printf("\n O valor total do carro é: %.2f", cc);

	}

}
