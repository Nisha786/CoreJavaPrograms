import java.io.*;
public class WriteTest
{
public static void main(String[] args)
{
try {
//Create Stream Object
FileOutputStream fos = new FileOutputStream("abc.txt");
ObjectOutputStream oos = new ObjectOutputStream(fos);
//Perform Serialization
//Student st = new Student(100,"Neeraj",25.5f);
Student st1 = new Student();
//oos.writeObject(st);
oos.writeObject(st1);
//close streams
fos.close();
oos.close();
//Serialization Completes
}
catch (IOException ioe) { ioe.printStackTrace(); }
catch (Exception e ) { e.printStackTrace(); }
}
}

 class WriteTest1
{
public static void main(String[] args) throws IOException
{
 try( FileOutputStream fos= new FileOutputStream("abc1234.txt");
   ObjectOutputStream oos = new ObjectOutputStream(fos))
{

Student st = new Student(100,"Neeraj",25.5f);
oos.writeObject(st);
}
}
}