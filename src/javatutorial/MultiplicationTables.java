package javatutorial;

public class MultiplicationTables {
    public static void run() {
        for (int i = 1; i <= 12; i++) {
            for (int n = 1; n <= 12; n++) {
                int result = i * n;
                System.out.format("%10s %s %s %s %s", ""+(i),"times", (n), "=", (result));
            }
            
            System.out.println("/n");
        }
    }
}