package aula2;

public class Aula2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		variaveis();
	}
	
	static void variaveis() {
		//iniciando variavel
		int idade;
		idade = 18;
		
		//declaracao direta
		float altura = 1.80f;
		
		System.out.print("A pessoa tem " + idade + " anos");
		System.out.println(" e " + altura + " metros de altura.");
		
		
		// tipo char (aceita apenas uma letra)
		char inicial = 'C';
		System.out.println(inicial);
		
		//boolean
		boolean casado = true;
		boolean cr7 = false;
		
		System.out.println(casado);
		System.out.print(cr7);
		
	}

}
