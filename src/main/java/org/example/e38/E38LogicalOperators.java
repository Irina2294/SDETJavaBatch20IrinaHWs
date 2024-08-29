package org.example.e38;

import java.util.Scanner;

public class E38LogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner=new Scanner(System.in);
        // Print prompt for user to answer if it is the weekend
        System.out.println("Is it weekend? (true/false)");
        // Capture the weekend input
        boolean isWeekend=scanner.nextBoolean();
        System.out.println("Are you available? (true/false)");
        boolean isAvailable= scanner.nextBoolean();
        String subject="";
        // Determine the subject based on the input
        // If it is the weekend
        if(isWeekend&&isAvailable) {
            //    Set subject to "Java"
            subject = "Java";
            // Otherwise
        }else if(!isWeekend&&isAvailable) {
            //    Set subject to "manual testing"
            subject = "manual testing";
        } else if(isWeekend&&!isAvailable){
            subject= "no subject";
        }
        // Print the subject suggestion
        // Output: Today you will be learning ____
        System.out.println("Today you will be learning "+subject);

    }
}
