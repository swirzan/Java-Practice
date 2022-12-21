public class AreaCalculatorChallenge {
    public static void main(String[] args) {
        double test1 = area(5.0);
        double test2 = area(-1);
        double test3 = area(5.0, 4.0);
        double test4 = area(-1.0, 4.0);
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println(test4);
    }
    //Output
    //78.53981633974483
    //-1.0
    //20.0
    //-1.0

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
