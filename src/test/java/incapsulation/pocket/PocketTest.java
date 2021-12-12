package incapsulation.pocket;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PocketTest {
    public static final double HUNDRED_DOLLARS = 100.0;
    private Pocket pocket;

    @BeforeEach
    void setUp() {
        pocket = new Pocket(HUNDRED_DOLLARS);
    }

    @Test
    void testShowMoney() {
        assertThat(pocket.showMoney()).isEqualTo(HUNDRED_DOLLARS);
    }

    @Test
    void testAddMoney() {
        pocket.addMoney(HUNDRED_DOLLARS);
        assertThat(pocket.showMoney()).isEqualTo(200.0);
    }

    @Test
    void withDrawnMoney() {
        pocket.withDrawnMoney(50.0);
        assertThat(pocket.showMoney()).isEqualTo(50.0);
    }

    @Test
    void withDrawnMoney_invalidAmount() {
        pocket.withDrawnMoney(HUNDRED_DOLLARS);
        assertThat(pocket.showMoney()).isEqualTo(HUNDRED_DOLLARS);
    }


}