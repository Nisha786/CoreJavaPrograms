/*     class MyThread extends Thread
{
	public void run(){
		for(int i=0; i<= 10; i++){
			System.out.println("child thread");
		}
	}
}
class ThreadDemo{
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();//starting of thread
		//t.run();
		for(int i = 0; i <= 10; i++)
		{
			System.out.println("Main thread");
		}
	}
}   */



//Demo-2
/*class MyThread extends Thread
{
	public void run(int i){
			System.out.println("run() with argument");
	} 

	public void start(){
		super.start();
			System.out.println("start method");
	}

	public void run(){
		super.start();
			System.out.println("No argument run()");
	}
}
class ThreadDemo{
	public static void main(String[] args) {
		MyThread t = new MyThread();
		    t.start();//starting of thread	
		   // t.run();	
			System.out.println("Main thread");
		}
}  */





//Demo-3(not recommended to use)
/*  class MyThread extends Thread
{

	public void run(){
			System.out.println("No argument run()");
	}
}
class ThreadDemo{
	public static void main(String[] args) {
		MyThread t = new MyThread();
		Thread t1 = new Thread(t);
		   // t1.start();//starting of thread	
		   t1.run();	
			System.out.println("Main thread");
		}
}  */




//Demo-4  set and get name of threads
class ThreadDemo{
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());//main
		Thread.currentThread().setName("Nisha");
		System.out.println(Thread.currentThread().getName()); //Nisha
	}
}