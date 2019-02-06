class MyThread extends Thread
{
	public void run(){
		for(int i=0; i<= 10; i++){
			//Thread.yield();
			System.out.println("child thread");
		}
	}
}
class ThreadYieldDemo{
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();//starting of thread
		//t.run();
		for(int i = 0; i <= 10; i++)
		{
			System.out.println("Main thread");
		}
	}
}