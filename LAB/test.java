// 1.write a program to illustrate static variables and static method
// public class test {
// public static int countObject=0;
// public test(){
// System.out.println("non-peremeterised constructor");
// countObject++;
// }
// public test(int some){
// System.out.println("peremeterised constructor");
// countObject++;
// }
// public static void showObject(){System.out.println(countObject);}
// public static void main(String[] args) {
// test t1=new test();
// test t2 =new test(20);
// test.showObject();
// }  
// }

//2. write a program to implement thread prioties.
// public class test extends Thread{
// String name="";
// public test(String name){this.name=name;}
// public synchronized void run(){
// for(int i=1;i<11;i++){System.out.println("value of i in "+name+" : "+i);}}
// public static void main(String[] args) {
// test t1=new test("thread A");
// test t2=new test("thread B");
// t1.setPriority(Thread.MAX_PRIORITY);
// t2.start();}}

//3.write a program to read data from file and display it on commandline.
// import java.io.*;
// public class test{
// public static void main(String[] args) {
// File path = new File("C:\\Users\\Yeshi Leksang\\Desktop\\Java\\test.html");
// try{FileReader doc=new FileReader(path);int ch;
// while ((ch=doc.read())!=-1){System.out.print((char)ch);}
// doc.close();}catch(IOException e){System.out.println(e);}}}

//4.write a program which illjustrate two types of inheritance in java.
// class A{
// A(){System.out.println("class A is parent class");}}
// class B extends A {
// B(){System.out.println("class B is singlelevel and sub-class of Class A ");}}
// class C extends B{
// C(){System.out.println("class C is multilevel and sub-class of Class B ");}}
// public class test {
// public static void main(String[] args) {
// C c1 =new C();
// System.out.println(c1);}}

//5.write a program of exception handing by using try.. catch.. finally keywords.
// public class test{
// public static void main(String[] args) {
// int numerator=10,denumerator=0;try{
// int result=numerator/denumerator;
// System.out.println("sum"+result);
// }catch(AbstractMethodError e){System.out.println(e);}
// finally{System.out.println("some must executed code");}
// System.out.println("after the exception has been handled");}}

//6.write a program unsing interface
// public class test {
// public static void main(String[] args) {
// brid b=new brid();
// System.out.println(b.sound());
// cattle c=new cattle();
// System.out.println(c.sound());}}
// interface animal{public String sound();}
// class brid implements animal{public String sound(){return"chip";}}
// class cattle implements animal{public String sound(){return"moo";}}

//7.write a program which use anymotheds of String buffer.
// class test{
// public static void main(String[] args) {
// StringBuffer sb=new StringBuffer("hello world");
// System.out.println("insert :"+sb.insert(2,"  "));
// System.out.println("replace :"+sb.replace(0, 2, "he"));
// System.out.println("delete :"+sb.delete(1, 4));
// System.out.println("append :"+sb.append("java"));
// System.out.println("reverse : "+sb.reverse());}}

// public class test{
// public static void main(String[] args) 
// {double x = 28, y = 4;
// System.out.println("Maximum number of x and y is: " +Math.max(x, y));
// System.out.println("Minimum number of x and y is: " +Math.min(x, y));
// System.out.println("Square root of y is: " + Math.sqrt(y));   
// System.out.println("Power of x and y is: " + Math.pow(x, y));  
// System.out.println("cube root of y is: " + Math.cbrt(y));}}