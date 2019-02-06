class D2
{
public static void main(String[] args)
 {
   String s1 = "What is your name";
   String s2[] = s1.split(" ");
   for(String s:s2)
    {
     StringBuffer b = new StringBuffer(s);
     System.out.println(b.reverse() + " ");
   }
 }
}