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
	}

	static void operadorTernario(int a, int b) {
		int maior;
		System.out.println("\nUtilizando operador ternário");
		maior = (a>b)?a:b;
		System.out.println("Maior: " + maior);
	}
}
