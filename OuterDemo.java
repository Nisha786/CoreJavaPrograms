package InnerClasses;
class OuterDemo
/*{
	static class Nested
	{
	   public void m1()
	   {
	      System.out.println("static nested class method");
	   }
	}
	public static void main(String[] args)
	{
		Nested n = new Nested();
		n.m1();
	}
}*/


{
	static class Nested
	{
	   public static void main(String[] args)
	   {
	      System.out.println("static nested class main method");
	   }
	}
	public static void main(String[] args)
	{
		System.out.println("Outer class main method");
	}
}



