import java.util.Scanner;
class Mobike1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the bike number");
int charge=0;
String bno=sc.nextLine();
System.out.println("Enter the customer name");
String name=sc.nextLine();
System.out.println("Enter the no of days");
int days=sc.nextInt();
if(days<=5){
charge=500*days;
}
else if(days>5 && days<=10){
charge=2500+400*(days-5);}
else if(days>10){
charge=2500+2000+200*(days-10);
}
System.out.print("Bike no"+"\t\t"+"customer name"+"\t"+"days"+"\t"+"charge");
System.out.println(" ");
System.out.print(bno+"\t\t\t");
System.out.print(name+"\t");
System.out.print(days+"\t");
System.out.print(charge+"\t");
}
}