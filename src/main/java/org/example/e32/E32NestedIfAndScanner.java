package org.example.e32;

import java.util.Scanner;

public class E32NestedIfAndScanner {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner=new Scanner(System.in);

        // Print prompt for user to enter gender
        System.out.println("Please enter your gender: M or F");
        // Capture the gender input
        char gender=scanner.next().charAt(0);
        System.out.println(gender);
        // Print prompt for user to enter age
        System.out.println("Please enter your age");
        // Capture the age input
        int age=scanner.nextInt();
        System.out.println(age);
        // Classify based on gender and age
        if(age>25){
        // If age is above 25
        //    If gender is "F", print "Woman"
            if(gender=='F'){
                System.out.println("Woman");
            } else{
        //    Otherwise, print "Man"
                System.out.println("Man");}}
        else if(age<25){
            // If age is 25 or below
            if(gender=='F'){
                //    If gender is "F", print "Girl"
                System.out.println("Girl");
            }else{
                //    Otherwise, print "Boy"
                System.out.println("Boy");
            }
            }



    }
}
