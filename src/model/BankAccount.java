package model;

import model.exceptions.DomainException;

public class BankAccount {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withDrawLimit;

	public BankAccount(Integer number, String holder, Double balance, Double withDrawnLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withDrawLimit = withDrawnLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
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

	public Double getwithDrawLimit() {
		return withDrawLimit;
	}

	public void deposit(Double amount)  {
			balance = balance + amount;
	}

	public void withdraw(Double amount) throws DomainException {
		if(amount > withDrawLimit || amount > balance) {
			throw new DomainException("withdrawal limit exceeded or insufficient balance");
		}else {
			balance = balance - amount;
		}
	}

	@Override
	public String toString() {
		return "your account: Number:" + number + ", Holder:" + holder + ", initial balance:" + balance
				+ ", Withdraw limit:" + withDrawLimit;
	}
}
