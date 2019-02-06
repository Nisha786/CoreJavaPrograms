import java.io.*;
class BufferedWriterDemo
{
public static void main(String[] args) throws IOException
{
 FileWriter fw = new FileWriter("cab.txt");
 BufferedWriter bw = new BufferedWriter(fw);
 bw.write(100);
 bw.newLine();
 char[] ch = {'a','b','c'};
 bw.write(ch);
 bw.newLine();
 bw.write("Hello");
bw.newLine();
 bw.write("1034");
 bw.flush();
 bw.close();
 }
}

