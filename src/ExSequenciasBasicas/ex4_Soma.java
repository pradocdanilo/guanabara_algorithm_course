package ExSequenciasBasicas;

//Desenvolva um algoritmo que leia dois n�meros inteiros e mostre o somat�rio entre eles.Ex:
//Digite um valor: 8
//Digite outro valor: 5
//A soma entre 8 e 5 � igual a 13.

import java.util.Scanner;

public class ex4_Soma {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);

		int num1;
		int num2;
		int soma;
		
		System.out.println("Digite o primeiro número: ");
		num1 = sc.nextInt();			
		System.out.println("Digite o segundo número: ");
		num2 = sc.nextInt();		
		
		soma = num1 + num2;
		System.out.println("A soma entre "+ num1 + " e " + num2 + " é " + soma);
		
		
		
	}
}
