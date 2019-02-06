package constructor;
/*class leg
{
	 int i = 10;
	 static int j = 20;
	 leg(int i, int j)
	  {
	  	  this.i = i;
	  	  this.j = j;
	  }
	void test()
	  {
	  	  System.out.println(i);
	  	  System.out.println(j);
	  }
}
public class Cons9
{
	public static void main(String[] args)
	  {

	  	leg a = new leg(10,20);
	  	a.test();
	  }
}*/

class Jeg
{
	int i;
	static int j;
	Jeg()
	  {
		int i = 10; 
	    int j = 20;
	  }
    Jeg(int k,int m)
      {
        i = k;
        j = m;
      }
   void test()
     {
     	System.out.println(i);
     	System.out.println(j);
     }
}
public class Cons9
{
    public static void main(String[] args)
      {
      	 Jeg a = new Jeg();
      	 Jeg a1 = new Jeg(30, 40);
      	 a.test();
      	 a1.test();
       }
}