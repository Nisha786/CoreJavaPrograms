import java.io.*;
import java.util.*;
class ReverseString
{
public static void main(String[] args)
{
String in = The quick brown fox;

StringBuilder in1 = new StringBuilder ();

in1.append(in);

in1 = in1.reverse();

System.out.println(in1);
}
}
