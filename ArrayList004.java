import java.util.*;
class ArrayList004
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		while(true)
		{	

			System.out.println("\n___________________\n");
			System.out.println(" "+"1.Traverse Number");
			System.out.println(" "+"2.Add Number");
			System.out.println(" "+"3.Remove Number");
			System.out.println(" "+"4.Sort Numbers");
			System.out.println(" "+"5.Update Number");
			System.out.println(" "+"6.Exit");
			System.out.println("\n___________________\n");

			System.out.print("\nSelect Choice From Above:");
			int num=sc.nextInt();

	
		if(num==1)
		{
			int num1;
			System.out.print("Enter Array Size:");
			int size=sc.nextInt();

			int a[]=new int[size];
			for(int  i=0;i<a.length;i++)
			{
				System.out.print("Enter Numbers:"+" ");
				 a[i]=sc.nextInt();

			}

			System.out.print("Traverse:");
			for(int i=0;i<a.length;i++)
			{	
				System.out.print(a[i]+" ");
			}	
		}


		if(num==2)
		{

			ArrayList<Integer> f=new ArrayList<Integer>();
			
				
				f.add(2);
				f.add(4);
				f.add(6);
				f.add(10);
				System.out.println("Before Adding Number:"+f);

				System.out.print("Add Any Number:");
				int num1=sc.nextInt();

				f.add(num1);
				System.out.println("\nAfter Adding Number:"+f);

		}

		if(num==3)
		{
			ArrayList<Integer> rem=new ArrayList<Integer>();

			rem.add(6);
			rem.add(7);
			rem.add(8);
			rem.add(9);

			System.out.println("Before Delete Any Number:"+rem);

			System.out.print("Enter index number of Numer Which You want to Delete :");
			int rem1=sc.nextInt();

			rem.remove(rem1);
			System.out.print("After :"+rem);
		}

		if(num==4)
		{
			ArrayList<Integer> sort=new ArrayList<Integer>();

			sort.add(4);
			sort.add(25);
			sort.add(7);
			sort.add(10);
			System.out.println("Before Update Any Number:"+sort);

			Collections.sort(sort);
			System.out.print("After Sorting:"+sort);
		}

		if(num==5)
		{
			ArrayList<Integer> update=new ArrayList<Integer>();

			update.add(10);
			update.add(20);
			update.add(3);
			update.add(4);

			System.out.println("Before UpdaTE Any Number:"+update);

			System.out.print("Enter Index number of Number which You want to Update:");
			int up=sc.nextInt();

			System.out.print("Enter Number Now:");
			int num1=sc.nextInt();

			update.set(up,num1);
			System.out.print("After Updating:"+update);
		}
		if(num==6)
			System.exit(0);
	}

	}
}