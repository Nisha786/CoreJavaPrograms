package abc;
class NumPyramid
{
public static void main(String[] args)
{
int n = 5;
 for(int i = 1; i <= n; i++)
 {
  for(int j = (n-1); j <= 1; j--)
  {
   for(int k = 1; k <= (n-j); j++)
    {
     System.out.println(" ");
    }
     System.out.println("*");
}
}
}