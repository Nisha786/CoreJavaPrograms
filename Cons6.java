package constructor;
class Eeg
{
   int i = 10;
   static int j = 20;
   void test()
    {
	  System.out.println(i);
	}
   static void test1()
    {
	   System.out.println(i);
	}
}
public class Cons6
 {
   public static void main(String[] args)
     {
	   Eeg e1 = new Eeg();
	   System.out.println(e1.i);
	   e1.test();
	   Eeg.test1();
	 }
 }