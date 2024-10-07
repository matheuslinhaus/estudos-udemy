package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class App {

	public static void main(String[] args) {
		DateTimeFormatter ftm = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe quantidade de produtos: ");
		int quantidade = sc.nextInt();
		
		List<Product> list = new ArrayList<>();
		
		for (int i= 1; i <= quantidade; i++) {
			System.out.println("Informe dados do produto #" + i);
			System.out.print("Comum, usado, importado: (c/u/i)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Infome nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Informe o preço: ");
			double preco = sc.nextDouble();
			
			if (ch == 'c') {
				Product product = new Product(nome, preco);
				list.add(product);
			}
			
			if (ch == 'u') {
				System.out.print("Data de fabricação: ");
				String data = sc.next();
				LocalDate manufactureDate = LocalDate.parse(data, ftm);
				Product product = new UsedProduct(nome, preco, manufactureDate);
				list.add(product);
			}
			
			if (ch == 'i') {
				System.out.print("Taxa de importação: ");
				double taxa = sc.nextDouble();
				Product product = new ImportedProduct(nome, preco, taxa);
				list.add(product);
			}
		}
		
		for (Product pt : list) {
			System.out.println(pt.priceTag());
		}
		
		sc.close();
	}

}
