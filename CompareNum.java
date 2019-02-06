import java.util.Scanner;
class CompareNum
{
public static void main(String[] args)
{
int x, y;
Scanner a = new Scanner(System.in);

System.out.println("Please enter first number :");

x = a.nextInt();

System.out.println("Please enter second number :");

y = a.nextInt();

if (x > y )
System.out.printf("%d > %d\n", x, y );
if ( x < y )
System.out.printf("%d < %d\n", x, y );
if ( x == y )
System.out.printf("%d == %d\n", x, y );
if ( x <= y )
System.out.printf("%d <= %d\n", x, y );
if ( x >= y )
System.out.printf("%d >= %d\n", x, y );
if ( x != y )
System.out.printf("%d != %d\n", x, y );
}
}



 