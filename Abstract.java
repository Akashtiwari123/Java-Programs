
//abstract class cannot be instantiated

abstract class A{
 int x;
abstract void m1();
 public void m2() {
	 System.out.println("This method need not to override");
 }
}

 class B extends A{ //if this class doesn't implement the inherited abstract method then it has to mark itself as abstract class.
public void m3(){
System.out.println("B");
 }
}

class C extends B{
public void m1(){
System.out.println("A");
 }
}

public class App1 {
 public static void main(String args[]) {
	 C c =new C();
	 
 }
