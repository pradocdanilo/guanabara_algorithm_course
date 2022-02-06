package ExSequenciasBasicas;

import java.util.Scanner;

//Fa�a um programa que leia um n�mero inteiro e mostre o seu antecessor e seu sucessor.
//Ex:
//Digite um n�mero: 9
//O antecessor de 9 � 8
//O sucessor de 9 � 10

public class ex6_SucessorAntecessor {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um n�mero: ");
		int num = sc.nextInt();
		
		int antecessor = num - 1;
		int sucessor = num + 1;
		System.out.println("O número é "+ num + ", seu antecessor é " + antecessor + " e seu sucessor é " + sucessor);
		
		
	}
	
	

}
