import java.util.Scanner;
class Division
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int num=sc.nextInt();
if(num%11==0)
System.out.println("Given number is divisible by 11");
else
System.out.println("Given number is not divisible by 11");
}
}
