public class EqualSumChecker {
    public static void main(String[] args) {
        boolean test1 = hasEqualSum(1, 1, 1);
        boolean test2 = hasEqualSum(1, 1, 2);
        boolean test3 = hasEqualSum(1, -1, 0);
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
    }
    //Output
    //false
    //true
    //true

    public static boolean hasEqualSum(int numOne, int numTwo, int numThree) {
        if (numOne + numTwo == numThree) {
            return true;
        }
        return false;
    }
}
