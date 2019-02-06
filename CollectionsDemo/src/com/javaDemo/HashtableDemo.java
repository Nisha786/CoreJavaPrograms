import java.util.*;

class Temp
{
	int i;
	Temp(int i)
	{
		this.i = i;
	}
	public int hashCode()
	{
		return i;
		//return i % 9;
	}
	public String toString()
	{
		return i+"";
	}
}

class HashtableDemo
{
	public static void main(String[] args) 
	{
		//Hashtable h = new Hashtable();
		Hashtable h = new Hashtable(25);
		h.put(new Temp(5), "A");
		h.put(new Temp(2), "B");
		h.put(new Temp(6), "B");
		h.put(new Temp(15), "B");
		h.put(new Temp(23), "B");
		h.put(new Temp(16), "F");

		System.out.println(h);
	}
}