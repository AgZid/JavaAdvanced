package inheritance.example2;

public class Tankete extends Tankas{
    public void saukIsAutomato() {
        System.out.println("Saudau is automato");
    }

    @Override
    public void vaziuok() {
        System.out.println("Vaziuoju daug greiciau.");
    }

}
