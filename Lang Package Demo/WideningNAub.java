class WideningNAub{

	//case-1
/*	public static void m1(Integer I) {
		System.out.println("AutoBoxing");
	}  

    public static void m1(int... i) {
		System.out.println("AutoBoxing");
	}
	public static void m1(long l){
		System.out.println("Widening");
	} 


*/

//case-2

     public static void m1(Long l){

           System.out.println("Long");

}




//case-3
    public static void m1(Object o){

           System.out.println("Long");

}




	public static void main(String[] args) {
		int x = 10;
		m1(x);
	}
}



// order is - widening --> Autoboxing --> Var args method