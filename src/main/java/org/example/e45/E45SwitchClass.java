package org.example.e45;

import java.util.Scanner;

public class E45SwitchClass {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scan=new Scanner(System.in);
        // Print prompt for user to enter the type of coffee (1 for Espresso, 2 for Latte, 3 for Cappuccino, 4 for Mocha)
        System.out.println("Enter the type of coffee (1 for Espresso, 2 for Latte, 3 for Cappuccino, 4 for Mocha)");
        // Capture the coffee type input
        int coffeeType=scan.nextInt();
        // Print the price
        switch(coffeeType){
            case 1:
            double espresso=3;
                System.out.println("The price of your coffee is $"+espresso);
                break;
            case 2:
            double latte=4;
                System.out.println("The price of your coffee is $"+latte);
            break;
            case 3:
            double cappuccino=4.50;
                System.out.println("The price of your coffee is $"+cappuccino);
            break;
            case 4:
            double mocha=5;
                System.out.println("The price of your coffee is $"+mocha);
            break;
            default:
                System.out.println("Invalid coffee type entered");
        }
        // Output: The price of your coffee is $____
    }
}
