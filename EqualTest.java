public class Equaltest {
public static void main(String[] args) {
String str1= new String(“ABCD”);
String str2= new String(“ABCD”);
if(Str1 == str2)
{
System.out.println("String 1 == String 2 is true");
}
else
{
System.out.println("String 1 == String 2 is false");
String Str3 = Str2;
if( Str2 == Str3)
{
System.out.println("String 2 == String 3 is true");
}
else
{
System.out.println("String 2 == String 3 is false");
}
/*if(Str1.equals(str2))
{
System.out.println("String 1 equals string 2 is true");
}
else
{
System.out.prinltn("String 1 equals string 2 is false");
}
}
}*/