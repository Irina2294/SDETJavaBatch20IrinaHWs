package org.example.e25;

public class E25DailyExpenseTrackerIfConditions {
    public static void main(String[] args) {
        // Assign values to daily expenses
        double morningExpense=5.95;
        double afternoonExpense=12.15;
        int eveningExpense=8;

        // Calculate total expense
        double totalExpense=morningExpense+afternoonExpense+eveningExpense;
        // Define a budget
        double budget=100.0;
        System.out.println("Your total daily expense is: "+totalExpense);
        if(totalExpense<=budget){
            System.out.println("You are within the budget.");
        } else{
            System.out.println("You are over the budget");
        }


        // Check if within budget


    }
}
