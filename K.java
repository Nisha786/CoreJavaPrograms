class K
{
static int test(int m)
{
m = 200;
return m;
}
public static void main(String[] args)
{
int i = 10;
System.out.println(i);
i = test(i);
System.out.println(i);
}
}