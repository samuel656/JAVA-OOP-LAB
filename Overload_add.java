class Overload2
{
	void add(int a,int b)
	{
		int c= a+b;
		System.out.println("integer addition is"+c);
	}
	void add(float a, float b)
	{
		float c= a+b;
		System.out.println("float addition is "+c);
	}
	void add(double a, double b)
	{
		double c=a+b;
		System.out.println("double addition is "+c);
	}
}
class Overload_add
{
	public static void main(String args[])
	{
		Overload2 obj=new Overload2();
		int x=10,y=20;
		obj.add(x,y);
		float a=3.14f,b=15.06f;
		obj.add(a,b);
		double p=12.65,q=15.10;
		obj.add(p,q);	
	}
}
