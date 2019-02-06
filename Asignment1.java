import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Asignment1 {

	public static void main(String[] args) {
		int[] a = { 15, 17, 19,17,17,-70,170, 21, 23, 25, 27, 29, 31, 33, 35, 37 };
		Set s = new HashSet<>();
		for (int i = 0; i<a.length; i++) {//N
			s.add(a[i]);//Constant
		}//
		System.out.println(s.size());
		Iterator it = s.iterator();
		
		while(it.hasNext()) {
		int temp = (int)it.next();
			if(s.contains(48-temp)) {
				System.out.println(temp+".."+(48-temp));
				it.remove();
			}
		}
		
		/*for (inti = 0; i<a.length; i++) {//N
			if (s.contains(48 - a[i])) {
				System.out.println(a[i] + "," + (48 - a[i]));
				s.remove(a[i]);
				s.remove(48-a[i]);
			}
				
		}*/
		
		
	}
	/*
	 * public static void main(String[] args) 
	 { 
	 int[] a = { 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37 };
	 int h[] = new int[38]; 
	 for (inti = 0; i<a.length; i++)
	 { 
	 //N ++h[a[i]]; 
	 } 
	 for (inti = 0; i<a.length; i++) 
	 { 
	 //N 
	 if
	 (h[48 - a[i]] > 0) System.out.println(a[i] + "," +( 48 - a[i]));
	 } // O(2N) 
	 }
	 */
	/*
	 * public static void main(String[] args) 
	 { 
	 int[] a = { 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37 }; 
	 int l = 0, r = a.length - 1; while (l < r) 
     { //N 
     if
	 (a[l] + a[r] == 48) 
	 { 
	 System.out.println(a[l] + ", " + a[r]); 
	 l++; 
	 } 
	 r--; 
	 } 
	 }
	 */
	// N * N = N^2
}
