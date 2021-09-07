
public class FooBarBaz {
	public static void main(String[] args) 
	{
		int n = 50;
		
		for (int i=0;i<=n;i++)
		{
				if (i%3==0 && i%5==0 && i!=0)
					System.out.print("foobar\n");
				else if (i%3==0 && i!=0)
					System.out.print("foo\n" );
				else if(i%5==0 && i!=0)
					System.out.print("bar\n"); 
			else 
				System.out.print(i + "\n");
		}
	}
}