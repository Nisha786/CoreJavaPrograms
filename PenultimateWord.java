import java.util.Scanner;

class PenultimateWord
{
public static void main(String[] args)
{
Scanner in = new Scanner(System.in);

System.out.println("Enter the sentance :");

String line = in.nextLine();

String [] words = line.split("[ ]+");

System.out.println("Penultimate word :" + words[words.length - 2]);
}
}