import javax.swing.*;
class Faraz
{
	public void addmission()
	{
		int pay;

		String addm1=JOptionPane.showInputDialog(null,"Enter Your Name:");
		String father1=JOptionPane.showInputDialog(null,"Enter Your Father Name:");
		String add1=JOptionPane.showInputDialog(null,"Enter Your Address");
		String challan=JOptionPane.showInputDialog(null,"Enter Your Challan Number");

		if(challan == "12345678" || challan == "76524321" || challan == "45345398" || challan == "67859432");
		{
			String pay1=JOptionPane.showInputDialog(null,"Enter Challan Fees");
			 pay=Integer.parseInt(pay1);

			JOptionPane.showMessageDialog(null,"Challan Paid Successfully");
		}

		JOptionPane.showMessageDialog(null,"\n____________________\nYour Name:"+addm1 + "\n____________________\nFather Name:"+father1 + "\n____________________\nAddress:"+add1 + "\n____________________\nChallan No:"+challan + "\n____________________\nChallan Fees:"+pay +"\n____________________\n Challan:Paid");
	}

	public void marksheet()
	{
		/*JOptionPane.showMessageDialog(null,"1.First Year");
		JOptionPane.showMessageDialog(null,"2.Second Year");
		JOptionPane.showMessageDialog(null,"3.Third Year");
		JOptionPane.showMessageDialog(null,"4.Fourth Year")*/

		String year1=JOptionPane.showInputDialog(null,"\n____________________\n1.First Year" + "\n____________________\n2.Second Year" + "\n____________________\n3.Third Year" + "\n____________________\n4.Fourth Year" +"\n____________________\n Select Year");
		int year=Integer.parseInt(year1);

		if(year==1)
		{

			String num1=JOptionPane.showInputDialog(null,"\n___________________\n1.1st SEMESTER"+"\n___________________\n2.2ND SEMESTER"+"\n___________________\nSELECT SEMESTER");
			int num=Integer.parseInt(num1);

			if(num==1)
			{
				String name1=JOptionPane.showInputDialog(null,"Enter Your Name");
				String father=JOptionPane.showInputDialog(null,"Enter Your Father Name");
				String roll=JOptionPane.showInputDialog(null,"Enter Your Roll No");

				int english=70;
				int iict=80;
				int pakstudy=70;
				int c=85;
				int accounting=86;
				int math=80;

				int totalmarks=600;
				int obtained=english+iict+pakstudy+c+accounting+math;
				double gpa=55/19;

				JOptionPane.showMessageDialog(null,"1ST SEMESTER MARKSHEET\n____________________\nName:"+name1+"\n____________________\nFather:"+father+"\n____________________\nRoll No:"+roll+"\n____________________\nEnglish:"+english+"\n____________________\nIICT:"+iict+"\n____________________\nPak Study:"+pakstudy+"\n____________________\nC-Language:"+c+"\n____________________\nAccounting:"+accounting+"\n____________________\nMath:"+math+"\n____________________\nTotal Marks:"+totalmarks+"\n____________________\nObtained Marks:"+obtained+"\n____________________\nGPA:"+gpa);
			}

			if(num==2)
			{
				String name1=JOptionPane.showInputDialog(null,"Enter Your Name");
				String father=JOptionPane.showInputDialog(null,"Enter Your Father Name");
				String roll=JOptionPane.showInputDialog(null,"Enter Your Roll No");

				int english=70;
				int dld=80;
				int java=80;
				int islymiyat=85;
				int discrete=88;

				int totalmarks=500;
				int obtained=english+dld+discrete+islymiyat+java;
				double gpa=56/19;

				JOptionPane.showMessageDialog(null,"\n____________________\nName:"+name1+"\n____________________\nFather Name:"+father+"\n____________________\nRoll No:"+roll+"\n____________________\nEnglish:"+english+"\n____________________\nDLD:"+dld+"\n____________________\nJava"+java+"Islymiyat:"+islymiyat+"\n____________________\nDiscrete"+discrete+"\n____________________\nTotal Marks:"+totalmarks+"\n____________________\nObtained"+obtained+"\n____________________\nGpa:"+gpa);
			}
		}

		if(year==2)
		{
				String num1=JOptionPane.showInputDialog(null,"\n___________________\n1.1st SEMESTER"+"\n___________________\n2.2ND SEMESTER"+"\n___________________\nSELECT SEMESTER");
				int num=Integer.parseInt(num1);

				if(num==1)
				{
					String name1=JOptionPane.showInputDialog(null,"Enter Your Name");
					String father=JOptionPane.showInputDialog(null,"Enter Your Father Name");
					String roll=JOptionPane.showInputDialog(null,"Enter Your Roll No");

					int hrm=80;
					int coal=85;
					int linear=80;
					int dsa=85;
					int software=85;

					int totalmarks=500;
					int obtained=hrm+coal+linear+dsa+software;
					double gpa=55/19;

					JOptionPane.showMessageDialog(null,"\n___________________\nName:"+name1+"\n___________________\nFather Name:"+father+"\n___________________\nRoll No:"+roll+"\n___________________\nHRM:"+hrm+"\n___________________\nCoal"+coal+"\n___________________\nLinear:"+"DSA:"+dsa+"\n___________________\nSoftware:"+software+"\n___________________\nTotal Marks:"+totalmarks+"\n___________________\nObtained:"+obtained+"\n___________________\nGPA:"+gpa);
				}

				if(num==2)
				{
					String name1=JOptionPane.showInputDialog(null,"Enter Your Name");
					String father=JOptionPane.showInputDialog(null,"Enter Your Father Name");
					String roll=JOptionPane.showInputDialog(null,"Enter Your Roll No");

					int automata=80;
					int database=85;
					int cssupporting=85;
					int statistics=80;
					int elective=75;

					int totalmarks=500;
					int obtained=automata+database+cssupporting+statistics+elective;
					double gpa=55/18;

					JOptionPane.showMessageDialog(null,"\n___________________\nName:"+name1+"\n___________________\nFather Name:"+father+"\n___________________\nRoll No:"+"Automate:"+automata+"\n___________________\nDataBase:"+database+"\n___________________\nCs-Supporting"+cssupporting+"\n___________________\nStatistics:"+statistics+"\n___________________\nElective:"+elective+"\n___________________\nTotal Marks:"+totalmarks+"\n___________________\nObtained Marks:"+obtained+"\n___________________\nGPA:"+gpa);
				}
		}

		if(year==3)
		{
			String num1=JOptionPane.showInputDialog(null,"\n___________________\n1.1st SEMESTER"+"\n___________________\n2.2ND SEMESTER"+"\n___________________\nSELECT SEMESTER");
			int num=Integer.parseInt(num1);

			if(num==1)
			{
				String name1=JOptionPane.showInputDialog(null,"Enter Your Name");
				String father=JOptionPane.showInputDialog(null,"Enter Your Father Name");
				String roll=JOptionPane.showInputDialog(null,"Enter Your Roll No");

				int desgn=80;
				int computer=75;
				int network=80;
				int elective=86;
				int supporting=88;

				int totalmarks=500;                                        
				int obtained=desgn+computer+network+elective+supporting;
				double gpa=56/16;

				JOptionPane.showMessageDialog(null,"\n___________________\nName:"+name1+"\n___________________\nFather Name:"+father+"\n___________________\nRoll No:"+roll+"\n___________________\nDesign:"+desgn+"\n___________________\nComputer:"+computer+"\n___________________\nNetwork:"+network+"\n___________________\nCS-Elective:"+elective+"\n___________________\nCs-Supporting"+supporting+"\n___________________\nTotal Marks:"+totalmarks+"\n___________________\nObtained:"+obtained+"\n___________________\nGPA:"+gpa);

			}

			if(num==2)
			{
				String name1=JOptionPane.showInputDialog(null,"Enter Your Name");
				String father=JOptionPane.showInputDialog(null,"Enter Your Father Name");
				String roll=JOptionPane.showInputDialog(null,"Enter Your Roll No");

				int operating=85;                                        
				int security=75;                                        
				int elective2=80;                                        
				int elective3=85;                                        
				int business=70;                                        

				int totalmarks=500;                                        
				int obtained=operating+security+elective2+elective3+business;

				double gpa=58/19;

				JOptionPane.showMessageDialog(null,"\n___________________\nName:"+name1+"\n___________________\nFather Name:"+father+"\n___________________\nRoll No:"+roll+"\n___________________\noperating System:"+operating+"\n___________________\nInformation Security"+security+"\n___________________\nCS-Elective2:"+elective2+"\n___________________\nCS-Elective3:"+elective3+"\n___________________\nBusiness Writting:"+business+"\n___________________\nTotal Marks:"+totalmarks+"\n___________________\nObtained:"+obtained+"\n___________________\nGPA:"+gpa);
			}
		}

		if(year==4)
		{
			String num1=JOptionPane.showInputDialog(null,"\n___________________\n1.1st SEMESTER"+"\n___________________\n2.2ND SEMESTER"+"\n___________________\nSELECT SEMESTER");
			int num=Integer.parseInt(num1);

			if(num==1)
			{
				String name1=JOptionPane.showInputDialog(null,"Enter Your Name");
				String father=JOptionPane.showInputDialog(null,"Enter Your Father Name");
				String roll=JOptionPane.showInputDialog(null,"Enter Your Roll No");

				int ai=85;
				int computing=75;
				int elective4=80;
				int elective5=85;
				int professional=75;
				int project=90;

				int totalmarks=600;
				int obtained=ai+computing+elective4+elective5+professional+project;

				double gpa=55/18;

				JOptionPane.showMessageDialog(null,"\n___________________\nName:"+name1+"\n___________________\nFather:"+father+"\n___________________\nRoll No:"+roll+"\n___________________\nAi:"+ai+"\n___________________\nComputing:"+computing+"\n___________________\nElective-4:"+elective4+"\n___________________\nElective-5:"+elective5+"\n___________________\nProfessional:"+professional+"\n___________________\nProject:"+project+"\n___________________\nTotal Marks:"+totalmarks+"\n___________________\nObtained:"+obtained+"\n___________________\nGPA:"+gpa);
			}

			if(num==2)
			{
				String name1=JOptionPane.showInputDialog(null,"Enter Your Name");
				String father=JOptionPane.showInputDialog(null,"Enter Your Father Name");
				String roll=JOptionPane.showInputDialog(null,"Enter Your Roll No");

				int project=90;
				int elective6=85;
				int elective7=80;
				int elective4=88;

				int totalmarks=400;
				int obtained=project+elective6+elective7+elective4;


				double gpa=57/19;

				JOptionPane.showMessageDialog(null,"\n___________________\nName:"+name1+"\n___________________\nFather Name:"+father+"\n___________________\nRoll No:"+roll+"\n___________________\nProject:"+project+"\n___________________\nElective-6"+elective6+"\n___________________\nElective-7:"+elective7+"\n___________________\nElective-4:"+elective4+"\n___________________\nTotal Marks:"+totalmarks+"\n___________________\nObtained:"+obtained+"\n___________________\nGPA:"+gpa);

			}
		}
	}

