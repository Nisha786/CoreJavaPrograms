import java.util.*;

class NavigableSetDemo
{
	public static void main(String[] args) {
		
/*		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(1000);
		t.add(2000);
		t.add(3000);
		t.add(4000);
		t.add(5000);
		System.out.println(t);
		System.out.println(t.ceiling(2000));
		System.out.println(t.higher(2000));
		System.out.println(t.floor(3000));
		System.out.println(t.lower(3000));
		System.out.println(t.pollFirst());
		System.out.println(t.pollLast());
		System.out.println(t.descendingSet());
		System.out.println(t);  */

























//Demo for NavigableMap
		TreeMap<String, String> t = new TreeMap<String, String>();
		t.put("b", "Banana");
		t.put("d", "Dog");
		t.put("k", "Kite");
		t.put("a", "Apple");
		t.put("o", "Orange");
		System.out.println(t);
		System.out.println(t.ceilingKey("d"));
		System.out.println(t.higherKey("c"));
		System.out.println(t.floorKey("c"));
		System.out.println(t.lowerKey("c"));
		System.out.println(t.pollFirstEntry());
		System.out.println(t.pollLastEntry());
		System.out.println(t.descendingMap());
		System.out.println(t);

	}
}