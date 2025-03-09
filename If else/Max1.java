import java.util.Scanner;

class Max1
{
public static void main(String[]args){
System.out.println("Enter first number");
Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
System.out.println("Enter second number");
int num2=sc.nextInt();
System.out.println("Enter third number");
int num3=sc.nextInt();
if(num1>num2)
{
System.out.println("Num1 is greater");
}
else if(num2>num3)
{
System.out.println("Num2 is greater");
}
else
{
	System.out.println("Num3 is greater");
	
}
}
}