	public void improve()
	{
			String name=JOptionPane.showInputDialog(null,"Enter Your Name");
			String challan1=JOptionPane.showInputDialog(null,"Enter Your Challan No");
			int challan=Integer.parseInt(challan1);

			if(challan==12345678 || challan==23456788)
			{
				/*JOptionPane.showMessageDialog(null,"1.1st Year");
				JOptionPane.showMessageDialog(null,"2,Second Year");
				JOptionPane.showMessageDialog(null,"3.Third Year");
				JOptionPane.showMessageDialog(null,"4.Fourth Year");*/

				String select1=JOptionPane.showInputDialog(null,"\n_____________________\n1.1st Year"+"\n_____________________\n2,Second Year"+"\n_____________________\n3.Third Year"+"\n_____________________\n4.Fourth Year"+"\n_____________________\nIn which Year You Have Supllies");
				int select=Integer.parseInt(select1);

				if(select==1)
				{
					String num1=JOptionPane.showInputDialog(null,"\n___________________\n1.1st SEMESTER"+"\n___________________\n2.2ND SEMESTER"+"\n___________________\nSELECT SEMESTER");
					int num=Integer.parseInt(num1);

					if(num==1)
					{
						String sub=JOptionPane.showInputDialog(null,"Enter Subjects:");

						JOptionPane.showMessageDialog(null,"Successfully Sumbited");
					}

					if(num==2)
					{
						String sub=JOptionPane.showInputDialog(null,"Enter Subjects:");

						JOptionPane.showMessageDialog(null,"Successfully Sumbited");
					}

				}

				if(select==2)
				{
					String num1=JOptionPane.showInputDialog(null,"\n___________________\n1.1st SEMESTER"+"\n___________________\n2.2ND SEMESTER"+"\n___________________\nSELECT SEMESTER");
					int num=Integer.parseInt(num1);

					if(num==1)
					{
						String sub=JOptionPane.showInputDialog(null,"Enter Subjects:");

						JOptionPane.showMessageDialog(null,"Successfully Sumbited");
					}

					if(num==2)
					{
						String sub=JOptionPane.showInputDialog(null,"Enter Subjects:");

						JOptionPane.showMessageDialog(null,"Successfully Sumbited");
					}	
				}

				if(select==3)
				{
					String num1=JOptionPane.showInputDialog(null,"\n___________________\n1.1st SEMESTER"+"\n___________________\n2.2ND SEMESTER"+"\n___________________\nSELECT SEMESTER");
					int num=Integer.parseInt(num1);

					if(num==1)
					{
						String sub=JOptionPane.showInputDialog(null,"Enter Subjects:");

						JOptionPane.showMessageDialog(null,"Successfully Sumbited");
					}

					if(num==2)
					{
						String sub=JOptionPane.showInputDialog(null,"Enter Subjects:");

						JOptionPane.showMessageDialog(null,"Successfully Sumbited");
					}
				}
			
				if(select==4)
				{
					String num1=JOptionPane.showInputDialog(null,"\n___________________\n1.1st SEMESTER"+"\n___________________\n2.2ND SEMESTER"+"\n___________________\nSELECT SEMESTER");
					int num=Integer.parseInt(num1);

					if(num==1)
					{
						String sub=JOptionPane.showInputDialog(null,"Enter Subjects:");

						JOptionPane.showMessageDialog(null,"Successfully Sumbited");
					}

					if(num==2)
					{
						String sub=JOptionPane.showInputDialog(null,"Enter Subjects:");

						JOptionPane.showMessageDialog(null,"Successfully Sumbited");
					}	
				}
			}			
		}

