class B3
{
  int i,j,k;
  B3(int i)
 {
  this.i = i;
  System.out.println("B(int)");
 }
B3()
  {
    System.out.println(i);
   }
void test1()
  {
    System.out.println(i);
  }
B3(int j, int k)
  {
    this.j = j;
    this.k = k;
    System.out.println("B(int int)");
  }
void test()
  {
    B3 b = new B3();
    b.test1();
    this.test1();
    System.out.println(i);
  }
public static void main(String[] args)
 {
   B3 b1 = new B3(10);
   B3 b4 = new B3(50);
   B3 b2 = new B3(20,40);
   B3 b3 = new B3(10,30);
   b1.test();
   System.out.println("-----");
   b4.test();
 }
}
