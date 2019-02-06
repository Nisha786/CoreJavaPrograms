package com.abc;
import java.util.Scanner;
class TableOfNum
{
public static void main(String[] args)
 {
   int i;
   Scanner in = new Scanner(System.in);
   System.out.println("Enter the value of table :");
   int n = in.nextInt();
 for(int j = 1; j <= 10; j++)
    {
  i = n*j;
    System.out.println("The value of table :" + i);
    }
 }
}