class Date{
	
}
class RuntimeDemo{
	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		System.out.println(r.totalMemory());
		System.out.println(r.freeMemory());

		for(int i = 0; i <= 1000; i++)
		{
			Date d = new Date();
			d= null;
		}
		System.out.println(r.freeMemory());
		r.gc();
		System.out.println(r.totalMemory());
	}
}