package Thread;
 
class C extends Thread
{
  public void run()
   { 
     for(int i = 10; i < 20; i++)
     {
     System.out.println(i); 
     }
   }
 }
public class Thread2
{
 public static void main(String[] args)
  {
    C t1 = new C();
    t1.start();
   for(int i = 10; i < 20; i++)
    {
      System.out.println(i);
    }
  }
}