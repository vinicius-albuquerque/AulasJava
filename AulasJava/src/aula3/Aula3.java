package aula3;
import java.util.Scanner;

public class Aula3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Vamos realizar algumas operações matemáticas o/");
		System.out.print("Insira um número: ");
		int a = in.nextInt();
		System.out.print("Agora outro número: ");
		int b = in.nextInt();
		
		System.out.println("Ok, vamos lá!");
		operacoesBasicas(a, b);
		
		
		
	}
	
	static void operacoesBasicas(int a, int b) {
		System.out.println("\nOperações básicas:");
		int soma = a + b;
		int subt = a - b;
		int mult = a * b;
		double divs = (double) a / b;
		int rsto = a % b;
		
		System.out.printf("\nA soma de %d e %d é %d", a, b, soma);
		System.out.printf("\nSubtraindo  %d de %d é %d", b, a, subt);
		System.out.printf("\nA multiplicação de %d e %d é %d", a, b, mult);
		System.out.printf("\nA divisão de %d por %d é %.2f", a, b, divs);
		System.out.printf("\nO resto da divisão de %d por %d é %d", a, b, rsto);
	}
	
	static void operacoesUnarias(double a, double b) {
		System.out.println("\nOperações unárias:");
		
		System.out.println("Dado um numero %.2f");
	}

}
