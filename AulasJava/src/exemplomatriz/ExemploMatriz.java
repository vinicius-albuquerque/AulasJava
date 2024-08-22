package exemplomatriz;

import java.util.Scanner;

public class ExemploMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		//Vamos criar uma matriz
		int m[][] = new int [3][4];
		
		//preenchendo vetor
		for(int i = 0; i < m.length; i++)
		{
			for(int j = 0; j < m[i].length; j++) {
				m[i][j] = (int) (Math.random() * 10);
			}	
		}
		
		//imprimindo
		//aproveitando pra usar for each
		for(int i = 0; i<m.length;i++) {
			for(int celula : m[i]) {
				System.out.print(" " + celula + " ");
			}
			System.out.print("\n");
		}
		
		in.close();
	}

}
