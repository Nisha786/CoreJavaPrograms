class Student{
	String name;
	int rollNo;
	Student(String name, int rollNo){
		this.name = name;
		this.rollNo = rollNo;
	}
   public boolean equals(Object obj){
    	if(obj instanceof Student){
    	//String name1 = this.name;
      //  int rollNo1 = this.rollNo;
        Student s = (Student) obj;
     //   String name2 = s.name;
     //   int rollNo2 = s.rollNo;
        if(name.equals(s.name) && rollNo == s.rollNo){
        	return true;
        }
        else{
        	return false;
        }  
 	   }
 	   return false; 
   // catch(ClassCastException e){ return false; }
   // catch(NullPointerException e){ return false;} 
}  
	 public static void main(String[] args) {
		Student s1 = new Student("Nisha", 101);
		Student s2 = new Student("Deepak", 102);
		Student s3 = new Student("Nisha", 101);
		Student s4 = s1;
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals("Nisha"));
		System.out.println(s1.equals(null));
	}
}