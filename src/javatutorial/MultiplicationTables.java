package javatutorial;

public class MultiplicationTables {

    public static void run() {
        for (int i = 1; i <= 12; i++) {
            for (int n = 1; n <= 12; n++) {
                int result = i * n;
                System.out.println(i + " times " + n + " = " + result);
            }
        }
    }
}