import java.util.Scanner;
class HescoBilling
{
	public void hesc100(int unit1)
	{
		System.out.print("\nYour Bill :"+(unit1*2));
	}

	public void hesco200(int unit1)
	{
		int temp1=unit1-100;
		int total1=temp1*4;

		int temp2=unit1-temp1;
		int total2=temp2*2;

		int total=total1+total2;
		System.out.print("\nYour Bill :"+total);
	}

	public void hesco300(int unit1)
	{
		int temp1=unit1-200;
		int total1=temp1*6;

		int temp2=unit1-temp1-100;
		int total2=temp2*4;

		int temp3=unit1-temp1-temp2;
		int total3=temp3*2;

		int total=total1+total2+total3;
		System.out.print("\nYour Bill :"+total);
	}

	public void hesco400(int unit1)
	{
		int temp1=unit1-300;
		int total1=temp1*8;

		int temp2=unit1-temp1-200;
		int total2=temp2*6;

		int temp3=unit1-temp1-temp2-100;
		int total3=temp3*4;

		int temp4=unit1-temp1-temp2-temp3;
		int total4=temp4*2;

		int total=total1+total2+total3+total4;
		System.out.print("Your Bill :"+total);
	}

	public void hesco500(int unit1)
	{
		int temp1=unit1-400;
		int total1=temp1*10;

		int temp2=unit1-temp1-300;
		int total2=temp2*8;

		int temp3=unit1-temp1-temp2-200;
		int total3=temp3*6;

		int temp4=unit1-temp1-temp2-temp3-100;
		int total4=temp4*4;

		int temp5=unit1-temp1-temp2-temp3-temp4;
		int total5=temp5*2;

		int total=total1+total2+total3+total4+total5;
		System.out.print("\nYour Bill :"+total);
	}
}

class HescoBilling01
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		HescoBilling th1=new HescoBilling();

		System.out.print("Enter Units :");
		int unit=sc.nextInt();

		if(unit>=0 && unit<=100)
		{
			th1.hesc100(unit);
		}	

		if(unit>100 && unit<=200)
		{	
			th1.hesco200(unit);
		}

		if(unit>200 && unit<=300)
		{
			th1.hesco300(unit);
		}

		if(unit>300 && unit<=400)
		{
			th1.hesco400(unit);
		}

		if(unit>400 && unit<=500)
		{
			th1.hesco500(unit);
		}
	}
}