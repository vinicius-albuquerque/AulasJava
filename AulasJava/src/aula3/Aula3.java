package aula3;
import java.util.Scanner;

public class Aula3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		operacoesBasicas(in);
		
	}
	
	static void operacoesBasicas(Scanner in) {
		double a, b;
		System.out.println("Vamos realizar algumas operações básicas");
		System.out.println("Insira um número:");
		a = in.nextDouble();
		System.out.println("Agora outro número");
		b = in.nextDouble();
		
		System.out.println("Ok, vamos lá!");
		double soma = a + b;
		double subt = a - b;
		double mult = a * b;
		double divs = a / b;
		double rsto = a % b;
		
		System.out.printf("\nA soma de %f e %f é %f", a, b, soma);
		System.out.printf("\nSubtraindo  %f de %f é %f", b, a, subt);
		System.out.printf("\nA multiplicação de %f e %f é %f", a, b, mult);
		System.out.printf("\nA divisão de %f por %f é %f", a, b, divs);
		System.out.printf("\nO resto da divisão de %f por %f é %f", a, b, rsto);
	}

}
