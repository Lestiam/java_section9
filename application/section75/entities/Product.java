package application.section75.entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    //o construtor SEMPRE tem o mesmo nome da classe e executa ao instanciar o objeto
    //é usado para OBRIGAR o programador a iniciar o objeto com um valor, no caso, name, price e quantity
    //usando a sobrecarga, podemos ter diversos construtores e até mesmo um padrão, sem parâmetros que inicia vazio ou com 0
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
//construtor padrão
    public Product(){
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}