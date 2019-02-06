public class F
{
public static void main(String[] args)
{
F f = new F();
test();
F.test();
f.test();
System.out.println("main method");
}
public static void test()
{
System.out.println("test method");
}
}