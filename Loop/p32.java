class p32
{
public static void main(String[]args)
{
int i,j,k,num=1;
for(i=0;i<=5;i++)
{
for(k=0;k<=5-i;k++)
{
System.out.print(" ");
}
for(j=0;j<=i;j++)
{
System.out.print(num+" ");
num++;
}
System.out.println("");
}
}
}