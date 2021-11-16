class Sample2_demo
{
	int a,b;
	void getdata()
	{
		a=5;
		b=10;
	}
	void display()
	{
	System.out.println(" a is"+a);
	System.out.println(" b is"+b);
	}
}
class Sample2
{
	public static void main(String []args)
	{
		Sample2_demo obj=new Sample2_demo();
		obj.getdata();
		obj.display();
	}
}
