import java.util.Scanner;
class Exe2
{
public static void main(String[] args)
 {
   String s = "Aa kiu, I swd skieo 236587. GH kiu: sieo??25.33";
   count(s);
 }
 public static void count(String x)
 { 
   char[] ch = x.toCharArray();
   int letter = 0;
   int space = 0;
   int num = 0;
   int other = 0;
   for(int i = 0; i < x.length(); i++)
      {
      if(Character.isLetter(ch[i]))
       {
        letter++;
       }
      else if(Character.isDigit(ch[i]))
      {
       num++;
      }
     else if(Character.isSpaceChar(ch[i])) 
     {
      space++;
     }
    else
     {
      other++;
     }
  }
    System.out.println("Aa kiu, I swd skieo 236587. GH kiu: sieo??25.33");
    System.out.println("Letter" + letter);
    System.out.println("Space" + space);
    System.out.println("Number" + num);
    System.out.println("Other" + other);
 }
}
