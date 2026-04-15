import java.util.Scanner;

class ConverterEngine {
    public static final double USD_TO_INR = 93.0;
    public static final double EUR_TO_INR = 109.0;
    public static final double GBP_TO_INR = 126.0;

    public static double convert(double amount, String currencyType) {

        if (currencyType.equals("USD")) {
            return amount * USD_TO_INR;
        } 
        else if (currencyType.equals("EUR")) {
            return amount * EUR_TO_INR;
        } 
        else if (currencyType.equals("GBP")) {
            return amount * GBP_TO_INR;
        } 
        else {
            System.out.println("Invalid currency type!");
            return 0;
        }
    }
}

public class GlobalCurrencyConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Currency Converter");

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();

        System.out.print("Enter Currency (USD/EUR/GBP): ");
        String currency = sc.next();

        double result = ConverterEngine.convert(amount, currency);

        if (result != 0) {
            System.out.println("Converted Amount in INR: " + result);
        }

        sc.close();
    }
}
