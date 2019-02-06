package string;
public class StringC
{
 public static void main(String[] args)
  {
    String s1 = new String("abc");
    String s2 = new String("abc");
    String s3 = new String("xyz");
    
    System.out.println(s2 == s1);
    System.out.println(s1 == s3);
    System.out.println(s1.equals(s2));
    System.out.println(s2.equals(s3));
    System.out.println(s1.hashCode());
    System.out.println(s2.hashCode());
    System.out.println(s3.hashCode());
  }
}
