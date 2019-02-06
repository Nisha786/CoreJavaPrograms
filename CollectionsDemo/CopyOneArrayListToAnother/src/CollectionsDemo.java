import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {

		// create two lists
		List<String> srclst = new ArrayList<String>(5);
		List<String> destlst = new ArrayList<String>(10);

		// populate 2 lists
		srclst.add("Java");
		destlst.add("C++");

		// Copy into dest list

		Collections.copy(destlst, srclst);

		System.out.println("Value of src list :" + srclst);
		System.out.println("Value of dest list :" + destlst);
	}

}
