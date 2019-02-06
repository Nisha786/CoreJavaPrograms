class AutoBoxing{
	static Integer I = 10;  // AutoBoxing

	public static void m1(Integer K){
		int m = K;  //AutoUnBoxing
		System.out.println(m);
	}

	public static void main(String[] args) {
		int i = I;   // AUB
		m1(i);
	}
}