import java.util.*;
class Employee
{
	int emp_id,count;
	String emp_name;
	double emp_sal;
	Employee(int emp_id,String emp_name,double emp_sal)
	{
		this.emp_id=emp_id;
		this.emp_name=emp_name;
		this.emp_sal=emp_sal;
	}
	void display()
	{
		System.out.println("employee id is :"+emp_id);
		System.out.println("employee name is :"+emp_name);
		System.out.println("employee salary is :"+emp_sal);
	}
	void display_data()
	{
		if(emp_sal>20000)
		{
			display();
		}
	}
	int display_details()
	{
		
		if(emp_name.startsWith("na"))
		    return 1;
		else 
			return 0;
	}
}
class Emp
{
	
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		Employee em[]=new Employee[5];
		System.out.println("enter employee details");
		int i,count=0;
		for(i=0;i<5;i++)
		{
			System.out.println("enter employee id");
			int id=sc.nextInt();
			System.out.println("enter employee namee");
			String na=sc.next();
			System.out.println("entter employee salary");
			double sal=sc.nextInt();
			em[i]=new Employee(id,na,sal);
		}
		System.out.println("employees details are");
		for(i=0;i<5;i++)
		{
			em[i].display();
		}
		System.out.println("emplpyee details whose salary > 20000");
		for(i=0;i<5;i++)
		{
			em[i].display_data();
		}
		System.out.println("no. of employees whose  names starst with 'na' ");
		for(i=0;i<5;i++)
		{
			count=count+em[i].display_details();
		}
		System.out.println(count);
	}
}