
public class Product {

    // Constructor Block
    public Product() {
        System.out.println("New instance created and this block called with this(); operator!");
    }

    // if signatures (name of the constructor and inside the "()" ) are same, the
    // program will angry. To solve this issue, give a parameter.
    public Product(int id, String name, double unitPrice, String detail) {
        this();
        this.id = id; // id that inside the class
        this.name = name; // name that inside the class
        this.unitPrice = unitPrice; // unitPrice that inside the class
        this.detail = detail; // detail that inside the class
        System.out.println(name + " created with contrustor that has accept parameter!");
    }

    int id;
    String name;
    double unitPrice;
    String detail;

}
