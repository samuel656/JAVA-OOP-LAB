import java.util.*;
class Amstrong 
{
	public static void main(String args[])
	{
		Scanner num=new Scanner(System.in);
		int n;
		int count=0,d,temp;
		double sum=0;
		System.out.println("enter a number");
		n=num.nextInt();
		temp=n;
		while(n!=0)
		{
			d=n%10;
			count=count+1;
			n=n/10;
		}
		n=temp;
		while(n!=0)
		{
			d=n%10;
			sum=sum+Math.pow(d,count);
			n=n/10;
		}
		if(temp==sum)
			System.out.println("Amstrong Number");
		else
			System.out.println("Not a amstrong number");
	}
}
		
