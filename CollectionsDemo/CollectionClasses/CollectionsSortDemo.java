import java.util.*;

class CollectionsSortDemo
{
	public static void main(String[] args) {
		
/*		ArrayList l = new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("N");
		//l.add(new Integer(10));
		l.add(null);
		System.out.println("Before sorting :"+l);
		Collections.sort(l);
		System.out.println("After sorting :"+l);  */





























        ArrayList l = new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("N");
		
		System.out.println("Before sorting :"+l);
		Collections.sort(l, new MyComparator());
		System.out.println("After sorting :"+l);


	}
}

class MyComparator implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		String s1 = (String)obj1;
		String s2 = obj2.toString();
		return s2.compareTo(s1);
	}
}