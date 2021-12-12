package incapsulation.pocket;

public class Pocket {
    private double money;

    public Pocket(double money) {
        this.money = Math.round(money * 100) / 100;
    }

    public double showMoney() {
        return money;
    }

    public void addMoney(double amoneyAmount) {
        if (amoneyAmount <= 0) {
            System.out.println("Can't add negative amount");
        } else if (amoneyAmount >= 3000) {
            System.out.println("You don't have enough space in the pocket");
        } else {
            money += amoneyAmount;
            System.out.println("You have added " + amoneyAmount + " $");
        }
    }

    public void withDrawnMoney(double moneyAmount) {
        if (moneyAmount < money && moneyAmount >= 10) {
            money -= moneyAmount;
            System.out.println("You have withdrawn " + moneyAmount + " $");
        } else {
            System.out.println("Not enough money");
        }
    }

    public double getMoney() {
        return money;
    }


}
