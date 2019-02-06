class D1
{
  D1()
  {
  }
}
public class D extends D1
{
 D()
 {
  System.out.println("D");
 }
 D(int i)
 {
  System.out.println("D(int)");
 }
public static void main(String[] args)
 {
  D1 d1 = new D1();
  System.out.println("----");
  D d = new D();
  System.out.println("----");
  D d2 = new D(10);
 }
}
