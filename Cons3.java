package constructor;
class ConsB
{
   int i = 90;
   ConsB(int i)
	 {
	   System.out.println("A(int i)");
	 }
   ConsB()
   {
	   System.out.println("A()");
   }
}
public class Cons3
{
 public static void main(String[] args)
  {
    ConsB b = new ConsB();
	System.out.println("-----");
	new ConsB(10);
	System.out.println("-------");
	ConsB b1 = new ConsB(10);
  }
}