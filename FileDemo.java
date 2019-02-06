import java.io.*;
class FileDemo
{
public static void main(String[] str) throws IOException
{
// File f = new File("D:\\");
// System.out.println(f.exists());
//System.out.println(f.createNewFile());
//System.out.println(f.exists());
  File f1 = new File("D:\\javacode","xyz111.txt");
  System.out.println(f1.createNewFile());
//System.out.println(f1.mkdir());
//System.out.println(f1.delete());
//System.out.println(f1.delete());
//System.out.println(f.isFile());
//System.out.println(f1.isDirectory());
//System.out.println(f1.isFile());
//System.out.println(f.isDirectory());
/*  int count=0;
String s[] = f.list();
for(String s1: s)
  { 
   File f2 = new File(f,s1);
    
     if(f2.isDirectory()) //f2.isFile()) 
      {
      count++; 
     System.out.println("Directory Name " + f2.getName() );  //s1 + " Length: " +f2.length()); 
       }
    }
System.out.println("Number of Directory : " +count); */

/*
  int count=0;
String s[] = f.list();
for(String s1: s)
  { 
   File f2 = new File(f,s1);
    
     if(f2.isFile())  
      {
      count++; 
     System.out.println("File Name " + f2.getName() );  //s1 + " Length: " +f2.length()); 
       }
    }
System.out.println("Number of Files : " +count);  */


 
}
}
