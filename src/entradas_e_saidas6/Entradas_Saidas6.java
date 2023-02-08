package entradas_e_saidas6;

import java.util.Scanner;

public class Entradas_Saidas6 {

	public static void main(String[] args) {
	Scanner leia6 = new Scanner (System.in); 
		
	double x1,x2,y1,y2,d,pt1,pt2; 
	
	 System.out.println("\nQual valor do x1? ");
	 x1 = leia6.nextDouble(); 
	 System.out.println("\nQual valor do x2? ");
	 x2 = leia6.nextDouble(); 
	 System.out.println("\nQual valor do y1? ");
	 y1 = leia6.nextDouble(); 
	 System.out.println("\nQual valor do y2? ");
	 y2 = leia6.nextDouble(); 
	 
	 pt1 = Math.pow((x2-x1),2);
	 pt2 = Math.pow ((y2-y1),2);
	 
	 d= Math.sqrt(pt1+pt2); 
	 
	 System.out.printf("O cálculo final é: %.2f ",d);	
	 
	 
	 
	  
	}

}
