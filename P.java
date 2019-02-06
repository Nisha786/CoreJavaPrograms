Interface P
{
String P = "pppp";
String Methodp();
}
Interface Q Extends P
{
String Q = "qqqq";
String Methodq();
}
Class R Implements P, Q
{
Public String Methodp()
{
Return Q+p;
}
Public String Methodq()
{
Return P+q;
}
}
Public Class Mainclass 
{
Public Static Void Main(string[] Args)
{
R R = New R();
System.out.println(r.methodp());
System.out.println(r.methodq());
}
}