package exemplovetor;

import java.util.Scanner;

public class ExemploVetorString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int tam;
		
		System.out.println("Vamos criar um vetor de nomes e iterar o/");
		
		
		do {
			System.out.println("Quantos nomes deseja adicionar ao vetor");
			tam = in.nextInt();	
			
			if(tam <= 0) {
				System.out.println("Por favor, insira um valor positivo maior que 0.\nVamos tentar novamente...");
			}
		}while(tam <= 0);
		
		String nomes [] = new String [tam];
		
		//preenchendo vetor
		for(int i = 0; i < nomes.length; i++) {
			System.out.printf("nome%d = ", i+1);
			nomes[i] = sc.nextLine();
		}
		
		//SINTAXE
		// tipo de conteúdo do vetor espaço nome da variavel : nome do vetor
		for(String nome : nomes) {
			System.out.println(nome);
		}
		
		in.close();
		sc.close();
	}

}
