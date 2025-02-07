import java.util.Scanner;

public class SeasonFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter the month  (1-12): ");
        int month = scanner.nextInt();
        
        
        String season;
        if (month >= 3 && month <= 5) {
            season = "Spring Season";
        } else if (month >= 6 && month <= 8) {
            season = "Summer Season";
        } else if (month >= 9 && month <= 11) {
            season = "Autumn Season";
        } else if (month == 12 || month == 1 || month == 2) {
            season = "Winter Season";
        } else {
            season = "Invalid Month Entered";
        }
        
        
        System.out.println(season);
        
        scanner.close();
    }
}
