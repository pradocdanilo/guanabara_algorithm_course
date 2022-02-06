package ExSequenciasBasicas;

import java.util.Scanner;

//Fa�a um programa que leia as duas notas de um aluno em uma mat�ria e mostre
//na tela a sua m�dia na disciplina.
//Ex:
//Nota 1: 4.5
//Nota 2: 8.5
//A m�dia entre 4.5 e 8.5 � igual a 6.5

public class ex5_DuasNotas {
	
	public static void main (String[] args) {
		
		int nota1;
		int nota2;
		int media=0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a primeira nota: ");
		nota1 = sc.nextInt();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = sc.nextInt();		
		
		media = (nota1 + nota2) / 2;
		System.out.println("A sua média foi de: " + media);		
		
		
	}
	
	

}
