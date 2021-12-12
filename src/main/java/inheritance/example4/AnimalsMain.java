package inheritance.example4;

import java.util.ArrayList;
import java.util.List;

public class AnimalsMain {

    public static void main(String[] args) {
        Dog rexas = new Dog("Rexas");
        System.out.println(rexas.getName());
        rexas.makeSound();
        rexas.growl();
        rexas.breathe();
        System.out.println();


        Cat murkis = new Cat("Murkis");
        System.out.println(murkis.getName());
        murkis.makeSound();
        murkis.purr();
        murkis.breathe();
        System.out.println();

        Duck donald = new Duck("Donald");
        System.out.println(donald.getName());
        donald.makeSound();
        donald.fly();
        donald.breathe();

        List<Dog> dogs = new ArrayList<>();
        dogs.add(rexas);

        System.out.println(rexas instanceof Dog);
        List<Animal> animals = new ArrayList<>();
        animals.add(rexas);
        animals.add(murkis);
        animals.add(donald);
        animals.add(new Cat("Misiukas"));

        System.out.println();

        for (Animal animal : animals) {
            animal.makeSound();
            if (animal instanceof Duck) {
                ((Duck) animal).fly();
            }
        }


    }
}
