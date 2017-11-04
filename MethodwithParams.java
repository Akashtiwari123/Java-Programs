class Sports {
    public void like(String text) {
        System.out.println(text);
    }
    
    public void rate(int point) {
        System.out.println("rating: " + point);
    }
    
    public void score(String Type, double rank) {
        System.out.println( "Type " + Type +"Rank " + rank );
    }
}

public class App {

    public static void main(String[] args) {
        Sports sp = new Sports();
        
        sp.like("My name is Dhoni");
        sp.rate(8);
        
        sp.score("Batsman",  4);
        
        String person = "Hello Dhoni";
        sp.like(person);
        
        int value = 14;
        sp.rate(value);

    }

}va
