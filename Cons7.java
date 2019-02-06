//package costructor;
class Feg
{  
	int i;
	static int j;
	int get()
	 {
	    return i;
	 }
	void set(int i)
	 {
	    this.i = i;
	 }
}
public class Cons7
{
public static void main(String[] args)
	  {
          Feg f1 = new Feg();
          System.out.println(f1.i);
          f1.i = 10;
          int k = f1.get();
          System.out.println(k);
          f1.set(20);
          System.out.println(f1.get());

	  }

}