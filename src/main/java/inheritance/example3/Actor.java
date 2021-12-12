package inheritance.example3;

public class Actor extends Person{

    public Actor(String name) {
        super(name);
    }

    public void readScenario(String movieName) {
        System.out.println("Reading scenario of movie " + movieName);
    }
}
