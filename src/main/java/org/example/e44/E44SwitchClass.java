package org.example.e44;

import javax.swing.*;
import java.util.Scanner;

public class E44SwitchClass {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scan=new Scanner(System.in);
        // Print prompt for user to enter the type of meal (1 for breakfast, 2 for lunch, 3 for dinner)
        System.out.println("Enter the type of meal (1 for breakfast, 2 for lunch, 3 for dinner)");
        // Capture the meal type input
        int mealType= scan.nextInt();
        switch (mealType){

            case 1:
            double breakfast=5;
                System.out.println("The price of your meal is $"+breakfast);
            break;
            case 2:
            double lunch=10;
                System.out.println("The price of your meal is $"+lunch);
            break;
            case 3:
            double dinner=15;
                System.out.println("The price of your meal is $"+dinner);
            break;
            default:
                System.out.println("Invalid meal type entered");}
                    }

        }

        // Print the price
        // Output: The price of your meal is $____



        // Print the price



