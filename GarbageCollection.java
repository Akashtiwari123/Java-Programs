package p1;

/*
author:Akash Tiwari
+Heap belongs to the entire project 
+Static belongs to the class
+Stack belongs to the method
+Any object in the heap that is unreachable from the stack is considered to be an inactive object and is eligible for garbage collection

*/
import java.util.Scanner;


public class App {
	Integer isbn;
	App(int isbn){
		this.isbn=isbn;
		
	}
  public static void main(String[] args) {
App a=new App(1222);
App a1=new App(5555);
App a2=changeIsbn(a1);
System.out.println(a2.isbn);
a1.isbn=0000;
a1=null;
}
private static App changeIsbn(App a1) {
	a1.isbn=1111;
	return a1;
}
}
