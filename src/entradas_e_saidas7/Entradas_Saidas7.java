package entradas_e_saidas7;

import java.util.Scanner;

public class Entradas_Saidas7 {

	public static void main(String[] args) {

	Scanner leia7 = new Scanner (System.in); 	
	
	double a,b,c,d,e,f,x,y;
	
	 System.out.println("\nQual valor do a? ");
	 a = leia7.nextDouble(); 
	 System.out.println("\nQual valor do b? ");
	 b = leia7.nextDouble(); 
	 System.out.println("\nQual valor do c? ");
	 c = leia7.nextDouble(); 
	 System.out.println("\nQual valor do d? ");
	 d = leia7.nextDouble(); 
	 System.out.println("\nQual valor do e? ");
	 e = leia7.nextDouble();
	 System.out.println("\nQual valor do f? ");
	 f = leia7.nextDouble(); 
	 
	 x = (c*e - b*f)/ (a*e - b*d);
	 y = (a*f - c*d)/ (a*e - b*d);
	 
	 System.out.println("\n valor de x foi: " +x);
	 System.out.println("\n valor de y foi: " +y);
	 
	}

}
