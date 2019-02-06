package string;
public class StringF
{
 public static void main(String[] args)
  {
    String s1 = "abc";
    System.out.println(s1.hashCode());
    String s2 = "abc";
    System.out.println(s2.hashCode());
    s1 = "xyz";
    System.out.println(s1.hashCode());
  }
}