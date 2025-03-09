import java.util.Scanner;
class Even
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int num=sc.nextInt();
if(num%2==0)
{
System.out.println("Given number is Even");
}
else
System.out.println("Given number is odd");
}
}