class Perimeter
{
	int l,b;
	Perimeter()
	{
		System.out.println("default constuctor");
	}
	Perimeter(int l)
	{
		l=l;
		System.out.println("perimeter of circle is "+(2*Math.PI*l));
	}
	Perimeter(int l,int b)
	{
	 this(l);
	 this.l=l;
	 this.b=b;
	 System.out.println("perimeter of rectangle is "+(2*(l+b)));
	}
}
class Perimeter_data
{
	public static void main(String []args)
	{
		Perimeter p=new Perimeter(10,20);
	}
}