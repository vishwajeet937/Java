import java.util.Scanner;
class TestCustomeException1 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int val=scan.nextInt();
		try
		{
		      if (val%2==1)
		      {
				  System.out.println("stock Available");
		      }	
			  else 
			      {
					throw new TestCustomeException1("Out of stock");
			      }
		}
		catch (RuntimeException r)
		{
			System.out.println("catch");
		}
	}
}
