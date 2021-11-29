class Base
{
	void displayA()
	{
		System.out.println("base class");
	}
}
class Derived extends Base
{
	void displayB()
	{
		System.out.println("derived class");
	}
}
class SimpleInheritance
{
	public static void main(String []args)
	{
		Derived d= new Derived();
		d.displayA();
		d.displayB();
	}
}
