import java.util.*;
class stng{
public static void main(String args[])
{
	int b;
String a,c,e;
boolean d;
Scanner s=new Scanner(System.in);
System.out.println("enter the string");
a=s.nextLine();
e=a;
a=a.toUpperCase();
System.out.println("the uppercase form is:"+a);
b=a.length();
System.out.println("The length of string is:"+b);
System.out.println("enter the same string");
c=s.next();
d=c.equals(e);
System.out.println("Result is:"+d);
}
}
