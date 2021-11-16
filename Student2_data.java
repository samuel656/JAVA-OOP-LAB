import java.util.*;
class Student2
{
	int rollno;
	String name;
	int m1,m2,m3;
	double sum,avg;
	Student2(int n,String na,int a,int b,int c)
	{
		rollno=n;
		name=na;
		m1=a;
		m2=b;
		m3=c;
	}
	void display_marks()
	{	
		if(avg>85)
		{
			System.out.println(name);
		}
	}
	void display_name()
	{	
		if(name.startsWith("s"))
		{
			System.out.println(rollno);
		}
	}
}
class Student2_data
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		Student2 st[]=new Student2[5];
		System.out.println("enter student details");
		int i;		
		for(i=0;i<5;i++)
		{
			System.out.println("enter rollno");
			int r=sc.nextInt();
			System.out.println("enter name");
			String na=sc.next();
			System.out.println("enter marks");
			int m1=sc.nextInt();
			int m2=sc.nextInt();
			int m3=sc.nextInt();
			st[i]=new Student2(r,na,m1,m2,m3);
			st[i].sum=m1+m2+m3;
			st[i].avg=st[i].sum/3;
		}
		System.out.println("student having avg>85");
		for(i=0;i<5;i++)
		{
			st[i].display_marks();
		}
		System.out.println("student name starting with s");
		for(i=0;i<5;i++)
		{
			st[i].display_name();
		}
	}
}
