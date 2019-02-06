public class C3
{ 
   int i = 10;
C3()
  {
  }
C3(int i)
  {
   this.i = i;
  }
void test1(C3 c1)
  {
  System.out.println(c1.i);
  }
void test()
  {
  C3 c2 = new C3();
  test1(c2);

  test1(this);
  System.out.println(this.i);
  }
public static void main(String[] args)
 {
 C3 c = new C3(20);
 c.test();
 }
}