class Test2
{
  int i;
  Test2(int i)
  {
   this.i = i;
  }
  public int hashCode()
  {
   return i;
  }
public static void main(String[] args)
 {
  Test2 t1 = new Test2(10);
  Test2 t2 = new Test2(100);
  System.out.println(t1);
  System.out.println(t2);
 }
}