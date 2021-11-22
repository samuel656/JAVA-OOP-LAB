class Overload1
{
	void display()
	{
		System.out.println("no arguments");
	}
	void display(int a)
	{
	
		System.out.println("a is "+a);	
	}
	void display(int a,int b)
	{
	
		System.out.println("a is "+a);	
		System.out.println("b is "+b);	
	}
}
class Overloading_demo1
{
	public static void main(String args[])
	{
		Overload1 ob=new Overload1();
		ob.display();
		ob.display(10);
		ob.display(10,20);
	}
}


	
