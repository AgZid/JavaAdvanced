package inheritance.example3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testPerson() {
        Actor actor = new Actor("Jim");
        Waitor waitor = new Waitor("Bill");
        assertThat(actor).isInstanceOf(Person.class);
        assertThat(waitor).isNotInstanceOf(Vehicle.class);
    }
}