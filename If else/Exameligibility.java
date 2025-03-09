class Absolutevalue
{
	public static void main(String[]args)
{
    System.out.println("enter the number");
    int number=new java.util.Scanner(System.in).nextInt();
    
    if(number>=0)
	{
    System.out.println(number);
	}
    else if(number<0)
	{
    System.out.println(number*(-1));
	}
}
}