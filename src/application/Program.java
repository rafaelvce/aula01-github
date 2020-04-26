package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de linhas e colunas: ");
		int li = sc.nextInt();
		int col = sc.nextInt();
		int[][] mat = new int[li][col];

		System.out.println("Digite os valores para as linhas/colunas: ");

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println("Digite um número: ");
		int num = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == num) {
					System.out.println("Position: " + i + ", " + j);
					if (i - 1 >= 0) {
						System.out.println("Up :" + mat[i - 1][j]);
					}
					if (i + 1 < mat[i].length) {
						System.out.println("Down :" + mat[i + 1][j]);
					}
					if (j - 1 >= 0) {
						System.out.println("Left :" + mat[i][j - 1]);
					}
					if (j + 1 < mat.length) {
						System.out.println("Right :" + mat[i][j + 1]);
					}

				}
			}
		}		
		sc.close();
	}
}