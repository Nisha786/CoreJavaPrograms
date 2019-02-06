import java.util.*;

class AreaOfHexagon
{
public static void main(String[] args)
{
Scanner in = new Scanner(System.in);

System.out.print("Input the length of the side of hexagon is :"); 
double s = in.nextDouble();

System.out.print("Area of Hexagon is : " + "\n" + hexagonArea(s));

}
public static double hexagonArea(double s)
{
return(6*(s*s))/(4*Math.tan(Math.PI/6));
}
}