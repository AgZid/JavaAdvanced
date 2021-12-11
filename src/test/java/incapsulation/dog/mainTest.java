package incapsulation.dog;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class DogTest {
    private Dog barbosas;
    private Dog puke;

    @BeforeEach
    void setUp() {
        barbosas = new Dog("Bobikas", 4, "male", "GoldenRace", 8.25);
        puke = new Dog("Female", "LegendRace");
    }

    @Test
    void testGetAge(){
        assertThat(barbosas.getAge()).isEqualTo(4);
        assertThat(puke.getAge()).isEqualTo(8);
    }

    @Test
    void testSetAge_validAge(){
        barbosas.setAge(6);
        puke.setAge(9);

        assertThat(barbosas.getAge()).isEqualTo(6);
        assertThat(puke.getAge()).isEqualTo(9);
    }

    @Test
    void testSetAge_invalidAge(){
        barbosas.setAge(-1);
        puke.setAge(-3);

        assertThat(barbosas.getAge()).isEqualTo(4);
        assertThat(puke.getAge()).isEqualTo(8);
    }

    @Test
    void testGetWeigh(){
        assertThat(barbosas.getWeight()).isEqualTo(8.25);
        assertThat(puke.getWeight()).isEqualTo(7.1);
    }

    @Test
    void testSetWeigh_validWeigh(){
        barbosas.setWeight(3);
        puke.setWeight(8);


        assertThat(barbosas.getWeight()).isEqualTo(3);
        assertThat(puke.getWeight()).isEqualTo(8);
    }

    @Test
    void testSetWeigh_invalidWeigh(){
        barbosas.setWeight(2);
        puke.setWeight(-2);

        assertThat(barbosas.getWeight()).isEqualTo(8.25);
        assertThat(puke.getWeight()).isEqualTo(7.1);
    }
}