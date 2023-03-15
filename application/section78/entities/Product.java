package application.section78.entities;

public class Product {
    //o private é usado para encapsular os atributos, os deixando segurros
    //a unica forma de acessa-los é utilizando os gets e sets na classe principal
    private String name;
    private double price;
    private int quantity;

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
    public Product() {
    }
    //por convenção, os gets e sets são criados depois dos construtores

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    //não crio o setQuantity para proteger a regra de negócios, a quantidade só deve ser alterada pelos
    //métodos addProducts e removeProducts

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