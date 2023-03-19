// We have classes that do work and hold properties. This is an example of holding methods in its body class.

public class ProductService {
    public void addToCart(Product product) {
        System.out.println("Sepete ekleme kodu çağırıldı ve " + product.name + " sepete eklendi!");
    }
}
