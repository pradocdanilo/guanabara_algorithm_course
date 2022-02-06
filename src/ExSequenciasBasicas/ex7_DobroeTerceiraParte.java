package ExSequenciasBasicas;

//Crie um algoritmo que leia um n�mero real e mostre na tela o seu dobro e a sua ter�a parte.
//Ex:
//Digite um n�mero: 3.5
//O dobro de 3.5 � 7.0
//A ter�a parte de 3.5 � 1.16666

import java.util.Scanner;

public class ex7_DobroeTerceiraParte {
	
	public static void main (String[] args) {
	
		Scanner sc= new Scanner(System.in);
	
		int num;
		int dobro;
		int terc;
	
		System.out.println("Digite um número: ");
		num = sc.nextInt();
		
		dobro= num * 2;
		terc= num / 3;
		
		System.out.println("O número é " + num + ", seu dobro é "+ dobro + " e sua terceira parte é "+terc );
			
	}

}
