public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        boolean test1 = isLeapYear(-1600);
        boolean test2 = isLeapYear(1600);
        boolean test3 = isLeapYear(2017);
        boolean test4 = isLeapYear(2000);
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println(test4);
        int test5 = getDaysInMonth(1, 2020);
        int test6 = getDaysInMonth(2, 2020);
        int test7 = getDaysInMonth(2, 2018);
        int test8 = getDaysInMonth(-1, 2020);
        int test9 = getDaysInMonth(1, -2020);
        System.out.println(test5);
        System.out.println(test6);
        System.out.println(test7);
        System.out.println(test8);
        System.out.println(test9);
    }
    //Output
    //false
    //true
    //false
    //true
    //Output
    //31
    //29
    //28
    //-1
    //-1

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            return -1;
        } else if (year < 1 || year > 9999) {
            return -1;
        } else if (isLeapYear(year) && month == 2) {
            return 29;
        }
        switch (month) {
            case 11:
            case 4:
            case 6:
            case 9:
                return 30;
            case 2:
                return 28;
            default:
                return 31;
        }
    }

}
