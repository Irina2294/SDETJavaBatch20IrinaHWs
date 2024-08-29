package org.example.e43;

import javax.swing.*;
import java.util.Scanner;

public class E43SwitchStatment {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Print prompt for user to enter their electricity usage in kWh
        System.out.println("Enter your electricity usage in kWh");

        // Capture the usage input
        double usage = input.nextDouble();

        // Convert the usage to an int range value
        int usageRange = (int)(usage / 100);

        double bill = 0;

        // Calculate bill using switch statement
        switch (usageRange) {
            case 0:
                bill = usage * 0.12;
                System.out.println("Your electricity bill is $" + bill);
                break;
            case 1:
                bill = usage * 0.15;
                System.out.println("Your electricity bill is $" + bill);
                break;
            case 2:
                bill = usage * 0.20;
                System.out.println("Your electricity bill is $" + bill);
                break;
            default:
                if (usage > 300) {
                    bill = usage * 0.25;
                    System.out.println("Your electricity bill is $" + bill);
                } else {
                    System.out.println("Invalid usage entered.");
                }
                break;
        }
    }
}


