class WrapperTest{

	public static void main(String[] args) {
		
/*		Boolean X = new Boolean("Yes"); false
		Boolean Y = new Boolean("No");  false
		System.out.println(X.equals(Y)); true  */



       
/*       Boolean X = new Boolean("Yes"); false
		Boolean Y = new Boolean("true");  true
		Boolean Y = new Boolean("True");  true
		Boolean Y = new Boolean("TRUE");  true
		System.out.println(X.equals(Y)); false  */





     //  xxxValue() example









/*		Integer I = new Integer(130);
		System.out.println(I.byteValue());
		System.out.println(I.shortValue());
		System.out.println(I.intValue());
		System.out.println(I.longValue());
		System.out.println(I.floatValue());
		System.out.println(I.doubleValue());  */



















     //public char charValue
		Character ch = new Character('a');
		char c = ch.charValue();
        System.out.println(c);






// public boolean booleanValue();
        Boolean B = Boolean.valueOf("true");  //true
        Boolean B = Boolean.valueOf("nisha"); //false
        boolean b = B.booleanValue();
        System.out.println(b);
















	}
}