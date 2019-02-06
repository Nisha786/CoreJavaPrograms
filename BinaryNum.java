import java.util.Scanner;

 class BinaryNum
 {

public static void main(String[] args) 
 {

  String a,b,str;

  Scanner k= new Scanner(System.in);

   System.out.println("enter 1st and 2nd number :");
   a=k.next();
   b=k.next();

   // Use as radix 2 because it's binary 
  int number0 = Integer.parseInt(a, 2);
  int number1 = Integer.parseInt(b, 2);
  int sum = number0 + number1;

  str=Integer.toBinaryString(sum);

  System.out.println("Binary Number is : "+ str);
 }
}