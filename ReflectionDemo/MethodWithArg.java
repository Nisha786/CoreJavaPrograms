import java.lang.reflect.*;

class A{
	private void cube(int n){
		System.out.println("private Message() called... "+ n*n*n);
	}
}
public class MethodWithArg{
	public static void main(String[] args)throws Exception{
       		Class c = A.class;
       		Object o = c.newInstance();

       		Method m = c.getDeclaredMethod("cube", new Class[]{int.class});
       		m.setAccessible(true);
       		m.invoke(o, 4);
	}
}