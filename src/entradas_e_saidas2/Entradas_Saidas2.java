package entradas_e_saidas2;

import java.util.Scanner;

public class Entradas_Saidas2 {

	public static void main(String[] args) {
    Scanner leia2 = new Scanner (System.in); 

    int idade, meses, dias, ano; 
    
    System.out.println("\nQuantos dias de vida você tem?:  ");
	idade = leia2.nextInt(); 
	
	ano = idade /365; 
	meses = (idade%365)/30;
	dias = ((idade%365)%30); 
	
	System.out.println("\nVocê tem " + ano + " anos " + meses + " meses " + dias + " dias");
	
	
	
	}

}
