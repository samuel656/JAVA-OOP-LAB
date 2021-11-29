class  Static1
{
	int rno;
	String name;
	static String branch;
	Static1(int n, String na)
	{
		rno=n;
		name=na;
	}
	void display()
	{
		System.out.println("name is "+name);
		System.out.println("rno is "+rno);
		System.out.println("branch is "+branch);
	}
}
class StaticMembers
{
	public static void main(String args[])
	{
		Static1.branch="CSE";
		Static1 s1=new Static1(65,"sam");
		s1.display();
	}
}
