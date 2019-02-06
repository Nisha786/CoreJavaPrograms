public class TotalMemoryInJVMExample{
    public static void main(String[] args) { 
           
      /**
      * first we will get the java Runtime object using the
      * Runtime class's getRuntime() method in java.
      */
        Runtime runtime = Runtime.getRuntime();
      
      /**
      * totalMemory() method of Runtime class returns the total
      * amount of memory in the JVM (Java virtual machine).
      * totalMemory() is the native method, so value returned by this
      * method depends on the host environment.
      */
      
      long totalMemoryInJVM = runtime.totalMemory();
       
        System.out.println("Total amount of memory in the "
               + "JVM (Java virtual machine) in bytes = "+ totalMemoryInJVM);
    }
}