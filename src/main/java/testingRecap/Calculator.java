package testingRecap;

import org.apache.log4j.Logger;

import java.util.Arrays;

public class Calculator {


    private static final Logger LOGGER = Logger.getLogger(Calculator.class);

    public Calculator(){

    }

    public int addTwoNumbers(int firstNumber, int secondNumber) {
        LOGGER.info("Adding two numbers " + firstNumber + " and " + secondNumber);
        return firstNumber + secondNumber;
    }

    public int addMultipleNumbers(int[] numbers) {
        LOGGER.info("Adding multiple numbers" + Arrays.toString(numbers));
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }


    public int subtractTwoNumbers(int firstNumber, int secondNumber) {
        LOGGER.info("Substract two numbers " + firstNumber + " and " + secondNumber);
        return firstNumber - secondNumber;
    }

    public int subtractMultipleNumbers(int[] numbers) {
        LOGGER.info("Substract multiple numbers: " + Arrays.toString(numbers));
        int subtract = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            subtract -= numbers[i];
        }

        return subtract;
    }

    public int multiplyTwoNumbers(int firstNumber, int secondNumber) {
        LOGGER.info("Multiply two numbers");
        return firstNumber * secondNumber;
    }

    public int multiplyMultipleNumbers(int[] numbers) {
        int multiply = 1;
        for(int number : numbers) {
            multiply *= number;
        }
        return multiply;
    }

    public double divideTwoNumbers(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return (double) firstNumber / secondNumber;

    }
}
