package inheritance.example4;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Auu auu");
    }

    public void growl() {
        System.out.println("Grrrr...");
    }

}
