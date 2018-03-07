/*
Contructor:-
1-A constructor is a member function of a class which initializes objects of a class
2-Each class has a contructor (if user is not specifying any constructor JVM makes a constructor[ called default-constructor also-called No-argument constructor] for it during compilation )
3- Constructor declarations look like method declarations—except that they use the name of the class and have no return type.
*/

class A{
	A(){
		System.out.println("1");
	}
}

class B extends A{
	B(){
		System.out.println("2");
	}
	B(int x){
		this();
		System.out.println(x);
	}
}

class C extends B{
	
	C(int y){
		super(3);
		System.out.println(y);
	}
}

public class App1{
	public static void main(String[] args) {
		C c=new C(4);
		
	}
}

/*
Output-
1
2
3
4
*/

