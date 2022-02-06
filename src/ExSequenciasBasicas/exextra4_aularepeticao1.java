package ExSequenciasBasicas;

//contagem inteligente

import java.util.Scanner;

public class exextra4_aularepeticao1 {
	
	public static void main (String [] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int i=1; //contador ja vale 1
		double brl;
		double usd;
		int converter;

		System.out.println("Quantas vezes voc� quer converter?");
		converter = sc.nextInt();
		
		while (i <= converter) { //enquanto for menor/igual ao valor recebido, executa
			System.out.println("Qual o valor em R$?");
			brl = sc.nextDouble(); //guarda o valor digitado nas 5x que digitarem
			i = i + 1; //pra incremenar o loop e acabar no quinto num digitado
			usd = brl / 5.37;		
			System.out.println("O valor em d�lar �: " + usd);
	}
	
	}
}
