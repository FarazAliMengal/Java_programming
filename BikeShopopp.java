import javax.swing.*;
class Faraz
{
	public void cd(){

		JOptionPane.showMessageDialog(null,"First Of All Enter Your Details\n");

		String name1=JOptionPane.showInputDialog(null,"Enter Your Name:");
		String add1=JOptionPane.showInputDialog(null,"Enter Your Address");
		String cnic1=JOptionPane.showInputDialog(null,"Enter Your Cnic");

		int bike=50;

			JOptionPane.showMessageDialog(null,"Total CD Bikes:"+bike);

			String quant1=JOptionPane.showInputDialog(null,"Enter CD-Bikes Quantity");
			int quant=Integer.parseInt(quant1);

			if(quant<=50)
			{
				String days1=JOptionPane.showInputDialog(null,"How Many Days do You need Bike");
				int days=Integer.parseInt(days1);

				int price=quant*days*200;
				JOptionPane.showMessageDialog(null,"Your Total Bill:"+price);

				int bike1=bike-quant;

				JOptionPane.showMessageDialog(null,"\n______________________\nName:" + name1 + "\n______________________\nAddress:" + add1 + "\n______________________\nCnic:" + cnic1 + "\n______________________\nBikes Quantity:" + quant + "\n______________________\nFor How Many Days:" + days + "\n______________________\nYour Total Bill:" + price + "\n______________________\nAvailable Bikes for Rent:" + bike1);
			}
		else 
			JOptionPane.showMessageDialog(null,"Not Available");
	}

	public void yamaha()
	{
		JOptionPane.showMessageDialog(null,"First Of All Enter Your Details\n");

		String name1=JOptionPane.showInputDialog(null,"Enter Your Name:");
		String add1=JOptionPane.showInputDialog(null,"Enter Your Address");
		String cnic1=JOptionPane.showInputDialog(null,"Enter Your Cnic");

		int yamaha=70;
		JOptionPane.showMessageDialog(null,"Total Yamaha Bikes:"+yamaha);

		String quant1=JOptionPane.showInputDialog(null,"Enter Yamaha Bikes Quantity");
		int quant=Integer.parseInt(quant1);

		if(quant<=70)
		{
			String days1=JOptionPane.showInputDialog(null,"How Many Days Do you Need Bike");
			int days=Integer.parseInt(days1);

			int price=quant*days*300;
			JOptionPane.showMessageDialog(null,"Your Total Bill:"+price);

			int bike=yamaha-quant;

			JOptionPane.showMessageDialog(null,"\n______________________\nName:" + name1 + "\n______________________\nAddres:" + add1 + "\n______________________\nCnic:" + cnic1 + "\n______________________\nTotal Yamaha Bikes:" + yamaha + "\n______________________\nBike Quantity:" + quant + "\n______________________\nFor How Many Daya:"+days + "\n______________________\nyour Total Bill:"+ price + "\n______________________\nRemaining Yamaha Bikes:"+bike); 
		}
		else 
			JOptionPane.showMessageDialog(null,"Not Available");

	}

	public void reven()
	{
		JOptionPane.showMessageDialog(null,"First Of All Enter Your Details\n");

		String name1=JOptionPane.showInputDialog(null,"Enter Your Name:");
		String add1=JOptionPane.showInputDialog(null,"Enter Your Address");
		String cnic1=JOptionPane.showInputDialog(null,"Enter Your Cnic");

		int reven=50;
		JOptionPane.showMessageDialog(null,"Total Reven Bikes:"+reven);

		String quant1=JOptionPane.showInputDialog(null,"Enter Bike Quantity");
		int quant=Integer.parseInt(quant1);

		if(quant<=50)
		{
			String days1=JOptionPane.showInputDialog(null,"How Many Days do you Need Bike");
			int days=Integer.parseInt(days1);

			int price=quant*days*400;
			JOptionPane.showMessageDialog(null,"Your Total Bill"+price);

			int bike=reven-quant;

			JOptionPane.showMessageDialog(null,"\n______________________\nName:" + name1 + "\n______________________\nAddress:" + add1 + "\n______________________\nCnic:" + cnic1 + "\n______________________\nBike Quantity:" + quant + "\n______________________\nFor How Many Days:" + days + "\n______________________\nYour Total Bill:" + price + "\n______________________\nRemaining Bikes:" + bike);
		}	
		else 
			JOptionPane.showMessageDialog(null,"Not Available");
	}

