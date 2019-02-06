import java.lang.*;
class Singleton implements Cloneable{
	private static Singleton soleInstance = new Singleton();// eagerly created object

	private Singleton(){
		System.out.println("creating...");
	}

	public static Singleton getInstance(){
		return soleInstance;
	}

    @Override
	protected Object clone() throws CloneNotSupportedException{
		if(soleInstance != null){
			throw new RuntimeException("Can't clone, please use getInstance()");
		}
		return soleInstance;
	}
}
class CloneSingleton{
	public static void main(String[] args)throws Exception{
	//	Singleton s1 = new Singleton();// C.E Singleton() has private access

		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();

		System.out.println("s1"+s1);
		System.out.println("s2"+s2);

		//Using Clone
		Singleton s3 = (Singleton) s2.clone();		

        System.out.println("s3"+s3);

	}
}