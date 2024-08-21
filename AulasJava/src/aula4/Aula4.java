package aula4;
import java.util.Scanner;

public class Aula4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Vamos algumas operações lógicas o/");
		System.out.print("Insira um número: ");
		int a = in.nextInt();
		System.out.print("Agora outro número: ");
		int b = in.nextInt();
		
		operadorTernario(a,b);
		comparacaoString();
	}

	static void operadorTernario(int a, int b) {
		int maior;
		System.out.println("\nUtilizando operador ternário");
		maior = (a>b)?a:b;
		System.out.println("Maior: " + maior);
	}
	
	static void comparacaoString() {
		String animal1 = "Rato";
		String animal2 = "Rato";
		String animal3 = new String("Rato");
		String comp1,comp2,comp3;
		
		System.out.println("\nAnimal1 = "+ animal1 + "\nAnimal2 = "+ animal2 + "\nAnimal3 = "+ animal3);
		comp1 = (animal1==animal2)?"igual":"diferente";
		comp2 = (animal1==animal3)?"igual":"diferente";
		System.out.println("Comparação 1: " + comp1);
		System.out.println("Comparação 2: " + comp2);
		
		System.out.println("A comparacao entre animal1 e animal3 retorna diferente devido ao metodo de criacao dessas variaveis");
		System.out.println("Aqui devemos utilizar a funcao equals das string para verificar se ambas possuem o mesmo conteudo");
		comp3 = (animal1.equals(animal3))?"igual":"diferente";
		System.out.println("Comparação 3: " + comp3);
		System.out.println("A mesma logica se dá a todos os objetos e classes involucros (new Integer(), new Double(), New String() etc.");
	}
}
