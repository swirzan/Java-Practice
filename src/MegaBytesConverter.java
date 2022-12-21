public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }
    //Output
    //2500 KB = 2 MB and 452 KB
    //Invalid Input
    //5000 KB = 4 MB and 904 KB

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes >= 0) {
            int megabytes = kiloBytes / 1024;
            int remainingKiloBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + remainingKiloBytes + " KB");
            return;
        }
        System.out.println("Invalid Input");
    }
}
