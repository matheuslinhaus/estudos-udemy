package application;

import java.util.Scanner;

import entities.Conta;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int conta;
		String nome = "";
		String deposito = "";
		double valorInicial = 0;

		System.out.print("Digite o numero da conta: ");
		conta = sc.nextInt();
		
		System.out.print("Digite o nome do titular da conta: ");
		nome = sc.next();
		
		System.out.print("Deseja um deposito inicial (S/N)? ");
		deposito = sc.next();
		
		if(deposito.toUpperCase().equals("S")) {
			System.out.print("Digite o valor de deposito: ");
			valorInicial = sc.nextDouble();	
		}
		
		Conta ct = new Conta(conta, nome, valorInicial);
		
		
		System.out.println("Dados da conta:");
		System.out.println(ct.toString());
		
		System.out.print("Digite o valor do deposito: ");
		ct.deposito(sc.nextDouble());
		
		System.out.println("Dados da conta:");
		System.out.println(ct.toString());
		
		System.out.print("Digite o valor do saque: ");
		ct.saque(sc.nextDouble());
		
		System.out.println("Dados da conta:");
		System.out.println(ct.toString());
		
		sc.close();

	}

}
