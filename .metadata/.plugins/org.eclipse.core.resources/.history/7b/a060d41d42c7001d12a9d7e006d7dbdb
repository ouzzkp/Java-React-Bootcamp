
public class Product {
    // encapsulation
    private int id;
    private String name;
    private double unitPrice;
    private String detail;
    private double discount;
    private double unitPriceAfterDiscount;

    public Product() {

    }

    public Product(int id, String name, double unitPrice, String detail, double discount,
            double unitPriceAfterDiscount) {
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.detail = detail;
        this.discount = discount;
        this.unitPriceAfterDiscount = unitPriceAfterDiscount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getUnitPriceAfterDiscount() {
        this.unitPriceAfterDiscount = this.unitPrice - (this.unitPrice * (this.discount / 100));
        return unitPriceAfterDiscount;
    }

}
// Constructor Block
/*
 * public Product() {
 * System.out.
 * println("New instance created and this block called with this(); operator!");
 * }
 * 
 * // if signatures (name of the constructor and inside the "()" ) are same, the
 * // program will angry. To solve this issue, give a parameter.
 * public Product(int id, String name, double unitPrice, String detail) {
 * this();
 * this.id = id; // id that inside the class
 * this.name = name; // name that inside the class
 * this.unitPrice = unitPrice; // unitPrice that inside the class
 * this.detail = detail; // detail that inside the class
 * System.out.println(name +
 * " created with contrustor that has accept parameter!");
 * }
 */