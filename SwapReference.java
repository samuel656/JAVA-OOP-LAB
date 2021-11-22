class Reference
{
	int a,b;	
	void swap(Reference r)
	{
		int temp;
		temp=r.a;
		r.a=r.b;
		r.b=temp;
	}
}
class SwapReference
{
	public static void main(String args[])
	{
		Reference swp=new Reference();
		swp.a=10;
		swp.b=20;
		System.out.println("before swapping");
		System.out.println("a is "+swp.a);
		System.out.println("b is "+swp.b);
		System.out.println("after swapping");
		swp.swap(swp);
		System.out.println("a is "+swp.a);
		System.out.println("b is "+swp.b);
	}
}

					
