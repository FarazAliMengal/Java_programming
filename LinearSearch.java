import java.util.*;
class LinearSearch
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		int a[]={1,2,33,4,55,77};
		int num1=0;

		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

		System.out.print("\nSearch Number From List :");
		int num=sc.nextInt();

		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)
			{
				 num=num1;
			}
		}
			if(num==num1)
			{
				System.out.print("This Number Exist");
			}
				else 
				System.out.print("This Number Not Exist");
	
	}
}