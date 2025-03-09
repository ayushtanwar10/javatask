class Placeofservice
{
	public static void main(String[]args)
	{
		System.out.println("enter the age");
		int age=new java.util.Scanner(System.in).nextInt();
		System.out.println("enter the sex:m/f");
		char sex=new java.util.Scanner(System.in).next().charAt(0);
		System.out.println("are you married:y/n");
		char married=new java.util.Scanner(System.in).next().charAt(0);
		
		if(sex=='f')
		{
			System.out.println("she will work only in urban area");
		}
		else if(age<60&&age>40)
		{
			System.out.println("he will work only in urban area");
		}
		else if(age>20&&age<40)
		{
			System.out.println("he will work anywhere");
		}
		else
		{
			System.out.println("error");
		}
		
	}	
}