
import java.util.*;

class Surface
{
public static void main(String[] args)
{

Scanner in = new Scanner(System.in);
System.out.println("Enter the latitude of co-ordinate is :");

double x1 = in.nextDouble();

System.out.println("Enter the longitude of co-ordinate is :");

double x2 = in.nextDouble();

System.out.println("Enter the latitude of co-ordinate is :");

double y1 = in.nextDouble();
System.out.println("Enter the latitude of co-ordinate is :");

double y2 = in.nextDouble();
System.out.println("Distance between those point is :" + surfaceEarth(x1, x2, y1, y2) + "km/n");
}
public static double surfaceEarth(double x1,double x2,double y1,double y2)
{
        x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);
double radious = 6371.01;
return radious * Math.acos(Math.sin(x1)*Math.sin(x2) + Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2));
}
}