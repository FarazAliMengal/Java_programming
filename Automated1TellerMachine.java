import java.util.*;
class Automated1TellerMachine
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int deposite=0;
		int withdraw=0;
		int checkbalance=0;


		char a='Y';
		while(a=='Y')// while(true)
		{
		System.out.println("\n1.Deposite");
		System.out.println("2.With-Draw");
		System.out.println("3.Check-Balance");
		System.out.println("4.Exit");

		System.out.print("\nSelect Number From Above:");
		int num=sc.nextInt();

		if(num==1)
		{
			System.out.print("\nEnter Deposite Money:");
			deposite=sc.nextInt();

			System.out.println("Deposite SuccessFully");
		}

		if(num==2)
		{
			System.out.print("\nEnter With-Drawal Money:");
			withdraw=sc.nextInt();

			System.out.print("With-Drawal Success-Fully");
		}

		if(num==3)
		{
			checkbalance=deposite-withdraw;
			System.out.println("\nCurrent Balance:"+checkbalance);
		}

		if(num==4)
		{
			System.exit(0);
		}
		}
	}
}