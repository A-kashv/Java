import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        
        System.out.print("Enter the third number: ");
        int c = sc.nextInt();

        
        int greatest = (a >= b && a >= c) ? a : 
                        (b >= a && b >= c) ? b : c;

        
        System.out.println("The greatest number is: " + greatest);

        
        sc.close();
    }
}
