package org.example.e33;
import java.sql.SQLOutput;
import java.util.Scanner;

public class E33NestedIfAndScanner {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input=new Scanner(System.in);
        // Print prompt for user to enter a number
        System.out.println("Please enter a number");
        // Capture the number input
        int number=input.nextInt();
        System.out.println(number);
        // Classify the number
        // Use an if-else statement to check if the number is even or odd
        if(number%2==0) {
            // If the number is even
            //    Print "Value is even"
            System.out.println("Value is even");
            //    Use another if-else statement to check if the number is greater than 1000
            if (number > 1000) {
                //        If it is, print "Even value is large"
                System.out.println("Even value is large");
            } else {
                //        Otherwise, print "Even value is just right"
                System.out.println("Even value is just right");
            }
        }else{
            System.out.println("Value is odd");
            if(number>1000){
                System.out.println("Odd value is large");
            }else{
                System.out.println("Odd value is just right");
            }
        }
        // If the number is odd
        //    Print "Value is odd"
        //    Use another if-else statement to check if the number is greater than 1000
        //        If it is, print "Odd value is large"
        //        Otherwise, print "Odd value is just right"
    }
}
