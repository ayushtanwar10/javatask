import java.util.Scanner;
class Year
{
public static void main(String[]args)
{
System.out.println("Enter a year");
Scanner sc=new Scanner(System.in);
int year=sc.nextInt();
if(year%4==0)
{
System.out.println("The given year is leap year:");
}
else
{
System.out.println("The given year is not leap year:");
}
}
}