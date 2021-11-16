//2d array elements 
import java.util.*;
class Matrix
{
	public static void main(String []args)
	{
		Scanner sa=new Scanner(System.in);
		System.out.println("enter size of the array");
		int n=sa.nextInt();
		int a[][]=new int[n][n];
		System.out.println("read a matrix");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
			
				a[i][j]=sa.nextInt();
			
			}
		}
		System.out.println("matrix elements are");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
			
				System.out.print(a[i][j]+" ");
			
			}
		System.out.println();
		}
	}
}
