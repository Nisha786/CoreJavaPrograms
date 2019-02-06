class CloneTest implements Cloneable{
	int i = 10;
	 int j = 20;
	 public static void main(String[] args)throws CloneNotSupportedException{
	 	CloneTest t1 = new CloneTest();
	 	CloneTest t2 = (CloneTest)t1.clone();
	 	t2.i = 888;
	 	t2.j = 999;
	 	System.out.println(t1.i+"...."+t2.j);

	 }
}  













//Demo2
/*class CloneTest implements Cloneable{

	int rollNo;
	String name;
	CloneTest(int rollNo, String name)
	{
		this.rollNo = rollNo;
		this.name = name;
	}
	public static void main(String[] args) throws CloneNotSupportedException
	{
		CloneTest t1 = new CloneTest(101,"Nisha");
		CloneTest t2 = (CloneTest) t1.clone();

		System.out.println(t1.rollNo +"---"+t1.name);
	 	System.out.println(t2.rollNo+"---"+t2.name);
	}
} */