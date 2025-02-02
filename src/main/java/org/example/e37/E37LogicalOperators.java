package org.example.e37;

import java.nio.file.DirectoryStream;
import java.util.Scanner;

public class E37LogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner=new Scanner(System.in);
        // Print prompt for user to answer if they are thirsty
        System.out.println("Are you thirsty? (true/false)");
        // Capture the thirsty input
        boolean isThirsty=scanner.nextBoolean();

        // Print prompt for user to answer if they are sleepy
        System.out.println("Are you sleepy? (true/false)");
        // Capture the sleepy input
        boolean isSleepy= scanner.nextBoolean();

        // Determine the drink based on the inputs
        String drink="";
        if(isThirsty&&!isSleepy){
        // Print the drink suggestion
            drink="water";}
        else if(isThirsty&&isSleepy){
            drink="coffee";
        }else if(!isThirsty&&isSleepy){
            drink="tea";
        }else{
            drink="nothing";
        }
        System.out.println( "Looks like you need to drink "+drink);
        // Output: Looks like you need to drink ___
    }
}
