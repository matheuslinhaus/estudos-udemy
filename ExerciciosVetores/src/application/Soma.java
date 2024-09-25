package application;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double soma = 0;
		System.out.print("Quantidade de numeros: ");
		int quantidade = sc.nextInt();
		
		double[] vect = new double[quantidade];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite o numero: ");
			vect[i] = sc.nextDouble();
		}
		
		System.out.print("Valores: ");
		for (int i = 0; i < vect.length; i++) {
			soma += vect[i];
			System.out.print(vect[i] + " ");
			System.out.println();
		}
		
		System.out.println("Soma: " + soma);
		System.out.println("Media: " + soma / vect.length);
		
		sc.close();
	}
}
