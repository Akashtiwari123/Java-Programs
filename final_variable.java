package p3;

class A{
	final int x=5;  //Has to initialize it
	 final void m1() { 
		System.out.println("A");	
	}
}

class B extends A{
	// void m1();   cannot override final method from A
	int x=4;  //Its not assigning a variable instead its a new variable
	public  void m2() {
		System.out.println(x);
	}
}

public class App1{
	public static void main(String[] args) {
		A a=new B();
		a.m1();
		B b=new B();
		b.m2();
	}
}

