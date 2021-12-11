package testingRecap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ShapeCalculatorTest {

    ShapeCalculator shapeCalculator = new ShapeCalculator();

    @Test
    void testCalculateSquareArea() {


        double squareWidth = 5.5;
        double squareHeight = 6.8;

        double squareArea = shapeCalculator.calculateSquareArea(squareHeight, squareWidth);

        assertThat(squareArea).isEqualTo(37.4);
    }

    @Test
    void shouldReturnZero_WhenParametersNegative() {
        double squareWidth = -5.5;
        double squareHeight = 6.8;

        double squareArea = shapeCalculator.calculateSquareArea(squareHeight, squareWidth);

        assertThat(squareArea).isEqualTo(0);
    }

    @Test
    void testCalculateSquareVolume() {

        double squareWidth = 5.5;
        double squareHeight = 6.8;
        double squareLength = 5.2;

        double squareVolume = shapeCalculator.calculateSquareVolume(squareHeight, squareWidth, squareLength);

        assertThat(squareVolume).isEqualTo(194.48);
    }
}