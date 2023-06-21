class MaximumArray
{
	public static void main(String[] args) 
	{
		
		int a[]={1,2,4,5,10};
		int max=a[0];

		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.print("Maxi:"+max);
	}
}