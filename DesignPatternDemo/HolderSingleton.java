import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class Singleton {

	private Singleton(){
		System.out.println("creating...");
	}

	public static Singleton getInstance(){
		return Holder.INSTANCE;
	}	

	static class Holder{
		static final Singleton INSTANCE = new Singleton();
	}

}
class HolderSingleton{
	static void useSingleton(){
		Singleton singleton = Singleton.getInstance();
		print("singleton", singleton);
	}
	public static void main(String[] args)throws Exception{

		ExecutorService service = Executors.newFixedThreadPool(2);
		service.submit(HolderSingleton::useSingleton);
		service.submit(HolderSingleton::useSingleton);

		service.shutdown();
	}
	static void print(String name, Singleton object){
		System.out.println(String.format("Object : %s, Hashcode : %d", name, object.hashCode()));
	}
}