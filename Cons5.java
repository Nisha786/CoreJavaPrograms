package constructor;
class Deg
  {
     int i;
	 Deg()
	  {
	    i = 10;
	  }
	 Deg(int k)
	  {
	    i = k;
	  }
  }
public class Cons5
 {
   public static void main(String[] args)
     {
	     Deg d = new Deg();
		 System.out.println(d.i);
		 Deg d1 = new Deg(20);
		 System.out.println(d1.i);
	 }
 }