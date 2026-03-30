package paymentGateway;

public class PayPalPayment implements PaymentMethod{

    String email;

    public PayPalPayment(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Neplatný formát e-mailu!");
        }
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Platba " + amount + " € cez PayPal účet " + getEmail());
    }
}
