package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class App {

	public static void main(String[] args) {
		DateTimeFormatter fdt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os dados do contrato:");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), fdt);
		System.out.print("Valor do contrato: ");
		Double valueContract = sc.nextDouble();
		
		Contract ct = new Contract(number, date, valueContract);
		
		System.out.print("Entre com o numero de parcelas: ");
		int quantityInstallment = sc.nextInt();
		
		ContractService contractService = new ContractService(new PaypalService());
		
		contractService.processContract(ct, quantityInstallment);
		
		for (Installment installment : ct.getList()) {
			System.out.println(installment);
		}
		
		
		

		
		
		
		sc.close();

	}

}
