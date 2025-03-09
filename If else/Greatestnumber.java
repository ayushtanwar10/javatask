class Shopdiscount
{
	public static void main(String[]args)
{
	int totalcost=0;
System.out.println("enter the no of units purchased");
int unit=new java.util.Scanner(System.in).nextInt();
if(unit<10)
{
totalcost=100*unit;
}
else if(unit>=10)
{
totalcost=(100*unit)-(100*unit*10/100);
}
System.out.println(totalcost);
}
}	