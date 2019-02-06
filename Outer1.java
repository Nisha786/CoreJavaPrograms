package InnerClasses;
class Outer1
/*{
	static int x = 10;
	int y = 20;
    class Inner
    {
    	public void m1()
    	{
    		System.out.println(x);
    		System.out.println(y);
    	}
    }
public static void main(String[] args)
 {
 	new Outer1().new Inner().m1();
 }
}*/

{
	int x = 10;
	class Inner
	{
		int x = 100;
	 public void m1()
	 {
		int x = 1000;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(Outer1.this.x);
	 }
	}
public static void main(String[] args)
  {
  	new Outer1().new Inner().m1();
  }
}