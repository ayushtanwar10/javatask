import java.util.Scanner;
class Oldest_youngest
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Emter first people age");
int age1=sc.nextInt();
System.out.println("Enter second people age");
int age2=sc.nextInt();
System.out.println("Enter third people age");
int age3=sc.nextInt();
if(age1>age2 && age1>age3)
{
System.out.println("First people is youngest");
}
else if(age2>age3){
System.out.println("Second people is youngest");}
else
System.out.println("Third people is youngest");
}
}