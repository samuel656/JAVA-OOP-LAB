import java.util.*;
class Delete
{
	public static void main(String []args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		n=sc.nextInt();
		int a[]=new int[n];
		int i,pos;
		System.out.println("enter position to delete ");
		pos=sc.nextInt();
		System.out.println("enter array elements");
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(i=pos;i<n;i++)
			a[i-1]=a[i];
		for(i=0;i<n-1;i++)
			System.out.print(a[i]+" ");
	}
}
		