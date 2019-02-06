import java.io.*;
class FileDemo1
{
public static void main(String[] str) throws IOException
{
 File f = new File("d:\\");
// System.out.println(f.length());
 String s[] = f.list();
for(String s1: s)
  { 
    File f1 = new File(f, s1);
     if(f1.isFile())
       System.out.println(s1); 
       
    }

}
}