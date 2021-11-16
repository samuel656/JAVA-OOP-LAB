import java.util.*;
class Transaction
{
	int transaction_id;
	double transaction_amount;
	Transaction()
	{
		System.out.println("initially Transaction id is "+transaction_id);
		System.out.println("initially Transaction amount is "+transaction_amount);
	}
	Transaction(int tid,double t_amount)
	{	
		this();
		transaction_id=tid;
		transaction_amount=t_amount;

	}
	void set_tid()
	{
		System.out.println("transaction ID Is sucesssfully generated");
	}
	void set_tamt()
	{
		System.out.println("transaction Amount is Sucessfully credited");
	}
	void ret_id(int tid)
	{
		System.out.println(tid);
	}
	void ret_amt(double t_amount)
	{
		System.out.println(t_amount);
	}
	void trans_details(int tid,double t_amount)
	{
		System.out.print("transaction id is ");
		ret_id(tid);
		System.out.print("transcation amount is ");
		ret_amt(t_amount);	
	}
}
class Transaction_details
{	
	public static void main(String []args)
	{
		int id=3245142;
		double amt=32450.00;
		Transaction t=new Transaction(id,amt);
		t.set_tid();
		t.ret_id(id);
		t.set_tamt();
		t.ret_amt(amt);
		t.trans_details(id,amt);
		
		
	}
}
