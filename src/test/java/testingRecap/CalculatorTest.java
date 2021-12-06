package testingRecap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;


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

        assertThat(actualAddResult).isEqualTo(-9);
    }

    @Test
    void testSubtractMultipleNumbers() {
        int[] numbersToTest = {5 ,2, -3, 4, 1};

        int actualResult = calculator.subtractMultipleNumbers(numbersToTest);

        assertThat(actualResult).isEqualTo(1);
    }

    @Test
    void testMultiplyTwoNumbers() {
        assertThat(calculator.multiplyTwoNumbers(1, 10)).isEqualTo(10);
    }

    @Test
    void testMultiplyMultipleNumbers() {
        int[] numbersToTest = {5 ,2, -3, 4, 1};

        int actualResult = calculator.multiplyMultipleNumbers(numbersToTest);

        assertThat(actualResult).isEqualTo(-120);
    }

    @Test
    void testDivideTwoNumbers() {
        assertThat(calculator.divideTwoNumbers(4, 2)).isEqualTo(2);
    }

    @Test
    void testDivideTwoNumbersWhereResultIsNotInteger() {
        assertThat(calculator.divideTwoNumbers(9, 2)).isEqualTo(4.5);
    }

    @Test
    void testDivideNumberByZero() {

        ArithmeticException exception = assertThrows(
                ArithmeticException.class,
                () -> calculator.divideTwoNumbers(5, 0)
        );

        assertTrue(exception.getMessage().contains("by zero"));
    }


}