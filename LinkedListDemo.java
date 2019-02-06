package collection;
import java.util.*;
class LinkedListDemo
{
	public static void main(String[] args)
	   {
	   	   LinkedList l = new LinkedList();
	   	     l.add("Nisha");
           l.add(30);
           l.add(null);
           l.add("Nisha");
           System.out.println(l);
           l.set(0,"Parveen");
           l.add(0,"Archuu");
           l.removeLast();
           l.addFirst("Java");
           System.out.println(l);
	   }
}