import java.util.Scanner;
class Hcf
{
static int gcd(int a,int b)
{
while(a>0 && b>0)
{
if(a>b)
{
a=a%b;
}
else
{
b=b%a;
}
}
if(a==0)
{
return b;
}
return a;
}
public static void main(String [] args)
{
System.out.println("Enter the first num");
int a= new Scanner(System.in).nextInt();
System.out.println("Enter the second num");
int b=new Scanner(System.in).nextInt();
System.out.println(gcd(a,b));
}
}