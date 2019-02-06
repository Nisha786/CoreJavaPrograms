package collection;
import java.util.*;
class ListIteratorDemo
{
	public static void main(String[] args)
	   {
	   	 LinkedList l = new LinkedList();
	   	 l.add("Nisha");
	   	 l.add("Archuu");
	   	 l.add("Dpk");
	   	 l.add("Nihal");
	   	 System.out.println(l);
	   	 ListIterator ltr = l.listIterator();
       while(ltr.hasNext())
       	 {
       	 	String s = (String) ltr.next();
       	if(s.equals("Archuu"))
       	{
       		ltr.remove();
       	}
       	if(s.equals("Dpk"))
         {
         	ltr.set("Parveen");
         }
        if(s.equals("Nihal"))
        {
        	ltr.add("Bittu");
        }

       	}
       	  System.out.println(l);
	   }
}