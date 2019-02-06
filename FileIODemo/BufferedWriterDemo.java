import java.io.*;
class BufferedWriterDemo
{
	public static void main(String[] args)throws IOException {
		File f = new File("nisha.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(100);
		bw.newLine();
		char[] ch = {'a','b','c','d'};
		bw.write(ch);
		bw.newLine();
		bw.write("Nisha Ansari");
		bw.flush();
		bw.close();
	}
}