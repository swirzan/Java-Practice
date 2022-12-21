public class BarkingDog {
    public static void main(String[] args) {
        boolean test1 = shouldWakeUp(true, -1);
        boolean test2 = shouldWakeUp(true, 1);
        boolean test3 = shouldWakeUp(false, 2);
        boolean test4 = shouldWakeUp(true, 8);
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println(test4);
    }

    //Output
    //false
    //true
    //true
    //true
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (!barking || hourOfDay < 0 || hourOfDay > 23 || (hourOfDay > 7 && hourOfDay < 23)) {
            return false;
        }
        return true;
    }
}

