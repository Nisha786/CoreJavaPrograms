import java.util.Scanner;
 class BinaryMultiply
 {
public static void main(String[] args)
  {
   String a,b,str,str1;  
  Scanner in = new Scanner(System.in);
   System.out.println("Enter the 1st and 2nd value :");
   a = in.next();
   b = in.next();
   int num1 = Integer.parseInt(a, 2);
   int num2 = Integer.parseInt(b, 2);
   
    int multiply = (num1 * num2);
    int division = (num1 / num2);
    str = Integer.toBinaryString(multiply);
    str1 = Integer.toBinaryString(division);
    System.out.println("Binary num multiply is :" + str);
    System.out.println("Binary num division is :" + str1);
  }
 }
