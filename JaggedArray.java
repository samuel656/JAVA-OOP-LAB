//jagged array 
import java.util.*;
class JaggedArray
{
	public static void main(String []args)
	{
		Scanner sa=new Scanner(System.in);
		System.out.println("enter row size of the array");
		int row=sa.nextInt();
		int a[][]=new int[row][];
		for(int i=0;i<row;i++)
		{
			System.out.println("enter column size for"+i+"row");
			int col=sa.nextInt();
			a[i]=new int[col];
		}
		System.out.println("enter jagged array elements");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
			
				a[i][j]=sa.nextInt();
			
			}
		}
		System.out.println("jaagged array elements are");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
			
				System.out.print(a[i][j]+" ");
			
			}
		System.out.println();
		}
	}
}
