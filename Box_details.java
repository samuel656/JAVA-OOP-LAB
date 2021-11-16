import java.util.*;
class Box
{
	int l,b,h;
	void getdata(int x,int y,int z)
	{
		l=x;
		b=y;
		h=z;
	}
	int volume()
	{
		return l*b*h;
	}
}
class Box_details
{
	public static void main(String []args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter l,b,h of the box");
		int l=sc.nextInt();
		int b=sc.nextInt();
		int h=sc.nextInt();
		Box b1=new Box();
		b1.getdata(l,b,h);
		System.out.println("volume of the box is "+b1.volume());
	}
}
