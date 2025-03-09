import java.util.Scanner;
class CheckAlphabet
{
public static void main(String args[])
{
System.out.println("Enter the Alphabet");
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
//char ch=(char)x;
if(ch=='M' || ch=='m'){
System.out.println("Male");}
else{
System.out.println("Female");}
//System.out.println(x);
//System.out.println(ch);
}
}