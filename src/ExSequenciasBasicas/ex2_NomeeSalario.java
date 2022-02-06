package ExSequenciasBasicas;

import java.util.Scanner;

//Fa�a um programa que leia o nome de uma pessoa e mostre uma mensagem de boasvindas
//para ela:
//Ex:
//Qual � o seu nome? Jo�o da Silva
//Ol� Jo�o da Silva, � um prazer te conhecer!

public class ex2_NomeeSalario {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		String nome;		
		System.out.println("Qual o seu nome?");
		nome = sc.next();
		System.out.println("Olá "+ nome + ", é um prazer te conhecer!");		
		
	}

}
