import java.util.*;
class Right_rotation
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter array size");
		int n=sc.nextInt();
		int a[]=new int[n];
		int op[]=new int[n];
		int i;
		System.out.println("enter array elemenets");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter no of rotations");
		int r=sc.nextInt();
		int rp=n-r;
		i=0;
		while(rp<n)
		{
			op[i]=a[rp];
			i++;
			rp++;
		}
		rp=0;
		while(rp<r+1)
		{
			op[i]=a[rp];
			i++;
			rp++;
		}
		System.out.println("output array is");
		for(i=0;i<n;i++)
		{
			System.out.print(op[i]+" ");
		}
	}
}
		