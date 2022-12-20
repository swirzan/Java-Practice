public class SecondAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(7200));
    }

    public static String getDurationString(int seconds) {
        int minutes = seconds / 60;
        int hour = minutes / 60;
        int remainingMinute = minutes % 60;
        int remainingSecond = seconds % 60;
        return hour + "h " + remainingMinute + "m " + remainingSecond + "s";
    }

    public static String getDurationString(int minutes, int seconds) {
        return "";
    }
}


//3600 sec in 1 hour