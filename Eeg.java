class Eeg
{
   int i;
   static int j;
   void test()
   {
     System.out.println(i);
   }
  static void test1()
  {
    System.out.println(j);
  }
}
public class E1
{
  public static void main(String[] args)
   {
     Eeg Eeg1 = new Eeg();
     System.out.println(Eeg1.i);
     Eeg1.test();
     Eeg.test1();
   }
}
