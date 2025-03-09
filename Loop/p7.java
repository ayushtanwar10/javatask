
class p7
{
public static void main(String[]args)
{
int i,j,k;
for(i=0;i<=5;i++)
{
	for(k=0;k<=5-i;k++)
	{
		System.out.print(" ");
		}
for(j=0;j<=i;j++)
{
System.out.print("* ");
}
System.out.println("");
}
for(i=0;i<=5;i++)
{
	for(k=0;k<=i+1;k++)
	{
		System.out.print(" ");
		}
	for(j=1;j<=5-i;j++)
	{
		System.out.print("* ");
		}
		System.out.println("");
	}
}
}