import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        
        Scanner sca = new Scanner(System.in);

        
        System.out.print("Enter the first number: ");
        int a = sca.nextInt();
        
        System.out.print("Enter the second number: ");
        int b = sca.nextInt();
        
        System.out.print("Enter the third number: ");
        int c = sca.nextInt();

        
        int greatest = (a >= b && a >= c) ? a : 
                        (b >= a && b >= c) ? b : c;

        
        System.out.println("The greatest number is: " + greatest);

        
        sca.close();
    }
}
