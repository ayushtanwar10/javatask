class p22
{
public static void main(String[]args)
{
int i,j;
for(i=1;i<=5;i++)
{
for(j=1;j<=i;j++)
{
if(i%2==0)
{
System.out.print(j);
}
else
{
System.out.print("*");
}
}
System.out.println("");
}
}
}