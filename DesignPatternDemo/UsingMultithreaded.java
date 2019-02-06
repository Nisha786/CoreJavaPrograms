import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class Singleton {
	private static Singleton soleInstance = null;//Lazily created object

	private Singleton(){
		System.out.println("creating...");
	}

	public static Singleton getInstance(){
		if(soleInstance == null){
			soleInstance = new Singleton();
		}
		return soleInstance;
	}	

}
class UsingMultithreaded{
	static void useSingleton(){
		Singleton singleton = Singleton.getInstance();
		print("singleton", singleton);
	}
	public static void main(String[] args)throws Exception{

		ExecutorService service = Executors.newFixedThreadPool(2);
		service.submit(UsingMultithreaded::useSingleton);
		service.submit(UsingMultithreaded::useSingleton);

		service.shutdown();
	}
	static void print(String name, Singleton object){
		System.out.println(String.format("Object : %s, Hashcode : %d", name, object.hashCode()));
	}
}