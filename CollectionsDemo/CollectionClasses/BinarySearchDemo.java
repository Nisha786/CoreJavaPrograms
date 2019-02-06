import java.util.*;

class BinarySearchDemo
{
	public static void main(String[] args) 
	{
	
/*		ArrayList l = new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("M");
		l.add("a");
		l.add("K");
		System.out.println(l);
		Collections.sort(l); //if we do not sort the elements we will get unpredictable results
		System.out.println(l);
		System.out.println(Collections.binarySearch(l, "Z"));
		System.out.println(Collections.binarySearch(l, "E"));  */





























		ArrayList l = new ArrayList();
		l.add(15);
		l.add(0);
		l.add(10);
		l.add(20);
		l.add(5);
		System.out.println(l);
		Collections.sort(l, new MyComparator());
		System.out.println(l);
		System.out.println(Collections.binarySearch(l,10,new MyComparator()));
		System.out.println(Collections.binarySearch(l,13,new MyComparator()));
		System.out.println(Collections.binarySearch(l,17));



	}
}

class MyComparator implements Comparator{

	public int compare(Object obj1, Object obj2)
	{
		Integer I1 = (Integer) obj1;
		Integer I2 = (Integer) obj2;
		return I2.compareTo(I1);
	}
}