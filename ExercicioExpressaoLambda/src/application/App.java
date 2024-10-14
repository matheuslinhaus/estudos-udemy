package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String path = "C:\\temp\\inLambda.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			List<Employee> list = new ArrayList<>();
			
			String line = br.readLine();
			
			while (line != null) {
				String[] vector = line.split(",");
				String name = vector[0];
				String email = vector[1];
				Double salary = Double.parseDouble(vector[2]);
				
				list.add(new Employee(name, email, salary));
				line = br.readLine();
			}
			
			System.out.print("Enter salary: ");
			double salary = sc.nextDouble();
			
			/*
			 * Cria uma nova lista
			 * Com o filtro de salario menor que o salario digitado
			 * Usa o Map somente para retornar informacoes de email
			 * Faz um "sort" ordenando de forma "natural"
			 * De stream volta para toList
			 */
			List<String> emails = list.stream()
					.filter(x -> x.getSalary() > salary)
					.map(x -> x.getMail())
					.sorted()
					.collect(Collectors.toList());
			
			System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary) + ":");
			emails.forEach(System.out::println);
			
			
			/*
			 * Cria um filtro de Nomes que iniciam com M
			 * Usa o map para retornar apenas os salarios
			 * Faz o caculo de 2 variaveis e soma todas
			 */
			double sum = list.stream()
					.filter(x -> x.getName().charAt(0) == 'M')
					.map(x -> x.getSalary())
					.reduce(0.0, (x, y) -> x + y);
			
			System.out.println("Sum of salary from people whose name starts with 'M': " + String.format("%.2f", sum));
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}

}
