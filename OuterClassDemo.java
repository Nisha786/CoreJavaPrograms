//package InnerClasses;
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
      Outer.Inner i = O.newInner();
      i.m1();
       }
    }
