package application;

import java.util.Scanner;

public class Negativos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quantidade;
		int[] vectInt;
		
		System.out.print("Quantos numeros deseja informar? ");
		
		quantidade = sc.nextInt();
		vectInt = new int[quantidade];
		
		for (int i = 0; i < vectInt.length; i++) {
			System.out.print("Digite um numero: ");
			vectInt[i] = sc.nextInt();
		}
		
		System.out.println("Numeros negativos: ");
		
		for (int i = 0; i < vectInt.length; i++) {
			if(vectInt[i] < 0) {
				System.out.println(vectInt[i]);
			}
		}
		
		sc.close();
	}
}
