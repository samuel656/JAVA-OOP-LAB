//sum of array elements 
import java.util.*;
class ArraySum
{
	public static void main(String []args)
	{
		Scanner sa=new Scanner(System.in);
		System.out.println("enter size of the array");
		int n=sa.nextInt();
		int a[]=new int[n];
		int sum=0;
		System.out.println("read an array");
		for(int i=0;i<n;i++)
		{
			a[i]=sa.nextInt();
			sum=sum+a[i];

		}
		System.out.println("sum is "+sum);
	}
}
