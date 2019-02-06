class MyThread extends Thread
{
	public void run()
	{
		for(int i = 0; i <= 10; i++)
		{
			System.out.println("Child thread");
		}
	}
}
class ThreadPriorityDemo
{
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.setPriority(10);
		t.start();
		for(int i = 0; i <= 10; i++)
		{
			System.out.println("Main thread-1");
		}
	}
} 






//Demo-2
/*  class MyThread extends Thread
{
	
}
class ThreadPriorityDemo
{
	public static void main(String[] args) {
		
			System.out.println(Thread.currentThread().getPriority());
			Thread.currentThread().setPriority(15);// R.E IllegalArgument Exception
			Thread.currentThread().setPriority(7);
			MyThread t = new MyThread();
			System.out.println(t.getPriority());
		
	}
} */