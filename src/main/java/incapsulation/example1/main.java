package incapsulation.example1;

public class main {
    /**
     * testuoti su unit testais
     */

    public static void main(String[] args) {
        Person person = new Person("Brown");
        person.setName("Bob");
        person.setPersonalNumber(12368963);
        System.out.println(person);

        person.setName("L");
        person.setPersonalNumber(-15);
        System.out.println(person);
    }
}
