public class SpeedConverter {
    public static void main(String[] args) {
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
        //Output
        //1.5 km/h = 1 mi/h
        //10.25 km/h = 6 mi/h
        //Invalid Value
        //25.42 km/h = 16 mi/h
        //75.114 km/h = 47 mi/h


        int test1 = (int) toMilesPerHour(1.5);
        double test2 = (double) toMilesPerHour(10.25);
        long test3 = toMilesPerHour(-5.6);
        long test4 = toMilesPerHour(25.42);
        long test5 = toMilesPerHour(75.114);
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println(test4);
        System.out.println(test5);
        //Output
        //1
        //6.0
        //-1
        //16
        //47
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        double MILES_TO_KILOMETER_UNIT = 1.609;
        if (kilometersPerHour >= 0) {
            long ans = Math.round(kilometersPerHour / MILES_TO_KILOMETER_UNIT);
            return Math.round(ans);
        }
        return -1;
    }

    public static void printConversion(double kilometersPerHour) {
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        if (milesPerHour >= 0) {
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        } else {
            System.out.println("Invalid Value");
        }

    }
}