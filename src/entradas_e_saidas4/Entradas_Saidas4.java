package entradas_e_saidas4;

import java.util.Scanner;

public class Entradas_Saidas4 {

	public static void main(String[] args) {
   Scanner leia4 = new Scanner (System.in); 	
   
   double a,b,c,r,s,d; 
   
   System.out.println("\nDigite um número: ");
	 a = leia4.nextDouble(); 
	 
   System.out.println("\nDigite outro número: ");
	 b = leia4.nextDouble(); 
   
   System.out.println("\nDigite mais um número: ");
	 c = leia4.nextDouble(); 

	 r = Math.pow((a+b),2) ;
	 s = Math.pow((b+c),2) ;
	 d = r+s /2; 
	 
	 System.out.printf("\nO valor total do calculo é: %.1f",d );	
	 
	}

}
