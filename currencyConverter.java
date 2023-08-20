import java.text.DecimalFormat;
	import java.util.HashMap;
	import java.util.Map;
	import java.util.Scanner;

	public class CurrencyConverter {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Define exchange rates
	        Map<String, Double> exchangeRates = new HashMap<>();
	        exchangeRates.put("USD", 1.0);
	        exchangeRates.put("EUR", 0.85);
	        exchangeRates.put("GBP", 0.72);
	        exchangeRates.put("JPY", 110.76);
	        exchangeRates.put("CAD", 1.26); // Canadian Dollar

	        System.out.println("Supported currencies: USD, EUR, GBP, JPY, CAD");

	        System.out.print("Enter amount: ");
	        double amount = scanner.nextDouble();

	        System.out.print("Enter source currency (e.g., USD): ");
	        String sourceCurrency = scanner.next().toUpperCase();

	        System.out.println("Choose target currency:");
	        for (String currency : exchangeRates.keySet()) {
	            if (!currency.equals(sourceCurrency)) {
	                System.out.println("- " + currency);
	            }
	        }

	        System.out.print("Enter target currency: ");
	        String targetCurrency = scanner.next().toUpperCase();

	        if (!exchangeRates.containsKey(targetCurrency)) {
	            System.out.println("Unsupported target currency.");
	            scanner.close();
	            return;
	        }

	        double sourceToUSD = amount / exchangeRates.get(sourceCurrency);
	        double convertedAmount = sourceToUSD * exchangeRates.get(targetCurrency);

	        DecimalFormat df = new DecimalFormat("#.##");
	        System.out.println(amount + " " + sourceCurrency + " is equivalent to " +
	                df.format(convertedAmount) + " " + targetCurrency);

	        scanner.close();
	    }
	}

