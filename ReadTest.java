import java.io.*;
public class ReadTest
{
public static void main(String[] args)
{
try {
//Create Stream Object
FileInputStream fis = new FileInputStream("abc.txt");
ObjectInputStream ois = new ObjectInputStream(fis);
//Perform DeSerialization
Object obj = ois.readObject();
Student st = (Student) obj;
st.display();
//close streams
ois.close();

//DeSerialization Completes
}
catch (IOException ioe) { ioe.printStackTrace(); }
catch (ClassNotFoundException e ) { e.printStackTrace(); }
}
}