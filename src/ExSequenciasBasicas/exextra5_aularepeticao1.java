package ExSequenciasBasicas;

//CONTADOR INTELIGENTE

import java.util.Scanner;

public class exextra5_aularepeticao1 {
	
	public static void main (String [] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int i;
		int contInicio;
		int contFinal;

		System.out.println("Qual o início?");
		contInicio = sc.nextInt();
		System.out.println("Qual o fim?");
		contFinal = sc.nextInt();
		
		if (contFinal > contInicio) { //Se o final for maior que o inicio, ai o contador recebe o contInicio
			i = contInicio;
			System.out.println("Caiu no if");
			while (i <= contFinal) {
				System.out.println(i + "..");
				i = i + 1;
			}
		} 
		else {
			i = contInicio;
			while (i >= contFinal) {
				System.out.println(i +"..");
				i = i - 1;
			}
		}	
	}
}
