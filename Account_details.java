import java.util.*;
class Account
{
	String ac_name;
	String ac_no;
	double balance;
	Account(String ac_name,String ac_no,double balance)
	{
		this.ac_name=ac_name;
		this.ac_no=ac_no;
		this.balance=balance;
	}
	void deposit(double amount)
	{
		
		balance=balance+amount;
		System.out.println("amount deposited is : "+amount);
		System.out.println("available balance is :"+balance);
	}
	void withdraw(double withdraw_amount)
	{
		if(balance<withdraw_amount)
			System.out.println("insufficient balance");
		else
		{
			balance=balance-withdraw_amount;
			System.out.println("withdrawl amount is "+withdraw_amount);
			System.out.println("available balance is "+balance);
		}
	}
	void balance_check()
	{
		System.out.println("available balance is"+balance);
	}
}
class Account_details
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String x;
		String y;
		double z;
		System.out.println("enter acount number");
		y=sc.next();
		System.out.println("enter acount holder name");
		x=sc.next();
		System.out.println("enter account balance");
		z=sc.nextDouble();
		Account sbi=new Account(x,y,z);
		int opt;
		System.out.println("1.deposit");
		System.out.println("2.withdrawl");
		System.out.println("3.balance enquiry");
		System.out.println("4.quit");
		System.out.println("enter your option");
		opt=sc.nextInt();
		switch(opt)
		{
			case 1: System.out.println("enter amount to deposit");
					double amt=sc.nextDouble();
					sbi.deposit(amt);
					break;
			case 2: System.out.println("enter amount to withdraw");
					double wamt=sc.nextDouble();
					sbi.withdraw(wamt);
					break;
			case 3: sbi.balance_check();
					break;
			case 4: System.exit(1);
			default: System.out.println("enter valid option");
		}
	}
}
				
