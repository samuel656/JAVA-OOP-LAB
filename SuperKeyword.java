class Base
{
	int i=20;
}
class Derived extends Base
{
	int i=50;
	void display()
	{
		System.out.println("Derived class i is "+i);
		System.out.println("Base class i is "+super.i);
	}
}
class SuperKeyword
{
	public static void main(String []args)
	{
		Derived d= new Derived();
		d.display();
		
	}
}
