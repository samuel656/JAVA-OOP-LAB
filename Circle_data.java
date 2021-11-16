import java.util.*;
class Circle
{
	int r;
	Circle(int x)
	{
		r=x;
	}
	void area()
	{
	System.out.println("area of circle is "+(Math.PI*r*r));
	}
	void perimeter()
	{
	System.out.println("Perimeter of circle is "+(2*Math.PI*r));
	}
}
class Circle_data
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		Circle c=new Circle(a);
		c.area();
		c.perimeter();
	}
}
