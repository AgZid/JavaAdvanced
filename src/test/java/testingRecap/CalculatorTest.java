package testingRecap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;


class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    void testAddTwoNumbers() {
        int firstNumber = 1;
        int secondNumber = 10;

        int actualAddResult = calculator.addTwoNumbers(firstNumber, secondNumber);

        assertEquals(11, actualAddResult);
        assertThat(actualAddResult).isEqualTo(11); //analogiskas tikrinimas su assertj
    }

    @Test
    void testAddMultipleNumbers() {
        int[] numbersToTest = {5 ,2, -3, 4, 1};

        int actualResult = calculator.addMultipleNumbers(numbersToTest);

        assertThat(actualResult).isEqualTo(9);
        //assertEquals(15,actualResult);
    }

    @Test
    void testSubtractTwoNumbers() {
        int firstNumber = 1;
        int secondNumber = 10;

        int actualAddResult = calculator.subtractTwoNumbers(firstNumber, secondNumber);

        assertEquals(-9, actualAddResult);
        assertThat(actualAddResult).isEqualTo(-9); //analogiskas tikrinimas su assertj
    }

    @Test
    void testSubtractMultipleNumbers() {
        int[] numbersToTest = {5 ,2, -3, 4, 1};

        int actualResult = calculator.subtractMultipleNumbers(numbersToTest);

        assertThat(actualResult).isEqualTo(1);
        //assertEquals(15,actualResult);
    }


}