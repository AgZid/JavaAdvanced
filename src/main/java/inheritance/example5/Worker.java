package inheritance.example5;

public class Worker {
    private double alga;
    private String name;
    private int atsotoguDienuSkaicius = 20;

    public Worker(String name, double alga) {
        this.alga = alga;
        this.name = name;
    }

    public void setAtsotoguDienuSkaicius(int atsotoguDienuSkaicius) {
        this.atsotoguDienuSkaicius = atsotoguDienuSkaicius;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAlga() {
        return alga;
    }

    public void setAlga(double alga) {
        this.alga = alga;
    }

    public void work() {
        System.out.println("Darbuotojas dirba");
    }

    public void atostogauti() {
        System.out.println("Gauti atostogas " + atsotoguDienuSkaicius);
    }
}
