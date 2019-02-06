import java.io.*;
public class FileWriteDemo
{
public static void main(String[] args) throws IOException
{
File f = new File("abc.txt");
//FileWriter fw = new FileWriter(f);               //"abc.txt");
FileWriter fw = new FileWriter(f,true);
//FileWriter fw = new FileWriter("d:\\abc.txt", true);
fw.write('a');
fw.write(97);
fw.write('\t');
fw.write("Heloooo");

fw.write(new char[] {'a','b','c'});

fw.flush();
//fw.write(new char[] {'a','b','c'});
fw.close();
}
}