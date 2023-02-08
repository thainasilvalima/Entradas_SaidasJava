package entradas_e_saidas3;

import java.util.Scanner;

public class Entradas_Saidas3 {

	public static void main(String[] args) {
	Scanner leia3 = new Scanner (System.in); 
	
	 int horas, minutos, segundos, duracao; 
	
	 System.out.println("\nQuantos segundos durou o evento?:   ");
	 duracao = leia3.nextInt(); 
	
      horas = duracao/3600; 
      minutos = (duracao%3600)/60; 
      segundos = (duracao%3600)%60; 
       
	System.out.println("\nO evento durou " + horas + " hora(s) " + minutos + " minuto(s) " + segundos + " segundo(s)");

	
     

	}

}
