class Student
{
	int rno;
	String name;
	Student(int r,String n)
	{
		rno=r;
		name=n;
	}
		
}
class Exam extends Student
{
	double avg;
	Exam(int r,String n,double a)
	{
		super(r,n);
		avg=a;
	}
	void display()
	{
		System.out.println("name is "+name);
		System.out.println("roll is is "+rno);
		System.out.println("avg is "+avg);
	}
}
class SuperConstructor
{
	public static void main(String []args)
	{
		Exam e=new Exam(65,"sam",76.43);
		e.display();
		
	}
}
