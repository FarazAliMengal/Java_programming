import java.util.*;
class Task6
{
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);

		
		int price;
		int a=1,b=2,h=3,d=4,e=5,x=6,y=7,z=8,g=9,t=10;
		
		System.out.println("Menu");
		System.out.println("1. Fish");
		System.out.println("2. pizza");
		System.out.println("3. Tea");
		System.out.println("4. Chicken");
		System.out.println("5. Biryani");
		System.out.println("6. Kebab");
		System.out.println("7. pilaf");
		System.out.println("8. potato chips");
		System.out.println("9.paratha ");
		System.out.println("10. Burger");

		System.out.println("Enter Choices(1-10):");
		price=sc.nextInt();

		switch(price)
		{
			case 1:
			System.out.println("1500 Rupees");
			break;

			case 2:
			System.out.println("1200 Rupees:");
			break;

			case 3:
			System.out.println("50 Rupees:");
			break;

			case 4:
			System.out.println("1400 Rupees:");
			break;
	
			case 5:
			System.out.println("300 Rupees:");
			break;

			case 6:
			System.out.println("500 Rupees:");
			break;

			case 7:
			System.out.println("600 Rupees:");
			break;

			case 8:
			System.out.println("150 Rupees:");
			break;

			case 9:
			System.out.println("30 Rupees");
			break;

			case 10:
			System.out.println("150 Rupees:");
			break;

			default:
			System.out.println("Please Enter Correct choice");
		
		}
		

	

	}


}		 

