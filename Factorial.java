class Facto
{
	int fact(int n)
	{
		if(n==1)
			return 1;
		else
			return n*fact(n-1);
	}
}
class Factorial
{
	public static void main(String args[])
	{
		int n=5;
		Facto f=new Facto();
		int a=f.fact(n);
		System.out.println("factorial is "+a);
	}
}
