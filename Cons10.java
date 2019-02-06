package constructor;
class K
{
	K()
	  {
	  	//this(10);
	  	System.out.println(1);
	  }
	K(int i)
	  { 
	  	this();
	  	System.out.println(2);
	  }
}
public class Cons10
{
	public static void main(String[] args)
	  {
         K a = new K();
         System.out.println("-----");
         K b = new K(10);
         System.out.println("-----");
	  }
}