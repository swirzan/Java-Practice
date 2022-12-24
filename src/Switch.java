public class Switch {
    public static void main(String[] args) {
        int switchValue = 5;
        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Was a 3, a4, or a 5");
                System.out.println("Actually was: " + switchValue);
            }
            default -> System.out.println("Was not 1, 2, 3, 4 or 5");
        }
    }
}
