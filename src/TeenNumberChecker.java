public class TeenNumberChecker {
    public static void main(String[] args) {
        boolean test = hasTeen(22, 23, 34);
        boolean test2 = isTeen(13);
        ;
        System.out.println(test2);
    }

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
