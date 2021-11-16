import java.util.*;
class Even
{
	public static void main(String args[])
	{
		Scanner num=new Scanner(System.in);
		int n;
		System.out.println("enter a number");
		n=num.nextInt();
		if(n%2==0)
		{
			System.out.println("even number");
		}
		else
		{
			System.out.println("odd number");
		}
	}
}

