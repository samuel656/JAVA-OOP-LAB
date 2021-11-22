class CallByValue
{
	void swap(int a,int b)
	{
		int temp;
		temp=a;
		a=b;
		b=temp;
	}
}
class Swapvalues
{
	public static void main(String args[])
	{
		CallByValue swp=new CallByValue();
		int a=10;
		int b=20;
		System.out.println("before swapping");
		System.out.println("a is "+a);
		System.out.println("b is "+b);
		System.out.println("after swapping");
		swp.swap(a,b);
		System.out.println("a is "+a);
		System.out.println("b is "+b);
	}
}

					
