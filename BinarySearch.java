import java.util.*;
class BinarySearch
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		int num1=0;
		int a[]={33,66,100,103,220,300,600,1000,1100};

		int middle=a.length/2;

		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] +" ");
		}

		System.out.print("\nSearch Number :");
		int num=sc.nextInt();

		if(a[middle]>=num)
		{
			for(int i=1;i<=middle;i++)
			{
				if(a[i]==num)
				{
					num=num1;
				}

			}
		}	



		if(a[middle]<=num)
		{	
			for(int i=middle;i<a.length;i++)
			{
				if(a[i]==num)
				{
					num=num1;
				}

			}
		}	

		if(num==num1)
			System.out.print("\nThe Number Exist in The List");
		else 
			System.out.print("\n The Number does Not Exist in the List");

	}
}