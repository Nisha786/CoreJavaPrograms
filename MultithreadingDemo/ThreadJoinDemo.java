class MyThread extends Thread
{
	public void run(){
		for(int i=0; i<= 10; i++){
			System.out.println("child thread");
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{

			}
		}
	}
}
class ThreadJoinDemo{
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();//starting of thread
		t.join();
		for(int i = 0; i <= 10; i++)
		{
			System.out.println("Main thread");
		}
	}
}