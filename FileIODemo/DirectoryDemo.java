import java.io.*;
class DirectoryDemo{
	public static void main(String[] args) {
		File f = new File("D:\\CoreJavaPractice");
		String[] s = f.list();
		for(String s1 : s)
		{
			System.out.println(s1);
		} 
	}
}