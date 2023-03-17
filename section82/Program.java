package section82;

import section82.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {//correção do professor da sessão anterior

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();//limpa o buffer do input do nextInt() anterior
        String holder = sc.nextLine();
        System.out.print("Is there a initial deposit (y/n)? ");
        char response = sc.next().charAt(0);
        //sobbrecarga na prática, aqui, o if chama o controlador dependendo da escolha do usuário
        if (response == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number,holder,initialDeposit);
        }
        else{
            account = new Account(number,holder);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Update account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Update account data: ");
        System.out.println(account);

        sc.close();
    }
}
