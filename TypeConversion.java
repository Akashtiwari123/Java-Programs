public class practice {

	public static void main(String[] args) {
	byte b;
	int i=240;
	double d=212.567;
	
	System.out.println("conversion of int to byte");
	b=(byte)i;
	System.out.println("i and b :"+i +"-> "+b);
	
    System.out.println("conversion of double to int");
	i=(int) d;
	System.out.println("i and d  :"+d+"-> "+i);
	
    System.out.println("conversion of double to byte");
	b=(byte)d;
	System.out.println("d and b :"+d+" ->"+b);
	
	}
}
