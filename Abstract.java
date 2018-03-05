
//abstract class cannot be instantiated
abstract class A{

public void m1();

}

abstract class B extends A{    //if this class solves for the m1() then its ok else this class also has to  mark as abstract
public void m2(){
System.out.println("B");
 }
}

class C extends B{
public void m1(){
System.out.println("A");
 }
}


class main{
public static void main(String args[]) {

C c =new ();
 }
}
