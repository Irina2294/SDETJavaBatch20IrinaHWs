package org.example.e31;

import java.util.Scanner;

public class E31NestedIfAndScanner {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input=new Scanner(System.in);
        // Declare a boolean variable isSunny
        boolean isSunny=true;
        // Print "Is it sunny outside? (true/false)"
        System.out.println("Is it sunny outside? (true/false)");
        // Capture the user's input and store it in isSunny
        isSunny=input.nextBoolean();
        System.out.println(isSunny);

        // Declare an integer variable temperature
        int temperature;

        // Use an if-else statement to check if it is sunny
        // If it is sunny
        if(isSunny){
            //    Print "It is a sunny day, I should go somewhere!"
            System.out.println("It is a sunny day, I should go somewhere!");
        //    Print "What is the temperature outside?"
            System.out.println("What is the temperature outside?");
        //    Capture the user's input and store it in temperature
            temperature=input.nextInt();
            System.out.println(temperature);
        //    Use another if-else statement to check the temperature
        //        If the temperature is higher than 85
           if(temperature>85){
               //   Print "I am going to the beach!"
               System.out.println("I am going to the beach!");
           }else{
               //        Otherwise
               //            Print "I am going to the park!"
               System.out.println("I am going to the park!");
           }

        }else{
            // If it is not sunny
            //    Print "I stay home and practice Java"
            System.out.println("I stay home and practice Java");
        }



    }
}
