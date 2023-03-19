public class Main {
    public static void main(String[] args) {
        /*
         * String[] products = {
         * "Lenovo V14",
         * "Lenovo V15",
         * "Hp 5",
         * };
         * int[] unitInStock = {
         * 3,
         * 5,
         * 6,
         * };
         * These are not beneficial examples
         */

        Product product1 = new Product(); // create a instance, referance
        product1.id = 1;
        product1.name = "Lenovo V14";
        product1.unitPrice = 15000;
        product1.detail = "16 GB Ram";

        Product product2 = new Product(2, "Lenovo V15", 15000, "16 GB Ram"); // create a instance, referance

        Product product3 = new Product(2, "HP 5", 15000, "24 GB Ram"); // create a instance, referance

        Product[] products = {
                product1,
                product2,
                product3
        };

        for (Product product : products) {
            System.out.println(product.name + " ");
        }
        System.out.println(products.length);

        Category category1 = new Category();
        category1.id = 1;
        category1.name = "Bilgisayar";

        Category category2 = new Category();
        category2.id = 2;
        category2.name = "Ev/Bahçe";

    }
}
