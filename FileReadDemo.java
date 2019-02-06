import java.io.*;
public class FileReadDemo
{
public static void main(String[] args) throws IOException
{
File f = new File("abc.txt");
FileReader fr = new FileReader(f);
/* int i=fr.read(); //return int value is unicode of char 
while(i != -1)
  {
   System.out.print((char)i);
   i=fr.read();
  } */

char ch[] = new char[(int)f.length()];
fr.read(ch);
for(char ch1 : ch)
  {
   System.out.print(ch1);
     }

fr.close();
}
}