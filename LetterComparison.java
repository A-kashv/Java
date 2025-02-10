import java.util.Scanner;

public class LetterComparison {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter th first letter: ");
        char letter1 = sc.nextChar();  

        
        System.out.print("Enter the second letter: ");
        char letter2 = sc.nextChar();  

        
        System.out.println(letter1 + " < " + letter2 + " is " + (letter1 < letter2));
        System.out.println(letter1 + " <= " + letter2 + " is " + (letter1 <= letter2));
        System.out.println(letter1 + " > " + letter2 + " is " + (letter1 > letter2));
        System.out.println(letter1 + " >= " + letter2 + " is " + (letter1 >= letter2));
        System.out.println(letter1 + " == " + letter2 + " is " + (letter1 == letter2));
        System.out.println(letter1 + " != " + letter2 + " is " + (letter1 != letter2));

        
        sc.close();
    }
}
