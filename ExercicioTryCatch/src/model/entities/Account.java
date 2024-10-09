package model.entities;

import model.exceptions.WithdrawException;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
		
	public Account() {
	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) throws WithdrawException {
		validateWithdraw(amount);
		balance -= amount;
	}

	private void validateWithdraw(double amount) throws WithdrawException {
		if (withdrawLimit < amount) {
			throw new WithdrawException("The amout exceeds withdraw limit");
		}
		if (balance < amount) {
			throw new WithdrawException("Not enough balance");
		}
	}
}
