import java.lang.reflect.*;
class Test
{
	public static void main(String[] args)throws Exception {
		Class c =Class.forName("Simple");
		Simple s = (Simple)c.newInstance();
		System.out.println("Calling...");
	}
}
