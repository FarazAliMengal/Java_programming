import java.util.*;
class cpm
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter matricculation marks ");
		double Matric=sc.nextDouble();

		System.out.print("Enter intermediate Marks ");
		double Inter=sc.nextDouble();

		System.out.print("Enter test score");
		 double Test=sc.nextDouble();

		double Cpn=(Matric/850)*10+(Inter/1100)*30+(Test/100)*60;

		System.out.println("cpn is"+(Cpn));

	}

}
