package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AppSet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> set = new HashSet<>();

		System.out.print("Quantidade de alunos no Curso A: ");
		int quantity = sc.nextInt();

		for (int i = 0; i < quantity; i++) {
			set.add(sc.nextInt());
		}
		
		System.out.print("Quantidade de alunos no Curso B: ");
		quantity = sc.nextInt();

		for (int i = 0; i < quantity; i++) {
			set.add(sc.nextInt());
		}
		
		System.out.print("Quantidade de alunos no Curso C: ");
		quantity = sc.nextInt();

		for (int i = 0; i < quantity; i++) {
			set.add(sc.nextInt());
		}

		System.out.println("Total alunos: " + set.size());
		sc.close();

	}

}
