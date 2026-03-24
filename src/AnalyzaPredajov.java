import java.util.Scanner;

public class AnalyzaPredajov {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] trzby = new double[7];
        double celkovaTrzba = 0;

        for (int i = 0; i < trzby.length; i++) {
            System.out.print("Zadajte tržbu za deň č. " + (i + 1) + ": ");

            while (!scanner.hasNextDouble()) {
                System.out.println("Chyba! Zadajte prosím číselnú hodnotu.");
                scanner.next();
            }

            trzby[i] = scanner.nextDouble();
            celkovaTrzba += trzby[i];
        }

        double priemer = celkovaTrzba / trzby.length;

        double maxTrzba = trzby[0];
        for (int i = 1; i < trzby.length; i++) {
            if (trzby[i] > maxTrzba) {
                maxTrzba = trzby[i];
            }
        }

        System.out.println("\n--- ŠTATISTIKA PREDAJOV ---");
        System.out.printf("Celková tržba za týždeň: %.2f €%n", celkovaTrzba);
        System.out.printf("Priemerná denná tržba:   %.2f €%n", priemer);
        System.out.printf("Najvyššia denná tržba:  %.2f €%n", maxTrzba);
        System.out.println("---------------------------");

        scanner.close();
    }
}