		public void hostel()
		{
			String name=JOptionPane.showInputDialog(null,"Enter Your Name");
			String dep=JOptionPane.showInputDialog(null,"Enter Your Department");
			String roll=JOptionPane.showInputDialog(null,"Enter Your Roll No");

			String challan1=JOptionPane.showInputDialog(null,"Enter Challan No");
			int challan=Integer.parseInt(challan1);

			if(challan==1234567 || challan==23456789)
			JOptionPane.showMessageDialog(null,"Hostel Form Sumbited Successfully");
		}
}

class SindhUniversityForm
{
	public static void main(String[] args) {

		Faraz ob=new Faraz();
		
		while(true)
		{
			
	/*	JOptionPane.showMessageDialog(null,"1.Addmission Challan");
		JOptionPane.showMessageDialog(null,"2.Marksheet Challan");
		JOptionPane.showMessageDialog(null,"3.Supply & Improve Challan");
		JOptionPane.showMessageDialog(null,"4.Hostel Challan");*/

		String num1=JOptionPane.showInputDialog(null, "\n__________________________\n1.Addmission Challan" + "\n__________________________\n2.Marksheet Challan" + "\n__________________________\n3.Supply & Improve Challan" + "\n__________________________\n4.Hostel Challan" +"\n__________________________\n5.Exit"+ "\n__________________________\nSelect Number From Above:");
		int num=Integer.parseInt(num1);

		if(num==1)
		{
			ob.addmission();
		}

		if(num==2)
			ob.marksheet();

		if(num==3)
			ob.improve();

		if(num==4)
			ob.hostel();

		if(num==5)
			System.exit(0);
		}
	}
}
                                                                                                                                                                                                                                                                                                                                                                                          