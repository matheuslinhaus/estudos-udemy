package application;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.WithdrawException;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account data: ");

		System.out.print("Number: ");
		int number = sc.nextInt();
		
		System.out.print("Holder: ");
		String holder = sc.next();
		
		System.out.print("Initial balance: ");
		double initialBalance = sc.nextDouble();
		
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();
		
		Account acc = new Account(number, holder, initialBalance, withdrawLimit);

		try {
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			acc.withdraw(sc.nextDouble());
			System.out.println("New balance: " + acc.getBalance());
		} catch (WithdrawException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}
