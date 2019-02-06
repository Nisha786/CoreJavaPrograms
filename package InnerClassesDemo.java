//package InnerClasses;
class OuterClass
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
      Outer o = new Outer();
      Outer.Inner i = o.newInner();
      i.m1();
       }
    }
