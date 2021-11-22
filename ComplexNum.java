import java.util.*;
class Complex
{
	double real,img;
	void setReal(double r)
	{
		real=r;
	}
	void setImg(double i)
	{
		img=i;
	}
	double getReal()
	{
		return real;
	}
	double getImg()
	{
		return img;
	}
	void display()
	{
		System.out.println(real+"+i"+img);
	}
	Complex add(Complex c1,Complex c2)
	{
		Complex c3=new Complex();
		c3.real=c1.real+c2.real;
		c3.img=c1.img+c2.img;
		return c3;
	}
	Complex sub(Complex c)
	{
		Complex c3=new Complex();
		c3.real=real-c.real;
		c3.img=img-c.img;
		return c3;
	}
}
class ComplexNum
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		double r,i;
		Complex c1=new Complex();
		Complex c2=new Complex();
		Complex c3=new Complex();
		System.out.println("enter real and img part of c1");
		r=s.nextDouble();
		i=s.nextDouble();
		c1.setReal(r);
		c1.setImg(i);
		c1.display();
		System.out.println("enter real and img part of c2");
		r=s.nextDouble();
		i=s.nextDouble();
		c2.setReal(r);
		c2.setImg(i);
		c2.display();
		c3=c3.add(c1,c2);
		System.out.println("addition is");
		c3.display();
		System.out.println("subtraction is");
		c3=c3.sub(c2);
		System.out.println(c3.getReal()+"+i"+c3.getImg());
	}
}
		
		

