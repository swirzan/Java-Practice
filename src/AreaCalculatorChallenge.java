public class AreaCalculatorChallenge {
    public static void main(String[] args) {
        double test = area(5.0);
        System.out.println(test);
        double test2 = area(-1.0, 4.0);
        System.out.println(test2);
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }
        return radius * radius * Math.PI;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        }
        return x * y;
    }
}
