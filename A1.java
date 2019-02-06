package com.abc;
class A1
{
 static
 {
  String a[] = {};
   System.out.println("SIB1");
   test();
   main(a);
 }
static void test()
 {
  System.out.println("test");
 }
static
 {
  System.out.println("SIB3");
 }
public static void main(String[] args)
 {
  System.out.println("main");
 }
static
 {
  System.out.println("SIB2");
 }
}