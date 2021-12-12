package inheritance.example4;

import java.sql.SQLOutput;

public class Duck extends Animal{
    public Duck(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Kre kre");
    }

    public void fly() {
        System.out.println("Skrenda");
    }
}
