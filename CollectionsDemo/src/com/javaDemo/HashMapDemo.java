import java.util.*;
class HashMapDemo{
	public static void main(String[] args) {
		HashMap m = new HashMap();
		//LinkedHashMap m = new LinkedHashMap();
		m.put("nisha", 101);
		m.put("jenny", 400);
		m.put("skarlett", 200);
		m.put("nick", 700);
		System.out.println(m);

		System.out.println(m.put("nisha", 500));

		Set s = m.keySet();
		System.out.println(s);

		Collection c = m.values();
		System.out.println(c);

		Set s1 = m.entrySet();
		System.out.println(s1);

		Iterator itr = s1.iterator();
		while(itr.hasNext())
		{
			Map.Entry m1 = (Map.Entry)itr.next();

			System.out.println(m1.getKey()+"-----"+m1.getValue());

			if(m1.getKey().equals("jenny"))
			{
				m1.setValue(1000);
			}
		}
		System.out.println(m);


	}
}