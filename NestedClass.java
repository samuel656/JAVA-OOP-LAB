class NestedOuter
{
	int a,b;
	NestedOuter(int x,int y)
	{
		a=x;
		b=y;
	}
	class NestedInner
	{
		void display()
		{
			System.out.println("a is "+a);
			System.out.println("b is "+b);
		}
	}
}
class NestedClass
{
	public static void main(String []args)
	{
		NestedOuter out=new NestedOuter(10,20);
		NestedOuter.NestedInner in=out.new NestedInner();
		in.display();
	}
}
