abstract class Shape
{
	abstract void noOfSides();
	abstract void area();
}
class Circle extends Shape
{
	void noOfSides()
	{
		System.out.println("no of sides is 0");
	}
	void area()
	{
		int r=5;
		double ar=Math.PI*r*r;
		System.out.println("area is "+ar);
	}
}
class Square extends Shape
{
	void noOfSides()
	{
		System.out.println("no of sides is 4");
	}
	void area()
	{
		int s=5;
		int ar=s*s;
		System.out.println("area is "+ar);
	}
}
class Triangle extends Shape
{
	void noOfSides()
	{
		System.out.println("no of sides is 3");
	}
	void area()
	{
		int b=5;
		int h=10;
		double ar=0.5*b*h;
		System.out.println("area is "+ar);
	}
}
class AbstractShape
{
	public static void main(String args[])
	{
		Circle c=new Circle();
		c.noOfSides();
		c.area();
		Square s=new Square();
		s.noOfSides();
		s.area();
		Triangle t=new Triangle();
		t.noOfSides();
		t.area();
	}
}
