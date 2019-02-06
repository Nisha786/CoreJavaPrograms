package string;
public class StringE
{
 public static void main(String[] args)
  {
    String s1 = "abc";
    String s2 = "xyz";
    System.out.println(s1 == s2);
    System.out.println(s1.equals(s2));
    String s3 = "abcxyz";
    String s4 = "abc" + "xyz";
    System.out.println(s3 == s4);
    System.out.println(s3.equals(s4));
    String s5 = "abcxyz";
    String s6 = "abc" + s2;
    System.out.println(s5);
    System.out.println(s6);
    System.out.println(s5 == s6);
    System.out.println(s5.equals(s6));
  }
}