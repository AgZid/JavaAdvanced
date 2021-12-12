package inheritance.example5;

public class Vairuotojas extends Worker{

    public Vairuotojas(String name, double alga) {
        super(name, alga);
    }

    @Override
    public void work() {
        System.out.println("Vairuotojas vairuoja automobili");
    }
}
