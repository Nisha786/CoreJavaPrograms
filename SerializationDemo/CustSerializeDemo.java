import java.io.*;

class Account implements Serializable
{
	String un = "Nisha";
	transient String pwd = "papa";

private void writeObject(ObjectOutputStream os)throws Exception
{
	os.defaultWriteObject();
	String epwd = "123"+pwd;
	os.writeObject(epwd);
}
private void readObject(ObjectInputStream is)throws Exception
{
	is.defaultReadObject();
	String epwd = (String) is.readObject();
	pwd = epwd.substring(3);
}
}
class CustSerializeDemo
{
	public static void main(String[] args)throws Exception {
	
	Account a1 = new Account();
	System.out.println(a1.un+"-----"+a1.pwd);

	    FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a1); //Serialization

		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account a2 = (Account) ois.readObject();

		System.out.println(a2.un+"-----"+a2.pwd);

	}
}