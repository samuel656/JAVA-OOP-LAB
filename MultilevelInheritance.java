class Base
{
	void displayA()
	{
		System.out.println("base class");
	}
}
class Derived1 extends Base
{
	void displayB()
	{
		System.out.println("derived class 1");
	}
}
class Derived2 extends Derived1
{
	void displayc()
	{
		System.out.println("derived class 2");
	}
}
class MultilevelInheritance
{
	public static void main(String []args)
	{
		Derived2 d= new Derived2();
		d.displayA();
		d.displayB();
		d.displayc();
	}
}
