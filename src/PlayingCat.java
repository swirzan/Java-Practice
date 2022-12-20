public class PlayingCat {
    public static void main(String[] args) {
        boolean test1 = isCatPlaying(true, 10);
        boolean test2 = isCatPlaying(false, 36);
        boolean test3 = isCatPlaying(false, 35);
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
    }
    //Output
    //false
    //false
    //true

    public static boolean isCatPlaying(boolean summer, int temperature) {
        int maxTemp = summer ? 45 : 35;
        return temperature >= 25 && temperature <= maxTemp;
    }
}
