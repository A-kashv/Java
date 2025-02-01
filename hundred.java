
import java.util.Scanner;


public class hundred {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        
        String result = (num % 100 == 0) ? "The number is a multiple of 100." : "The number is not a multiple of 100.";
        
       
        System.out.println(result);
        
        scanner.close();
    }
}
