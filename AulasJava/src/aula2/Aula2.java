package aula2;
import java.util.Scanner;

public class Aula2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		variaveis();
		imprimindo();
		entradaDeDados();
		calcularIMC();
		convertendoValores();
	}
	
	static void variaveis() {
		
		System.out.println("**Imprimindo variáveis diferentes**");
		//iniciando variavel
		int idade;
		idade = 18;
		
		//declaracao direta
		float altura = 1.80f;
		
		System.out.print("A pessoa tem " + idade + " anos");
		System.out.println(" e " + altura + " metros de altura.");
		
		
		// tipo char (aceita apenas uma letra e aspas simples)
		char inicial = 'C';
		System.out.println(inicial);
		
		//boolean
		boolean casado = true;
		boolean cr7 = false;
		
		System.out.println(casado);
		System.out.print(cr7);
		
		//
	}
	
	static void imprimindo() {
		System.out.println("\n\n**Imprimindo strings com format e normal**");
		//imprimindo de outras formas
		//2024-08-18
		String nome = "W. Rato";
		float sofaScore = 7.2f;
		System.out.print("Jogador: " + nome);
		System.out.print(" | nota Sofascore: " + sofaScore);
		
		
		//Usando print f
		nome = "Rafael";
		sofaScore = 7f;
		System.out.print("\nJogador: " + nome);
		System.out.printf(" | nota Sofascore: %f", sofaScore);
		
		
		//Usando print f controlando numero de casas decimais
		nome = "Luciano";
		sofaScore = 6.9f;	
		System.out.print("\nJogador: " + nome);
		System.out.printf(" | nota Sofascore: %.2f", sofaScore);
		
		
		//Usando print format controlando numero de casas decimais
		nome = "Calleri";
		sofaScore = 6.7f;	
		System.out.print("\nJogador: " + nome);
		System.out.format(" | nota Sofascore: %.1f", sofaScore);
	}
	
	static void entradaDeDados() {
		System.out.println("\n\n**Treinando entrada de dados**");
		Scanner in = new Scanner(System.in);
		
		System.out.println("Qual seu nome?");
		String nome = in.nextLine();
		System.out.println("Qual sua idade?");
		int idade = in.nextInt();
		
		if(idade <0) {
			System.out.printf("%s sua idade é negativa????????",nome);
		}
		else if(idade == 1) {
			System.out.printf("%s tem %d ano de idade",nome, idade);
		}
		else {
			System.out.printf("%s tem %d anos de idade",nome, idade);
		}
		
	}
	
	static void calcularIMC() {
		System.out.println("\n\n**Treinando calculos com IMC**");
		Scanner scn = new Scanner(System.in);
		boolean varCorreta = false;
		double altura, peso, imc;
		
		System.out.println("\nVamos lá, precisamos calcular seu IMC");
		
		//altura
		do {
			System.out.println("\nQual sua altura?\nEm metros, utilize , para decimal");
			altura = scn.nextDouble();
			if(altura <= 0) {
				System.out.println("Altura inválida, vamos tentar novamente.");
			}
			else {
				varCorreta = true;
			}
		} while (varCorreta == false);
		
		varCorreta = false;
		//peso
		do {
			System.out.println("\nQual seu peso?\nEm kilogramas, utilize , para decimal");
			peso = scn.nextDouble();
			if(peso <= 0) {
				System.out.println("Peso inválido, vamos tentar novamente.");
			}
			else {
				varCorreta = true;
			}
		} while (varCorreta == false);
		
		
		imc = peso/(Math.pow(altura, 2));
		
		System.out.printf("\nSeu IMC é %.2f",imc);
	}
	
	static void convertendoValores() {
		System.out.println("\n\n**Treinando conversoes de valores**");
		Scanner cnv = new Scanner(System.in);
		
		System.out.println("Parse de Double");
		System.out.println("Insira um numero decimal, utilizando o separador `.`");
		double conv = Double.parseDouble(cnv.nextLine());
		System.out.printf("Numero com 2 casas decimais %.2f",conv);
		
		System.out.println("\nAgora int para string");
		System.out.println("Insira um numero inteiro");
		int valor = cnv.nextInt();
		String texto = Integer.toString(valor);
		System.out.println(texto.substring(0,1));
	}

}
