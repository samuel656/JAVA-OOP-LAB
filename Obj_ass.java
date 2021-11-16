class Obj
{ 
	int x,y;
	void getdata(Obj ob)
	{
		x=ob.x;
		y=ob.y;
	}
	void display()
	{
		System.out.println("x is "+x);
		System.out.println("y is "+y);
	}
}
class Obj_ass
{
	public static void main(String []args)
	{
		Obj d1=new Obj();
		d1.x=10;
		d1.y=20;
		Obj d2=new Obj();
		d2.getdata(d1);
		d1.display();
		d2.display();
		Obj d3;
		d3=d1;
		d3.display();
	}
}
