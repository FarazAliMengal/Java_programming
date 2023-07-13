import java.util.*;
class Conversion01
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		while(true)
	{		

		System.out.println("\n__________________________\n");

		System.out.println("1.Binary To Decimal");
		System.out.println("2.Decimal To Binary");
		System.out.println("3.Hexa Decimal To Decimal");
		System.out.println("4.Decimal To HexaDecimal");
		System.out.println("5.Octal To Decimal");
		System.out.println("6.Decimal To Octal");
		System.out.println("7.Binary To Hexa-Decimal");
		System.out.println("8.Exit");

		System.out.println("\n__________________________\n");

		System.out.print("  \nSelect Number:");
		int num=sc.nextInt();

		if(num==1)
		{	
			try
			{
				System.out.print("Enter Binary Number :");
				String binary=sc.next();

				int decimal=Integer.parseInt(binary,2);
				System.out.println("\nDecimal Number :"+decimal);
			}
			catch(Exception e)
			{
				System.out.print("");
			}

		}	

		if(num==2)
		{
			System.out.print("Enter Decimal Number:");
			int dec=sc.nextInt();

			System.out.println("\nBinary Number :"+Integer.toBinaryString(dec));
		}

		if(num==3)
		{
			System.out.print("Enter HexaDecimal Number :");
			String hex=sc.next();

			int decimal=Integer.parseInt(hex,16);
			System.out.println("\nDecimal Number :"+decimal);
		}

		if(num==4)
		{
			System.out.print("Enter Decimal Number :");
			int dec=sc.nextInt();


			System.out.println("\nHexa-Decimal Number :"+Integer.toHexString(dec));
		}

		if(num==5)
		{
			System.out.print("Enter Octal Number :");
			String oct=sc.next();

			int octal=Integer.parseInt(oct,8);
			System.out.println("\nDecimal Number :"+octal);
		}

		if(num==6)
		{
			System.out.print("Enter Decimal Number :");
			int dec=sc.nextInt();

			System.out.println("\nOctal Number :"+Integer.toOctalString(dec));
		}

		if(num==7)
		{
			System.out.print("Enter Binary Number :");
			String binary=sc.next();

			int decimal=Integer.parseInt(binary,2);

			System.out.print("\nHexa-Decimal Number :"+Integer.toHexString(decimal));
		}

		if(num==8)
		{
			System.out.print("Enter Binary Number :");
			int bin=sc.nextInt();

			int decimal=Integer.parseInt(bin,2);
			int octal=Integer.parseInt(decimal,8);
			System.out.print("Octal Number :"+octal);
		}

			if(num==8)
				System.exit(0);
		}
	}
}