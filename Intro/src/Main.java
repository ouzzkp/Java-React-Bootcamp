public class Main {
    public static void main(String[] args) {

        String distributorButton = "İnternet Şubesi";
        double dollarPrevius = 8.15;
        double dollarNowadays = 9;
        int maturity = 20;
        boolean isOkey = true;

        if (dollarNowadays < dollarPrevius) {
            System.out.println("Red arrow");
        } else if (dollarPrevius < dollarNowadays) {
            System.out.println("Green arrow");
        } else {
            System.out.println("Grey arrow");
        }
        System.out.println(distributorButton);

        String kredi1 = "Hızlı kredi";
        String kredi2 = "Mutlu emekli kredi";
        ;
        String kredi3 = "Konut kredi";
        String kredi4 = "İhtiyaç kredi";
        String kredi5 = "MSB kredi";

        String[] krediler = {
                "Hızlı kredi",
                "Mutlu emekli kredi",
                "Konut kredi",
                "İhtiyaç kredi",
                "MSB kredi"
        };

        for (int i = 0; i < krediler.length; i++) {
            System.out.println(krediler[i]);
        }
        System.out.println("Second method->");
        // foreach
        for (String kredi : krediler) {
            System.out.println(kredi);
        }

        int number1 = 10;
        int number2 = 20;
        number1 = number2;
        number2 = 100;
        System.out.println(number1);

        int[] numbers1 = { 1, 2, 3, 4, 5 };
        int[] numbers2 = { 10, 20, 30, 40, 50 };
        numbers1 = numbers2;
        numbers2[0] = 100;
        System.out.println(numbers1[0]); // it is return 100

    }
}