package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class App {

	public static void main(String[] args) {
		DateTimeFormatter ftm = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe dados do cliente: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Nascimento (DD/MM/YYYY): ");
		String nascimento = sc.nextLine();
		LocalDate dataNasciment = LocalDate.parse(nascimento, ftm);
		Client ct = new Client(nome, email, dataNasciment);
		
		System.out.println("Dados do pedido: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.nextLine());
		LocalDate agora = LocalDate.now();
		Order order = new Order(agora, status, ct);
		
		
		
		System.out.print("Quantos itens: ");
		int quantidadeItens = sc.nextInt();
		sc.nextLine();
		
		
		for (int i = 0; i < quantidadeItens; i++) {
			System.out.println("Produto #" + (i+1));
			System.out.print("Nome do produto: ");
			String nomeProduto = sc.nextLine();
			
			System.out.print("Preço do produto: ");
			Double valorProduto =sc.nextDouble();
			
			System.out.print("Quantidade: ");
			Integer quantidade = sc.nextInt();
			
			sc.nextLine();
			Product pd = new Product(nomeProduto, valorProduto);
			OrderItem item = new OrderItem(quantidade, valorProduto, pd);
			order.addItem(item);
		}
		
		
		
		
		System.out.println("Lista de produtos: ");
		System.out.println(order);
		
		sc.close();

	}

}
