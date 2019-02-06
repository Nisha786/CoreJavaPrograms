class E1
{
 static
 {
 System.out.println("SIB E1");
 }
 {
 System.out.println("IIB E1");
 }
 E1()
 {
 System.out.println("E1()");
 }
}
class E2 extends E1
{
 static
 {
 System.out.println("SIB E2");
 }
 {
 System.out.println("IIB E2");
 }
}
class E3 extends E2
{
 static
 {
 System.out.println("SIB E3");
 }
 {
 System.out.println("IIB E3");
 }
}
public class E0
{
 public static void main(String[] args)
 {
 System.out.println("main");
 // E1 e1 = new E1();
 System.out.println("-----");
 E2 e2 = new E2();
 System.out.println("-----");
 E3 e3 = new E3();
 }
}