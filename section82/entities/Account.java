package section82.entities;

public class Account {
    private int number;
    private String holder;
    private double balance; //saldo inicial

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Account (int number, String holder, double initialDeposit){
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);//chama o depósito para proteger a regra de negócios, pois caso ela mudê, eu só preciso alterar o método e não o método junto do construtor
    }

    //como o número na conta não pode ser alterado, ele apagou o setNumber
    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    //não tem setBalance pois o saldo só pode ser alterado através dos métodos de saque e de depósito
    public double getBalance(double balance){
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount + 5.0;
    }

    public String toString(){
        return "Account "
                + number
                + ", Holder: "
                + holder
                + ", Balance: $ "
                + String.format("%.2f",balance);

    }

}
