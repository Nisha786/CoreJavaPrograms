public class G
{
public static void main(String[] args)
{
G g = new G();

test();
G.test();
g.test();
System.out.println("main method");
}
public static void test()
{
System.out.println("test method");
}
} 