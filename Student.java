class Student 
 {
  String name;
  int rollno;
 Student(String name, int rollno)
  {
    this.name = name;
    this.rollno = rollno;
  }
public String toString()
  {
    return name+"----"+rollno;
  // return "This is student with the name"+ "\n" + name+"student roll no" +"\n"+ rollno;
  }
public static void main(String[] args)
 {
  String s1 = new String("Nisha", 101);
  Student s2 = new Student("Archu", 102);
  System.out.println(s1);
  System.out.println(s1.toString());
  System.out.println(s2.toString());
 }
} 