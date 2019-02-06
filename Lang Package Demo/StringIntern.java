class StringIntern{
	public static void main(String[] args) {
		String s1 = new String("Nisha");
		String s2 = s1.intern();
		System.out.println(s1 == s2); //false
		String s3 = "Nisha";
		System.out.println(s2 == s3);//true







       String s4 = new String("Nisha");
       String s5 = s4.concat("Deepak");
       String s6 = s5.intern();
       System.out.println(s5 == s6);
       String s7 = "NishaDeepak";
       System.out.println(s6 == s7);	

	}
}