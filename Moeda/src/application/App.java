package application;

import java.util.Scanner;

import util.ConversorMoedas;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual valor do dolar: ");
		Double dolar = sc.nextDouble();
		
		System.out.print("Quantos dolares deseja comprar: ");
		Double quantidade = sc.nextDouble();
		
		System.out.printf("Valor total da compra: %.2f", ConversorMoedas.calcularCompra(dolar, quantidade));
	}

}
