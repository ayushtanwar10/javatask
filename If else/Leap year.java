//import java.util.Scanner;
class Leap_year
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.println("Enter a year");	
int year=sc.nextInt();
int century=sc.nextInt();
if(year %2000 2100 1900==0){
System.out.println("The Given year is leap year");}
else if(year %400){
System.out.println("The given year is  a leap year");
}

else
System.out.println("The given year is not a leap year");
}
}
