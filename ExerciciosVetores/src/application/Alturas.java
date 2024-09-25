package application;

import java.util.Scanner;

import entities.Pessoa;

public class Alturas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantidade de pessoas: ");
		int quantidade = sc.nextInt();
		double somaAltura = 0;
		int idadeMenor = 0;
		
		Pessoa[] vect = new Pessoa[quantidade];
		
		for (int i = 0; i < vect.length; i ++) {
			System.out.println("Dados da pessoa " + (i+1));
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			
			vect[i] = new Pessoa(nome, idade, altura);
		}
		
		for (int i = 0; i < vect.length; i ++) {
			somaAltura += vect[i].getAltura();
			if (vect[i].getIdade() < 16) {
				idadeMenor++;
			}
		}
		
		System.out.println("Altura media: " + somaAltura / vect.length);
		System.out.println("Pessoas com menos de 16 anos: " + ((idadeMenor * 100) / vect.length) + "%");
		for (int i = 0; i < vect.length; i++) {
			if(vect[i].getIdade() < 16) {
				System.out.println(vect[i].getNome());
			}
		}

	}

}
