package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import model.BankAccount;
import model.exceptions.DomainException;

public class BankAccountProgram {

	public static void main(String[] args) throws DomainException {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite o número da conta:");
			Integer number = sc.nextInt();
			System.out.println("Digite o nome do titular da conta:");
			String holder = sc.next();
			System.out.println("Digite o dinheiro da conta:");
			Double balance = sc.nextDouble();
			System.out.println("Digite o limite de conta:");
			Double withDrawLimit = sc.nextDouble();
			BankAccount account = new BankAccount(number, holder, balance, withDrawLimit);
			System.out.println(account);
			System.out.println("Digite o valor de depósito:");
			Double deposit = sc.nextDouble();
			account.deposit(deposit);
			System.out.println("Depósito efetuado com sucesso:"+account);
			System.out.println("Digite o valor de saque:");
			Double loot = sc.nextDouble();
			account.withdraw(loot);
			System.out.println("Saque efetuado com sucesso:"+account);
		}catch(InputMismatchException e) {
			System.out.println("Error: Input Mismatch Exception");
		}catch(DomainException e) {
			System.out.println(e.getMessage());
		}
	}

}
