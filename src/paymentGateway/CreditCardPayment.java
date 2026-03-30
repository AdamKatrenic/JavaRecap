package paymentGateway;

public class CreditCardPayment implements PaymentMethod{

    String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Platba " + amount + " € kartou " + getCardNumber());
    }

}
