package ExSequenciasBasicas;

//MELHOR ALUNO DA TURMA

import java.util.Scanner;

public class exextra6_aularepeticao1 {
	
	public static void main (String [] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int i=1; //contador ja vale 1
		double nota;
		int turma;
		String nome;
		double maiorNota=0;
		String melhorAluno = null;


		System.out.println("============================");		
		System.out.println("Quantos alunos tem na turma?");		
		turma = sc.nextInt();
		
		while (i <= turma){ // Contador j� est� com o valor 1. Enquanto o contador for menor/igual que o num da turma, ele conta.
			System.out.println("============================");	
			System.out.println("ALUNO "+i);
			System.out.println("Nome do aluno:");				
			nome = sc.next();
			System.out.println("Nota do aluno:");				
			nota = sc.nextInt();
			
			if (nota > maiorNota) { //Se a nota for maior que o a variavel maiorNota, ent�o ele seleciona abaixo
				maiorNota = nota; //A maior nota se aloca aqui
				melhorAluno = nome; //O nome do melhor aluno se aloca aqui							
			}			
			i = i + 1;
			
	}
		System.out.println("============================");	
		System.out.println("O melhor aluno foi " + melhorAluno + " com nota: " + maiorNota);
		System.out.println("============================");	
		
		
	}
}

