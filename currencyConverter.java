public class ConvertingForienHeatToCelcius {
	  // Method to convert Foreignheat to Celcius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Method to convert Celcius to Foreignheat
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        // Test the conversion methods
        double fahrenheitValue = 77.0;
        double celsiusValue = 25.0;

        double convertedCelsius = fahrenheitToCelsius(fahrenheitValue);
        double convertedFahrenheit = celsiusToFahrenheit(celsiusValue);

        System.out.println(fahrenheitValue + " degrees Fahrenheit is equal to " + convertedCelsius + " degrees Celsius.");
        System.out.println(celsiusValue + " degrees Celsius is equal to " + convertedFahrenheit + " degrees Fahrenheit.");
    }
}
