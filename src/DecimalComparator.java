public class DecimalComparator {
    public static void main(String[] args) {
        boolean test1 = areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        boolean test2 = areEqualByThreeDecimalPlaces(3.175, 3.176);
        boolean test3 = areEqualByThreeDecimalPlaces(3.0, 3.0);
        boolean test4 = areEqualByThreeDecimalPlaces(-3.123, 3.123);
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println(test4);
    }
    //Output
    //true
    //false
    //true
    //false

    public static boolean areEqualByThreeDecimalPlaces(double numOne, double numTwo) {
        int numOneCheck = (int) (numOne * 1000);
        int numTwoCheck = (int) (numTwo * 1000);
        if (numOneCheck - numTwoCheck == 0) {
            return true;
        }
        return false;
    }
}
