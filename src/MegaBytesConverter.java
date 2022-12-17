public class MegaBytesConverter {
    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(2500);
//        printMegaBytesAndKiloBytes(5000);

    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes > 0) {
            int megabytes = kiloBytes / 1024;
            int remainingKiloBytes = kiloBytes % 1024;
            System.out.println(kiloBytes +" KB = "+ megabytes +" MB and "+ remainingKiloBytes +" KB");
            return;
        }
        System.out.println("Invalid Input");
    }
}
