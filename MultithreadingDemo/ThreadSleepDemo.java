/*class ThreadSleepDemo{
	public static void main(String[] args)throws InterruptedException {
		System.out.println("Nisha");
		Thread.sleep(2000);
		System.out.println("Deepak");
		Thread.sleep(5000);
		System.out.println("Archu");
	}
} */

//Demo-2 Interrupted thread
class MyThread extends Thread
{
	public void run()
	{
		try
		{
			for(int i = 0; i < 6; i++)
			{
		        System.out.println("Child Thread");
		        Thread.sleep(5000);
		    }    
	    }
	    catch(InterruptedException e)
	    {
	    	System.out.println("Got Interrupted");
	    }
	}
}
class ThreadSleepDemo
{
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		//t.interrupt();
		System.out.println("End of main");
	}
}