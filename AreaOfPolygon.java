import java.util.Scanner;
class AreaOfPolygon
{
public static void main(String[] args)
{
int n = 7;

Scanner in = new Scanner(System.in);

System.out.println("Enter the length of one of side of the polygon :");

double s = in.nextDouble();

System.out.println("Area of the polygon is :" + polygonArea(n, s));

}
public static double polygonArea(int n, double s)
{
return (n*(s*s))/(4*Math.tan(Math.PI/n));
}
}