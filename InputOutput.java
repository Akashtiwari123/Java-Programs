import java.util.*;
import java.lang.Exception;
class ioex extends Exception{
public static void main(String args[]){
int a,b,ans;
a=10;b=4;
try
{
ans=a/b;
System.out.println("The quotient="+ans);
if(ans<4){System.out.println(ans);}else
{
throw new Exception("hii");	
}
}
catch(Exception e)
{System.out.println("Eception has occured.divisor is zero");
}
finally
{
System.out.println("In final block");
}
}
}
