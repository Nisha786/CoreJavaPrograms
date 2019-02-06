import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class Singleton {
	private static volatile Singleton soleInstance = new Singleton();//Lazily created object
//we use volatile keyword so double check locking won't be broken
	private Singleton(){
		System.out.println("creating...");
	}

	public static synchronized Singleton getInstance(){
		if(soleInstance == null){ //check 1
			synchronized(Singleton.class)
			{
				if(soleInstance == null) //check 2
				{
			      soleInstance = new Singleton();
		        }
		    }
	    }
		return soleInstance;
	}	

}
class MultiThreadedSingleton{
	static void useSingleton(){
		Singleton singleton = Singleton.getInstance();
		print("singleton", singleton);
	}
	public static void main(String[] args)throws Exception{

		ExecutorService service = Executors.newFixedThreadPool(2);
		service.submit(MultiThreadedSingleton::useSingleton);
		service.submit(MultiThreadedSingleton::useSingleton);

		service.shutdown();
	}
	static void print(String name, Singleton object){
		System.out.println(String.format("Object : %s, Hashcode : %d", name, object.hashCode()));
	}
}