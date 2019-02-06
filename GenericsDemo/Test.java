class Test
{
	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		l.add("a");
		l.add(true);
		l.add(10);
		m1(l);
		System.out.println(l);
		l.add(10);
	}
/*	public static void m1(ArrayList l) // non-generic area
	{
		l.add(10);
		l.add(10.5);
		l.add(true);
	}  */
}