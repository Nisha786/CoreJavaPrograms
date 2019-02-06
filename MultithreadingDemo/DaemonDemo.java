class MyThread extends Thread
{
	public void run(){
		for(int i = 0; i < 10; i++)
		{
			System.out.println("Child Thread");
			try{
				Thread.sleep(2000);
			}catch(InterruptedException e){}
		}
	}
}
class DaemonDemo {
	public static void main(String[] args) {
	//	Thread.currentThread().setDaemon(true);
		MyThread t = new MyThread();
		t.setDaemon(true);
		t.start();
		System.out.println("End of main");
		//t.stop();
		//t.suspend();
		//t.resume();
	}
}  


