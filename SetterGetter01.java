import java.util.*;

class Faraz
{
	int num;

	public void add(int a, int b)
	{
		num=a+b;
	}

	public void sub(int a,int b)
	{
		num=a-b;
	}

	public void multi(int a, int b)
	{
		num=a*b;
	}

	public void div(int a,int b)
	{
		num=a/b;
	}

	public void mod(int a,int b)
	{
		num=a%b;
	}

	int get()
	{
		return num;
	}
}
 class SetterGetter01
{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		Faraz ob=new Faraz();
		
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Modulus");

		System.out.print("\nSelect Number from Above:");
		int num=sc.nextInt();

		if(num==1)
		{
			System.out.print("Enter 1st Number:");
			int num1=sc.nextInt();

			System.out.print("Enter second Number");
			int num2=sc.nextInt();

			ob.add(num1,num2);
			System.out.print("Addition is:"+ob.get());
		}

		if(num==2)
		{
			System.out.print("Enter 1st Number:");
			int num1=sc.nextInt();

			System.out.print("Enter 2nd Number:");
			int num2=sc.nextInt();

			ob.sub(num1,num2);
			System.out.print("Subtraction is:"+ob.get());
		}

		if(num==3)
		{
			System.out.print("Enter 1st Number:");
			int num1=sc.nextInt();

			System.out.print("Enter 2nd Number:");
			int num2=sc.nextInt();

			ob.multi(num1,num2);
			System.out.print("Multiplication is:"+ob.get());
		}

		if(num==4)
		{
			System.out.print("Enter 1st Number:");
			int num1=sc.nextInt();

			System.out.print("Enter 2nd Number:");
			int num2=sc.nextInt();

			ob.div(num1,num2);
			System.out.print("Division is:"+ob.get());
		
		}

		if(num==5)
		{
			System.out.print("Enter 1st Number:");
			int num1=sc.nextInt();

			System.out.print("Enter 2nd Number:");
			int num2=sc.nextInt();

			ob.mod(num1,num2);
			System.out.print("Modulus is:"+ob.get());
		
		}
	}
}
