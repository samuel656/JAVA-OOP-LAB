class Retobj
{
	int a,b;
	Retobj(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	Retobj compute(Retobj ob)
	{
		ob.a=ob.a+10;
		ob.b=ob.b-10;
		return ob;
	}
	void display()
	{
		System.out.println("a is "+a);
		System.out.println("b is "+b);
	}
}
class Ret_obj
{
	public static void main(String args[])
	{
		Retobj r;
		Retobj r1=new Retobj(10,20);
		r=r1.compute(r1);
		r.display();
	}
}
