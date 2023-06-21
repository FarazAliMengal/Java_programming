import java.util.*;
class LinearSearch1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		int num1=0;
		int a[][]={
			{1,22,33,44,55,66},
			{2,23,43,54,64,77},
		};

		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print("\n"+a[i][j]+" ");
			}
		}


		System.out.print("\nSearch Number :");
		int num=sc.nextInt();

		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]==num)
			{
				num=num1;
			}
			}
		}
 
		if(num==num1)
			System.out.print("The Number Exist in the List");
		else 
			System.out.print("The Number does Not Exist in The List");
	}
}
