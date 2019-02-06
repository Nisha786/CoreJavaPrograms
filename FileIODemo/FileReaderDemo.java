import java.io.*;
class FileReaderDemo
{
	public static void main(String[] args)throws IOException {
		File f = new File("wc.txt");
		FileReader fr = new FileReader(f);
		System.out.println(fr.read());
		char[] ch = new char[(int) f.length()];
		fr.read(ch);
		for(char c1 : ch)
		{
			System.out.println(c1);
		}
		System.out.println("*****************");
		FileReader fr2 = new FileReader(f);
		int i = fr2.read();
		while(i != -1)
		{
			System.out.println((char)i);
			i = fr2.read();
		}  









/*      FileReader fr = new FileReader("wc.txt");
		
		int i = fr.read();
		while(i != -1)
		{
		//	System.out.println((char)i);
			System.out.println(i);
			i = fr.read();
		}  
		fr.close(); */

	}
}