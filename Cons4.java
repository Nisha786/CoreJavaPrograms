package constructor;
class A
{
  int i,j;
  String s;
  double d;
  A(double d1)
   {
      i = 10;
	  j = 20;
	  s = "Hello";
	  d = 10.23;
	  System.out.println("A(double i)");
   }
  A(int n)
   {
      i = 120;
	  j = 230;
	  s = "Hi";
	  d = 134.23;
	  System.out.println("A(int i)");
  }
 A()
  {
      System.out.println("A()");
  }
}
public class Cons4
{
  public static void main(String[] args)
   {
      A a= new A(123);
	  A a1= new A(123.34);
	  A a2= new A();
	System.out.println(a1.i);
	System.out.println(a.i);
   }
}