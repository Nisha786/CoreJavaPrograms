import java.io.*;
class FileWriterDemo
{
	public static void main(String[] args)throws Exception {
		FileWriter fw = new FileWriter("wc.txt", true);
		fw.write(100);
		fw.write("\nnisha \nAnsari");
		char[] c = {'a', 'b', 'c'};
		fw.write('\n');
		fw.write(c);
		fw.write('\n');
		System.out.println("wc text file has been created");
		fw.flush();
		fw.close();
	}
}