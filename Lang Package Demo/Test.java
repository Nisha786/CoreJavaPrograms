import java.lang.reflect.*;
class Test{
	public static void main(String[] args) {

  /*      int count = 0;
		Object o = new String("Nishu");
		Class c = o.getClass();
		System.out.println("fully qualified name of class" + c.getName());
		Method[] m = c.getDeclaredMethods();
		System.out.println("Method information :");
		for(Method m1 : m){
			count++;
			System.out.println(m1.getName());
		}
		System.out.println("the no. of methods :" + count);  */








/*	final StringBuffer sb = new StringBuffer("Nisha");
	final StringBuilder sb = new StringBuilder("Nisha");
		sb.append(" Parveen");
		
		//sb = new StringBuffer("Ansari");
		System.out.println(sb);  */














//		StringBuffer sb = new StringBuffer("durga");
    //    sb.append("abcdefghdrscghjk");
    //    sb.append("a");
     //   sb.append("k");
	//	System.out.println(sb.capacity());






/*       StringBuffer sb = new StringBuffer();
       sb.append("PI value is :");
       sb.append(3.14);
       sb.append("It is exactly :");
       sb.append(true);
       System.out.println(sb);  */




/*       StringBuffer sb = new StringBuffer("asdfghjgf");
       sb.insert(2,"xyz"); 
       sb.setLength(5);
       System.out.println(sb);  */






/*       StringBuffer sb = new StringBuffer(1000);
       sb.ensureCapacity(1000);
       System.out.println(sb.capacity());
       sb.append("abc");
         sb.trimToSize();
        System.out.println(sb.capacity());  */















        //method chaining
       StringBuffer sb = new StringBuffer();
        sb.append("Nisha ").append("Deepak ").append("Soni").insert(5,"Ansari ").delete(13,21).append("Indore").reverse();
        System.out.println(sb); 


















	}
}