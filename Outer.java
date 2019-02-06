package InnerClasses;
class Outer
{
	class Inner
	 {
	 	public void m1()
	 	 {
	 	 	System.out.println("Inner class method");
	 	 }
	 }
public static void main(String[] args)
    {
      Outer O = new Outer();
      Outer.Inner i = O.new Inner();
      i.m1();
       }
    }

/*class Outer
{
	class Inner 
	 {
	 	public void m1()
	 	{
	 		System.out.println("Inner Class Method");
	 	}
	 }
	   public void m2()
	   {
	   	   Inner i = new Inner();
	   	   i.m1();
	   }
public static void main(String[] args)
  {
  	 Outer o = new Outer();
  	 o.m2();
  }
}*/
