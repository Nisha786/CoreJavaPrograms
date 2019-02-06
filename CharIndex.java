class CharIndex
{
public static void main(String[] args)
 { 
  String str = new String("Java Program");
  System.out.println("Original code is :" + str);
  int a = str.charAt(2);
  int b = str.charAt(10);
  
  System.out.println("The character at position 2 is :" + (char)a);
  System.out.println("The character at position 1 is :" + (char)b);
 }
}