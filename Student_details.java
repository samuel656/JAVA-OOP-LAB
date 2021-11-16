class Student_demo
{
	int rollno,age;
	String name;
	void getdata(int x,String y,int z)
	{
		rollno=x;
		name=y;
		age=z;
	}
	void display()
	{
	System.out.println("rol no is "+rollno);
	System.out.println("name is "+name);
	System.out.println("age is "+age);
	}
}
class Student_details
{
	public static void main(String []args)
	{
		Student_demo s1=new Student_demo();
		s1.getdata(565,"samuel",18);
		s1.display();
		Student_demo s2=new Student_demo();
		s2.getdata(546,"venu",19);
		s2.display();
	}
}
