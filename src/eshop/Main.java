package eshop;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Product> kosik = new ArrayList<Product>();

        kosik.add(new PhysicalProduct("Monitor",200));
        kosik.add(new DigitalProduct("E-kniha",15));

        double suma =0;

        for (Product product : kosik) {
            product.processOrder();
            suma += product.getPrice();
        }

        System.out.println("Celkova cena objednavky: " + suma);
    }
}
