package org.example.e34;
import java.util.Scanner;
public class E34NestedIfAndScanner {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input=new Scanner(System.in);
        // Print prompt for user to enter 3 distinct numbers separated by spaces
        System.out.println("Please enter 3 distinct numbers separated by spaces");
        // Capture the three numbers input
        int num1=input.nextInt();
        int num2=input.nextInt();
        int num3=input.nextInt();
        // Use nested if-else statements to find the largest number
        input.close();
        // If num1 is greater than or equal to num2
        int largestNumber;

        if (num1 >= num2 && num1 >= num3) {
            largestNumber = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largestNumber = num2;
        } else {
            largestNumber = num3;
        }
        System.out.println("The largest number is "+largestNumber);
        //    If num1 is greater than or equal to num3
        //        num1 is the largest
        //    Else
        //        num3 is the largest
        // Else
        //    If num2 is greater than or equal to num3
        //        num2 is the largest
        //    Else
        //        num3 is the largest

        // Print the largest number
    }
}
