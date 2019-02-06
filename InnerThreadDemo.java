package InnerClasses;
class InnerThreadDemo
/*{
	public static void main(String[] args)
	{
		Thread t = new Thread()
		{
			public void run()
			{
				for(int i = 0; i < 10; i++)
				{
					System.out.println("Child Thread");
				}
			}
		};
		t.start();
		for(int i = 0; i < 10; i++)
		{
			System.out.println("Main Thread");
		}
	}
}*/
 
{
	public static void main(String[] args)
	{
		Runnable r = new Runnable()
        {
        	public void run()
        	{
        		for(int i = 0; i < 10; i++)
        		{
        			System.out.println("Child Thread");
        		}
        	}
        };
        Thread t = new Thread(r);
        t.start();
        for(int i = 0; i < 10; i++)
        {
        	System.out.println("Main Thread");
        }
	}
}