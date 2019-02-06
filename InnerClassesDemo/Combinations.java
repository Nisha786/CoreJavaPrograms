//1. Interface inside interface
interface Outer{
	public void m1();

	interface Inner{
		public void m2();
	}
}
class Test1 implements Outer{
	public void m1(){
		System.out.println("Outer interface method implementation");
	}
}
class Test2 implements Outer.	Inner{
	public void m2(){
		System.out.println("Inner interface method implementation");
	}
}
class Combinations{
	public static void main(String[] args) {
		Test1 t1 = new  Test1();
		t1.m1();

		Test2 t2 = new Test2();
		t2.m2();
	}
}