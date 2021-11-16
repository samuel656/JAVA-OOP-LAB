import java.util.*;
class Big
{
	public static void main(String args[])
	{
		Scanner num=new Scanner(System.in);
		int a,b,c;
		System.out.println("read three integers");
		a=num.nextInt();
		b=num.nextInt();
		c=num.nextInt();
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("a is big");
					
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("b is big");
			}
			else
			{
				System.out.println("c is big");
			}
		}
	}
}
		
