public class UnitConvertor3 {

    // Convert Fahrenheit to Celsius
    public static double convertFarhenheitToCelsius(double farhenheit) {
        double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
        return farhenheit2celsius;
    }

    // Convert Celsius to Fahrenheit
    public static double convertCelsiusToFarhenheit(double celsius) {
        double celsius2farhenheit = (celsius * 9 / 5) + 32;
        return celsius2farhenheit;
    }

    // Convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    // Convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // Convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    // Main method for testing
    public static void main(String[] args) {
        System.out.println("98.6 F to Celsius: " + convertFarhenheitToCelsius(98.6));
        System.out.println("37 C to Fahrenheit: " + convertCelsiusToFarhenheit(37));
        System.out.println("10 pounds to kg: " + convertPoundsToKilograms(10));
        System.out.println("5 kg to pounds: " + convertKilogramsToPounds(5));
        System.out.println("2 gallons to liters: " + convertGallonsToLiters(2));
        System.out.println("5 liters to gallons: " + convertLitersToGallons(5));
    }
}
