public class LeapYearCalculator {
    public static void main(String[] args) {
        boolean test1 = isLeapYear(-1600);
        boolean test2 = isLeapYear(1600);
        boolean test3 = isLeapYear(2017);
        boolean test4 = isLeapYear(2000);
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println(test4);
    }
    //Output
    //false
    //true
    //false
    //true

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }
};

