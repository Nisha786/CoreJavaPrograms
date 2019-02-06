import java.io.*;
class DigitSum
{
static int getSum(int n)
{
 int sum = 0;
while (n != 0)
{
sum = sum + n % 10;

n = n/10;
}
return sum;
}

public static void main( String[] args)
{
int n = 168;
System.out.println(getSum(n));
}

}

