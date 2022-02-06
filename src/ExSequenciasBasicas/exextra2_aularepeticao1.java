package ExSequenciasBasicas;

import java.util.Scanner;

public class exextra2_aularepeticao1 {
	
	public static void main (String [] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int i=0;
		int valor;
		int salto;
		
		System.out.println("Que contar at� quanto?");
		valor = sc.nextInt();
		
		System.out.println("Quer pular quanto?");
		salto = sc.nextInt();	
		
		while (i <= valor) { //enquanto for menor/igual ao valor recebido, executa
			System.out.println(i);
			i = i + salto; //contador recebe o salto
				
	}
		
		System.out.println("Terminei de contar!");
	}
}
