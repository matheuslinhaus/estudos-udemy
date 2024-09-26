package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe a quantidade de funcionarios: ");
		int quantidade = sc.nextInt();
		List<Funcionario> lista = new ArrayList<>();

		for (int i = 0; i < quantidade; i++) {
			System.out.println("Funcionario #" + (i + 1));
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();

			System.out.print("Salario: ");
			double salario = sc.nextDouble();

			Funcionario func = new Funcionario(id, nome, salario);
			lista.add(func);
		}

		System.out.print("Informe o código do funcionario para aumento: ");
		int idFuncionario = sc.nextInt();
		
		//outra forma de fazer alem do for feito no metodo posicao
		Funcionario posicao = lista.stream().filter(x -> x.getId() == idFuncionario).findFirst().orElse(null);
		//Integer posicao = posicao(lista, idFuncionario);

		if (posicao == null) {
			System.out.println("Esse código não existe");
		} else {
			System.out.print("Informe o percentual de aumento: ");
			double percentualAumento = sc.nextDouble();

			posicao.percentualAumentaSalario(percentualAumento);
		}



		System.out.println("Lista de funcionarios: ");

		for (Funcionario e : lista) {
			System.out.println(e.toString());
		}
	}

	private static Integer posicao(List<Funcionario> lista, int idFuncionario) {

		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getId() == idFuncionario) {
				return i;
			}
		}
		return null;
	}

}
