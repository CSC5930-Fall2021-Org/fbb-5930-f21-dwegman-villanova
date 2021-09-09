import java.util.Scanner;

public class FooBarBaz {
	public static void main(String[] args) 
	{
		while(true)
		{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter the input");	
		String input = sc.nextLine();
		String trim = input.trim();
		//String inputws = input.replaceAll("\\s", "");
		if (trim.equalsIgnoreCase("stop"))
		{
			break;
		}
		try
		{
			int n = Integer.parseInt(trim);
			//while(input.equalsIgnoreCase("stop"))
			//{
			
					//int n = 110;
					if(n>=0 && n<=2147483647)
					{
						for (int i=0;i<=n;i++)
						{
							System.out.print(i + "=");
							if (i%3==0 && i%5==0 && i%7==0 && i!=0)
							{
								System.out.print("foobarbaz"+ "\n");
							}
							else if (i%3==0 && i%5==0 && i!=0)
							{
								System.out.print("foobar"+ "\n");
							}
							else if (i%3==0 && i%7==0 && i!=0)
							{
								System.out.print("foobaz"+ "\n");
							}
							else if (i%5==0 && i%7==0 && i!=0)
							{
								System.out.print("barbaz"+ "\n");
							}
							else if (i%3==0 && i!=0)
							{
								System.out.print("foo"+ "\n" );
							}
							else if(i%5==0 && i!=0)
							{
								System.out.print("bar"+ "\n");
							}
							else if(i%7==0 && i!=0)
							{
								System.out.print("baz"+ "\n");
							}
							else
							{
								//System.out.print("\n");
								System.out.print(i+ "\n");
							}
						}
					}
					else 
						System.out.print(trim + "=" + "Invalid\n");	
		}
		catch(NumberFormatException e) 
		{
			   System.out.print(input + "=" + "Invalid\n");
		}
		}
	}
	
}