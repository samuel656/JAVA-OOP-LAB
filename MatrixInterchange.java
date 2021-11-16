//interchange diagnal elements
import java.util.*;
class MatrixInterchange
{
	public static void main(String []args)
	{
		Scanner sa=new Scanner(System.in);
		System.out.println("enter row size of the array");
		int row=sa.nextInt();
		System.out.println("enter column size of the array");
		int col=sa.nextInt();
		int a[][]=new int[row][col];
		System.out.println("read a matrix");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
			
				a[i][j]=sa.nextInt();
			
			}
		}
		if(row==col)
		{
		for(int i=0;i<row;i++)
		{
			int temp=a[i][i];
			a[i][i]=a[i][row-i-1];
			a[i][row-i-1]=temp;
		}
		}
		else
		{
			System.out.println("interchange is not possible");
		}
		System.out.println("after diagnals interchange");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
			
				System.out.print(a[i][j]+" ");
			
			}
		System.out.println();
		}
	}
}
