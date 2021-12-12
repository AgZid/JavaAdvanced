package inheritance.example5;

public class Programuotojas extends Worker{

    public Programuotojas(String name, double alga) {
        super(name, alga);
    }

    @Override
    public void work() {
        System.out.println("Programuotojas raso koda");
    }
}
