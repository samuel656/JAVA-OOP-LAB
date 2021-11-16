import java.util.*;
class Student
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String name;
		int rollno;
		double sgpa;
		System.out.println("enter student name");
		name=s.next();
		System.out.println("enter student ID");
		rollno=s.nextInt();
		System.out.println("enter student SGPA");
		sgpa=s.nextDouble();
		System.out.println("student name is "+name);
		System.out.println("student ID is "+rollno);
		System.out.println("student SGPA is "+sgpa);
	}
}

