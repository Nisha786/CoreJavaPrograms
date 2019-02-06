package collection;
import java.util.*;
class VectorDemo
{
	public static void main(String[] args)
	  {
	  	Vector v = new Vector();
	  	System.out.println(v.capacity());
	  for(int i = 1; i <= 20; i++)
	    {
           v.addElement(i);
	    }
	    System.out.println(v.capacity());
	    v.size();
	    v.addElement("A");
	    System.out.println(v.capacity());
	   // v.removeAllElements();
	    System.out.println(v);
	  }
}



