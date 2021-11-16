//addition of two matrices
//2d array elements 
import java.util.*;
class MatrixAddition
{
	public static void main(String []args)
	{
		Scanner sa=new Scanner(System.in);
		System.out.println("enter size of first matrix");
		int m=sa.nextInt();
		int n=sa.nextInt();
		System.out.println("enter size of second matrix");
		int p=sa.nextInt();
		int q=sa.nextInt();
		int a[][]=new int[m][n];
		int b[][]=new int[p][q];
		int c[][]=new int[m][n];
		if(m!=p && n!=q)
		{
			System.out.println("matrix addition is not possible");
		}
		else
		{
		System.out.println("read first matrix");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
			
				a[i][j]=sa.nextInt();
			
			}
		}
		System.out.println("read second matrix");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
			
				b[i][j]=sa.nextInt();
			
			}
		}
		System.out.println("matrix addition is ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
			
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
			
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		}
	}
}
