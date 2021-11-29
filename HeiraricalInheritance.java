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
class Derived2 extends Base
{
	void displayc()
	{
		System.out.println("derived class 2");
	}
}
class HeiraricalInheritance
{
	public static void main(String []args)
	{
		Derived1 d1= new Derived1();
		d1.displayA();
		d1.displayB();
		Derived2 d2=new Derived2();
		d2.displayA();
		d2.displayc();
	}
}
