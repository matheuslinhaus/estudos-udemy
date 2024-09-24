package application;

import java.util.Scanner;

import entities.Salario;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Salario slr = new Salario();
		Double percentualAumento;
		
		System.out.print("Nome: ");
		slr.setNome(sc.next());
		
		System.out.print("Salário: ");
		slr.setSalario(sc.nextDouble());
		
		System.out.print("Taxa: ");
		slr.setTaxa(sc.nextDouble());
		
		System.out.println();
		System.out.println("Salario: " + slr.getNome() + ", R$ " + slr.salarioLiquido());
		
		System.out.print("Quantidade percentual de beneficio: ");
		percentualAumento = slr.incrementoSalarial(sc.nextDouble());
		
		System.out.printf("Salario com aumento: " + slr.getNome() + ", R$ " + "%.2f",(slr.salarioLiquido() + percentualAumento));
		
		sc.close();

	}

}
