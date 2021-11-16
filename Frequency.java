import java.util.*;
class Frequency
{
	public static void main(String []args)
	{	
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter the size of the array");
		n=sc.nextInt();
		int a[]=new int[n];
		int visitArr[]=new int[a.length];
		int i,j,count,visited=-1;
		System.out.println("enter array elements");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<a.length;i++)
		{
			count=1;
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					visitArr[j]=visited;
				}
			}
			if(visitArr[i]!=-1)
			{
				visitArr[i]=count;
			}
		}
		for(i=0;i<visitArr.length;i++)
		{
			if(visitArr[i]!=-1)
			{
				System.out.println("frequency of"+a[i]+" :"+visitArr[i]);
			}
		}
	}
}