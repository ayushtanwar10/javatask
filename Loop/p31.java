class p31
{
public static void main(String[]args)
{
int i,j,k;
for(i=0;i<=5;i++)
{
for(k=0;k<=1;k++)
{
System.out.print(" ");
}
for(j=0;j<=5-i;j++)
{
if(i==0&&j==0)
{
System.out.print(" ");
}
if((i==1&&j==0))
{
System.out.print(" ");
}
if((i==2&&j==0))
{
System.out.print("");
}

System.out.print((char)('A'+i));
}
System.out.println(" ");
}
}
}