class This
{
	int x,y;
	This(int x,int y)	
	{
		this.x=x;
		this.y=y;
	}
	void display()
	{
		System.out.println("x is "+x);
		System.out.println("y is "+y);
	}
}
class This_demo
{
	public static void main(String []args)
	{
		This t1=new This(10,20);
		t1.display();
	}
}
