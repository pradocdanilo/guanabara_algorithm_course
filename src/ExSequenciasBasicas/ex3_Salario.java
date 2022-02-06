package ExSequenciasBasicas;

import java.util.Scanner;

//Crie um programa que leia o nome e o sal�rio de um funcion�rio, mostrando no
//final uma mensagem.
//Ex:
//Nome do Funcion�rio: Maria do Carmo
//Sal�rio: 1850,45
//O funcion�rio Maria do Carmo tem um sal�rio de R$1850,45 em Junho.

public class ex3_Salario {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		String nome;
		long salario;
		
		System.out.println("Qual o nome do funcion�rio?");
		nome = sc.next();
		System.out.println("Qual o sal�rio do funcionário?");
		salario = sc.nextLong();		
		
		System.out.println("O funcionário "+ nome + " irá receber um salário de R$" + salario + " em Junho.");		
		
	}

	
	
}
