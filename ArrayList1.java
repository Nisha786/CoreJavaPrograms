package collection;
import java.util.*;
/*class ArrayList1
	  {
	  	public static void main(String[] args)
	  	  {
	  	  	 ArrayList a = new ArrayList();
	  	  	 a.add(90);
	  	  	 a.add(true);
	         int i = (Integer)a.get(0);
	         boolean flag = (Boolean)a.get(1);
	  	  	 System.out.println(i);
	  	  	 System.out.println(flag);
	  	  	 System.out.println(a.get(0));
	  	  }
	  }*/

class ArrayList1
	  {
	  	public static void main(String[] args)
	  	  {
	  	  	 ArrayList a = new ArrayList();
	  	  	 a.add(90);
	  	  	 a.add("abc");
	  	  	 a.add('s');
	  	  	 a.add(true);
	  	  	 a.add(1,54);
	  	  	 System.out.println(a.size());
	  	  	 for(int i=0; i<a.size(); i++)
	  	  	    {
	  	  	    	 System.out.println(a.get(i));
	  	  	    }
	  	  }
	  }