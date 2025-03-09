class Checkcharacter
{
	public static void main(String[]args)
	{
    System.out.println("enter the charcater");
	char character=new java.util.Scanner(System.in).next().charAt(0);
	int value = (int)character;
	if( value>64&&value<91)
	{
		System.out.println("the character is uppercase");
	}
	else if(value>96&&value<122)
	{
		System.out.println("the character is lowercase");
	}
	}
}