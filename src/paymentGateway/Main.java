package paymentGateway;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<PaymentMethod> platby = new ArrayList<PaymentMethod>();

        platby.add(new PayPalPayment("adamkatrenic@gmail.com"));
        platby.add(new CreditCardPayment("0123456789"));

        for (PaymentMethod platba : platby) {
            platba.pay(100.50);
        }
    }
}
