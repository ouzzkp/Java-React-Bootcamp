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

        Product[] products = {
                product1,
        };
        System.out.println(products.length);

    }
}
