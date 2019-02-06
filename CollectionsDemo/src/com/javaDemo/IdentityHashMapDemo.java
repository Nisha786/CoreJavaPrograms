import java.util.*;

class IdentityHashMapDemo{
	public static void main(String[] args) {
		//HashMap h = new HashMap();  // jvm calls .equals method
		IdentityHashMap h = new IdentityHashMap(); // jvm calls == operator 	

		Integer I1 = new Integer(10);
		Integer I2 = new Integer(10);

		h.put(I1, "Pavan");
		h.put(I2, "Kalyan");
		System.out.println(h);

	}
}