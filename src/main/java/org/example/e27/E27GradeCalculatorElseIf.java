package org.example.e27;

public class E27GradeCalculatorElseIf {
    public static void main(String[] args) {
        // Hint: Declare 'score' as an int and assign 85 to it
    int score=85;
        // Hint: Use if-else if statements to check grades A, B, C, D, F in order
        if(90<=score&&score<=100){
            System.out.println("Your grade is: A");
        } else if(80<=score&&score<=89){
            System.out.println("Your grade is: B");
        } else if(70<=score&&score<=79){
            System.out.println("Your grade is: C");
        } else if(60<=score&&score<=69){
            System.out.println("Your grade is: D");
        } else{
            System.out.println("Your grade is: F");
        }
        // Hint: Print the grade using System.out.println()

        // Expected output: "Your grade is: B"
    }
}