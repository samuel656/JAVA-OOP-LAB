class Base
{
	void display()
	{
		System.out.println("base class");
	}
}
class Derived extends Base
{
	void display()
	{
		System.out.println("derived class");
	}
}
class MethodOverriding
{
	public static void main(String []args)
	{
		Derived d= new Derived();
		d.display();
		
	}
}
