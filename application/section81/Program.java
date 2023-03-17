package application.section81;

import application.section81.entities.Bank;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Bank bank = new Bank();


        System.out.println("Enter account number: ");
        int number = sc.nextInt();
        bank.setAccountNumber(number);

        // Clear the input buffer
        sc.nextLine();

        System.out.println("Enter account holder: ");
        String name = sc.nextLine();
        bank.setName(name);

        System.out.println("Is there a initial deposit (y/n)");
        String aux = sc.nextLine();
        if (aux.equals("y")) {
            System.out.println("Enter initial deposit value: ");
            double initial = sc.nextDouble();
            bank.setInitialDeposit(initial);
        }

        System.out.println("\nAccount data: \n " + bank);

        System.out.println("\nEnter a deposit value: ");
        double value = sc.nextDouble();
        bank.cashDeposit(value);

        System.out.println("Update account data: \n" + bank);

        System.out.println("\n Enter a withdraw value: ");
        value = sc.nextDouble();
        bank.withdrawMoney(value);

        System.out.println("Update account data: \n" + bank);


        sc.close();
    }
}
