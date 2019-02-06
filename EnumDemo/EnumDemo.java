/*enum Beer{
	KF,KO,RC,FO;
}
class EnumDemo
{
	public static void main(String[] args) {
	
	/*	Beer b = Beer.KF;

		switch(b){
			case KF:

			System.out.println("KF type");
			break;

			case KO:

			System.out.println("KO type");
			break;

			case RC:

			System.out.println("RC type");
			break;

			case FO:

			System.out.println("FO type");
			break;

		    default:

			System.out.println("Not any type");
			break;  



		}   */












		//Demo-2

/*		Beer[] b = Beer.values();
		for(Beer b1 : b){

			System.out.println(b1+"----"+b1.ordinal());
		}

	}
}  */

//Demo-3
/*enum Beer{
	KF,RF,FO,RC;

	Beer(){
		System.out.println("Constructor");
	}
}
class EnumDemo{

	public static void main(String[] args) {
		Beer b = Beer.KF;
		System.out.println("Hello");
	}
}  */



//Demo-4
/*   enum Beer{
	KF(100),RF(20),FO(300),RC;
	int price;

	Beer(int price)
	{
		this.price = price;
	}

	Beer(){
		this.price = 65;
	}
	public int getPrice(){
		return price;
	}
}
class EnumDemo{

	public static void main(String[] args) {
		Beer[] b = Beer.values();
		for(Beer b1 : b){

		System.out.println(b1+"----"+b1.getPrice()+"\t"+b1.ordinal());
	}
	}
}  */







//Demo-4
/*  enum Color{
	BLUE,RED,GREEN;
	public void info(){
		System.out.println("Universal colors");
	}
}
	class EnumDemo
	{
		public static void main(String[] args) {
			Color[] c = Color.values();
			for(Color c1 : c)
				c1.info();
		}
	}  */









	//Demo-5 for Anonymous inner class

	enum Color{
	BLUE,RED{
		public void info(){
		System.out.println("Dangerous color");
	}
	},
	GREEN;
	public void info(){
		System.out.println("Universal colors");
	}
}
	class EnumDemo
	{
		public static void main(String[] args) {
			Color[] c = Color.values();
			for(Color c1 : c)
				c1.info();
		}
	}