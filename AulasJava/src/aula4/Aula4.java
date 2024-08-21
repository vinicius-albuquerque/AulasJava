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
		operadoresLogicos(a,b);
		usandoSwitch();
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
	
	static void operadoresLogicos(int x, int y) {
		boolean ex;
		
		System.out.println("\n\nx = " + x + "  y = " + y);
		//Operador E && AND
		ex = x>5 && y>5;
		System.out.println("x E y maior que 5? " + ex);
		
		//Operador OU || OR
		ex = x>5 || y>5;
		System.out.println("x OU y maior que 5? " + ex);
		
		//Uso do não
		ex = !(x==5) && (y>5);
		System.out.println("x não maior que 5 E y maior que 5? " + ex);
		
		//Operador Exclusivo / AND
		ex = (x>5) ^ (y>5);
		System.out.println("ou x maior que 5 ou y e exclusivamente y maior que 5? " + ex);
		//ambos maior que 5 = false
		//apenas um maior que cinco = true
		//nenhum maior que 5 = false
	}
	
	static void usandoSwitch() {
		Scanner kb = new Scanner(System.in);
		System.out.println("\n\nSwitch");
		System.out.println("Qual dia devo pagar as contas? ");
		String conta =  kb.nextLine();
		String auxConta = conta.toUpperCase();
		int dia;
		
		switch (auxConta) {
		case "AGUA":
			dia = 4;
			break;
		case "LUZ":
			dia = 20;
			break;
		case "INTERNET", "ALUGUEL":
			dia = 10;
			break;
		case "CONDOMINIO":
			dia = 15;
			break;
		case "GAS":
			dia = 28;
			break;
		default:
			dia = 1;
		}
		
		System.out.println("A conta " + conta + " deve ser paga dia " + dia);
	}
}
