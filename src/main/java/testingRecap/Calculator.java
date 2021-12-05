package testingRecap;

import org.apache.log4j.Logger;

public class Calculator {


    private static final Logger LOGGER = Logger.getLogger(Calculator.class);

    public Calculator(){

    }

    public int addTwoNumbers(int firstNumber, int secondNumber) {
        LOGGER.info("Adding two numbers " + firstNumber + " and " + secondNumber);
        return firstNumber + secondNumber;
    }

    public int addMultipleNumbers(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }
}
