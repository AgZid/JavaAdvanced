package inheritance.example5;

public class Daktaras extends Worker{

    public Daktaras(String name, double alga) {
        super(name, alga);
    }

    @Override
    public void work() {
        System.out.println("Dakatras gydo");
    }


}
