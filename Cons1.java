package constructor;
class Cons1
 {
   int rollno;
   String name;
  Cons1(int rollno,String name)
   {
	 this.rollno = rollno;
	 this.name = name;
   }
 public String toString()
   {
      return rollno+" "+name;
   } 
 public static void main(String[] args)
   {
      Cons1 a1 = new Cons1(26,"Nisha");
	  Cons1 a2 = new Cons1(27,"Archu");
	
	  System.out.println(a1);
	  System.out.println(a2);
   }
 }
