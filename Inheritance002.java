import java.util.*;
class Add
{
	Scanner sc=new Scanner(System.in);

	public void add()
	{
		System.out.print("Enter 1st Number:");
		int num1=sc.nextInt();

		System.out.print("Enter 2nd Number:");
		int num2=sc.nextInt();

		int add=num1+num2;
		System.out.print("Addition is:"+add);
	}
}

class Sub extends Add
{
	Scanner sc=new Scanner(System.in);

	public void sub()
	{
		System.out.print("Enter 1st Number:");
		int num1=sc.nextInt();

		System.out.print("Enter 2nd Number:");
		int num2=sc.nextInt();

		int sub=num1-num2;
		System.out.print("Subtraction is:"+sub);
	}

	public void multi()
	{
		System.out.print("Enter 1st Number:");
		int num1=sc.nextInt();

		System.out.print("Enter 2nd Number:");
		int num2=sc.nextInt();

		int multi=num1*num2;
		System.out.print("Multiplication is:"+multi);
	}
}

class Division extends Sub
{
	Scanner sc=new Scanner(System.in);

	public void div()
	{
		System.out.print("Enter 1st number:");
		int num1=sc.nextInt();

		System.out.print("Enter 2nd Number:");
		int num2=sc.nextInt();

		int div=num1/num2;
		System.out.print("Division is:"+div);
	}
}

class Inheritance002
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Division ob=new Division();

		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");

		System.out.print("Select Number From Above:");
		int num=sc.nextInt();

		if(num==1)
		{
			ob.add();
		}

		if(num==2)
		{
			ob.sub();
		}

		if(num==3)
		{
			ob.multi();
		}

		if(num==4)
		{
			ob.div();
		}
	}
}