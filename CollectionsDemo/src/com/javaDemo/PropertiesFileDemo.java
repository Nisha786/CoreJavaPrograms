import java.util.*;
import java.io.*;

class PropertiesFileDemo
{
	public static void main(String[] args) throws Exception
	{
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("abc.properties");
		p.load(fis);
		System.out.println(p);

		String s = p.getProperty("venki");
		System.out.println(s);
		p.setProperty("nag", "88888");
		FileOutputStream fos = new FileOutputStream("abc.properties");
		p.store(fos, "Updated by nisha for collection practice");


























/*        Properties p = new Properties();
		FileInputStream fis = new FileInputStream("db.properties");
		p.load(fis);

		String url = p.getProperty("url");
		String user = p.getProperty("UserName");
		String pwd = p.getProperty("pwd");
		Connection con = DriverManager.getConnection(url,UserName,pwd);
		;;;;;;;;  */


	}
}