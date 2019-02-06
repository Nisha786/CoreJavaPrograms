import java.io.*;

class ExternalizableDemo implements Externalizable{

	String s;
	int i;
	int j;

	public ExternalizableDemo(){
		System.out.println("Default constructo called");
	}

	public ExternalizableDemo(String s, int i, int j)
	{
		this.s = s;
		this.i = i;
		this.j = j;
	}

	public void writeExternal(ObjectOutput out)throws IOException{
		out.writeObject(s);
		out.writeInt(j);
	}

	public void readExternal(ObjectInput in)throws IOException, ClassNotFoundException{
		s = (String) in.readObject();
		j = in.readInt();
	}
	public static void main(String[] args)throws Exception {
		ExternalizableDemo t1 = new ExternalizableDemo("nisha", 10, 20);

		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(t1); //Serialization

		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ExternalizableDemo t2 = (ExternalizableDemo) ois.readObject();//deSerialization

		System.out.println(t2.s+"\t"+t2.i+"\t"+t2.j);
	}
}