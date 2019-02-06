package collection;
import java.util.*;
class ArrayList2
{
	public static void main(String[] args)
	 {
	 	ArrayList l = new ArrayList();
	 	l.add(90);
	 	l.add("abc");
	 	l.add('s');
	 	l.add(true);
	 	l.add(234.54);
        System.out.println("Classical for loop");
        System.out.println("===================");
       for(int i = 0; i < l.size(); i++)
       	 {
       	 	System.out.println(l.get(i));
       	 }
       	 System.out.println("Enhanced for loop");
       	 System.out.println("===================");
       for(Object obj:l)
         {
         	System.out.println(obj + ",");
         }
         System.out.println("toString()");
         System.out.println("===================");
         System.out.println(l);
  	 }
}