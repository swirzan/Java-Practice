public class TeenNumberChecker {
    public static void main(String[] args) {
        boolean test1 = hasTeen(9, 99, 19);
        boolean test2 = hasTeen(23, 15, 42);
        boolean test3 = hasTeen(22, 23, 34);
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);

        boolean tes4 = isTeen(9);
        boolean test5 = isTeen(13);
        System.out.println(tes4);
        System.out.println(test5);
    }

    //Output
    //true
    //true
    //false
    //false
    //true
    public static boolean hasTeen(int ageOne, int ageTwo, int ageThree) {
        if (ageOne >= 13 && ageOne <= 19 || ageTwo >= 13 && ageTwo <= 19 || ageThree >= 13 && ageThree <= 19) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen(int ageFour) {
        if (ageFour >= 13 && ageFour <= 19) {
            return true;
        } else {
            return false;
        }
    }
}
