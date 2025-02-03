import java.util.Scanner;

public class WashingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the weight of clothes in grams (max 7000): ");
        int weight = scanner.nextInt();

        
        if (weight < 0 || weight > 7000) {
            System.out.println("Invalid weight! Please enter a value between 0 and 7000 grams.");
            return;
        }

        
        System.out.print("Enter water level (low/medium/high): ");
        String waterLevel = scanner.next().toLowerCase();

        int timeNeeded = 0; 

        
        if (weight == 0) {
            timeNeeded = 0;
        } else if (weight > 0 && weight <= 2000 && waterLevel.equals("low")) {
            timeNeeded = 25;
        } else if (weight >= 2001 && weight <= 4000 && waterLevel.equals("medium")) {
            timeNeeded = 35;
        } else if (weight > 4000 && weight <= 7000 && waterLevel.equals("high")) {
            timeNeeded = 45;
        } else {
            System.out.println("Invalid input! Please check the weight and water level.");
            return;
        }

        
        System.out.println("Total washing time needed: " + timeNeeded + " minutes");

        
        scanner.close();
    }
}
