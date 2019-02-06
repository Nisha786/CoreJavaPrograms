package InnerClasses;
class InnerMethodArgument
{
	public static void main(String[] args)
	{
		new Thread(new Runnable()
        {
        	public void run()
        	{
        		for(int i = 0; i < 10; i++)
        		{
        			System.out.println("Child Thread-1");
        		}
        	}
        }).start();
        for(int i = 0; i < 10; i++)
        {
        	System.out.println("Main Thread-1");
        }
	}
}