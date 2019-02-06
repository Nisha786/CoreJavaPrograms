public class B0
{
static
{
System.out.println("B1 - SIB");
}
public static void main(String[] args)
{
System.out.println("B1 - main");
}
}
public class B2
{
static 
{
System.out.println("B2 - SIB");
}
}
public class B1 extends B2
{
static
{
System.out.println("B1 - SIB");
}
}