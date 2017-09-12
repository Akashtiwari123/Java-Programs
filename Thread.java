class NewThread implements Runnable{
Thread t;
NewThread(){
t=new Thread(this,"Demo");
System.out.println("this thread is"+t);
t.start();
}
//
public void run(){
try{
for(int i=5;i>0;i--)
{
System.out.println("hii"+i);
Thread.sleep(50);
}
}
catch(InterruptedException e)
{
System.out.println("ending thread");
   }
System.out.println("exit thread");
    }
}
class threadDemo{
public static void main(String args[]){
new NewThread();
try{
for(int i=5;i>0;i--)
{System.out.println("hii"+i);
Thread.sleep(100);
}
}
catch(InterruptedException e)
{
System.out.println("ending thread");
}
System.out.println("exit thread");

}
}
