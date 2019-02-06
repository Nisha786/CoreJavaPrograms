import java.util.*;

class TreeSetDemo {
	public static void main(String[] str){

 /*        TreeSet t = new TreeSet(new MyComparator());
         t.add("A");
         t.add(new StringBuffer("ABC"));
         t.add(new StringBuffer("AA"));
         t.add("xx");
         t.add("ABCD");
         t.add("A");
         t.add(10);
         System.out.println(t);
	}
}
class MyComparator implements Comparator{
	public int compare(Object obj1, Object obj2){
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		int l1 = s1.length();
		int l2 = s2.length();

	if(l1<l2)
		return -1;
	if(l2>l1)
	return 1;
	else
	return s1.compareTo(s2);  */



















//Demo-2
/*	TreeSet t = new TreeSet();
	t.add("A");
	t.add("a");
	t.add("Z");
	t.add("z");
	t.add("C");
	t.add("D");
	//t.add(new Integer(10));//CCE
	//t.add(null);//NPE
	System.out.println(t); */






















/*     TreeSet t = new TreeSet(new MyComparator()); // compare method call if we not write new MyComparator then internally calls comareTo
     t.add(10);
     t.add(0);
     t.add(15);
     t.add(5);
     t.add(20);
     t.add(20);
     System.out.println(t);

	}
}
class MyComparator implements Comparator{
	public int compare(Object obj1, Object obj2){
		Integer I1 = (Integer) obj1;
		Integer I2 = (Integer) obj2;
		if(I1 < I2)
			return +1;
		else if(I1 > I2)
			return -1;
		else
			return 0;  */



















//Demo-3
/*     TreeSet t = new TreeSet(new MyComparator()); // compare method call if we not write new MyComparator then internally calls comareTo
     t.add(10);
     t.add(0);
     t.add(15);
     t.add(5);
     t.add(20);
     t.add(20);
     System.out.println(t);

	}
}
class MyComparator implements Comparator{
	public int compare(Object obj1, Object obj2){
		Integer I1 = (Integer) obj1;
		Integer I2 = (Integer) obj2;
		//return I1.compareTo(I2); // DNSO ASC
		//return -I1.compareTo(I2); //CSO  DESC
		//return I2.compareTo(I1); //CSO DESC
		//return -I2.compareTo(I1);  //DNSO ASC
		//return +1; // Insertion order
		//return -1;  // reverse insertion order
		return 0; // only first element will be inserted and remaining continuied as duplicate
*/



















/*		TreeSet t = new TreeSet(new MyComparator());
		t.add("Nisha");
		t.add("Nihal");
		t.add("Sahil");
		t.add("Deepak");
		t.add("Salman");
		System.out.println(t);

	}
}   
class MyComparator implements Comparator{
	public int compare(Object obj1, Object obj2){
		String s1 = (String) obj1;
		String s2 = obj2.toString();

		//return s1.compareTo(s2);
		//return -s1.compareTo(s2);
		return s2.compareTo(s1);
		return -s2.compareTo(s1);//C.E
		*/



















/*       TreeSet t = new TreeSet(new MyComparator());  //if we remove new MyComparator we will get CCE
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("C"));
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("B"));
		System.out.println(t);

	}
}   
class MyComparator implements Comparator{
	public int compare(Object obj1, Object obj2){
		String s1 = obj1.toString();
		String s2 = obj2.toString();

		//return s1.compareTo(s2); 
		return "Z".compareTo("A");

	}
}   */






























TreeSet t = new  TreeSet(new MyComparator());
		t.add("A");
		t.add(new StringBuffer("ABCD"));
		t.add(new StringBuffer("AA"));
		t.add("ABC");
		t.add("XX");
		System.out.println(t);




	}

}
class MyComparator implements Comparator{
	public int compare(Object obj1, Object obj2){
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		int l1 = s1.length();
		int l2 = s2.length();
		if(l1 < l2)
			return -1;
		else if(l2 > l1)
			return 1;
		else 
			return s1.compareTo(s2);


	}
}