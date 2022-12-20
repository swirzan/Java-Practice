public class MethodOverloading {
    public static void main(String[] args) {
        calculateScore("Wirzan", 500);
        calculateScore(100);
        calculateScore("Maaz", (float) 90);
        calculateScore();
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Anonymous player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(String playerNames, float score) {
        System.out.println("Player " + playerNames + " scored " + score + " points");
        return (int) (score * 1000);
    }

    public static int calculateScore() {
        System.out.println("no player name, no player score");
        return 0;
    }

    ;
}