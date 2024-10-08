package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantidade de pessoas pagantes de taxa: ");
		int quantidade = sc.nextInt();
		
		List<Pessoa> list = new ArrayList<>();
		
		for (int i = 1; i <= quantidade; i++) {
			System.out.println("Dados pagamento pessoa #" + i);
			System.out.print("Fisica ou Juridica (f/j)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Ganhos anuais: ");
			double ganhoAnual = sc.nextDouble();
			if (ch == 'f') {
				System.out.print("Custos de saude: ");
				double custoSaude = sc.nextDouble();
				list.add(new PessoaFisica(nome, ganhoAnual, custoSaude));
			} 
			if (ch == 'j') {
				System.out.print("Numero de funcionarios: ");
				int funcionarios = sc.nextInt();
				list.add(new PessoaJuridica(nome, ganhoAnual, funcionarios));	
			}
		}
		
		System.out.println();
		System.out.println("Taxa paga: ");
		for (Pessoa ps : list) {
			System.out.println(ps.toString());
		}
		
		double total = 0;
		for (Pessoa ps : list) {
			total += ps.impostoPago();
		}
		
		System.out.println("Total de taxa: " + String.format("%.2f", total));
		
		sc.close();

	}

}
