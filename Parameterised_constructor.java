class Parameterised
{
	int a,b;
	Parameterised(int x,int y)
	{
		System.out.println("parameterised constructor");	
		a=x;	
		b=y;
	}
	void display()
	{
		System.out.println("a is "+a);
		System.out.println("b is "+b);
	}
}
class Parameterised_constructor
{
	public static void main(String args[])
	{
		Parameterised d=new Parameterised(10,20);
		d.display();
	}
}	
