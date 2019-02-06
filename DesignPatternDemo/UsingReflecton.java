import java.lang.reflect.*;
class Singleton{
	private static Singleton soleInstance = new Singleton();

	private Singleton(){
		System.out.println("creating...");
	}

	public static Singleton getInstance(){
		return soleInstance;
	}
}
class UsingReflecton{
	public static void main(String[] args)throws Exception{
	//	Singleton s1 = new Singleton();// C.E Singleton() has private access

		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();

		System.out.println("s1"+s1);
		System.out.println("s2"+s2);

		//Using Reflection
		Class c = Class.forName("Singleton");
		Constructor<Singleton> ctr = c.getDeclaredConstructor();
		ctr.setAccessible(true);
		Singleton s3 = ctr.newInstance();
        System.out.println("s3"+s3);

	}
}