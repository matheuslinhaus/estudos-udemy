package application;

import java.util.Scanner;

import entities.Retangulo;

public class Dados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Retangulo ret = new Retangulo();
		
		System.out.println("Informe a altura e largura do retangulo: ");
		ret.setAltura(sc.nextDouble());
		ret.setLargura(sc.nextDouble());
		
		System.out.println("Area: " + ret.area());
		System.out.println("Perimetro: " + ret.perimetro());
		System.out.println("Diagonal: " + ret.diagonal());
		
		sc.close();
	}

}
