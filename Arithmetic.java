import java.util.*;
class Arithmetic
{
	public static void main(String args[])
	{
		Scanner op=new Scanner(System.in);
		int a,b;
		System.out.println("read two integers");
		a=op.nextInt();
		b=op.nextInt();
		int sum=a+b;
		int sub=a-b;
		int mul=a*b;
		int div=a/b;
		int mod=a%b;
		System.out.println("arithmetic operations");
		System.out.println("addition is "+sum);
		System.out.println("subtraction is "+sub);		
		System.out.println("multiplication is "+mul);
		System.out.println("division is "+div);
		System.out.println("modular division  is "+mod);
	}
}
