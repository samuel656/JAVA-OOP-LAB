class NestedOuter
{
	Static int a=10,b=20;
	Static class NestedInner
	{
		void display()
		{
			System.out.println("a is "+a);
			System.out.println("b is "+b);
		}
	}
}
class NestedStaticClass
{
	public static void main(String []args)
	{
		NestedOuter out=new NestedOuter();
		NestedOuter.NestedInner in=new NestedOuter.NestedInner();
		in.display();
	}
}
