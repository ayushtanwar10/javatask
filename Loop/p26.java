class p26
{
public static void main(String[]args)
{
for(int i=1;i<6;i++)
{
for(int j=2;j<=i;j++)
{
System.out.print(" ");
}
for(int k=1;k<6;k++)
{
if((i>=2 && i<=4)&&(k>1 && k<5))
{
System.out.print(" ");
}
else
{
System.out.print(" @ ");
}
}
System.out.println();
}
}
}