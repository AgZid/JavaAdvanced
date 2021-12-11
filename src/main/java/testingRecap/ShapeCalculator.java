package testingRecap;

public class ShapeCalculator {

    public double calculateSquareArea(double height, double weidth) {
        if (height <= 0 || weidth <= 0) {
            System.out.println("Error");
            return 0;
        }

        return height * weidth;
    }

    public  double calculateSquareVolume(double height, double weidth, double length) {
        return height * weidth * length;
    }
}
