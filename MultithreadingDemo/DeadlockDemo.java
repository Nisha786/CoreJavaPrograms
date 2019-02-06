class A
{
	public synchronized void d1(B b)
	{
		System.out.println("Thread1 starts execution of d1()");
		try
		{
			Thread.sleep(5000);
		}catch(InterruptedException e){}
		System.out.println("thread1 tying to call b's last method");
		b.last();
	}
	public void last()
	{
		System.out.println("inside A last method");
	}
}
class B
{
	public synchronized void d2(A a)
	{
		System.out.println("Thread2 starts execution of d2()");
		try
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException e){}
		System.out.println("thread2 tying to call A's last method");
		a.last();
	}
	public void last()
	{
		System.out.println("inside B last method");
	}
}
class DeadlockDemo extends Thread
{
	A a = new A();
	B b = new B();

	public void m1()
	{
		this.start();
		a.d1(b);
	}

	public void run(){
		b.d2(a);
	}
	public static void main(String[] args) {
		DeadlockDemo t = new DeadlockDemo();
		t.m1();
	}
}