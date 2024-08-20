package aula2;

public class Aula2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		variaveis();
		imprimindo();
	}
	
	static void variaveis() {
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
		//imprimindo de outras formas
		//2024-08-18
		String nome = "W. Rato";
		float sofaScore = 7.2f;
		System.out.print("\nJogador: " + nome);
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

}
