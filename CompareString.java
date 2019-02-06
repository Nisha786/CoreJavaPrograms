class CompareString
{
public static void main(String[] args)
 {
  String str = new String("Java");
  StringBuffer sb = new StringBuffer("Java");
  boolean result = str.equals(sb);
  System.out.println(result);
 }
}