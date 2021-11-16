class Overloading
{
	int a,b;
	Overloading()
	{
	
	}
	Overloading(int x,int y)
	{
		a=x;
		b=y;
	}
	void display()
	{
		System.out.println("a is "+a);
		System.out.println("b is "+b);
	}
}
class Overloading1
{
	public static void main(String args[])
	{
		Overloading d1=new Overloading();
		d1.display();
		Overloading d2=new Overloading(10,20);
		d2.display();
	}
}
