package incapsulation.pocket;

public class PocketMain {
    public static void main(String[] args) {
        Pocket pocket = new Pocket(500.00);

        System.out.println("I have this much money: " + pocket.showMoney());

        pocket.addMoney(52.2);
        System.out.println("I have this much money: " + pocket.showMoney());

        pocket.withDrawnMoney(152.2);
        System.out.println("I have this much money: " + pocket.showMoney());
    }
}
