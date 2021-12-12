package inheritance.example1;

public class MonsterMain {
    public static void main(String[] args) {
        Monster monster = new Monster();
        monster.talk();
        monster.attack();

        Vampire vampire = new Vampire();
        vampire.talk();
        vampire.drinkBlood();
        vampire.attack();
        vampire.setHealthPoints(100);
        System.out.println("Vampire health points " + vampire.getHealthPoints());

    }
}
