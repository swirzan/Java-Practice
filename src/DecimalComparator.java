public class DecimalComparator {
    public static void main(String[] args) {
        boolean test = areEqualByThreeDecimalPlaces(3.175, 3.176);
        System.out.println(test);
    }

    ;

    public static boolean areEqualByThreeDecimalPlaces(double numOne, double numTwo) {
        int numOneCheck = (int) (numOne * 1000);
        int numTwoCheck = (int) (numTwo * 1000);
        if (numOneCheck - numTwoCheck == 0) {
            return true;
        }
        return false;
    }
}
