package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Account account;

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.println("Is there an inicial deposity (y/n): ");
		char response = sc.next().charAt(0);

		if (response == 'y') {
			System.out.println("Enter initial deposit value:  ");
			double inicialDeposit = sc.nextDouble();
			account = new Account(number, holder, inicialDeposit);
		} else {
			account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data : ");
		System.out.println(account);
		System.out.println();
		System.out.print("Enter deposit value:  ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Update account data : ");
		System.out.println(account);
		
		double withdrowValue = sc.nextDouble();
		account.withdraw(withdrowValue);
		System.out.println("Update account data : ");
		System.out.println(account);
		
		
		
		
		
				

		sc.close();

	}

}
