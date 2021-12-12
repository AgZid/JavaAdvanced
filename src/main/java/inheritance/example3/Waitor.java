package inheritance.example3;

public class Waitor extends Person {

    public Waitor(String name) {
        super(name);
    }

    public void serveFood(String foodName) {
        System.out.println("Serving " + foodName);
    }
}
