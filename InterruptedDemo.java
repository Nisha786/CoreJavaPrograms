class MyThread extends Thread
{
 public void run()
  {
   try 
    {
     for(int i=0; i<10; i++)
      {
        System.out.println("Lazy Thread");
        Thread.sleep(2000);
      }
    }
  catch(InterruptedException e)
    {
       System.out.println("I got interrupted");
     }
  }
}
class InterruptedDemo
{
 public static void main(String[] args)
  {
    MyThread t = new MyThread();
    t.start();
    //t.interrupt();
    System.out.println("End of main");
  }
}