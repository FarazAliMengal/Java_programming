class OuterClass
{
	class InnerClass
	{
		int a=100;
		int b=200;
	}
}







class NestedClass
{
	public static void main(String[] args) 
	{
		OuterClass outer=new OuterClass();

		OuterClass.InnerClass inner=outer.new InnerClass();


		System.out.println("a="+inner.a);
		System.out.println("b="+inner.b);
		
		System.out.println(inner.a+inner.b);
	}
}