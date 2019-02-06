class MyRunnable implements Runnable
{
	public void run()
	{
		for(int i=0; i < 10; i++)
	{
		System.out.println("child thread");
	}
	}
}
class RunnableDemo
{
	public static void main(String[] args) {
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);
		Thread t1 = new Thread();
		//t.run();
		//t.start();
		t1.run();
		//t1.start();
		//r.start(); //C.E
		//r.run();

		for(int i=0; i < 10; i++)
	{
		System.out.println("main thread");
	}
 }
}// o/p will be mixed