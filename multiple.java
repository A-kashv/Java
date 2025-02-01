import java.util.Scanner;

public class multiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        
        String result = (num % 27 == 0) ? "The number is a multiple of 27." : "The number is not a multiple of 27.";
        
        
        System.out.println(result);
        
        scanner.close();
    }
}
