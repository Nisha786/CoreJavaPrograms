import java.util.Scanner;
class SumIntValue
{
public static void main(String[] args)
 {
  Scanner in = new Scanner(System.in);
  System.out.println("Enter the value of x :");
  int x = in.nextInt();
  System.out.println("Enter the value of y :");
  int y = in.nextInt();
  System.out.println("Enter the value of x :");
  int z = in.nextInt();
  if(x + y == z)
    System.out.println("The result is : True");
  else
   {
    System.out.println("The result is : False");
   }
 }
}
   