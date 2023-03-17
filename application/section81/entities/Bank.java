package application.section81.entities;

public class Bank {
    private int accountNumber;
    private String name;
    private double initialDeposit;
    private double accountBalance; // saldo da conta

    public Bank(int accountNumber, String name, double initialDeposit, double accountBalance){
        this.accountNumber = accountNumber;
        this.name = name;
        this.initialDeposit = initialDeposit;
        this.accountBalance = accountBalance;
    }
    public Bank(){
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public String getName(){
        return  name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getInitialDeposit(){
        return initialDeposit;
    }

    public void setInitialDeposit(double initialDeposit){
        this.initialDeposit = initialDeposit;
        this.accountBalance += initialDeposit;
    }

    public double getAccountBalance(){
        return accountBalance;
    }

    //não tem set pois apenas depósitos e saques devem alterar o valor do saldo

    public void cashDeposit(double accountBalance){
        this.accountBalance += accountBalance;
    }

    public void withdrawMoney(double accountBalance){//saque
        int tax = 5;
        this.accountBalance -= (accountBalance + tax);

    }

    public String toString(){
        return "Account "
                + accountNumber
                + ", Holder: "
                + getName()
                + ", Balance: $ "
                + String.format("%.2f",accountBalance);

    }
}
