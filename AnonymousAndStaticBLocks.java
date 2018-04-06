
class A{
	//Anonymous blocks
	{        //Called when object is created.
		System.out.println("Welcome");
	}
	
	//Static blocks
	static {    //Called when class is loaded in memory
		System.out.println("Thanks!");
	}
}

public class App {

	public static void main(String[] args) {
		  A a=new A();
		  new A();

	}
/*
Output:
Thanks!
Welcome
Welcome
*/
}
