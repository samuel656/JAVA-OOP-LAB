import java.util.*;
class DiagnalSum
{
	public static void main(String []args)
	{
		Scanner sa=new Scanner(System.in);
		System.out.println("enter size of the array");
		int n=sa.nextInt();
		int a[][]=new int[n][n];
		System.out.println("read a matrix");
		int sum=0;
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
			
				a[i][j]=sa.nextInt();
				if(i==j)
				{
					sum=sum+a[i][j];
		
				}
			
			}
			
		}
		
		System.out.println("sum is"+sum);
		
	}
}
