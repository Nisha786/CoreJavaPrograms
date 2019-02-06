class Outer{
/*	class Inner{

	}
	public static void main(String[] args) {
		System.out.println("Outer Class main method");
	}  */












	/*class Inner{
		public static void main(String[] args) {
			System.out.println("Inner Class main method");
		}
	} */








/*	class Inner{
		public void m1(){
			System.out.println("Inner Class method");
		}
	}
	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		i.m1();

	}*/















/*	class Inner{
		public void m1(){
			System.out.println("Inner Class method");
		}
	}
	public void m2(){
		Inner i = new Inner();
		i.m1();

	}
	public static void main(String[] args) {
		Outer o = new Outer();
		o.m2();
	} */

















    
 /*   int x = 10;
    static int y = 20;
	class Inner{

		public void m1(){
			System.out.println(x);
			System.out.println(y);
		}

	}
	public static void main(String[] args) {
		new Outer().new Inner().m1();
	}  */














   int x = 10;
   class Inner{
   	int x = 100;
   	public void m1(){
   		int x = 1000;
   		System.out.println(x);
   		System.out.println(this.x);
   		System.out.println(Outer.this.x);
   	}
   }
   public static void main(String[] args) {
   	new Outer().new Inner().m1();
   }


}