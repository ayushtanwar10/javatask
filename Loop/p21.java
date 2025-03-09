class p21
{
public static void main(String[]args)
{
int n=5;
int i,j;
for(i=1;i<=n;i++)
{
int a=64+(2*i-1);
for(j=1;j<=i;j++)
{
System.out.print((char)a);
a--;
}
System.out.println("");
}
}
}