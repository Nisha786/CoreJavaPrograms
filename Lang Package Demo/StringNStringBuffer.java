class StringNStringBuffer
{
	public static void main(String[] args) 
	{
		String s1 = new String("Nisha");
		String s2 = new String("Nisha");
		StringBuilder sbl1 = new StringBuilder("Nisha");
		StringBuilder sbl2 = new StringBuilder("Nisha");
		StringBuffer sb1 = new StringBuffer("Nisha");
		StringBuffer sb2 = new StringBuffer("Nisha");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));
		System.out.println(s1 == sb2);
		System.out.println(s1.equals(sb2));
		System.out.println(sbl1 == sbl2);
		System.out.println(sbl1.equals(sbl2));
 
	}
}