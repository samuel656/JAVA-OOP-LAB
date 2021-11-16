class Default
{
	int a,b;
	Default()
	{
		System.out.println("default constructor");	
		a=10;	
		b=20;
	}
	void display()
	{
		System.out.println("a is "+a);
		System.out.println("b is "+b);
	}
}
class Default_constructor
{
	public static void main(String args[])
	{
		Default d=new Default();
		d.display();
	}
}	
