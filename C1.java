class C1
{
   {
     System.out.println("Hello1");
   }
static
  {
   System.out.println("SIB");
  }
C1()
  {
    System.out.println("Hello2");
}
C1(int i)
{
System.out.println("Hello3");
}
C1(int i, int j)
{
System.out.println("Hello4");
}
public static void main(String[] args)
{
C1 c4 = new C1();
C1 c5 = new C1(10);
C1 c6 = new C1(19,39);
System.out.println("main");
}
}