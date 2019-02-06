import java.io.*;

/*class Dog implements Serializable //w/o implement serializable we will get R.E not Serializable
{
    int i = 10;
	int j = 20;
}

class Cat implements Serializable
{
	String c = "cat";
}

class SerializeDemo{
	public static void main(String[] args)throws Exception{

		Dog d1 = new Dog();
		Cat c1 = new Cat();
		
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1); //Serialization
		oos.writeObject(c1);

		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog) ois.readObject();//deSerialization
		Cat c2 = (Cat) ois.readObject();// if we interchange that order we will get CCE

		System.out.println(d2.i+"-----"+d2.j);
		System.out.println(c2.c+"-----"+c2.c);

	}
} */

//class Animal implements Serializable
class Animal
{
	int i = 10;
	Animal(){
		System.out.println("Animal constructor");
	}
}
//class Dog extends Animal
class Dog extends Animal implements Serializable
{
	int j = 20;
	Dog(){
		System.out.println("Dog constructor called");
	}
}
class SerializeDemo
{
	public static void main(String[] args)throws Exception{

		Dog d1 = new Dog();
		d1.i = 888;
		d1.j = 999;
		
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1); //Serialization

		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog) ois.readObject();//deSerialization
		//Animal d2 = (Animal) ois.readObject();

		System.out.println(d2.i+"-----"+d2.j);

	}
}