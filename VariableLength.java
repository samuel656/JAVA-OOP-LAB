class VarLen
{
	void display(int ...ar)
	{
		System.out.println("no. of arguments received is "+ar.length);
		int sum=0;
		for(int i=0; i<ar.length;i++)
		{
			sum=sum+ar[i];
		}
		System.out.println("sum is " +sum);
	}
}
class VariableLength
{
	public static void main(String []args)
	{
		VarLen v=new VarLen();
		v.display();
		v.display(10);
		v.display(10,20,30);
	}
}	
