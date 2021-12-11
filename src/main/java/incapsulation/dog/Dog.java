package incapsulation.dog;

public class Dog {
    private String name;
    private int age;
    private String gender;
    private String race;
    private double weight;

    private int minWeight = 3;
    private int maxWeight = 20;

    public Dog(String name, int age, String gender, String race, double weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.race = race;
        this.weight = weight;
    }

    public Dog(String gender, String race) {
        this("Reksas", 8, gender, race, 7.1);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Netinkamas amzius");
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight >= minWeight && weight <= maxWeight) {
            this.weight = weight;
        } else {
            System.out.println("Netinkamas svoris");
        }
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", race='" + race + '\'' +
                ", weigth=" + weight +
                '}';
    }
}

class main{
    public static void main(String[] args) {
        Dog pukis = new Dog("Pukis", 3, "Male", "Greyhound", 5.3);
        Dog reksas = new Dog("Male", "Blackrace");
        System.out.println(pukis);
        System.out.println(reksas);

    }
}
