import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

enum Singleton{
	INSTANCE;

/*	public String getConfiguration(){
		return "nisha";
	}  */
}
class EnumSingleton{
	static void useSingleton(){
		Singleton singleton = Singleton.INSTANCE;
		print("singleton", singleton);
	}
	public static void main(String[] args)throws Exception{

		ExecutorService service = Executors.newFixedThreadPool(2);
		service.submit(EnumSingleton::useSingleton);
		service.submit(EnumSingleton::useSingleton);

		service.shutdown();
	}
	static void print(String name, Singleton object){
		System.out.println(String.format("Object : %s, Hashcode : %d", name, object.hashCode()));
	}
}
