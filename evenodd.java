import java.util.*;
class evenodd
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);

		int a=ob.nextInt();
		System.out.println("Enter a number");

		if(a%2==0)
			{
				System.out.println("Even number");
			}
		else    {
				System.out.println("odd number");
			}
	}
}