class B1
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
class B2
{
static 
{
System.out.println("B2 - SIB");
}
}
public class B extends B2
{
static
{
System.out.println("B - SIB");
}
}