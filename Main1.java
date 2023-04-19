import java.util.Locale;

public class Main1 {

public class exercicios {
    /**
     * @param args
     */
    public static void main(String[] args) {

        String product1 = "Computer";
        String product2 = "Office Desk";

        byte age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.00;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.printf("%s, which price is %f%n %s, which price is %f", product1, price1, product2, price2);

        System.out.printf("Record: %d years old, code %d and gender: %s", age, code, gender);

        System.out.printf("Measure with eight decimal places: %.8f", measure);
        System.out.printf("Rouded: %.3f", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f", measure);
    }
}
}
