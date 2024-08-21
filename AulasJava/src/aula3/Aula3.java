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
		System.out.printf("\n	x ^ 3 = %.0f", (double) Math.pow(a, 3));
		System.out.printf("\nraiz quadrada de x = %.2f", (double) Math.sqrt(a));
		System.out.printf("\nraiz cúbica de y = %.2f", (double) Math.cbrt(b));
		System.out.printf("\no número negativo -100, seu modulo é %d", Math.abs(-100));
		
		System.out.println("\n\nArredondamentos");
		double aux = Math.sqrt(5);
		System.out.printf("\nConsiderando a raiz quadrada de 5 = %.8f", aux);
		System.out.print("\n	Arredonando:");
		System.out.printf("\n	para baixo = %.0f", Math.floor(aux));
		System.out.printf("\n	para cima  = %.0f", Math.ceil(aux));
		System.out.printf("\n	aritmético = %d", Math.round(aux));
		
		System.out.println("\n\nNúmeros aleatórios");
		System.out.println("Os numeros gerados são maiores ou iguais a 0,0 e menores que 1,0, portanto precisamos multiplicar por multiplos de 10 para alcançar o range desejado");
		System.out.print("10 números inteiros entre 0 e 9\n");
		for(int i = 0; i<9; i++) {
			if(i < 8) {
				System.out.printf("%d, ", (int) (Math.random() * 10));
			}
			else {
				System.out.printf("%d", (int) (Math.random() * 10));
			}
		}
		
		System.out.print("\n10 números reais entre 0 e 9.9\n");
		for(int i = 0; i<9; i++) {
			if(i < 8) {
				System.out.printf("%.1f , ", (Math.random() * 10));
			}
			else {
				System.out.printf("%.1f", (Math.random() * 10));
			}
		}
		
		
	}

}
