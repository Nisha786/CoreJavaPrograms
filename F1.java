package staticeg;
class Feg
{
   int i;
   static int j;
   int get()
   {
       return i;
   }
  void set(int i)
  {
      this.i = i;
  }
}
public class F1
{
public static void main(String[] args)
 {
   Feg Feg1 = new Feg();
   System.out.println(Feg1.i);
   Feg1.i = 10;
   int k = Feg1.get();
   System.out.println(k);
   Feg1.set(20);
   System.out.println(Feg1.get());
 }
}