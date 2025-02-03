import java.util.Scanner;
class amprecsent{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a Number");
int a = sc.nextInt();
if(a%5==0 && a%3==0)
System.out.println(a + "is divisible by both 3 & 5");
else if(a%5==0)
System.out.println(a+" is divisible by 5 ");
else if(a%3==0)
System.out.println(a+" is divisible by 3 ");
else
System.out.println(a + "The is not divisible by 3 and 5");
sc.close();
}
}
