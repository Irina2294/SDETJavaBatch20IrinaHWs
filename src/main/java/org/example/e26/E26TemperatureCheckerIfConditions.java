package org.example.e26;

public class E26TemperatureCheckerIfConditions {
    public static void main(String[] args) {
        // Declare a variable for temperature and assign a value
        double temperature = 25;
        if (temperature >= 30) {
            System.out.println("It's hot outside.");
        } else if (20 <= temperature && temperature < 30) {
            System.out.println("It's warm outside.");
        } else if (10 <= temperature && temperature < 20) {
            System.out.println("It's cool outside.");
        } else {
            System.out.println("It's cold outside.");
        }

        // Check the temperature and print the message

    }
}
