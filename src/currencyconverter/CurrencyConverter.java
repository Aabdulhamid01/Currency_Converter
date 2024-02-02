
 
package currencyconverter;
import java.util.Scanner;

public class CurrencyConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner imput = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        double amount = imput.nextDouble();

        System.out.print("Enter the source currency (e.g., USD, EUR, JPY ) ");
        String sourceCurrency = imput.next();

        System.out.print("Enter the target currency (e.g., USD, EUR, JPY:)");
               
        String targetCurrency = imput.next();

        double convertedAmount = convertCurrency(amount, sourceCurrency, targetCurrency);

        System.out.println("Converted amount: " + convertedAmount + " " + targetCurrency);

        imput.close();
    }

    private static double convertCurrency(double amount, String sourceCurrency, String targetCurrency) {
        // For simplicity, you can use fixed conversion rates or call an API for real-time rates.
        // Here, I'm using a simple fixed conversion rate for illustration purposes.
        double usdToEurRate = 0.85;
        double usdToJpyRate = 110.0;

        double amountInUSD;
        switch (sourceCurrency) {
            case "USD":
                amountInUSD = amount;
                break;
            case "EUR":
                amountInUSD = amount / usdToEurRate;
                break;
            case "JPY":
                amountInUSD = amount / usdToJpyRate;
                break;
           
            default:
                System.out.println("Unsupported source currency");
                return 0.0;
        }

        switch (targetCurrency) {
            case "USD":
                return amountInUSD;
            case "EUR":
                return amountInUSD * usdToEurRate;
            case "JPY":
                return amountInUSD * usdToJpyRate;
            default:
                System.out.println("Unsupported target currency");
        }         return 0.0; 

    }
    
}
