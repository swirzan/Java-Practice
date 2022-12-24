public class SwitchChallenge {
    public static void main(String[] args) {
        char myChar = 'X';

        switch (myChar) {
            case 'A':
                System.out.println("a for Able");
                break;
            case 'B':
                System.out.println("b for Baker");
                break;
            case 'C':
                System.out.println("c for Charlie");
                break;
            case 'D':
                System.out.println("d for Dog");
                break;
            case 'E':
                System.out.println("e for easy");
                break;
            default:
                System.out.println("Letter " + myChar + " not found");
                break;
        }

    }
}
