class Square
{
	public static void main(String[]args)
	{
		System.out.println("enter the year");
		int year=new java.util.Scanner(System.in).nextInt();
		
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					System.out.println("year, is a leap year");
				}
				else{
					System.out.println("Not a leap year");
				}
			}
		}
		else 
		{
			System.out.println("year, is not a leap year");
		}
	}
}