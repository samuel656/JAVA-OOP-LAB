import java.util.*;
class Count
{
	public static void main(String []args)
	{	
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter the size of the array");
		n=sc.nextInt();
		int a[]=new int[n];
		int visitArr[]=new int[a.length];
		int i,j,count,duplicates=0;
		System.out.println("enter array elements");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			visitArr[i]=-1;
		}
		for(i=0;i<a.length;i++)
		{
			count=1;
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					visitArr[j]=0;
				}
			}
			if(visitArr[i]!=0)
			{
				visitArr[i]=count;
				duplicates++;
			}
		}
		
				System.out.print(duplicates);
			
		
	}
}