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
		operacoesUnarias(a, b);
		operadoresAtribuicao(a, b);
		bibliotecaMath(a, b);
	}
	
	static void operacoesBasicas(int a, int b) {
		System.out.println("\n\nOperações básicas:");
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
	
	static void operacoesUnarias(int a, int b) {
		System.out.println("\n\nOperações unárias:");
		
		int auxa = a;
		int auxb = b;
		System.out.printf("\nDado um número %d, podemos somar +1 através do comando ++número, que resulta: %d", auxa, ++auxa);
		System.out.printf("\nUtilizando a mesma lógica para número que agora é igual a %d, o comando --número retorna ao valor anterior, ou seja, temos: %d", auxa, --auxa);
		
		System.out.println("\nMas, atenção!");
		System.out.printf("Existe também o comando número-- ou número++, essa operação não modifica o número na mesma conta, refletindo apenas na chamada seguinte");
		System.out.printf("\nEntão, dado x = %d e y = %d, x + y++ será %d e não %d", a, b, auxa + auxb++, auxa+auxb);
		System.out.printf("\nObserve que mesmo assim y foi modificado para %d, agora a conta n1 + n2 será igual a %d", auxb, auxa + auxb);
		System.out.println("\nÓtimo, agora sabemos também a diferença de pré e pós incremento");
	}
	
	static void operadoresAtribuicao(int a, int b) {
		System.out.println("\n\nOperações de atribuição:");
		
		int auxa = a;
		int auxb = b;
		System.out.println("\nNeste caso o programa realizará a conta e a atribuição na variável");
		System.out.printf("Dado x = %d e y = %d", a, b);
		auxa += auxb;
		System.out.printf("\nA operação x += y, resultará x = %d, o equivalente a x = x + y", auxa);
	}
	
	static void bibliotecaMath(int a, int b) {
		System.out.println("\n\nBiblioteca Math:");
		
		System.out.println("\nExemplos");
		System.out.printf("\nMath.PI = %.4f, o pi, neste caso com 4 casas decimais", Math.PI);
		System.out.printf("\nDado x = %d e y = %d", a, b);
		System.out.printf("\n	x ^ y = %.0f", (double) Math.pow(a, b));
		System.out.printf("\n	raiz quadrada de x = %.2f", (double) Math.sqrt(a));
		System.out.printf("\n	raiz cúbica de y = %.2f", (double) Math.cbrt(b));
		
		
		
	}

}
