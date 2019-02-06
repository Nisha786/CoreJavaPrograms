import java.util.Scanner;
class FindEvenNum
{
public static void main(String[] args)
{
Scanner in = new Scanner(System.in);

System.out.println("Enter the value :");
i = in.nextInt();

if (i % 2 == 0)
System.out.println("Value 1" + i);
else 
System.out.println("Value 0" + i);
}
}

