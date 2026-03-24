import java.util.Scanner;

public class PasswordValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Zadajte heslo: ");
        String uzivatelskeHeslo = scanner.nextLine();

        if (jeHesloSilne(uzivatelskeHeslo)) {
            System.out.println("✅ Heslo je silné!");
        } else {
            System.out.println("❌ Heslo je slabé! (Musí mať 8+ znakov, číslo a veľké písmeno)");
        }

        scanner.close();
    }

    public static boolean jeHesloSilne(String heslo) {
        if (heslo.length() < 8) return false;

        boolean hasUppercase = !heslo.equals(heslo.toLowerCase());
        boolean hasDigit = heslo.matches(".*\\d.*");

        return hasUppercase && hasDigit;
    }
}