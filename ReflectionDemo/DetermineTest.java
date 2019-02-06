class Simple{}
interface My{}

class DetermineTest{
	public static void main(String[] args)throws Exception{
		
		Class c = Class.forName("Simple");
		System.out.println(c.isInterface());

		Class c2 = Class.forName("My");
		System.out.println(c2.isInterface());
	}
}