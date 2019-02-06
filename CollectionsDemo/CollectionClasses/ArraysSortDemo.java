import java.util.Arrays;
import java.util.Comparator;

class ArraysSortDemo{

	public static void main(String[] args) {
		int[] a = {10,5,20.11,6};
		System.out.println("Primitive array before sorting :");
		for(int a1:a)
		{
			System.out.println(a1);
		}
		Arrays.sort(a);
		System.out.println("Primitive Array after sorting :");
		for(int a1 : a)
		{
			System.out.println(a1);
		}

		String[] s = {"A","Z","B"};
		System.out.println("Object Array before sorting :");
		for(String a2 : s)
		{
			System.out.println(a2);
		}
		Arrays.sort(s);
		System.out.println("Object Array after sorting :");
		for(String a1:s)
		{
			System.out.println(a1);
		}
		Arrays.sort(s, new MyComparator());
		System.out.println("Object Array after sorintg by Comparator :");
		for(String a1:s)
		{
			System.out.println(a1);
		}
	}
}