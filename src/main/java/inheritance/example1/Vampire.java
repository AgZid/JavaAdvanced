package inheritance.example1;

public class Vampire extends Monster {

    public void drinkBlood() {
        System.out.println("Drinking blood since I am vampire");
    }

    //perraseme monter klases funkcionaluma
    @Override
    public void attack() {

        super.attack(); // tevines klases metodas
        System.out.println("Attacking like vampire"); // vaikines klaseje perrasytas metodas
    }



}
