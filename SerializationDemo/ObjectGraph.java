import java.io.*;

class Dog implements Serializable
{
	Cat c = new Cat();
}
class Cat implements Serializable
{
	Rat r = new Rat();
}
class Rat implements Serializable
{
	int j = 20;
}
class ObjectGraph
{
	public static void main(String[] args) throws Exception{
		
		Dog d1 = new Dog();

		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1); //Serialization

		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog) ois.readObject();//deSerialization

		System.out.println(d2.c.r.j); // 20
		System.out.println(d2.c.r);// rat@ca494b
		System.out.println(d2);
		
	}
}