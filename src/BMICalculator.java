import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Zadajte váhu v Kilogramoch: ");
        double weight = scanner.nextDouble();

        System.out.println("Zadajte výšku v Centimetroch: ");
        double height = scanner.nextDouble();

        double bmi = weight / ( (height / 100) * (height / 100) );

        double roundedBMI = Math.round( bmi * 100 ) / 100.0;

        System.out.println("Tvoje BMI je: " + roundedBMI);

        if (roundedBMI < 18.5) {
            System.out.println("Kategória: Podvíživený");
        } else if (roundedBMI < 25) {
            System.out.println("Kategória: Normálna Váha");
        } else if (roundedBMI < 30) {
            System.out.println("Kategória: Nadváha");
        } else {
            System.out.println("Kategória: Obezita");
        }

        scanner.close();
    }

}
