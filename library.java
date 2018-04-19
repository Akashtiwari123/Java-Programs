
package library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Library {
    public static void main(String[] args) {
  Book b=new Book();
    }
    
}                                              
//Book Details
public class Book
{
String bk_name;
double price;
String author;
String availability;


Book(String bkn,double p,String author,String availability)
{
bk_name=bkn;
price=p;
this.author=author;
this.availability=availability;
}
//Librarian Log
void librarian(){

int it,rt,fine,n;
System.out.println("Enter the issue _date and return_date");
Scanner s= new Scanner(System.in);
it=s.nextInt();
rt=s.nextInt();
n=it-rt;
if(n>7)
{   fine=(n-7)*5;
  System.out.println("The amount as fine is:"+fine);
}
else 
    System.out.println("No Fine");
}
 
void student()
{
String name,sclass;
int roll;
System.out.println("enter your name,class,roll no: ");
name=s.next();
sclass=s.next();
roll=s.nextInt();
List<String> list = new ArrayList<>();
list.add(new Book("oopm","Herbert",200,"YES"));
list.add(new Book("dbms","TECHMAX",300,"YES"));
list.add(new Book("dsa","TACHMAX",150,"YES"));
list.add(new Book("adc","TECHMAX",400,"YES"));
list.add(new Book("padc","TECHMAX",145,"YES"));

Scanner input=new Scanner(System.in);
System.out.println("Enter book name:");
String st=input.nextLine();
 
for (Book s : list){
if(st.equals(s.bk_name)){
System.out.println("\n book_name:"+bk_name +"\nAuthor:"+ author +"\n Price:"+ price +"\n Availability:"+availability);
}   }
}
}
