class MultipleCatchBlock
{
public static void main(String[] args)
{
try
{
int a[] = new int[3];
a[0] = 10;
a[1] = 20;
a[2] = 30;
int i = 10/0;
}
catch(ArithmeticException e)
{
System.out.println("Task 1 is computed");
}
catch(ArrayIndexOutOfBoundException e)
{
System.out.println("task 2 is completed");
}
catch(Exception e)
{
System.out.println("Common task completed");
}
System.out.println("Rest of the code");
}
}