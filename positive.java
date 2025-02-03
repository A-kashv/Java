import java.util.Scanner;
class positive{
 public static void main(String[]args){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter a Number:");
int a = sc.nextInt();
if(a>0)
System.out.println(a+ "is Positive Number");
else if(a<0)
System.out.println(a+ "is Negative Number");
else
System.out.println("Number is Zero");
sc.close();
}
}