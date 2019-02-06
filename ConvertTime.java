import java.util.*;
class ConvertTime
{
public static void main(String[] args)
{
Scanner in = new Scanner(System.in);

System.out.println("Enter the no. of seconds :");
int x = in.nextInt();

int hours = x / 3600;

int minutes = (x % 3600) / 60;

int seconds = (x % 3600) % 60;

System.out.println("\n"+ hours + ":" + minutes + ":" + seconds);
System.out.println("\n");
}
}
