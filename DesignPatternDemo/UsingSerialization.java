import java.io.*;
class Singleton implements Serializable{
	private static Singleton soleInstance = new Singleton();

	private Singleton(){
		System.out.println("creating...");
	}

	public static Singleton getInstance(){
		return soleInstance;
	}
}
class UsingSerialization{
	public static void main(String[] args)throws Exception{
	//	Singleton s1 = new Singleton();// C.E Singleton() has private access

		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();

		System.out.println("s1"+s1);
		System.out.println("s2"+s2);

		//Using Serialization
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("s2.ser"));
		oos.writeObject(s2);

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("s2.ser"));
		Singleton s3 = (Singleton) ois.readObject();

        System.out.println("s3"+s3);

	}
}