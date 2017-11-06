class person {
    private String name;
    private int age;
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setInfo(String name, int age) {
        setName(name);
        setAge(age);
    }
}

public class App {

    public static void main(String[] args) {
    
        person pr = new person();
        
       
        
        pr.setName("Bertie");
        pr.setAge(1);
        
        System.out.println(pr.getName());
    }

}
