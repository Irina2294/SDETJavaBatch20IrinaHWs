package org.example.e19;

public class E19ActivityTimeTrackerTypeCasting {
    public static void main(String[] args) {
        // Declare the double variables and assign values
        double activity1 = 45.5;
        double activity2 = 30.2;
        double activity3 = 60.7;

        // Calculate total time
        double totalTme = activity1 + activity2 + activity3;

        // Type cast the total time to an int to get total minutes
        int totalMinutes = (int) totalTme;
        // Calculate hours and remaining minutes
        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;

        // Print the results
        System.out.println("The original total time is " + totalTme + " minutes.");
        System.out.println("The converted time is " + hours + " hours and " + minutes + " minutes.");
    }
}
