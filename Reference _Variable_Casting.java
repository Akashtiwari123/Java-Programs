package main;
/*
@author:Akash Tiwari
*/

 class A{
	
}
 class B extends A{
	 
 }
public class consrtuct {

	public static void main(String[] args) {
		A a=new A();
		B b=new B();
	//	b=a;              //Type mismatch: cannot convert from A to B
		
		//But this can also be overcome by making the behaviour of A to be as B.
		a=b;      //line20
		b=(B)a;   //This will not cause any compilation error
		  /*
      The order of line 20 and 21 is importent as it first make
      a polymorphic polymorphism is made so that the next line make itself as pure polymorphism
      else it gives classCastException runtime error
      */
		System.out.println("Success");
	}

}
