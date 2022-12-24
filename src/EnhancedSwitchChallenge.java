public class EnhancedSwitchChallenge {
    public static void main(String[] args) {
        printDayOfWeek(-1);
        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);

        printNumberInWord(-5);
        printNumberInWord(0);
        printNumberInWord(1);
        printNumberInWord(2);
        printNumberInWord(3);
        printNumberInWord(4);
        printNumberInWord(5);
        printNumberInWord(6);
        printNumberInWord(7);
        printNumberInWord(8);
        printNumberInWord(9);
    }
    //OUTPUT
    //-1 Stands for Invalid
    //0 Stands for Sunday
    //1 Stands for Monday
    //2 Stands for Tuesday
    //3 Stands for Wednesday
    //4 Stands for Thursday
    //5 Stands for Saturday
    //6 Stands for Invalid

    //OUTPUT
    //OTHER
    //ZERO
    //ONE
    //TWO
    //THREE
    //FOUR
    //FIVE
    //SIX
    //SEVEN
    //EIGHT
    //NINE

    public static void printDayOfWeek(int day) {
        String dayOfWeek = switch (day) {
            case 0 -> {
                yield "Sunday";
            }
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Saturday";
            default -> "Invalid";
        };
        System.out.println(day + " Stands for " + dayOfWeek);
    }

    public static void printNumberInWord(int number) {
        String word = switch (number) {
            case 0 -> "ZERO";
            case 1 -> "ONE";
            case 2 -> "TWO";
            case 3 -> "THREE";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "SEVEN";
            case 8 -> "EIGHT";
            case 9 -> "NINE";
            default -> "OTHER";
        };
        System.out.println(word);
    }
}
