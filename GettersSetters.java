class Person {
    String name;
    int age;
    
    void speak() {
        System.out.println("Your name: " + name);
    }
    
    int Retirement() {
        int yearsLeft = 62 - age;
        
        return yearsLeft;
    }
    
    int getAge() {
        return age;
    }
    
    String getName() {
        return name;
    }
}


public class App {

    public static void main(String[] args) {
        Person person1 = new Person();
        
        person1.name = "xyz";
        person1.age = 45;
        
       
        
        int years = person1.Retirement();
        
        System.out.println("Years till retirements " + years);
        
        int age = person1.getAge();
        String name = person1.getName();
        
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
    }

}

 
