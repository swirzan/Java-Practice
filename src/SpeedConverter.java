public class SpeedConverter {
    public static void main(String[] args) {
//        // Evaluate
//        printConversion(1.5);
//        printConversion(10.25);
//        printConversion(-5.6);
//        printConversion(25.42);
//        printConversion(75.114);
//    printConversion(0.0);


//       int test1 = (int) toMilesPerHour (1.5);
//       double test2 = (double) toMilesPerHour (10.25);
//       long test3 = toMilesPerHour (-5.6);
//       long test4 = toMilesPerHour (25.42);
//       long test5 = toMilesPerHour (75.114);
//        System.out.println(test1 + "\n" + test2 + "\n" + test3 + "\n" + test4 + "\n" + test5);



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