	public void star()
	{
		JOptionPane.showMessageDialog(null,"First Of All Enter Your Details\n");

		String name1=JOptionPane.showInputDialog(null,"Enter Your Name:");
		String add1=JOptionPane.showInputDialog(null,"Enter Your Address");
		String cnic1=JOptionPane.showInputDialog(null,"Enter Your Cnic");

		int star=50;
		JOptionPane.showMessageDialog(null,"Total Super Star Bikes:"+star);

		String quant1=JOptionPane.showInputDialog(null,"Enter Bike Quantity");
		int quant=Integer.parseInt(quant1);

		if(quant<=50)
		{
			String days1=JOptionPane.showInputDialog(null,"How Many Days do you Need Bike");
			int days=Integer.parseInt(days1);

			int price=quant*days*400;
			JOptionPane.showMessageDialog(null,"Your Total Bill"+price);

			int bike=star-quant;

			JOptionPane.showMessageDialog(null,"\n______________________\nName:" + name1 + "\n______________________\nAddress:" + add1 + "\n______________________\nCnic:" + cnic1 + "\n______________________\nBike Quantity:" + quant + "\n______________________\nFor How Many Days:" + days + "\n______________________\nYour Total Bill:" + price + "\n______________________\nRemaining Bikes:" + bike);
		}
		else 
			JOptionPane.showMessageDialog(null,"Not Available");
	}

	public void express()
	{
		JOptionPane.showMessageDialog(null,"First Of All Enter Your Details\n");

		String name1=JOptionPane.showInputDialog(null,"Enter Your Name:");
		String add1=JOptionPane.showInputDialog(null,"Enter Your Address");
		String cnic1=JOptionPane.showInputDialog(null,"Enter Your Cnic");

		int express=50;
		JOptionPane.showMessageDialog(null,"Total Express Bikes:"+express);

		String quant1=JOptionPane.showInputDialog(null,"Enter Bike Quantity");
		int quant=Integer.parseInt(quant1);

		if(quant<=50)
		{
			String days1=JOptionPane.showInputDialog(null,"How Many Days do you Need Bike");
			int days=Integer.parseInt(days1);

			int price=quant*days*400;
			JOptionPane.showMessageDialog(null,"Your Total Bill"+price);

			int bike=express-quant;

			JOptionPane.showMessageDialog(null,"\n______________________\nName:" + name1 + "\n______________________\nAddress:" + add1 + "\n______________________\nCnic:" + cnic1 + "\n______________________\nBike Quantity:" + quant + "\n______________________\nFor How Many Days:" + days + "\n______________________\nYour Total Bill:" + price + "\n______________________\nRemaining Bikes:" + bike);
		}
		else 
			JOptionPane.showMessageDialog(null,"Not Available");
	}

	public void unique()
	{
		JOptionPane.showMessageDialog(null,"First Of All Enter Your Details\n");

		String name1=JOptionPane.showInputDialog(null,"Enter Your Name:");
		String add1=JOptionPane.showInputDialog(null,"Enter Your Address");
		String cnic1=JOptionPane.showInputDialog(null,"Enter Your Cnic");

		int unique=50;
		JOptionPane.showMessageDialog(null,"Total Unique Bikes:"+unique);

		String quant1=JOptionPane.showInputDialog(null,"Enter Bike Quantity");
		int quant=Integer.parseInt(quant1);

		if(quant<=50)
		{
			String days1=JOptionPane.showInputDialog(null,"How Many Days do you Need Bike");
			int days=Integer.parseInt(days1);

			int price=quant*days*400;
			JOptionPane.showMessageDialog(null,"Your Total Bill"+price);

			int bike=unique-quant;

			JOptionPane.showMessageDialog(null,"\n______________________\nName:" + name1 + "\n______________________\nAddress:" + add1 + "\n______________________\nCnic:" + cnic1 + "\n______________________\nBike Quantity:" + quant + "\n______________________\nFor How Many Days:" + days + "\n______________________\nYour Total Bill:" + price + "\n______________________\nRemaining Bikes:" + bike);
		}
		else 
			JOptionPane.showMessageDialog(null,"Not Available");
	}

