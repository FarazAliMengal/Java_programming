class Document extends Thread 
{
	public void run()
	{
		System.out.println("Documents Checked");
		//Thread.sleep(100);
	}
}

class Photo extends Thread 
{
	public void run()
	{
		System.out.println("Take Photos");
	}
}

class Form extends Thread 
{
	public void run()
	{
		System.out.println("Form Required");
	}
}

class Signature extends Thread 
{
	public void run()
	{
		System.out.println("Signature");
	}
}

class NadraThread 
{
	public static void main(String[] args) throws Exception
	{
		Document th1=new Document();
		Photo th2=new Photo();
		Form th3=new Form();
		Signature th4=new Signature();

		th1.start();
		th1.join();
		Thread.sleep(1000);

		th2.start();
		th2.join();
		Thread.sleep(1000);

		th3.start();
		th3.join();
		Thread.sleep(1000);

		th4.start();
		th4.join();
		Thread.sleep(1000);
	}
}