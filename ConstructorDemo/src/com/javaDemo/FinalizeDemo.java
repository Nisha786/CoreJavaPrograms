/*class FinalizeDemo
{
	public static void main(String[] args) {
		//String s = new String("nisha");
		FinalizeDemo s = new FinalizeDemo();
		//s.finalize();
		s = null;
		System.gc();
		System.out.println("End of main");
	}
	public void finalize()
	{
		System.out.println("finalize() called");
		System.out.println(10/0);
	}
} */
class FinalizeDemo
{
    static FinalizeDemo s;

	public static void main(String[] args)throws Exception{
		FinalizeDemo f = new FinalizeDemo();
		System.out.println(f.hashCode());
		f = null;
		System.gc();
		Thread.sleep(2000);
		System.out.println(s.hashCode());
		s = null;
		System.gc();
		Thread.sleep(2000);
		System.out.println("end of main()");
	}
	public void finalize()
	{
	  System.out.println();
	  s = this;
    }
}