	public void dhoom()
	{
		JOptionPane.showMessageDialog(null,"First Of All Enter Your Details\n");

		String name1=JOptionPane.showInputDialog(null,"Enter Your Name:");
		String add1=JOptionPane.showInputDialog(null,"Enter Your Address");
		String cnic1=JOptionPane.showInputDialog(null,"Enter Your Cnic");

		int dhoom=50;
		JOptionPane.showMessageDialog(null,"Total Dhoom Bikes:"+dhoom);

		String quant1=JOptionPane.showInputDialog(null,"Enter Bike Quantity");
		int quant=Integer.parseInt(quant1);

		if(quant<=50)
		{
			String days1=JOptionPane.showInputDialog(null,"How Many Days do you Need Bike");
			int days=Integer.parseInt(days1);

			int price=quant*days*400;
			JOptionPane.showMessageDialog(null,"Your Total Bill"+price);

			int bike=dhoom-quant;

			JOptionPane.showMessageDialog(null,"\n______________________\nName:" + name1 + "\n______________________\nAddress:" + add1 + "\n______________________\nCnic:" + cnic1 + "\n______________________\nBike Quantity:" + quant + "\n______________________\nFor How Many Days:" + days + "\n______________________\nYour Total Bill:" + price + "\n______________________\nRemaining Bikes:" + bike);
		}
		else 
			JOptionPane.showMessageDialog(null,"Not Available");
	}

	public void hundred()
	{
		JOptionPane.showMessageDialog(null,"First Of All Enter Your Details\n");

		String name1=JOptionPane.showInputDialog(null,"Enter Your Name:");
		String add1=JOptionPane.showInputDialog(null,"Enter Your Address");
		String cnic1=JOptionPane.showInputDialog(null,"Enter Your Cnic");

		int hundred=50;
		JOptionPane.showMessageDialog(null,"Total Hundred Bikes:"+hundred);

		String quant1=JOptionPane.showInputDialog(null,"Enter Bike Quantity");
		int quant=Integer.parseInt(quant1);

		if(quant<=50)
		{
			String days1=JOptionPane.showInputDialog(null,"How Many Days do you Need Bike");
			int days=Integer.parseInt(days1);

			int price=quant*days*400;
			JOptionPane.showMessageDialog(null,"Your Total Bill"+price);

			int bike=hundred-quant;

			JOptionPane.showMessageDialog(null,"\n______________________\nName:" + name1 + "\n______________________\nAddress:" + add1 + "\n______________________\nCnic:" + cnic1 + "\n______________________\nBike Quantity:" + quant + "\n______________________\nFor How Many Days:" + days + "\n______________________\nYour Total Bill:" + price + "\n______________________\nRemaining Bikes:" + bike);
		}
		else 
			JOptionPane.showMessageDialog(null,"Not Available");
	}
		public void list()
		{
			JOptionPane.showMessageDialog(null,"RENT LIST\n____________________\n1.CD=200" + "\n____________________\n2.Yamaha=300" + "\n____________________\n3.Reven=400" + "\n____________________\n4.Super Star=400" + "\n____________________\n5.Express=400" + "\n____________________\n6.Unique=400" + "\n____________________\n7.Dhoom=400" + "\n____________________\n8.Hundred=400");
		}


}

class BikeShopopp
{
	public static void main(String[] args) {

		Faraz ob=new Faraz();

		while(true)
		{
		
		/*JOptionPane.showMessageDialog(null,"1.CD-17");
		JOptionPane.showMessageDialog(null,"2.Yamaha");
		JOptionPane.showMessageDialog(null,"3.Raven");
		JOptionPane.showMessageDialog(null,"4.Super Star");
		JOptionPane.showMessageDialog(null,"5.Express");
		JOptionPane.showMessageDialog(null,"6.Unique");
		JOptionPane.showMessageDialog(null,"7.Dhoom");
		JOptionPane.showMessageDialog(null,"8.Hundred");*/

		String select1=JOptionPane.showInputDialog(null, "HUSSAINI-SHOP\n___________________\n1.CD-17" + "\n___________________\n2.Yamaha" + "\n___________________\n3.Raven" + "\n___________________\n4.Super Star" + "\n___________________\n5.Express" + "\n___________________\n6.Unique" + "\n___________________\n7.Dhoom" + "\n___________________\n8.Hundred" + "\n___________________\n9.Bike Rent List" + "\n___________________\n10.Exit" + "\n___________________\nSelect Number\n");
		int select=Integer.parseInt(select1);

				if(select==1)
				{
					ob.cd();
				}

				if(select==2)
				{
					ob.yamaha();
				}

				if(select==3)
				{
					ob.reven();
				}

				if(select==4)
				{
					ob.star();
				}

				if(select==5)
				{
					ob.express();
				}

				if(select==6)
				{
					ob.unique();
				}

				if(select==7)
				{
					ob.dhoom();
				}

				if(select==8)
				{
					ob.hundred();
				}
				if(select==9)
					ob.list();

				if(select==10)
					System.exit(0);
		}

	}
} 

