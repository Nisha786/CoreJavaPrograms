//package constructor;
class Cons
{
  int i;
  Cons()  
   {
    System.out.println("cons1");
   }
  Cons(int i)
   {
    System.out.println("cons2");
   }
  Cons(int i, int j)
  {
    System.out.println("cons (int int)");
  }
  Cons(int i, String s)
  {
    System.out.println("cons (int String)");
  }
 }
 class ConsA
 {
   public static void main(String[] args)
    {
      Cons b1 = new Cons(16);
	  Cons b2 = new Cons(15,20);
	  Cons b3 = new Cons();
	  Cons b4 = new Cons(89,"Nisha");
    }
 }