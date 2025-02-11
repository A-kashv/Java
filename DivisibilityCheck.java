import java.util.Scanner;

public class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
       
        if (number % 3 == 0 && number % 4 == 0) {
            System.out.println("Good Morning");
        } else if (number % 4 == 0) {
            System.out.println("Good Afternoon");
        } else if (number % 3 == 0) {
            System.out.println("Good Evening");
        } else {
            System.out.println("Good Nights");
        }
        
        
        scanner.close();
    }
}
