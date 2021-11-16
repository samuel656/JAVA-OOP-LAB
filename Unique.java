import java.util.*;
class Unique
{
	public static void main(String []args)
	{	
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter the size of the array");
		n=sc.nextInt();
		int a[]=new int[n];
		int visitArr[]=new int[a.length];
		int i,j,count;
		System.out.println("enter array elements");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			visitArr[i]=
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
			}
		}
		for(i=0;i<visitArr.length;i++)
		{
			if(visitArr[i]==1)
			{
				System.out.print(a[i]+" ");
			}
		}
	}
}