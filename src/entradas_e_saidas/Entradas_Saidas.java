package entradas_e_saidas;

import java.util.Scanner;

public class Entradas_Saidas {

	public static void main(String[] args) {
	Scanner leia = new Scanner (System.in); 
	
	int anos, meses, dias, totalDias; 
	
	System.out.println("\nQuantos anos você tem?: ");
	anos= leia.nextInt(); 
	
	System.out.println("\nQuantos meses você tem?: ");
	meses = leia.nextInt(); 
	
	System.out.println("\nQuantos dias você tem?: ");
	 dias = leia.nextInt(); 
	 
	totalDias = (anos*365) + (meses*30) + dias;
		
	System.out.println("\n O total de dias que você tem de vida é: " + totalDias);
	
	}

}
