/*class Outer{
	class Inner{
		public void m1(){
			System.out.println("Inner Class method");
		}
	}
}

class Test{
	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		i.m1();
	}
}  */














//Static nested inner class
/*class Test{
	static class Nested{
		public void m1(){
			System.out.println("Static nested Class method");
		}
	}
	public static void main(String[] args) {
		//Test.Nested n = new Test.Nested();
		Nested n = new Nested();
		n.m1();
	}
}  */






















/*class Test{
	static class Nested{
		public static void main(String[] args) {
			System.out.println("Static nested Class main method");
		}
	}
	public static void main(String[] args) {
		System.out.println("Outer Class main method");
	}
} */
























class Test{
	int x = 10;
	static int y = 20;
	static class Nested{
		public void m1(){
		//	System.out.println(x);    //C.E- we can't access non static variable within static nested inner class
			System.out.println(y);
		}
	}
	public static void main(String[] args) {
		Nested n = new Nested();
		n.m1();
	}
}

















