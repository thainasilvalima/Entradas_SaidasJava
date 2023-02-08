package entradas_e_saidas5;

import java.util.Scanner;

public class Entradas_Saidas5 {

	public static void main(String[] args) {
	Scanner leia5 = new Scanner (System.in); 
	
	double n1,n2,n3,mediaFinal;
	
	System.out.println("\nDigite a nota 1 ");
	 n1 = leia5.nextDouble(); 
	 
	 System.out.println("\nDigite a nota 2 ");
	 n2 = leia5.nextDouble(); 
	 
	 System.out.println("\nDigite a nota 3 ");
	 n3 = leia5.nextDouble(); 
	 
	 mediaFinal = ((n1*2)+(n2*3)+(n3*5)) /10; 
	 
	 System.out.printf("\nA média ponderada do aluno é: %.1f ", mediaFinal );	

	 
	}

}
