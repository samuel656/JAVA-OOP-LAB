class This_st
{
	int rno,age;
	String name;
	This_st(int rno)
	{
		this.rno=rno;
	}
	This_st(int rno,int age)
	{
		this(rno);
		this.age=age;
	}
	This_st(int rno,int age,String name)	
	{
		this(rno,age);
		this.name=name;
	}
	void display()
	{
		System.out.println("rno is "+rno);
		System.out.println("name is "+name);
		System.out.println("age is "+age);
	} 
}
class Student_this
{
	public static void main(String []args)
	{
		This_st st=new This_st(565,18,"sam");
		st.display();
	}
}

