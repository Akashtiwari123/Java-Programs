/*
About Interface:
1-Interface cannot be initiated.(i.e., can't make an object of it)
2-A method in interface by default is public and abstract.
3-An interface can extends another interface.
4-All the methods of interface has to compulsorily override .
*/

interface inter{
  void m1();

}

 class B implements inter{
    public void m1() {
    	System.out.println("Running interface");
    }
}


public class App1 {
 public static void main(String args[]) {
	 B b=new B();
	 b.m1();
	 
 }
}
