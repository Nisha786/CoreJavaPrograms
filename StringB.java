package string;
public class StringB
{
 public static void main(String[] args)
  {
    String s1 = "abc";
    String s2 = "abc";
    String s3 = "xyz";
    
    System.out.println(s2 == s1);
    System.out.println(s1 == s3);
    System.out.println(s1.equals(s2));
    System.out.println(s2.equals(s3));
    System.out.println(s1.hashCode());
    System.out.println(s2.hashCode());
    System.out.println(s3.hashCode());
  }
}
