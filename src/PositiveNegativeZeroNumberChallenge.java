public class PositiveNegativeZeroNumberChallenge {
    public static void main(String[] args) {
        checkNumber(12);
        checkNumber(-9);
        checkNumber(0);
    }
    //Output
    //positive
    //negative
    //zero

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }

    }

    ;
}
