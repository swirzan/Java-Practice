public class MinutesToYearsandDaysCalculatorChallenge {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    //Output
    //525600 min = 1 y and 0d
    //1051200 min = 2 y and 0d
    //561600 min = 1 y and 25d
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long year = minutes / 525600;
            long days = (minutes % 525600) / 1440;
            System.out.println(minutes + " min = " + year + " y and " + days + "d");
        }
    }
}
