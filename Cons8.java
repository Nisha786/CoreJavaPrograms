package constructor;
class Geg
{
	int i;
	static int j;
	Geg()
	  { 
        System.out.println(i);
        System.out.println(j);
	  }
    void test()
      {
        System.out.println(i);
        System.out.println(j);
      }
}
public class Cons8
 {
   public static void main(String[] args)
     {
        Geg g1 = new Geg();
        g1.test();
        Geg g2 = new Geg();
        g2.i = 10;
        g2.j = 30;
        g2.test();
     }
 }