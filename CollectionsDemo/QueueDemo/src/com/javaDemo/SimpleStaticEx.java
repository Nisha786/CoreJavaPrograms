class Student{
/*	static void myMethod(){
		System.out.println("myMethod");
	}
	public static void main(String[] args){
		//with static method we do not need to create an object to call a method
	//	SimpleStaticEx se = new SimpleStaticEx();
		se.myMethod();
	}  */



//Ex-2
/*	static int var1;
	static String var2;

	static void disp(){
		var1 = 12;
		var2 = "Nisha";
		System.out.println("Var 1 is :" + var1);
		System.out.println("Var 2 is :" + var2);
	}
	public static void main(String[] args){
		disp();
	}  */




	//Ex-3
	String name;
	int rollNo;

	static String clgName;
	//static counter to set unique roll no
	static int counter=0;

	public Student(String name){
             this.name = name;
             this.rollNo = setRollNo();
	}

	//getting unique rollNo through static variable counter

    static int setRollNo(){
             counter++;
             return counter;
    }

    //static method
    static void setClg(String name){
    	clgName = name;
    }

    //instance method
    void getStudentInfo(){
    	System.out.println("name :"+ this.name);
    	System.out.println("rollNo :"+ this.rollNo);

    }
}	

public class SimpleStaticEx{
	 public static void main(String[] args) {
		
		//calling static method w/o instantiating student class
		Student.setClg("XYZ");

		Student s1 = new Student("Alice");
		Student s2 = new Student("Bob");

		s1.getStudentInfo();
		s2.getStudentInfo();
	}








//Ex-4

}





