class Static2
{
	static int y;
	void getdata(int y)
	{
		this.y=y;
	}
	static void display()
	{
		System.out.println("y is "+y);
	}
}
class StaticMethod
{
	public static void main(String []args)
	{
		Static2 ob=new Static2 ();
		ob.getdata(10);
		ob.display();
	}
}
