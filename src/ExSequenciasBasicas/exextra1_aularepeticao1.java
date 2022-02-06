package ExSequenciasBasicas;

//receber 5 numeros e somar

import java.util.Scanner;

public class exextra1_aularepeticao1 {
	
	public static void main (String [] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int i=1; //contador ja vale 1
		int valor;
		int soma=0; //soma zerada
			
		while (i <= 5) { //enquanto for menor/igual ao valor recebido, executa
			System.out.println("Digite o "+ i + "� valor: ");
			valor = sc.nextInt(); //guarda o valor digitado nas 5x que digitarem
			soma = soma + valor; // somo o valor e guardo na variavel soma a cada looping
			i = i + 1 ; //contador incrementa 1
	}
		
		System.out.println("A soma de todos os n�meros �: " + soma);
	}
}
