package incapsulation.example1;

public class Person {
    private String name;
    private int personalNumber;
    private String eyeColor;

    public Person(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 2) {
            this.name = name;
        }
        else {
            System.out.println("name too short");
        }
    }

    public int getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(int personalNumber) {
        if (personalNumber > 10) {
            this.personalNumber = personalNumber;
        }
        System.out.println("Wrong input");
    }

    public String getEyeColor() {
        return eyeColor;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personalNumber=" + personalNumber +
                ", eyeColor='" + eyeColor + '\'' +
                '}';
    }
}
